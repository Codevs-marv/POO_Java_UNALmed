package Actividad2.Parte1.EstrDesicion_Logica;
import java.util.Scanner;

public class Exercice14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese los valores de VD1, VD2, VD3 y SALAR:");
        double VD1 = scanner.nextDouble();
        double VD2 = scanner.nextDouble();
        double VD3 = scanner.nextDouble();
        double SALAR = scanner.nextDouble();
        double SALAR1, SALAR2, SALAR3;

        double TOTVEN = VD1 + VD2 + VD3;
        double PORVEN = 0.33 * TOTVEN;

        if (VD1 > PORVEN) {
            SALAR1 = SALAR + 0.2 * SALAR;
        } else {
            SALAR1 = SALAR;
        }

        if (VD2 > PORVEN) {
            SALAR2 = SALAR + 0.2 * SALAR;
        } else {
            SALAR2 = SALAR;
        }

        if (VD3 > PORVEN) {
            SALAR3 = SALAR + 0.2 * SALAR;
        } else {
            SALAR3 = SALAR;
        }

        System.out.println("Salario vendedores depto. 1: $" + (int) SALAR1 + 
        ", Salario vendedores depto. 2: $" + (int) SALAR2 + ", Salario vendedores depto. 3: $" + (int) SALAR3);

        scanner.close();
    }
}