import java.util.ArrayList;
import java.util.List;

/**
 * Crear un ArrayList, agregar 5 números enteros. Luego, agregar un número entero al principio de la lista y otro al final. * Por último, iterar e imprimir los elementos de la lista y el tamaño de la misma (antes y después de agregar a
 * en la primera y última posición).*/

public class E2_Lista5numeros {

    public static void main(String[] args) {
        
        
        List<Integer> listaNumeros = new ArrayList<Integer>();
        
        listaNumeros.add(5);
        listaNumeros.add(16);
        listaNumeros.add(41);
        listaNumeros.add(10);
        listaNumeros.add(7);
        
        System.out.println("Elementos de la Lista: " + listaNumeros.size());
        listaNumeros.add(0,8);
        System.out.println("Lista luego de agregar un elemento al inicio: " + listaNumeros.size());
        listaNumeros.add(6, 20);
        System.out.println("Lista luego de agregar un elemento al final: " + listaNumeros.size());

        for (int i = 0; i <= i ;) {
            System.out.println("Lista final: " + listaNumeros + " con "+ listaNumeros.size() + " elementos ");
            break;

        }
        
        }

    
}