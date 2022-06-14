import java.util.Scanner;

/** Programa que solicita el nombre del usuario e imprimir por pantalla el
 * siguiente mensaje “HOLA {USUARIO}!!!”
 */
public class E1_HolaUsuario {
    public static void main(String[] args) {   
        System.out.println("¡Bienvenido! Ingrese su nombre: ");
        Scanner scan= new Scanner(System.in);
        String usuario = scan.nextLine();
        System.out.println("¡Hola " + usuario + "!");
        scan.close();
    }
}