import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
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
    private ArrayList<Aula> listaAulaOrdenada;
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

    public void eliminarClase(int numeroClase){
        int cont=0;
        while (cont < listaAula.size()) {
            Aula numeroC = listaAula.get(cont);
            if(numeroC.getAula()<numeroClase){
                listaAula.remove(numeroClase);
                cont--;
            }
            cont++;
        }

    }
    public void modificarAlumnos(int numIdentificacion ,int nuevosAlumnos){
        int cont=0;
        Aula aulaActual = listaAula.get(numIdentificacion);
        while(numIdentificacion>=0 && cont<listaAula.size()){
            if(numIdentificacion== aulaActual.getnumeroIndentificativo()){
                aulaActual.setAlumnos(nuevosAlumnos);
                cont++;
            }
        }
    }
    
    
    
}

