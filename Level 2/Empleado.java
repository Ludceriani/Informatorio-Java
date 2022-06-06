public class Empleado {

    private String nombre;
    private String apellido;
    private String dni;
    private int horasTrabajadas;
    private int valorPorHora;



    

    public Empleado(String nombre, String apellido, String dni, int horasTrabajadas, int valorPorHora) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.horasTrabajadas = horasTrabajadas;
        this.valorPorHora = valorPorHora;
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
    public String getDni() {
        return dni;
    }
    public void setDni(String dni) {
        this.dni = dni;
    }
    public int getHorasTrabajadas() {
        return horasTrabajadas;
    }
    public void setHorasTrabajadas(int horasTrabajadas) {
        this.horasTrabajadas = horasTrabajadas;
    }
    public int getValorPorHora() {
        return valorPorHora;
    }
    public void setValorPorHora(int valorPorHora) {
        this.valorPorHora = valorPorHora;
    }

    


    
}
