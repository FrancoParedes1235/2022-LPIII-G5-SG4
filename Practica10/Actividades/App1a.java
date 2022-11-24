/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10act1a;

/**
 *
 * @author HOUSE
 */
public class App1a {
    public static void main(String[] args) throws Exception {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Character[] charArray = { 'C', 'U', 'R', 'S' , 'O' };
        // agregando los arreglos
        Float[] floatArray = {12.7f, 5.4f, 5.11f,8.6f};
        Boolean[] booleanArray = {false, true, false, true};
        
        System.out.printf("Array integerArray contiene:%n");
        imprimirArray(intArray);
        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray);
        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray);
        
        System.out.printf("%nArray floatArray contiene:%n");
        imprimirArray(floatArray);
        System.out.printf("%nArray booleanArray contiene:%n");
        imprimirArray(booleanArray);
    }
/*
    public static void imprimirArray(Integer[] inputArray) {
        for (Integer elemento : inputArray)
            System.out.printf("%s ", elemento);

        System.out.println();

    }

    public static void imprimirArray(Double[] inputArray) {
        for (Double elemento : inputArray)
            System.out.printf("%s ", elemento);

        System.out.println();

    }

    public static void imprimirArray(Character[] inputArray) {
        for (Character elemento : inputArray)
            System.out.printf("%s ", elemento);

        System.out.println();

    }
*/
    
    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray)
            System.out.printf("%s ", elemento);
        System.out.println();

    }

}
