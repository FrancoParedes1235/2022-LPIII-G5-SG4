package cuentabanco;
import java.util.*;


public class CuentaBanco {                // cramos clase
    
    private String titular;                //  creamos atributos de la clase
    private double cantidad;

    public CuentaBanco(String titular) {
        this.titular = titular;
        this.cantidad = 0.0;
    }
    
    public CuentaBanco(String titular,double cantidad){
        this.titular = titular;
        this.cantidad = cantidad;
    }

    public String getTitular() {                        //cramos metodos get y set pata cada uno de los atributos privados
        return titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

  
    public String toString() {
        return "CuentaBanco{" + "titular=" + titular + ", cantidad=" + cantidad + '}';
    }
    
    public void ingresar(double cantidad){
        if (cantidad < 0){
        }
        else {
            this.cantidad = this.cantidad + cantidad;
        }
    }
    
    public void retirar(double cantidad){
        this.cantidad = this.cantidad - cantidad;
        if (this.cantidad < 0){
            this.cantidad = 0;
        }
    }
    
    
    public static void main(String[] args) {
        String miNombre;
        double miCantidad;
        Scanner s1 = new Scanner (System.in);
        System.out.println("Ingrese el nombre del titular de la cuenta:");
        miNombre = s1.next();
        System.out.println("Desea ingresar una cantidad a su cuenta?(s/n)");
        String Opcion = s1.next();
        if (Opcion == "s"){
            System.out.println("Ingrese la cantidad:");
            miCantidad = s1.nextDouble();
        }
        else{
            miCantidad = 0.0;
        }
        
        CuentaBanco Usuario = new CuentaBanco(miNombre,miCantidad);
        System.out.println(Usuario.toString());
        System.out.println("------------ MENU ------------");                          //Creo mini menu que se muestra por pantalla 
        System.out.println("Ingrese 1 : Para ingresar dinero a su cuenta");
        System.out.println("Ingrese 2 : Para retirar dinero a su cuenta");
        System.out.println("Ingrese 3 : Para mostrar el saldo actual de su cuenta");
        System.out.println("Ingrese su opción:");
        Integer Opcion2 = s1.nextInt();
        switch(Opcion2){
            case 1:
            System.out.println("Ingrese la cantidad:");
            miCantidad = s1.nextDouble();
            Usuario.ingresar(miCantidad);
            break;
            case 2:
            System.out.println("Ingrese la cantidad:");
            miCantidad = s1.nextDouble();
            Usuario.retirar(miCantidad);
            break;
            case 3:
            System.out.println(Usuario.getCantidad());
            
        }
    }
    
}