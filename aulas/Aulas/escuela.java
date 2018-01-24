import java.util.ArrayList;
/**
 * Write a description of class escuela here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class escuela
{
    // instance variables - replace the example below with your own
    private ArrayList<Aula> listaAula;
    private int numIdentificacion;
    /**
     * Constructor for objects of class escuela
     */
    public escuela()
    {
        listaAula = new ArrayList<Aula>();
        numIdentificacion=0;
    }

    public void añadirAula(String nombre,int numeroClase,int alumnos,int numeroIdentificativo)
    {
        Aula aulas = new Aula(nombre,numeroClase,alumnos,numeroIdentificativo);
        listaAula.add(aulas);
        
    }
    
    public void listarAulas(){
    int posicionAulas = 0;
        while(posicionAulas < listaAula.size()){
        System.out.println((posicionAulas+1) + "-" + listaAula.get(posicionAulas).detallesAula());
        posicionAulas++;
    }
    }
}
