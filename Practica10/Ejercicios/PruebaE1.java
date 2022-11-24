/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10ejer1;

/**
 *
 * @author HOUSE
 */
public class PruebaE1 {

    public static void main(String[] args) throws Exception {

        Character[] charArray = {'C', 'U', 'R', 'S', 'O'};
        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray);
        String[] a = {"Uno", "Dos", "Tres", "Cuatro", "Cinco", "Seis", "Siete", "Ocho", "a", "b", "c", "d", "e"};
        System.out.printf("%nArray de cadenas contiene:%n");
        imprimirArray(a);
    }

    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray) {
            System.out.printf("%s ", elemento);
        }
        System.out.println();
    }

    public static void imprimirArray(String[] stringArray) {
        for (int i = 0; i < stringArray.length; i++) {
            System.out.printf("%-10s", stringArray[i]);
            if ((i + 1) % 4 == 0) {
                System.out.println();
            }
        }
    }
}
