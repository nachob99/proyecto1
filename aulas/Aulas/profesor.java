import java.util.ArrayList;
import java.util.Iterator;
/**
 * Write a description of class profesor here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class profesor
{
    // instance variables - replace the example below with your own
    private String profesor;
    private int numeroIndentificacion;
    private String materia;

    /**
     * Constructor for objects of class profesor
     */
    public profesor()
    {
        profesor="";
        numeroIndentificacion=0;
        materia="";
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void añadirProfesor(String profesor, int numero ,String materia)
    {
        profesor=profesor;
        numeroIndentificacion=numero;
        materia=materia;
    }
    
    
     public String getProfesor(){
        return profesor;
    }
    
    public void setAula(String profesor){  
        this.profesor=profesor;
    }
    
     public String getMateria(){
        return materia;
    }
    
    public void setMateria(String materia){  
        this.materia=materia;
    }
    
    public int getnumeroIndentificacion(){
        return numeroIndentificacion;
    }
    
    public void setnumeroIndentificacion(int numeroIndentificacion){
        this.numeroIndentificacion=numeroIndentificacion;
    }
    
}
