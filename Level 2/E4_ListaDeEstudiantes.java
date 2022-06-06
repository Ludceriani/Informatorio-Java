import java.util.ArrayList;
import java.util.List;

public class E4_ListaDeEstudiantes {
    
    /**
     * Cargar un arrayList con 12 nombres de estudiantes (String), luego separarlos
     * en 3 cursos (3 arrayList) e imprimir dichos cursos
     */

    public static void main(String[] args) {

        List<String> nombres = new ArrayList<>();
        ListaAlumnos(nombres);
        
        ArrayList<String> curso1 = new ArrayList<String>(nombres.subList(0, 4));
        ArrayList<String> curso2 = new ArrayList<String>(nombres.subList(4, 8));
        ArrayList<String> curso3 = new ArrayList<String>(nombres.subList(8, 12));
        
        System.out.println("Alumnos de Primer curso: " + curso1);
        System.out.println("Alumnos de Segundo curso: " + curso2);
        System.out.println("Alumnos de Tercer curso: " + curso3);
        
        
        
    }
    
   public static void ListaAlumnos(List<String> nombres) {
       nombres.add("Juan");
       nombres.add("María");
       nombres.add("Lisa");
       nombres.add("Dimitri");
       nombres.add("Matías");
       nombres.add("Adriana");
       nombres.add("Maiara");
       nombres.add("Ivan");
       nombres.add("Carlos");
       nombres.add("Franco");
       nombres.add("German");
       nombres.add("Agustín");

   }
    
   
}
