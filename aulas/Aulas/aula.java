import java.util.ArrayList;
/**
 * Write a description of class aula here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class aula
{
    // instance variables - replace the example below with your own
    private String nombreAula;
    private int numeroAula;
    private int numeroAlumnos;
    private int numeroIndentificativo;

    /**
     * Constructor for objects of class aula
     */
    public aula()
    {
        // initialise instance variables
        nombreAula="";
        numeroAula=0;
        numeroAlumnos=0;
        numeroIndentificativo=0;
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public void añadirAula(String nombre,int numeroClase,int alumnos,int numeroIdentificativo)
    {
       nombreAula=nombre;
       numeroAula=numeroClase;
       numeroAlumnos=alumnos;
       numeroIndentificativo=numeroIndentificativo;
    }
    
    public int getAula(){
        return numeroAula;
    }
    
    public void setAula(int nAula){  
        this.numeroAula=nAula;
    }
    
     public int getAlumnos(){
        return numeroAlumnos;
    }
    
    public void setAlumnos(int alumnos){  
        this.numeroAlumnos=alumnos;
    }
    
    public String getNombreAula(){
        return nombreAula;
    }
    
    public void setNombreAula(String nombreAula){
        this.nombreAula=nombreAula;
    }
    
    public String detallesAula(){
        return getNombreAula() + "-" + getAula() + "-" + getAlumnos();
    }
}
