import java.util.Scanner;

public class E8_SolicitarDatos {
    
    public static void main(String[] args) {        
        System.out.println("Ingrese sus datos");
        Scanner scan = new Scanner(System.in);
        System.out.println("Nombre y apellido: ");
        String nombre_apellido = scan.nextLine();
        System.out.println("Edad: ");
        String edad = scan.nextLine();
        System.out.println("Dirección: ");
        String direccion = scan.nextLine();
        System.out.println("Cuidad: ");
        String cuidad = scan.nextLine();        
        scan.close();
        System.out.print(cuidad + " - ");
        System.out.print(direccion + " - ");
        System.out.print(edad + " - ");
        System.out.print(nombre_apellido + " - ");        
    }    
}
