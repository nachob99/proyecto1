import java.util.ArrayList;
import java.util.Iterator;
import java.util.Collection;
import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;
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
    public escuela(String nombreArchivo)
    {

        listaAula = new ArrayList<Aula>();
        int numIdentificacion = 1;

        try {
            File archivo = new File("datos.txt");
            Scanner sc = new Scanner(archivo);

            while (sc.hasNextLine()) {
                String[] objeto = sc.nextLine().split(" # ");
                String nombreAula = objeto[0];
                int numeroAula = Integer.parseInt(objeto[1]);
                int numeroAlumnos = Integer.parseInt(objeto[2]);
                añadirAula(nombreAula,numeroAula,numeroAlumnos);

            }
            sc.close();
        } 
        catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void añadirAula(String nombreAula,int numeroAula,int numeroAlumnos)
    {
        Aula aulas = new Aula(nombreAula,numeroAula,numeroAlumnos,numIdentificacion);
        listaAula.add(aulas);
        numIdentificacion++;
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
            if(numIdentificacion== aulaActual.getnumIdentificacion()){
                aulaActual.setAlumnos(nuevosAlumnos);
                cont++;
            }
        }
    }


    public void imprimirPorNombre(){
        listaAulaOrdenada = (ArrayList<Aula>) listaAula.clone();
        while(listaAulaOrdenada.size() != 0){

            Aula aulasPorNombre = listaAulaOrdenada.get(0);
            for(Aula listaAula : listaAulaOrdenada) {
                if (listaAula.getNombreAula().length() <= listaAula.getNombreAula().length()){
                    aulasPorNombre = listaAula;
                }
            }
            System.out.println(aulasPorNombre.detallesAula());
            listaAulaOrdenada.remove(aulasPorNombre);

        }

    }

    public void ordenarAulaPorAlumnos()
    {
        int variable = 0;
        for (int i = 0; i < listaAula.size(); i++) {
            Aula aulaConElMayorNumeroDeAlumnos = listaAula.get(i);
            int posicion = i;
            for (int j = i + 1; j < listaAula.size(); j++) {
                Aula aulaActual = listaAula.get(j);
                if (aulaConElMayorNumeroDeAlumnos.getAlumnos() < aulaActual.getAlumnos()) {
                    aulaConElMayorNumeroDeAlumnos = aulaActual;
                    posicion = j;
                }
            }
            if (posicion != i) {                
                Aula aux = listaAula.get(i);
                listaAula.set(i, listaAula.get(posicion));
                listaAula.set(posicion, aux);
            } 

            if (aulaConElMayorNumeroDeAlumnos.getAlumnos() != variable) {
                if (aulaConElMayorNumeroDeAlumnos.getAlumnos() == 1) {
                    System.out.println("");
                    System.out.println(aulaConElMayorNumeroDeAlumnos.getAlumnos() + " alumnos");
                }
                else {
                    System.out.println("");
                    System.out.println(aulaConElMayorNumeroDeAlumnos.getAlumnos() + " alumnos");
                }
                variable = aulaConElMayorNumeroDeAlumnos.getAlumnos();
            }
            System.out.println(aulaConElMayorNumeroDeAlumnos);
        }    
    }

}
