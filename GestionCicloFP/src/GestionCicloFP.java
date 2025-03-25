import java.util.ArrayList;
/**
 * @author Carlos
 */

/**
 * Clase que gestiona el ciclo y los estudiantes
 */
public class GestionCicloFP {
	/**
	 * Lista de todos los estudiantes registrados en el sistema.
	 */
    public ArrayList<Estudiante> listaEstudiantes = new ArrayList<>();
    /**
     * Lista de los ciclos formativos disponibles.
     */
    public ArrayList<Ciclo> listaCiclos = new ArrayList<>();         
   
    /**
     * Constructor de la clase GestionCicloFP.
     * Inicializa las listas de estudiantes y ciclos.
     */
    public GestionCicloFP() {
        listaEstudiantes = new ArrayList<>();
        listaCiclos = new ArrayList<>();
    }/**
     * Metodo para agregar un nuevo estudiante a la lista
     * @param Nombre, nombre del estudiante
     * @param ID, id del estudiante
     * @param Edad, edad del estudiante 
     */
    
    public void agregarEstudiante(String Nombre, int ID, int Edad) {  
        listaEstudiantes.add(new Estudiante(Nombre, ID, Edad));
    }
    /**
     * Metodo para agregar un nuevo ciclo
     * @param NombreCiclo, nombre del ciclo 
     */
    public void agregarCiclo(String NombreCiclo) { 
    	listaCiclos.add(new Ciclo(NombreCiclo));
    }
    /**
     * Metodo para matricular un estudiante en un ciclo 
     * @param idEstudiante, id del estudiante 
     * @param nombreCiclo. nombre del ciclo 
     */
    public void matricularEstudiante(int idEstudiante, String nombreCiclo) { 
        Estudiante estudiante = null; 
        Ciclo ciclo = null;      

        for (Estudiante estudiantesRecorridos : listaEstudiantes) { 
            if (estudiantesRecorridos.id == idEstudiante) {
                estudiante = estudiantesRecorridos;
                break;
            }
        }

        for (Ciclo ciclosRecorridos : listaCiclos) { 
            if (ciclosRecorridos.nombreCiclo.equals(nombreCiclo)) {
                ciclo = ciclosRecorridos;
                break;
            }
        }

        if (estudiante != null && ciclo != null) {
            ciclo.agregarEstudiante(estudiante);
        }
    }
    /**
     * Metodo para mostrar los datos de todos los ciclos 
     */
    public void mostrarCiclos() { 
        for (Ciclo ciclo : listaCiclos) {
            System.out.println(ciclo.datosCiclo());
        }
    }
    /**
     * metodo main para probar la gestion de los ciclos 
     * @param args, Argumentos de la línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        GestionCicloFP gestion = new GestionCicloFP();

        gestion.agregarEstudiante("Alicia", 1, 20);
        gestion.agregarEstudiante("Roberto", 2, 22);

        gestion.agregarCiclo("DAW");
        gestion.agregarCiclo("ASIR");

        gestion.matricularEstudiante(1, "DAW");
        gestion.matricularEstudiante(2, "ASIR");

        gestion.mostrarCiclos();
    }
}

