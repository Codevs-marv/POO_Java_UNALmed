package Actividad2.Parte1.EstrDesicion_Logica;
import java.util.Scanner;

public class Exercice13 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingres el valor de la compra:");
        int valComp = scanner.nextInt();
        scanner.nextLine(); // Consumir la nueva línea pendiente
        System.out.println("¿Cual es el color de su bolita?");
        String color = scanner.nextLine();
        int valPag;
        int pDes;

        if (color.equals("blanco")) {
            pDes = 0;
        } else if (color.equals("verde")) {
            pDes = 10;
        } else if (color.equals("amarillo")) {
            pDes = 25;
        } else if (color.equals("azul")) {
            pDes = 50;
        } else {
            pDes = 100;
        }

        valPag = valComp - pDes * valComp / 100;
        System.out.println("El cliente debe pagar: $" + valPag);
        scanner.close();
    }
}
