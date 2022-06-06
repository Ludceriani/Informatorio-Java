import java.util.ArrayList;
import java.util.Collections;


public class E3_BarajaFrancesa {

    /**
     * Crear una lista que contenga como elementos la numeración de cartas de una
     * baraja francesa (solo los valores, no figuras). Se deberá cargar el ArrayList
     * (en orden),imprimir, imprimir en orden inverso (reverse), desordenar
     * (mezclar) el arrayList y volver a imprimir. 
     */

    public static void main(String[] args) {

        ArrayList<String> valorBaraja = new ArrayList<>();
        for (int i = 1; i < 13; i++) {
            valorBaraja.add(String.format("%s", i));
        }
        System.out.println("Baraja Ordenada " + valorBaraja);
        Collections.reverse(valorBaraja);
        System.out.println("Baraja en Orden Inverso " + valorBaraja);

        Collections.shuffle(valorBaraja);
        System.out.println("Baraja Mezclada " + valorBaraja);
    }
}

