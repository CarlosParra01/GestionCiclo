import java.util.ArrayList;
/**
 * @author Carlos
 */
/**
 * Clase Ciclo, con un nombre 
 * y una lista de estudiante
 */
public class Ciclo {
    public String nombreCiclo;
    public ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
/**
 * Constructor de Ciclo
 * @param nombreCiclo, nombre del ciclo
 * @param listaEstudiantes, lista de Alumnos matriculados en el ciclo 
 */
    public Ciclo(String nombreCiclo) {
        this.nombreCiclo = new String(nombreCiclo);
    }
   /**
    * Metodo para agregar un estudiante
    * @param estudiante, estudiante que se va a agregar 
    */
    public void agregarEstudiante(Estudiante estudiante) { 
        listaEstudiantes.add(estudiante); 
    }
    /**
     * Metodo para devolver los datos del ciclo y 
     * la lista de estudiantes 
     * @return Una cadena con la informacion del ciclo 
     */
    public String datosCiclo() {  
        String datos = "Ciclo: " + nombreCiclo + "\nEstudiantes:\n";
        for (Estudiante estudiante : listaEstudiantes) {
            datos += estudiante.datosEstudiante() + "\n";
        }
        return datos;
    }
}
