/**
 *Generar un programa Java que permita ingresar 4 estudiantes; 
 * por cada uno de ellos ingresar el nombre del estudiante, 
 * el promedio de ciclo. Presentar el siguiente reporte
 * Estudiante 1	  10	Aprobado
 * Estudiante 2	  6.9	Reprobado
 * Estudiante 3	  7	Aprobado
 * Estudiante 4	  5	Reprobado
 */
import java.util.Scanner;
public class Ejercicio_5_Promedios {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre_Es, estado;
        double promedio, cont=1;
        while(cont <=4){
            System.out.print("Dame un nombre y un promedio: ");
            nombre_Es =tcl.next();
            promedio =tcl.nextDouble();
            estado = (promedio >= 7) ? "Aprobado" : "Reprobado";
            //if(promedio >= 7)
              //  estado = "Aprobado";
            //else
              //  estado = "Reprobado";
            System.out.println("Nombre Promedio Estado");
            System.out.println(nombre_Es + "\t" + promedio + "\t" + estado);
            cont++;
        }
    }
}
/***
 * Dame un nombre y un promedio: Bryan 10
 *Nombre Promedio Estado
 * Bryan	10.0	Aprobado
 * Dame un nombre y un promedio: Alexander 8
 * Nombre Promedio Estado
 * Alexander	8.0	Aprobado
 * Dame un nombre y un promedio: Valeria 5
 * Nombre Promedio Estado
 * Valeria	5.0	Reprobado
 * Dame un nombre y un promedio: Vargas 6
 * Nombre Promedio Estado
 * Vargas	6.0	Reprobado
 */