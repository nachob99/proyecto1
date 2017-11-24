import java.util.ArrayList;
/**
 * Write a description of class Todoist here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Todoist
{
    // instance variables - replace the example below with your own
    private ArrayList<String> tareas; 
    /**
     * Constructor for objects of class Todoist
     */
    public Todoist()
    {
        tareas = new ArrayList<String>();
    }

    /**
     * Inserta una nueva tarea
     */
    public void addTarea(String nombreTarea){
        tareas.add(nombreTarea);
    }

    /**
     * Muestra por pantalla todas las tareas existentes
     */
    public void mostrarTareas(){
        System.out.println("Tareas existentes:");
        System.out.println(tareas);
    }

    /**
     * Devuelve el numero de tareas
     */
    public int getNumeroTareasPendientes(){
        return tareas.size();
    }

    /**
     * Imprime por pantalla el numero de tareas pendientes
     */
    public void mostrarNumeroTareasPendientes(){
        System.out.println(tareas.size());
    }

    /** 
     * Elimina la tarea que ocupa la posicion indicada como
     * parametro (empezando en 0). devuelve true si la tarea existe,false en caso contrario
     */
    public boolean eliminarTarea(int posicionTarea){
        boolean valorADevolver = true;
        if(posicionTarea >= 0 && posicionTarea < tareas.size()){
            tareas.remove(posicionTarea);
        }
        else{
         return valorADevolver = false;
        }
        return valorADevolver;
    }
}
