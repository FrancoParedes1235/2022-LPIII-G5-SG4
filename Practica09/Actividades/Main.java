/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab09act2;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;
/**
 *
 * @author HOUSE
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException{
        Scanner sc = new Scanner(System.in);
        String cadena;
        
        try(PrintWriter salida = new PrintWriter("c:/ficheros/dato.txt")) // se crea el fichero o sobreescribe
        { //try-with-resources asegura que estos objetos serán cerrados al final de la instrucción try
            System.out.println("Introduce texto. Para acabar introduce la cadena FIN:");
            cadena = sc.nextLine(); // se introduce una cadena de texto
            while(!cadena.equalsIgnoreCase("FIN")){
                salida.println(cadena); // se ecribe la cadena en el fichero
                cadena = sc.nextLine(); // se introduce por el teclado una cadena de texto
            }
        }catch(FileNotFoundException e){
            System.out.println(e.getMessage());
        }
    }
    
}
