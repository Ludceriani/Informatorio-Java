import java.util.Scanner;

/**Realizar un programa que dado un String de entrada en minúsculas lo convierta
 * por completo a mayúsculas. Sin toUppercase().
 */

public class E7_MinusAMayus {
    
    public static void main(String[] args) {
        
        System.out.println("Ingrese una palabra: ");
        Scanner scan = new Scanner(System.in);
        String palabra = scan.nextLine();
        String mayuscula = "";

        for (int i = 0; i < palabra.length(); i++) {
            char letra = convertir_Mayus(palabra.charAt(i));
            mayuscula += letra;
        }
        System.out.println(mayuscula);
        scan.close();

    }
    
    public static char convertir_Mayus(char palabra) {
        if (palabra >= 'a' || palabra <= 'z') {
            palabra = (char) (palabra - ('a' - 'A'));
        }
        return palabra;
    }
        
        
}
