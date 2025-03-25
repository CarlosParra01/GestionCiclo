
	 /**
	 * Clase estudiante	
	 * con nombre, id y edad. 
	 * @author Carlos
	 */
public class Estudiante {
	
    public String nombre;  
    public int id;         
    public int edad;  
    
   /**
    * Constructor de Estudiante
    * @param nombre, nombre del estudiante  
    * @param id, identificador del estudiante  
	* @param edad, edad del estudiante 
    */
    public Estudiante(String nombre, int id, int edad) {
        this.nombre = nombre;
        this.id = id;
        this.edad = edad;
       
    }

    public String datosEstudiante() {
        return "Estudiante: " + nombre + " (ID: " + id + ") Edad: " + edad;
    }
}
