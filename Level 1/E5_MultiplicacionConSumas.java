import java.util.Scanner;

/** Se desea una aplicación que solicite 2 números enteros y realice la operación de multiplicación por sumas sucesivas (sin uso de librerías).
 */

public class E5_MultiplicacionConSumas {
    
    public static void main(String[] args) {
        System.out.println("Ingrese dos numeros: ");
        Scanner scan = new Scanner(System.in);
        int valor1 = scan.nextInt();
        int valor2 = scan.nextInt();
        scan.close();
        int resultado = 0;

        for (int i = 1; i <= valor2; i++) {
            resultado += valor1;
        }
        
        System.out.println("El resultado es: " + resultado);
               
        
    }
}
