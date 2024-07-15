/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.chthonics.prototypes.javaspidemo.api;

import java.io.PipedInputStream;
import java.util.Map;

/**
 *
 * @author Warwick Dufour
 */
public interface InputPullAdapterProvider {
    
    /**
     * An {@link InputPullAdapter} is created using an arbitrary set of
     * properties.
     * 
     * @param properties 
     * @param pipedInputStream 
     * @return  
     */
    public InputPullAdapter create(Map<String, Object> properties, PipedInputStream pipedInputStream);
}
