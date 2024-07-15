/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.chthonics.prototypes.javaspidemo.api;

import java.io.PipedInputStream;
import java.util.Map;

/**
 *
 * @author Warwick Dufour
 */
public abstract class InputPullAdapter {

    protected final PipedInputStream pipedInputStream;
    protected final Map<String, Object> properties;

    public InputPullAdapter(Map<String, Object> map, PipedInputStream pis) {
        properties = map;
        pipedInputStream = pis;
    }
    
    /**
     * Establish connection to source and start pulling data from it
     */
    public abstract void pull();
}
