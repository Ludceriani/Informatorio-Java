import java.time.LocalDate;
import java.time.Period;

public class Alumno {
    private String nombre;
    private String apellido;
    private LocalDate fechaDeNacimiento;  
    
    
    public Alumno(String nombre, String apellido, LocalDate string) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.fechaDeNacimiento = string;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }    
    public Alumno(LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
    }
    public Alumno(String nombre2, String apellido2, String string) {
    }
    public LocalDate getFechaDeNacimiento() {
        return fechaDeNacimiento;
    }    
    public String getNombreCompleto() {
        return apellido + " " + nombre;
    }

    public int getedad() {         
        LocalDate fechaNacimiento = fechaDeNacimiento;
        int edad = Period.between(fechaNacimiento, LocalDate.now()).getYears();        
        return edad;
    }
    
}
