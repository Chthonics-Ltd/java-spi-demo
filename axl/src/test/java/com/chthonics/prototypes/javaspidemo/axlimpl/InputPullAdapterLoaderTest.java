/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.chthonics.prototypes.javaspidemo.axlimpl;

import com.chthonics.prototypes.javaspidemo.InputPullAdapterLoader;
import com.chthonics.prototypes.javaspidemo.api.InputPullAdapterProvider;
import com.chthonics.prototypes.javaspidemo.impl.FileInputPullAdapterProvider;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author Warwick Dufour
 */
public class InputPullAdapterLoaderTest {
    
    public InputPullAdapterLoaderTest() {
    }

    /**
     * Test of providers method, of class InputPullAdapterLoader.
     */
    @Test
    public void testProviders() {
        assertEquals(2, InputPullAdapterLoader.providers().size());
    }

    /**
     * Test of provider method, of class InputPullAdapterLoader.
     */
    @Test
    public void testProvider_0args() {
        assertNotNull(InputPullAdapterLoader.provider());
        assertTrue(InputPullAdapterLoader.provider() instanceof FileInputPullAdapterProvider);
    }

    /**
     * Test of provider method, of class InputPullAdapterLoader.
     */
    @Test
    public void testProvider_String() {
        
        InputPullAdapterProvider provider = InputPullAdapterLoader.provider("com.chthonics.prototypes.javaspidemo.impl.FileInputPullAdapterProvider");
        assertNotNull(provider);
        assertTrue(provider instanceof FileInputPullAdapterProvider);
        
        provider = InputPullAdapterLoader.provider("com.chthonics.prototypes.javaspidemo.axlimpl.AxlInputPullAdapterProvider");
        assertNotNull(provider);
        assertTrue(provider instanceof AxlInputPullAdapterProvider);
    }
    
}
