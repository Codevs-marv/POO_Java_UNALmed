package Actividad1;

public class Exercice5 {
    public static void main(String[] args) {
    float suma = 0;
    float x = 20;
    suma = suma + x;
    float y = 40;
    x = x + (y*y);
    suma = suma + (x/y);
    System.out.println("El valor de la suma es: " + suma);
    }
}