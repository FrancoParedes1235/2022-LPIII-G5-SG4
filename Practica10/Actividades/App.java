/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10act2;

/**
 *
 * @author HOUSE
 */
public class App {

    public static void main(String[] args) throws Exception {
        Integer[] intArray = { 1, 2, 3, 4, 5 };
        Double[] doubleArray = { 1.1, 2.2, 3.3, 4.4, 5.5 };
        Character[] charArray = { 'G', 'R', 'U', 'P' , 'O' };

        System.out.printf("Array integerArray contiene:%n");
        imprimirArray(intArray);
        System.out.printf("%nArray doubleArray contiene:%n");
        imprimirArray(doubleArray);
        System.out.printf("%nArray charArray contiene:%n");
        imprimirArray(charArray);

        System.out.println("\nImpresion con limites:");
        System.out.printf("%nArray integerArray contiene");
        imprimirArray(intArray, 0, 3);
        System.out.printf("%nArray doubleArray contiene");
        imprimirArray(doubleArray, 2, 3);
        System.out.printf("%nArray charArray contiene");
        imprimirArray(charArray, 1, 2);

    }

    public static <T> void imprimirArray(T[] inputArray) {
        for (T elemento : inputArray)
            System.out.printf("%s ", elemento);

        System.out.println();

    }

    public static <T> void imprimirArray(T[] inputArray, int limiteInferior, int limiteSuperior) {
        int longitud = inputArray.length - 1;

        try {
            validacion(longitud, limiteInferior, limiteSuperior);
            System.out.print(" desde " + limiteInferior + " hasta " + limiteSuperior + ": \n");
            for (int i = limiteInferior; i <= limiteSuperior; i++) {
                System.out.print(inputArray[i] + " ");
            }

        } catch (Exception e) {
            System.out.println("\n" + e.getMessage());
        }
    }

    public static void validacion(int longitud, int limiteInferior, int limiteSuperior)
            throws LimiteInvalidoException {
        if (limiteInferior < 0 || limiteInferior > longitud || limiteSuperior < 0 || limiteSuperior > longitud
                || limiteInferior > limiteSuperior) {
            throw new LimiteInvalidoException("Indice invalido(s)");
        }
    }
}

class LimiteInvalidoException extends IndexOutOfBoundsException {
    public LimiteInvalidoException(String error) {
        super(error);
    }
}