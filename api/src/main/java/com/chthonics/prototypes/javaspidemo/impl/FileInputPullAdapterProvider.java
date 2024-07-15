/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chthonics.prototypes.javaspidemo.impl;

import com.chthonics.prototypes.javaspidemo.api.InputPullAdapter;
import com.chthonics.prototypes.javaspidemo.api.InputPullAdapterProvider;
import java.io.PipedInputStream;
import java.util.Map;

/**
 * Factory class to create {@link InputPullAdapter} instances.
 * 
 * @author Warwick Dufour
 */
public class FileInputPullAdapterProvider implements InputPullAdapterProvider {

    /**
     *
     * @param properties
     * @param pipedInputStream
     * @return
     */
    @Override
    public InputPullAdapter create(Map<String, Object> properties, PipedInputStream pipedInputStream) {
        return new FileInputPullAdapter(properties, pipedInputStream);
    }
    
}
