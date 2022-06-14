import java.util.ArrayList;
import java.util.Scanner;

/* 1.	Crear un ArrayList y cargarlo con tus ciudades favoritas de Argentina, luego imprimir por pantalla el ranking
 */

public class E1_CuidadesFavoritas {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> ciudades = new ArrayList<String>();
        int x = 1, i = 1;
        while (x != 0) {
            System.out.println("Ingresar ciudad favorita : ");
            System.out.println("#" + (i));
            String cuidad = sc.nextLine();
            ciudades.add(cuidad);
            i++;
            System.out.println("Presione 0 para finalizar o enter para ingresar una nueva ciudad");
            x = Integer.parseInt(sc.nextLine());
        }
        cuidadesFavoritas(ciudades);
        sc.close();
    }
    public static void cuidadesFavoritas(ArrayList<String> ciudades) {
        System.out.println("Ranking de ciudades favoritas  : ");
        for (String c : ciudades) {
            System.out.println("#" + (ciudades.indexOf(c) + 1) + " - " + c);
        }
    }
}




