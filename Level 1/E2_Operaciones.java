import java.util.Scanner;;

/** Programa que solicita 2 números enteros e imprime el resultado de la suma,
 *  resta, multiplicación, división y módulo de ambos números.
 */

public class E2_Operaciones {
    
   
    public static void main(String[] args) {

        System.out.println("Ingrese dos numero: ");
        Scanner scan = new Scanner(System.in);
        int numero1 = scan.nextInt();
        int numero2 = scan.nextInt();
        System.out.println("Suma de ambos números: " + (numero1 + numero2));
        System.out.println("Resta de ambos números: " + (numero1 - numero2));
        System.out.println("Multiplicacion de ambos números: " + (numero1 * numero2));
        System.out.println("División de ambos números: " + (numero1 / numero2));
        System.out.println("Modulo de ambos números: " + (numero1 % numero2));
        System.out.println(scan);

    }

}
