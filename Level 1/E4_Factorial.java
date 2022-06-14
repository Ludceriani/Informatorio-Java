import java.util.Scanner;

/** Realizar un programa que calcule el factorial de un número:
 *  n! = 1 x 2 x 3 x 4 x 5 x … x (n-1) x n. Sin hacer uso de librerías.
 */
public class E4_Factorial {
    public static void main(String[] args) {
        System.out.println("Ingrese un número para calcular su factorial: ");
        Scanner scan = new Scanner(System.in);
        int numero = scan.nextInt();        
        scan.close();
        System.out.println("El factorial de " + numero + " es: " + factorial(numero));
    }
    public static int factorial(int valor) {
        System.out.println(valor);
        if (valor == 1) {
            return 1;
        }
        return valor * factorial(valor - 1);
    }    
}
