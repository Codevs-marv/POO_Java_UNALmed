package Actividad1;
import java.util.Scanner;

public class Exercice17 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de números que desea sumar: ");
        int N = scanner.nextInt();
        int suma = 0;
        int num = 1;

        while (num <= N) {
            suma = suma + num;
            num ++;
        }
    System.out.println("La suma es: " + suma);
    scanner.close();
    }
}
