
/**
 * Write a description of class Gestion here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.ArrayList;
import java.util.List;

public class Gestion
{
    ArrayList<Estudiante> estudiantes = new ArrayList<Estudiante>();
    public Gestion(){
        
    }
    public List<Estudiante>getEstudiante(){
        return estudiantes;
    }
    public void setEstudiante(List<Estudiante>Estudiantes){
        this.estudiantes = estudiantes;
    }
   
    public void agregarEstutdiante(Estudiante estudiantes){
        this.estudiantes.add(estudiantes);
    }
    public void listarEstudiantes(){
        if (estudiantes.isEmpty()) {
            System.out.println("No hay estudiantes registrados.");
        } 
        else {
            for (Estudiante estudiante : estudiantes) {
                System.out.println(estudiante);
            }
        }
    }
    
    public void buscarEstudiante(int numeroEstudiante, String nombre) {
        boolean encontrado = false;
        for (Estudiante estudiante : estudiantes) {
            if (estudiante.numeroEstudiante == numeroEstudiante) {
                System.out.println("Estudiante encontrado:");
                System.out.println(estudiante);
                encontrado = true;
                break;
            }
        }
        if(!encontrado){
            System.out.println("No se encontró ningun estudiante con ese numero");
        }
    
}
}
