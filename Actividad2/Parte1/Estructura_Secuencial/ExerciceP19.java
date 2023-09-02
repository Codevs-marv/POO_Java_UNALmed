package Actividad2.Parte1.Estructura_Secuencial;
import java.text.DecimalFormat;
import java.util.Scanner;

public class ExerciceP19 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DecimalFormat formatoDecimal = new DecimalFormat("#.##");
        System.out.print("Ingrese valor del lado del triángulo equilátero:");
        double lado = scanner.nextDouble();

        double perimetro = 3 * lado;
        double altura = (Math.sqrt(3) / 2) * lado;
        double area = (Math.sqrt(3) / 4) * lado * lado;

        System.out.println("Perímetro: " +  formatoDecimal.format(perimetro));
        System.out.println("Altura: " +  formatoDecimal.format(altura));
        System.out.println("Área: " +  formatoDecimal.format(area));

        scanner.close();
    }
}
