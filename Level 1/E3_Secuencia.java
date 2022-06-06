import java.util.Scanner;

/** Programa que dado un número entero como dato de entrada
 * imprima la secuencia de números (incrementos de 1).
 */

public class E3_Secuencia {
    
    public static void main(String[] args) {

        System.out.println("Ingrese un numero: ");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();

        
             
        if (numero > 0) {
            for (int i = 1; i <= numero + 1; i++) {
                System.out.println(" ");
                for (int j = 1; j < i; j++) {
                    System.out.print(j);
                }
            }
        }
        else {
            System.out.println("Ingrese un numero correcto");
        }
        scan.close();         
        
        
    }
    
}
