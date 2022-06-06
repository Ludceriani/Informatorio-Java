import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

    /**
     * Crear una función que dado 2 argumentos (int, siendo el primero menor al segundo), nos devuelva un array de        * Strings. Con la secuencia de números enteros de principio a final. Pero si el número es multiplo de 2 colocara el
     * valor “Fizz”, si es múltiplo de 3 “Buzz” y si es a la vez múltiplo de ambos colocara “FizzBuzz”.
     * Observacion: Los 2 argumentos indican con que valor se arranca a calcular y el segundo con qué valor debe frenar   (no se incluye en el cálculo) Ejemplo: (1, 5) ----> calculará valores de 1, 2, 3, 4
     */


public class E7_FizzBuzzFuncion {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ingrese argumento menor: ");
        int argMenor = scan.nextInt();
        System.out.println("Ingrese argumento mayor: ");
        int argMayor = scan.nextInt();
        

        scan.close();
        
        System.out.println(Arrays.toString(FizzBuzzFuncion(argMenor, argMayor).toArray()));

    }
    
    public static List<String> FizzBuzzFuncion(int argumento1, int argumento2) {
        List<String> array = new ArrayList<>();

        for (int i = argumento1; i <= argumento2; i++) {
            if (argumento1 % 2 == 0 && argumento1 % 3 == 0) {
                array.add(i + " " + "FizzBuzz");
                } else if (argumento1 % 3 == 0) {
                    array.add(i + " " + "Buzz");
                    } else if (argumento1 % 2 == 0) {
                        array.add(i + " " + "Fizz");
                    }
        }
        return array;
            
    }   
    

}
