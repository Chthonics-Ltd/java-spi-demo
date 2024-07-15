/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chthonics.prototypes.javaspidemo.axlimpl;

import com.chthonics.prototypes.javaspidemo.api.InputPullAdapter;
import com.chthonics.prototypes.javaspidemo.api.InputPullAdapterProvider;
import java.io.PipedInputStream;
import java.util.Map;

/**
 *
 * @author Warwick Dufour
 */
public class AxlInputPullAdapterProvider implements InputPullAdapterProvider {

    @Override
    public InputPullAdapter create(Map<String, Object> properties, PipedInputStream pipedInputStream) {
        return new AxlInputPullAdapter(properties, pipedInputStream);
    }
    
}
