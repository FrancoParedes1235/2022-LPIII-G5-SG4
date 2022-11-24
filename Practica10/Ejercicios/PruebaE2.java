/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10ejer2;
/**
 *
 * @author HOUSE
 */

public class PruebaE2 {
    
    public static <T> void intercabiaPosiciones(T[] inputArray, int ind1, int ind2) {

        T temp; // variable temporal
        temp = inputArray[ind1];
        inputArray[ind1] = inputArray[ind2];
        inputArray[ind2] = temp;

    }
    
    public static void main(String[] args) throws Exception {
        Integer[] intArray = { 1, 2, 3, 4, 5, 6, 7 };
        Double[] doubleArray = { 4.4, 5.5, 6.6, 7.7, 8.8, 9.9 };
        Character[] charArray = { 'C', 'U', 'R', 'S', 'O' };
        Float[] floatArray = {7.7f, 4.4f,9.9f,11f};
        
        System.out.printf("Arreglo integerArray  contiene:%n");
        imprimirArray(intArray);
        System.out.printf("%nArreglo doubleArray contiene:%n");
        imprimirArray(doubleArray);
        System.out.printf("%nArreglo charArray contiene:%n");
        imprimirArray(charArray);
        System.out.printf("%nArreglo floatArray contiene:%n");
        imprimirArray(floatArray);
        
        System.out.printf("\nArreglo integerArray  \nintercambiando posiciones%n");
        intercabiaPosiciones(intArray, 1, 5);
        imprimirArray(intArray);
        System.out.printf("\nArreglo doubleArray  \nintercambiando posiciones%n");
        intercabiaPosiciones(doubleArray, 0, 2);
        imprimirArray(doubleArray);
        System.out.printf("\nArreglo charArray  \nintercambiando pisiciones%n");
        intercabiaPosiciones(charArray, 0, 3);
        imprimirArray(charArray);
        System.out.printf("\nArreglo floatArray  \nintercambiando posiciones%n");
        intercabiaPosiciones(floatArray, 1, 3);
        imprimirArray(floatArray);
    }

    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray)
            System.out.printf("%s ", elemento);

        System.out.println();

    }
    
}
