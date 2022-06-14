import java.util.Scanner;
/**
 * Se desea una aplicación que solicite 2 números enteros y realice la operación
 * de potencia (sin uso de librerías).
 */
public class E6_Potencia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese un número para la base: ");
        int base = scan.nextInt();
        System.out.println("Ingrese un número para la potencia: ");
        int potencia = scan.nextInt();
        scan.close();
        int resultado = 1;

        for (int i = 1; i <= potencia; i++) {
            resultado = (resultado * base);
        }
        System.out.println("El número " + base + " elevado a la " + potencia + " es: " + resultado);
    }
} 