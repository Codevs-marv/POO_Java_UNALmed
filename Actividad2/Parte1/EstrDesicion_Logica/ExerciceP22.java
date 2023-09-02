package Actividad2.Parte1.EstrDesicion_Logica;
import java.util.Scanner;

public class ExerciceP22 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese nombres del empleado:");
        String nombre = scanner.nextLine();
        System.out.println("Ingrese salario basico por hora del empleado:");
        int salario = scanner.nextInt();
        System.out.println("Ingrese N° horas trabajadas al mes:");
        int horas = scanner.nextInt();
        double salarioMensual = salario * horas;

        if (salario > 450000) {
            System.out.println("Nombres: " + nombre + "\nSalario: $" + salarioMensual);
        } else {
            System.out.println("Nombres: " + nombre);
        }
        scanner.close();
    }
}
