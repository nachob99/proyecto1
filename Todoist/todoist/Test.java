public class Test
{
    /**
     * Metodo principal
     */
    public static void main(String[] args) 
    {
         System.out.println("Creamos un objeto todoist...");
        Todoist todoist = new Todoist();
        System.out.println("Mostramos el numero de tareas pendientes...");
        todoist.mostrarNumeroTareasPendientes();
        System.out.println("Añadimos una tarea...");
        todoist.addTarea("Limpiar la cocina");
        System.out.println("Añadimos otra tarea...");
        todoist.addTarea("Quitar las lentejas del fuego");
        System.out.println("Añadimos otra tarea...");
        todoist.addTarea("No llegar tarde mañana");
        System.out.println("Mostramos todas las tareas...");
        todoist.mostrarTareas();
        System.out.println("Eliminamos la segunda tarea...");
        boolean valorADevolver;
        valorADevolver = todoist.eliminarTarea(1);
        System.out.println("El metodo de eliminar anterior devolvio...");
        System.out.println(valorADevolver);
        System.out.println("Mostramos todas");
        todoist.mostrarTareas();
        System.out.println("\nIntentamos borrar una tarea que no existe...");
        valorADevolver = todoist.eliminarTarea(1000);
        System.out.println("Mostramos todas");
        todoist.mostrarTareas();
        
        
        
        
    }
    
}