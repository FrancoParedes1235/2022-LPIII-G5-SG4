/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab10act1b;

/**
 *
 * @author HOUSE
 */

public class App1b {
    //implemetado del codigo mnimo
    public static void main(String[] args) throws Exception {
        System.out.printf("El maximo de %d, %d y %d es %d%n%n",
                3, 4, 5, maximo(3, 4, 5));
        System.out.printf("El maximo de %.1f, %.1f y %.1f es %.1f%n%n",
                6.6, 7.7, 8.8, maximo(6.6, 7.7, 8.8));
        // Para el caso de los objetos String la comparación se hace alfabéticamente.
        System.out.printf("El maximo de %s, %s and %s es %s%n%n",
                "pera", "zanahoria", "uva", maximo("pera", "zanahoria", "uva"));

        System.out.printf("El minimo de %d, %d, %d y %d es %d%n%n",
                3, 4, 5, 6, minimo(6, 4, 5, 3));
        System.out.printf("El minimo de %.1f, %.1f, %.1f y %.1f es %.1f%n%n",
                6.6, 7.7, 8.8, 9.9, minimo(6.6, 7.7, 8.8, 9.9));
        // Para el caso de los objetos String la comparación se hace alfabéticamente.
        System.out.printf("El minimo de %s, %s, %s and %s es %s%n%n", "manzana", "zanahoria", "fresa", "palta", minimo("palta", "zanahoria", "fresa", "manzana"));
    }

    // Agregando el nuevo método
    public static <T extends Comparable<T>> T minimo(T r, T a, T b, T c) {
        T min = r;
        if (a.compareTo(r) < 0)
            min = a;
        if (b.compareTo(a) < 0)
            min = b;
        if (c.compareTo(b) < 0)
            min = c;
        return min;
    }
    
    public static <T extends Comparable<T>> T maximo(T x, T y, T z) {
        T max = x;
        if (y.compareTo(x) > 0)
            max = y;
        if (z.compareTo(y) > 0)
            max = z;
        return max;
    } 
}


