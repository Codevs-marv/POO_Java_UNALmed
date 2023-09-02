package Actividad2.Parte1.EstrDesicion_Logica;
import java.util.Scanner;

public class Exercice11 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el valor del 1er numero:");
        int N1 = scanner.nextInt();
        System.out.println("Digite el valor del 2do numero:");
        int N2 = scanner.nextInt();
        System.out.println("Digite el valor del 3er numero:");
        int N3 = scanner.nextInt();
        int MAYOR;

        if (N1 > N2 && N1 > N3) {
            MAYOR = N1;
        } else {
            if (N2 > N3) {
                MAYOR = N2;
            } else {
                MAYOR = N3;
            }
        }
        System.out.println("El valor mayor entre: " + N1 + "," + N2 + "," + N3 +
        " es " + MAYOR);
        scanner.close();
    }
}
