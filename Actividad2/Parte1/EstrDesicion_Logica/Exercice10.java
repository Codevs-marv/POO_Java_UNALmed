package Actividad2.Parte1.EstrDesicion_Logica;
import java.util.Scanner;

public class Exercice10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite No. de inscripcion:");
        int NI = scanner.nextInt();
        scanner.nextLine(); // Agrega esta línea para consumir el carácter de nueva línea
        System.out.println("Escriba sus nombres:");
        String NOM = scanner.nextLine();
        System.out.println("Ingrese su patrimonio:");
        int PAT = scanner.nextInt();
        System.out.println("Ingrese su estrato:");
        int ES = scanner.nextInt();
        double PAGMAT = 50000;

        if (PAT > 2000000 && ES > 3) {
            PAGMAT = PAGMAT + 0.03 * PAT;
        }
        System.out.println("El estudiante con numero de inscripcion " + String.format("%04d", NI) +
        " y nombre " + NOM + " debe pagar: $" + (int) PAGMAT);

        scanner.close();
    }
}
