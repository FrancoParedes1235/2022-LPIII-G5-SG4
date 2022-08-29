/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.runejercicio;

/**
 *
 * @author HOUSE
 */

import java.util.*;

public class RunEjercicio {

    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        String primerNombre, apellido, sexo;
        int dia, mes, anio;
        double altura;
        double peso;
        
        System.out.println("Ingrese su 1er nombre: ");
        primerNombre = entrada.nextLine();
        
        System.out.println("Ingrese su apellido: ");
        apellido = entrada.nextLine();
        
        System.out.println("Ingrese su genero: ");
        sexo = entrada.next();
        
        System.out.println("Ingrese su fecha de nacimiento: ");
        System.out.println("Ingrese el dia: ");
        dia = entrada.nextInt();
        System.out.println("Ingrese el mes: ");
        mes = entrada.nextInt();
        System.out.println("Ingrese el año: ");
        anio = entrada.nextInt();
        
        System.out.println("Ingrese su altura en cm: ");
        altura = entrada.nextDouble();
        
        System.out.println("Ingrese su peso en kg: ");
        peso = entrada.nextDouble();
        
        //Creación del usuario
        PerfilMedico usuario = new PerfilMedico(primerNombre, apellido, sexo, dia, mes, anio, altura, peso);
        System.out.println(usuario.toString());
        entrada.close();
    }
}
