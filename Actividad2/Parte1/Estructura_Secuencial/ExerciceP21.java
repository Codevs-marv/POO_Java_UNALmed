package Actividad2.Parte1.Estructura_Secuencial;
import java.util.Scanner;

public class ExerciceP21 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese valor del 1er lado del triangulo: ");
        double lado1 = scanner.nextDouble();
        System.out.print("Ingrese valor del 2do lado del triangulo: ");
        double lado2 = scanner.nextDouble();
        System.out.print("Ingrese valor del 3er lado del triangulo: ");
        double lado3 = scanner.nextDouble();

        double perimetro = lado1 + lado2 + lado3;
        double semiper = perimetro / 2;
        double area = Math.sqrt(semiper * (semiper - lado1) * (semiper - lado2) * (semiper - lado3));

        System.out.println("Perimetro: " + perimetro);
        System.out.println("Semiperimetro: " + semiper);
        System.out.println("Area: " + area);

        scanner.close();
    }
}
