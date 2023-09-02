package Actividad2.Parte1.Estructura_Secuencial;
import java.util.Scanner;

public class ExerciceP18 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese codigo del empleado: ");
        String codigo = scanner.nextLine();
        System.out.print("Ingrese los nombres del empleado: ");
        String nombres = scanner.nextLine();
        System.out.print("Ingrese número de horas trabajadas al mes: ");
        double horasTrabajadas = scanner.nextDouble();
        System.out.print("Ingrese valor hora trabajada: ");
        double valorHora = scanner.nextDouble();
        System.out.print("Ingrese porcentaje de retención en la fuente: ");
        double retencion = scanner.nextDouble();

        double salarioBruto = horasTrabajadas * valorHora;
        double reteFuente = (salarioBruto * retencion) / 100;
        double salarioNeto = salarioBruto - reteFuente;

        System.out.println("\nInformacion del empleado:");
        System.out.println("Codigo: " + codigo);
        System.out.println("Nombres: " + nombres);
        System.out.println("Salario Bruto: $" + salarioBruto);
        System.out.println("Salario Neto: $" + salarioNeto);

        scanner.close();
    }
}
