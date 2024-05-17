
/**
 * Write a description of class Estudiante here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Estudiante
{
    String nombre;
    String apellido;
    int edad;
    String codigo;
    int numeroEstudiante;
   public Estudiante() {
    }

    public Estudiante(String nombre, String apellido, int edad, String codigo, int numeroEstudiante) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.codigo = codigo;
        this.numeroEstudiante = numeroEstudiante;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getCodigo() {
        return codigo;
    }
    
    public int getNumeroEstudiante(){
        return numeroEstudiante;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }
    public void setNumeroEstudiante(int numeroEstudiante){
        this.numeroEstudiante = numeroEstudiante;
    }
}
