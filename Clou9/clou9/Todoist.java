
/**
 * Write a description of class Todoist here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Todoist
{
    // instance variables - replace the example below with your own
    private String tarea0;
    private String tarea1;
    private String tarea2;

    /**
     * Constructor for objects of class Todoist
     */
    public Todoist()
    {
        tarea0 = null;
        tarea1 = null;
        tarea2 = null;
        
    }

    /**
     * Añadir tarea en la posicion en la que queremos
     */
    public void addTarea(String nombreTarea,int posicion)
    {
        if(posicion == 0){
            tarea0 = nombreTarea;
        }
        else if(posicion == 1){
            tarea1 = nombreTarea;
        }
        else if(posicion == 2){
            tarea2 = nombreTarea;
        }
    }
    /**
     * Muestra por pantalla todas las tareas existentes
     */
    public void mostrarTareas(){
        System.out.println("Tareas existentes:");
        if(tarea0 !=null){
            System.out.println(tarea0);
        }
        else if(tarea1 !=null){
            System.out.println(tarea1);
        }
        else if(tarea2 !=null){
            System.out.println(tarea2);
        }
    }
}
