import java.util.Scanner;
/**
 *Generar una solución que permita ingresar jugadores 
 * de fútbol; por cada jugador se debe solicitar:
 * Nombre el jugador
 * Posición en el campo de juego
 * Edad
 * Estatura
 * El ciclo de ingreso de información deberá terminar cuando 
 * el usuario lo decida. Se debe imprimir el siguiente reporte 
 * (usar una cadena de acumulación):
 * Listado de Jugadores
 * 1. Alexander Dominguez -Arquero-, edad 32, estatura 1.95
 * 2. Xavier Arreaga -Defensa-, edad 24, estatura 1.85
 * 3. Moisés Caicedo -Mediocentro-, edad 19, estatura 1.88
 * 4. Ángel Mena -Delantero-, edad 32, estatura 1.75
 * 5. Michael Estrada -Delantero-, edad 27, estatura 1.93
 * Promedio de edades:  26.8
 * Promedio de estaturas: 1.87
 */
public class Ejercicio_4_ugadores_de_fútbol {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String nombre;
        String posicion;
        int edad;
        double estatura;
        String continuar;
        String reporte = ""; // Cadena para acumular el reporte
        do {
            System.out.println("Ingrese el nombre del jugador:");
            nombre = tcl.nextLine();
            System.out.println("Ingrese la posición del jugador:");
            posicion = tcl.nextLine();
            System.out.println("Ingrese la edad del jugador:");
            edad = tcl.nextInt();
            System.out.println("Ingrese la estatura del jugador (en metros):");
            estatura = tcl.nextDouble();
            tcl.nextLine(); 
            reporte += "Nombre: " + nombre +
                       ", Posición: " + posicion +
                       ", Edad: " + edad +
                       ", Estatura: " + estatura + " m\n";
            System.out.println("¿Desea ingresar otro jugador? (si/no):");
            continuar = tcl.nextLine();
        } while (continuar.equalsIgnoreCase("si"));
        System.out.println("\nReporte de Jugadores:");
        System.out.println(reporte);
    }
}
/***
 * Reporte de Jugadores:
 * Nombre: Alexander Domiguez, Posición: Arquero, Edad: 32, Estatura: 1.95 m
 * Nombre: Xavier Arrega, Posición: Defensa, Edad: 24, Estatura: 1.85 m
 * Nombre: Moisés Caicedo, Posición: Mediocentro, Edad: 19, Estatura: 1.88 m
 * Nombre: Ángel Mena, Posición: Delantero, Edad: 32, Estatura: 1.75 m
 * Nombre: Michael Estrada, Posición: Delantero, Edad: 27, Estatura: 1.93 m
 */