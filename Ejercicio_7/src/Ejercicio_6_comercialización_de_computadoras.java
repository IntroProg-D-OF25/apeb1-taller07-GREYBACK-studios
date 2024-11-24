/**
 * Una empresa de comercialización de computadoras realiza el proceso de venta 
 * haciendo un descuento por tipo de cliente: Si es cliente tipo 1 hay un 
 * descuento del 10% Si es cliente tipo 2 hay un descuento del 20% En caso
 * que sea otro tipo de cliente, no hay descuento. Generar un proceso que 
 * permita ingresar 7 ventas: por cada venta preguntar los siguiente datos:
 * Nombre del cliente
 * Costo de la computadora (solo se vende una computadora por transacción)
 * Tipo de cliente Presentar el siguiente reporte: Cliente tipo 1, compra computadora con precio $100
 */
import java.util.Scanner;
public class Ejercicio_6_comercialización_de_computadoras {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        String[] nombresClientes = new String[7];
        double[] costosComputadoras = new double[7], descuentos = new double[7],preciosFinales = new double[7];;
        int[] tiposClientes = new int[7];
        // Ingresar 7 ventas
        for (int i = 0; i < 7; i++) {
            System.out.println("Venta #" + (i + 1));
            System.out.print("Ingrese el nombre del cliente: ");
            nombresClientes[i] = tcl.nextLine();
            System.out.print("Ingrese el costo de la computadora: ");
            costosComputadoras[i] = tcl.nextDouble();
            System.out.print("Ingrese el tipo de cliente (1 o 2): ");
            tiposClientes[i] = tcl.nextInt();
            tcl.nextLine(); // Limpiar el buffer
            if (tiposClientes[i] == 1) {
                descuentos[i] = 0.10; // 10% de descuentoi] == 2) {
                descuentos[i] = 0.20;
            } else {
                descuentos[i] = 0.0;
            }
            // Calcular el precio final
            preciosFinales[i] = costosComputadoras[i] - (costosComputadoras[i] * descuentos[i]);
        }
        System.out.println("\nReporte de Ventas:");
        System.out.println("Nombre\tCosto Original\tTipo de Cliente\tDescuento\tPrecio Final");
        for (int i = 0; i < 7; i++) {
            System.out.printf("%s\t$%.2f\t%d\t$%.2f\t$%.2f%n", 
                              nombresClientes[i], 
                              costosComputadoras[i], 
                              tiposClientes[i], 
                              costosComputadoras[i] * descuentos[i], 
                              preciosFinales[i]);
    }

    }
}
 /***
  * Nombre	Costo Original	Tipo de Cliente	 Descuento	Precio Final
  * Jorgue	$4500,00	1                 $450,00	$4050,00
  * Ezequiel	$2500,00	2                 $500,00	$2000,00
  * Bryan	$5000,00	1                 $500,00	$4500,00
  * Raul	$650,00	        3                  $0,00	$650,00
  * Flora	$780,00	        1                 $78,00	$702,00
  * Fernando	$890,00	        2                $178,00	$712,00
  * Bety	$4560,00	1                 $456,00	$4104,00
  */