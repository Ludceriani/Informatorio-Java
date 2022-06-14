import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Dada una lista que contiene valores de tipo String, se deberá filtrar odos los valores que NO sean null o vacío ("").
 */
public class E1_FiltrarNullyVacio {
   
    public static void main(String[] args) {
        List<String> listString = new ArrayList<>();
        listString.add("Hola");
        listString.add(null);
        listString.add("Informatorio");
        listString.add("");
        
        List<String> listaFiltrada = listString.stream()
                .filter(element -> !(element == null))
                .filter(element -> !element.isEmpty())
                .collect(Collectors.toList());
        System.out.println(listaFiltrada);
    }
}
