/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab09act1;
import java.io.IOException;
import java.nio.file.DirectoryStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;
/**
 *
 * @author HOUSE
 */
public class TestFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        System.out.println("Escriba el nombre del archivo o directorio: ");
        // crear objeto Path con base en la entrada del usuario
        Path ruta = Paths.get(sc.nextLine());
        if(Files.exists(ruta)){ // mostrar información del archivo
            // getFileName obtiene el nombre String del archivo o directorio sin información sobre la ubicación.
            System.out.printf("%n%s existe%n", ruta.getFileName()); 
            //  isDirectory de Files recibe un objeto Path y devuelve un boolean
            System.out.printf("%s un directorio%n" , Files.isDirectory(ruta)? "Es" : "No es"); 
            //  isAbsolute de Path devuelve un boolean que indica si ese objeto Path representa una ruta absoluta a un archivo
            System.out.printf("%s una ruta absoluta%n", ruta.isAbsolute()? "Es" : "No es"); 
            // getLastModifiedTime de Files recibe un objeto Path y devuelve un objeto FileTime que indica cuándo fue la última vez que se modificó el archivo
            System.out.printf("Fecha de ultima modificacion: %s%n", Files.getLastModifiedTime(ruta)); 
            // size de Files recibe un objeto Path y devuelve un long que representa el número de bytes en el archivo
            System.out.printf("Tamanio: %s%n", Files.size(ruta)); 
            System.out.printf("Ruta : %s%n", ruta);
            // toAbsolutePath de Path convierte el objeto Path con el que se invoca en una ruta absoluta
            System.out.printf("Ruta absoluta: %s%n", ruta.toAbsolutePath());
            if(Files.isDirectory(ruta)){
                System.out.printf("%nContenido del directorio:%n");
                // newDirectoryStream de Files obtiene un objeto DirectoryStream<Path> que contiene objetos Path para el contenido del directorio
                // objeto para iterar en el contenido
                DirectoryStream<Path> flujoDirectorio = Files.newDirectoryStream(ruta); 
                for(Path p : flujoDirectorio){
                    System.out.println(p);
                }
            }
        }
        else{ // si no existe el archivo
            System.out.printf("%s no existe%n", ruta);
        }
        
    }
    
}
