import java.time.LocalDate;

public class Alumnos {
    private String nombre;
    private String apellido;
    private LocalDate aniversario;

    public Alumnos(String nombre, String apellido, LocalDate aniversario) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.aniversario = aniversario;
    }
    public String getNombre() {
        return nombre;
    }
    public String getApellido() {
        return apellido;
    }
    public LocalDate getAniversario() {
        return aniversario;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setSurname(String surname) {
        this.apellido = apellido;
    }
    public void setAniversario(LocalDate aniversario) {
        this.aniversario = aniversario;
    }   
}