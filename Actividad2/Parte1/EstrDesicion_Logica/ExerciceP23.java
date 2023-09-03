package Actividad2.Parte1.EstrDesicion_Logica;

import java.util.Scanner;

public class ExerciceP23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de A:");
        double A = sc.nextDouble();
        System.out.println("Ingrese el valor de B:");
        double B = sc.nextDouble();
        System.out.println("Ingrese el valor de C:");
        double C = sc.nextDouble();
        
        // Calcula el discriminante
        double discriminante = B * B - 4 * A * C;
        
        if (discriminante > 0) {
            // Dos soluciones reales
            double x1 = (-B + Math.sqrt(discriminante)) / (2 * A);
            double x2 = (-B - Math.sqrt(discriminante)) / (2 * A);
            System.out.println("Las soluciones son:");
            System.out.println("x1 = " + x1);
            System.out.println("x2 = " + x2);
        } else if (discriminante == 0) {
            // Una solución real
            double x1 = -B / (2 * A);
            System.out.println("La única solución es:");
            System.out.println("x1 = " + x1);
        } else {
            // No hay soluciones reales
            System.out.println("No existen soluciones reales.");
        }
        sc.close();
    }
}
