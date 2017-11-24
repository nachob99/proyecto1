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
        if(esValidoElIndice(posicionTarea)){
            tareas.remove(posicionTarea);
            valorADevolver = true;
        }
        return valorADevolver;
    }

    /**
    Metodo que comprueba si una posicion es valida y devuelve true
     * en caso afirmativo o false en otro caso.
     */
    public boolean esValidoElIndice(int indice){
        return (indice > 0 && indice< tareas.size());
    }

    /**
     * Metodo que devuelve true en caso de que haya tareas por hacer, false
     * en otro caso
     */    
    public boolean hayTareasPendientes(){
        return (getNumeroTareasPendientes() > 0);
    }

    /** 
     * Metodo que imprime todas las tareas existentes, una por linea.
     * El metodo imprime el numero de posicion de la tarea antes del
     * nombre de la tarea.
     */   
    public void mostrarTareasNumeradas(){
        int numeroPosicion = 1;
        for (String tarea : tareas){
            System.out.println(numeroPosicion + ". " + tarea);
            numeroPosicion = numeroPosicion + 1;
        }
    }
     /**
     * Muestra solo las tareas en posiciones impares sin numero delante ni nada,
     * solo la tarea
     */
    public void mostrarTareasEnPosicionImpar(){}
    }
