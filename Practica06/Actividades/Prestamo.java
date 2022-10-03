/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package labs6act;

/**
 *
 * @author HOUSE
 */
public class Prestamo implements PorPagar {

    private int numerocuotas;
    private double montoCuotas;

    public Prestamo(int numerocuotas, double montoCuotas) {
        this.numerocuotas = numerocuotas;
        this.montoCuotas = montoCuotas;
    }

    public int getNumerocuotas() {
        return numerocuotas;
    }

    public double getMontoCuotas() {
        return montoCuotas;
    }

    public void setNumerocuotas(int numerocuotas) {
        this.numerocuotas = numerocuotas;
    }

    public void setMontoCuotas(int montoCuotas) {
        this.montoCuotas = montoCuotas;
    }

    @Override
    public double getMontoPago() {
        return getNumerocuotas() * getMontoCuotas();
    }

    @Override
    public String toString() {
        return "Prestamo:\n" + "Numero de cuotas: " + numerocuotas + "\n" + "Monto de Cuotas: " + montoCuotas;
    }
}
