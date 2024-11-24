import java.util.Scanner;
/**
 *Realizar un programa Java que permita pedir por teclado el nombre de 5 empleados. 
 * Por cada empleado se debe solicitar el nombre, numero de días trabajados y costo 
 * del día trabajo. Calcular el valor a cancelar por la empresa para cada empleado.
 * Presentar un reporte como el siguiente:
 * Nombre 1	10	$2.5	$25
 * Nombre 2	11	$2	$22
 * Nombre 3	9	$3	$27
 * Nombre 4	5	$4	$20
 * Nombre 5	12	$2	$24
 */
public class Ejercicio_3_dia_trabajo {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre1, nombre2, nombre3, nombre4, nombre5;
        int diasTrabajados1, diasTrabajados2, diasTrabajados3, diasTrabajados4, diasTrabajados5;
        double costoPorDia1, costoPorDia2, costoPorDia3, costoPorDia4, costoPorDia5;
        double totalAPagar1, totalAPagar2, totalAPagar3, totalAPagar4, totalAPagar5;
        System.out.println("Ingrese el nombre del empleado 1:");
        nombre1 = tcl.nextLine();
        System.out.println("Ingrese el número de días trabajados de " + nombre1 + ":");
        diasTrabajados1 = tcl.nextInt();
        System.out.println("Ingrese el costo del día de trabajo de " + nombre1 + ":");
        costoPorDia1 = tcl.nextDouble();
        totalAPagar1 = diasTrabajados1 * costoPorDia1;
        tcl.nextLine(); 
        System.out.println("Ingrese el nombre del empleado 2:");
        nombre2 = tcl.nextLine();
        System.out.println("Ingrese el número de días trabajados de " + nombre2 + ":");
        diasTrabajados2 = tcl.nextInt();
        System.out.println("Ingrese el costo del día de trabajo de " + nombre2 + ":");
        costoPorDia2 = tcl.nextDouble();
        totalAPagar2 = diasTrabajados2 * costoPorDia2;
        tcl.nextLine(); 
        System.out.println("Ingrese el nombre del empleado 3:");
        nombre3 = tcl.nextLine();
        System.out.println("Ingrese el número de días trabajados de " + nombre3 + ":");
        diasTrabajados3 = tcl.nextInt();
        System.out.println("Ingrese el costo del día de trabajo de " + nombre3 + ":");
        costoPorDia3 = tcl.nextDouble();
        totalAPagar3 = diasTrabajados3 * costoPorDia3;
        tcl.nextLine();
        System.out.println("Ingrese el nombre del empleado 4:");
        nombre4 = tcl.nextLine();
        System.out.println("Ingrese el número de días trabajados de " + nombre4 + ":");
        diasTrabajados4 = tcl.nextInt();
        System.out.println("Ingrese el costo del día de trabajo de " + nombre4 + ":");
        costoPorDia4 = tcl.nextDouble();
        totalAPagar4 = diasTrabajados4 * costoPorDia4;
        tcl.nextLine();
        System.out.println("Ingrese el nombre del empleado 5:");
        nombre5 = tcl.nextLine();
        System.out.println("Ingrese el número de días trabajados de " + nombre5 + ":");
        diasTrabajados5 = tcl.nextInt();
        System.out.println("Ingrese el costo del día de trabajo de " + nombre5 + ":");
        costoPorDia5 = tcl.nextDouble();
        totalAPagar5 = diasTrabajados5 * costoPorDia5;
        System.out.println("\nReporte de empleados:");
        System.out.println("Nombre\tDías Trabajados\tCosto por Día\tTotal a Pagar");
        System.out.printf("%s\t%d\t$%.2f\t$%.2f%n", nombre1, diasTrabajados1, costoPorDia1, totalAPagar1);
        System.out.printf("%s\t%d\t$%.2f\t$%.2f%n", nombre2, diasTrabajados2, costoPorDia2, totalAPagar2);
        System.out.printf("%s\t%d\t$%.2f\t$%.2f%n", nombre3, diasTrabajados3, costoPorDia3, totalAPagar3);
        System.out.printf("%s\t%d\t$%.2f\t$%.2f%n", nombre4, diasTrabajados4, costoPorDia4, totalAPagar4);
        System.out.printf("%s\t%d\t$%.2f\t$%.2f%n", nombre5, diasTrabajados5, costoPorDia5, totalAPagar5);

    }    
}

/***
 * Reporte de empleados:
 * Nombres   Días Trabajados	Costo por Día	Total a Pagar
 * dfsd            10               $2,50	$25,00
 * reger	   11               $2,00	$22,00
 * reger	   9                $3,00	$27,00
 * ytnrt	   5                $4,00	$20,00
 * trhrt	   12               $2,00	$24,00
 */