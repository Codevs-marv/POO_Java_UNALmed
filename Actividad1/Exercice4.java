package Actividad1;
import java.util.Scanner;

public class Exercice4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Ingrese la edad de Juan: ");
        int EdJuan = scanner.nextInt();
        int EdAlber = 2 * EdJuan / 3;
        int EdAna = 4 * EdJuan / 3;
        int EdMama = EdAlber + EdJuan + EdAna;
        
        System.out.println("Edad de Alber: " + EdAlber);
        System.out.println("Edad de Juan: " + EdJuan);
        System.out.println("Edad de Ana: " + EdAna);
        System.out.println("Edad de Mamá: " + EdMama);
        
        scanner.close();
    }
}
