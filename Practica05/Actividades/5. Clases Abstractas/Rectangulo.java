/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testabstracto;

/**
 *
 * @author HOUSE
 */
public class Rectangulo extends FiguraGeometrica {

    private double base;
    private double altura;

    public Rectangulo(double largo, double ancho) {
        super("Rectangulo");
        this.base = largo;
        this.altura = ancho;
    }

    public double area() {
        return this.base * this.altura;
    }

}