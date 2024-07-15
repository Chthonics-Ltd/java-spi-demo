/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chthonics.prototypes.javaspidemo.impl;

import com.chthonics.prototypes.javaspidemo.api.InputPullAdapter;
import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.PipedInputStream;
import java.io.PipedOutputStream;
import java.util.Map;

/**
 *
 * @author Warwick Dufour
 */
public class FileInputPullAdapter extends InputPullAdapter {

    public FileInputPullAdapter(Map<String, Object> map, PipedInputStream pis) {
        super(map, pis);
    }

    @Override
    public void pull() {

        InputStream inputStream;
        try {
            inputStream = new BufferedInputStream(new FileInputStream((String) properties.get("filename")));
        } catch (FileNotFoundException ex) {
            throw new RuntimeException("Cannot find file", ex);
        }

        PipedOutputStream outputStream;
        try {
            outputStream = new PipedOutputStream(pipedInputStream);
        } catch (IOException ex) {
            throw new RuntimeException("Cannot open PipedOutputStream", ex);
        }

        int readValue;
        do{
            try {
                readValue = inputStream.read();
            } catch (IOException ex) {
                throw new RuntimeException("Cannot read from input stream", ex);
            }
            try {
                outputStream.write(readValue);
            } catch (IOException ex) {
                throw new RuntimeException("Cannot write to piped output stream", ex);
            }
        }
        while(readValue >= 0);
    }
}
