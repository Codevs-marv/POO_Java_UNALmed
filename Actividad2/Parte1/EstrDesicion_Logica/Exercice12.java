package Actividad2.Parte1.EstrDesicion_Logica;
import java.util.Scanner;

public class Exercice12 {
    public static void main(String[] args) {
        // Declaración de variables
        int HET;
        int HEE8;
        int Salario;

        // crear un objeto para leer la entrada del teclado
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombre del trabajador:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese N° de horas trabajadas:");
        int NHT = scanner.nextInt();
        
        System.out.println("Ingrese valor hora de trabajo:");
        int VHN = scanner.nextInt();
        scanner.close();

        if (NHT > 40) {
            HET = NHT -40;
            if (HET > 8) {
                HEE8 = HET - 8;
                Salario = 40 * VHN + 16 * VHN + HEE8 * 3 * VHN;
            } else {
                Salario = 40 * VHN + HET * 2 * VHN;
            }
        } else {
            Salario = NHT * VHN;
        }
        System.out.println("El trabajador " + nombre + " devengó: $" + Salario);
    }
}
