/**
 *Generar e imprimir la siguiente serie:
 * sumatoria = -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 */
import java.util.Scanner;
public class Ejercicio_7_sumatoria_de_serie {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        double sumatoria = 0.0;
        String serie = "";
        sumatoria += -(1.0 / 1);
        serie += "-(1/1)";
        sumatoria += (1.0 / 2);
        serie += "+(1/2)";
        sumatoria += -(1.0 / 3);
        serie += "-(1/3)";
        sumatoria += (1.0 / 4);
        serie += "+(1/4)";
        sumatoria += -(1.0 / 5);
        serie += "-(1/5)";
        sumatoria += (1.0 / 6);
        serie += "+(1/6)";
        sumatoria += -(1.0 / 7);
        serie += "-(1/7)";
        sumatoria += (1.0 / 8);
        serie += "+(1/8)";
        sumatoria += -(1.0 / 9);
        serie += "-(1/9)";
        sumatoria += (1.0 / 10);
        serie += "+(1/10)";
        System.out.println("La serie es: " + serie);
        System.out.println("La sumatoria es: " + sumatoria);
    }
}
/***
 * La serie es: -(1/1)+(1/2)-(1/3)+(1/4)-(1/5)+(1/6)-(1/7)+(1/8)-(1/9)+(1/10)
 * La sumatoria es: -0.6456349206349207
 */