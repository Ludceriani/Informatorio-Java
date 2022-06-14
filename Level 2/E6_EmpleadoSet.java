import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Se dispone de una colección de Empleados: Nombre y Apellido, DNI,
 * horasTrabajadas, valorPorHora.
 * Todos los empleados están cargados en un Set (HashSet), se desea calcular el
 * sueldo (horasTrabajadas x valorPorHora) de toda esa lista para luego
 * almacenar en un Map (o Diccionario) donde la clave (key) es el dni y el valor
 * (value) es el sueldo calculado.
 * 
 */

public class E6_EmpleadoSet {
    
    public static void main(String[] args) {

        HashSet<Empleado> empleados = new HashSet<>();
        Empleado empleado1 = new Empleado("Juan", "Sosa", "36.686.273", 8, 450);
        Empleado empleado2 = new Empleado("Javier", "Vera", "38.741.951", 8, 500);

        empleados.add(empleado1);
        empleados.add(empleado2);

        Map<String, Integer> map = new HashMap<String, Integer>();
        
        for (Empleado obj : empleados) {
            int totalSueldo = obj.getValorPorHora() * obj.getHorasTrabajadas();
            map.put(obj.getDni(), totalSueldo);
        }
        
        System.out.println("Sueldo de empleado según DNI: " + map);      


    }    
    
}


