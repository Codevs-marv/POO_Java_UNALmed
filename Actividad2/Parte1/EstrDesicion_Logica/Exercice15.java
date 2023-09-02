package Actividad2.Parte1.EstrDesicion_Logica;
import java.util.Scanner;

public class Exercice15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese peso esfera A:");
        int PesoA = scanner.nextInt();
        System.out.println("Ingrese peso esfera B:");
        int PesoB = scanner.nextInt();
        System.out.println("Ingrese peso esfera C:");
        int PesoC = scanner.nextInt();
        System.out.println("Ingrese peso esfera D:");
        int PesoD = scanner.nextInt();

        if (PesoA == PesoB && PesoA == PesoC) {
            if (PesoD > PesoA) {
                System.out.println("La esfera D es la diferente y es de mayor peso");
            } else {
                System.out.println("La esfera D es la diferente y es de menor peso");
            }

        } else if (PesoA == PesoB && PesoA == PesoD) {
            if (PesoC > PesoA) {
                System.out.println("La esfera C es la diferente y es de mayor peso");
            } else {
                System.out.println("La esfera C es la diferente y es de menor peso");
            }

        } else if (PesoA == PesoC && PesoA == PesoD) {
            if (PesoB > PesoA) {
                System.out.println("La esfera B es la diferente y es de mayor peso");
            } else {
                System.out.println("La esfera B es la diferente y es de menor peso");
            }

        } else {
            if (PesoA > PesoB) {
                System.out.println("La esfera A es la diferente y es de mayor peso");
            } else {
                System.out.println("La esfera A es la diferente y es de menor peso");
            }
        }
        scanner.close();
    }
}
