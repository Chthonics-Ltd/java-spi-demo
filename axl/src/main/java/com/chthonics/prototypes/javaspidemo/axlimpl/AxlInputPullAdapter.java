/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chthonics.prototypes.javaspidemo.axlimpl;

import com.chthonics.prototypes.javaspidemo.api.InputPullAdapter;
import java.io.PipedInputStream;
import java.util.Map;

/**
 *
 * @author Warwick Dufour
 */
public class AxlInputPullAdapter extends InputPullAdapter {

    public AxlInputPullAdapter(Map<String, Object> map, PipedInputStream pis) {
        super(map, pis);
    }
    
    @Override
    public void pull() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
