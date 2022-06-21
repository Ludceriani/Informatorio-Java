import java.util.List;

/* Se dispone de una lista de Strings, de la cual saber la cantidad de valores que comiencen con la letra B (tanto mayúscula como *minúscula, en ese caso decimos que será ignoreCase).
*/

public class E3_CantidadDeB {
    
    public static void main(String[] args) {
        List<String> palabras = List.of("Batman", "Aquaman", "Flash", "Batgirl", "Wonder Woman", "brainiac");
        long contLetrasB = palabras.stream()
            .filter(inicial -> inicial.startsWith("B")||inicial.startsWith("b"))
                .count();
        System.out.println(contLetrasB);       
        
    }
}
