import java.util.List;
import java.util.stream.Collectors;

public class E4_FactorialSinRepetidos {
    /*
     * Se dispone de una lista de Integer, de la cual queremos obtener otra lista
     * aplicando la operación de factorial pero no se desean valores repetidos.
     */

    public static void main(String[] args) {
        List<Integer> listInteger = List.of(1, 2, 4, 4, 4);
        List<Integer> listFactorial = listInteger.stream()
                .map(factorialNum -> factorial(
                        factorialNum))
                .collect(Collectors.toList());
        List<Integer> listaFiltrada = listFactorial.stream().distinct()
                .collect(Collectors.toList());
        System.out.println(listaFiltrada);

    }

    public static int factorial(int valor) {
        System.out.println(valor);
        if (valor == 1) {
            return 1;
        }
        return valor * factorial(valor - 1);
    }

}
