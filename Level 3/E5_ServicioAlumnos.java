
import java.time.LocalDate;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class E5_ServicioAlumnos {

/*
* Se posee una Lista con objetos de clase Alumno con los atributos: apellido,
* nombre y fechaDeNacimiento (con tipos: String, String y LocalDate). Se desea
* generar un Map<String, Integer> donde la clave de Map será el apellido
* concatenado con el nombre (con separador de espacio en blanco) y el value la
* edad del alumno*/
    
public static void main(String[] args) {
                

                List<Alumno> alumno = List.of(
                                new Alumno("Juan", "Vera", LocalDate.parse("1994-03-03")    
                        ));
                Map<String, Integer> alumnoMap = alumno.stream()
                        .collect(Collectors
                        .toMap((element) -> element.getNombreCompleto(), (element) -> element.getedad()));
                        
                System.out.println(alumnoMap);
        }
}
    

    
    

