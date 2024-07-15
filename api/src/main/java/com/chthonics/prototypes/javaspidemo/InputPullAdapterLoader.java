/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.chthonics.prototypes.javaspidemo;

import com.chthonics.prototypes.javaspidemo.api.InputPullAdapterProvider;
import com.chthonics.prototypes.javaspidemo.impl.FileInputPullAdapterProvider;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ServiceLoader;

/**
 *
 * @author Warwick Dufour
 */
public class InputPullAdapterLoader {
    private static final String DEFAULT_PROVIDER = FileInputPullAdapterProvider.class.getName();

    // All providers
    public static List<InputPullAdapterProvider> providers() {
        List<InputPullAdapterProvider> serviceProviders = new ArrayList<>();
        ServiceLoader<InputPullAdapterProvider> providerLoader = ServiceLoader.load(InputPullAdapterProvider.class);
        providerLoader.forEach(serviceProviders::add);
        return serviceProviders;
    }

    // Default provider
    public static InputPullAdapterProvider provider() {
        return provider(DEFAULT_PROVIDER);
    }

    // Provider by name
    public static InputPullAdapterProvider provider(String providerName) {
        ServiceLoader<InputPullAdapterProvider> providerLoader = ServiceLoader.load(InputPullAdapterProvider.class);
        for (Iterator iterator = providerLoader.iterator(); iterator.hasNext();) {
            InputPullAdapterProvider provider = (InputPullAdapterProvider) iterator.next();
            if (providerName.equals(provider.getClass().getName())) {
                return provider;
            }
        }
        throw new RuntimeException("Input Pull Adapter Provider '" + providerName + "' not found");
    }
}
