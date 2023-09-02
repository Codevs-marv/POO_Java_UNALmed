package Actividad2.Parte1.EstrDesicion_Logica;
import java.util.Scanner;

public class ExerciceP24 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite el peso de la esfera A:");
        double E1 = scanner.nextDouble();
        System.out.println("Digite el peso de la esfera B:");
        double E2 = scanner.nextDouble();
        System.out.println("Digite el peso de la esfera C:");
        double E3 = scanner.nextDouble();
        double mayor = E1;
        
        if (E2 > mayor || E3 > mayor) {
            if (E2 > mayor) {
                mayor = E2;
                if (mayor < E3) {
                    mayor = E3;
                    System.out.println("La esfera de mayor peso es la C");
                } else {
                    System.out.println("La esfera de mayor peso es la B");
                }
            }
        }  else {
                System.out.println("La esfera de mayor peso es la A");
            }
        scanner.close();
    }
}
