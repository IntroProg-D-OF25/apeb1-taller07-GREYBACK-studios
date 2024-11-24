/***
 * Realizar un programa Java que permita presentar 
 * en pantalla la siguiente secuencia:1/10 ,2/11 ,3/12 ,4/13 ........n
 */
import java.util.Scanner;
public class Ejercicio_1_secuencia {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        int limite, contador =1;
        System.out.print("Dame un limite");
        limite =tcl.nextInt();
        while (contador <=limite){
            System.out.print(contador + "/"+ (contador+2)+ ",");
            contador++;
        }
        
    }
}
/***
 * Dame un limite: 10
 * 1/10,2/11,3/12,4/13,5/14,6/15,7/16,8/17,9/18,10/19
 */
