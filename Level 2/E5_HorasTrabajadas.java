import java.util.ArrayList;
import java.util.List;

public class E5_HorasTrabajadas {
    /**Dados 2 ArrayList que contienen horas-trabajadas (array1) y valor-por-hora(array2) del resumen de carga de horas semanal de un empleado. Se debe generar otra lista que contenga los totales y luego imprimir el total final a cobrar.
     */
    public static void main(String[] args) {
        ArrayList<Integer> horasTrabajadas = new ArrayList<Integer>();
        ArrayList<Integer> valorXhora = new ArrayList<Integer>();        
                
        listaHoras(horasTrabajadas);
        ListaValorXHoras(valorXhora);

        List<Integer> totalSemanal = new ArrayList<Integer>();

        int resultado = 0;
        for (int i = 0; i < horasTrabajadas.size() ; i++) {
            totalSemanal.add(horasTrabajadas.get(i) * valorXhora.get(i));
            resultado += totalSemanal.get(i);
        }                
        System.out.println(horasTrabajadas);
        System.out.println(valorXhora);
        System.out.println(totalSemanal);
        System.out.println(resultado);
    }
    public static void listaHoras(List<Integer> horasTrabajadas) {
        horasTrabajadas.add(6);
        horasTrabajadas.add(7);
        horasTrabajadas.add(8);
        horasTrabajadas.add(4);
        horasTrabajadas.add(5);
    }

    public static void ListaValorXHoras(List<Integer> valorXhora) {
        valorXhora.add(350);
        valorXhora.add(345);
        valorXhora.add(550);
        valorXhora.add(600);
        valorXhora.add(320);
    }
}



    




