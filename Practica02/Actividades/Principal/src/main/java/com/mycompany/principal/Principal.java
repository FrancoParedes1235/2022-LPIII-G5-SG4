/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */
package com.mycompany.principal;

import java.util.*;

/**
 *
 */
public class Principal {

    public static void main(String[] args) {
        Perro Fido = new Perro("Chihuahua", "Marron");
        Perro Pelusa = new Perro("Pequines", "Blanco");
        Fido.increEdad(2);
        System.out.println(Fido.toString());
        Pelusa.increEdad(5);
        System.out.println(Pelusa.toString());

    }
}
