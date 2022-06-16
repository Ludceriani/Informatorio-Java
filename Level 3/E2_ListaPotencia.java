import java.util.List;
import java.util.stream.Collectors;

public class E2_ListaPotencia {
    public static void main(String[] args) {
        List<Integer> enteros = List.of(1, 2, 3, 4, 5);
        List<Integer> potencia = enteros.stream()
                .map(potenciaNum -> potencial(potenciaNum,2))
                .collect(Collectors.toList());
        System.out.println(potencia);        
            
    }

    public static int potencial(int enteros, int potencia) {
        int resultado = 1;

        for (int i = 1; i <= potencia; i++) {
            resultado = (resultado * enteros);
        }
        return resultado;        
    }
}

