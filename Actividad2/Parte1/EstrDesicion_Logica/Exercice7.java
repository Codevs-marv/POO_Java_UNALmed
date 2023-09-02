package Actividad2.Parte1.EstrDesicion_Logica;
import java.util.Scanner;

public class Exercice7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el valor de A:");
        int A = scanner.nextInt();
        System.out.println("Digite el valor de B:");
        int B = scanner.nextInt();

        if (A > B) {
            System.out.println("A es mayor que B");
        } else {
            if (A == B) {
                System.out.println("A es igual a B");
            } else {
                System.out.println("A es menor que B");
            }
        }
        scanner.close();
    }
}
