/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.runejercicio;

/**
 *
 * @author HOUSE
 */

import java.time.LocalDate;
import java.time.Period;

public class PerfilMedico {
    private String primerNombre, apellido, sexo;
    private int dia, mes, anio;
    private double altura;
    private double peso;

    public PerfilMedico(String primerNombre, String apellido, String sexo, int dia, int mes, int anio, double altura, double peso) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.dia = dia;
        this.mes = mes;
        this.anio = anio;
        this.altura = altura;
        this.peso = peso;
    }

    public String getPrimerNombre() {
        return primerNombre;
    }

    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAnio() {
        return anio;
    }

    public void setAnio(int anio) {
        this.anio = anio;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }  
    
    public int edadActual(){
        LocalDate fechaHoy = LocalDate.now();
        LocalDate fechaNacimiento = LocalDate.of(anio, mes, dia);
        Period periodo = Period.between(fechaNacimiento, fechaHoy);
        return periodo.getYears();
    }
    
    public double FCM(){
        return 208 - (0.7*edadActual());
    }
    
    public double IMC(){
        return this.peso/this.altura;
    }

    //@Override
    //public String toString() {
    //    return "PerfilMedico{" + "primerNombre=" + primerNombre + ", apellido=" + apellido + ", sexo=" + sexo + ", dia=" + dia + ", mes=" + mes + ", anio=" + anio + ", altura=" + altura + ", peso=" + peso + '}';
    //}
    
    @Override
    public String toString() {
        System.out.println("Nombre: " + primerNombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Sexo: " + sexo);
        System.out.println("Fecha de nacimiento: " + dia + "/" + mes + "/" + anio);
        System.out.println("Altura: " + altura);
        System.out.println("Peso: " + peso);
        System.out.println("Edad: " + edadActual());
        System.out.println("Frecuencia Cardiaca Maxima: " + FCM());
        System.out.println("Indice de Masa Corporal: " + IMC());
    }
       
}
