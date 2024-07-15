/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package com.chthonics.prototypes.javaspidemo.app;

import com.chthonics.prototypes.javaspidemo.InputPullAdapterLoader;

/**
 * Designed to replicate how the AIXM Ingestion Service can fetch both fault and
 * AxL Input Pull Adapters with compile time access to the Input Adapter API and
 * runtime access to the Axl Input Adapter (note the dependency scopes in the
 * pom file).
 *
 * @author Warwick Dufour
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        // Make sure we can fetch all service providers
        InputPullAdapterLoader.providers().forEach((provider) -> {
            System.out.println("Loaded: " + provider.getClass().getName());
        });
    }

}
