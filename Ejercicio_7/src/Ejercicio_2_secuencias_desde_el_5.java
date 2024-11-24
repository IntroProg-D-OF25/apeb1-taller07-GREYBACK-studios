/**
 * Realizar un programa Java que permita presentar
 * en pantalla la siguiente secuencia:5/10, 10/12, 15/14, 20/16, 25/18.............n
 */
import java.util.Scanner;
public class Ejercicio_2_secuencias_desde_el_5 {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limite;
        int numerador = 5;
        int denominador = 10; 
        System.out.print("¿Hasta qué límite quieres generar la secuencia? ");
        limite = tcl.nextInt();
        System.out.println("Secuencia:");
        while (numerador <= limite) {
            System.out.print(numerador + "/" + denominador);
            numerador += 5; // Aumenta el numerador en 5
            denominador += 2; // Aumenta el denominador en 2
            if (numerador <= limite) {
                System.out.print(", ");
            }
        }
    }
}
/***
 * run:
 * ¿Hasta qué límite quieres generar la secuencia? 40
 * Secuencia:
 * 5/10, 10/12, 15/14, 20/16, 25/18, 30/20, 35/22, 40/24
 */