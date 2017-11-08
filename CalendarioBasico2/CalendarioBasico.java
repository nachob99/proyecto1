/**
 * Write a description of class CalendarioBasico here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class CalendarioBasico
{
    // instance variables - replace the example below with your own
    private int day;
    private int month;
    private int year;

    /**
     * Constructor for objects of class CalendarioBasico
     */
    public CalendarioBasico()
    {
        day = 1;
        month = 1;
        year = 1;
    }

    /**
     * Avanzar de fecha dia a dia
     */
    public void avanzarFecha()
    {
        if(day <31)
        {day= day + 1;}
        if(day == 31)
        {day = 1;
            month = month + 1;
        }
        if(month == 13)
        {month = 1;
            year = year +1;
        }
    }

    /**
     * Fijar fecha
     */
    public void fijarFecha(int dia, int mes, int ano)
    {
        day = dia;
        month = mes;
        year = ano;
    }

    /**
     * Nos muestra la fecha
     */
    public String obtenerFecha()
    {
        String devolverFecha= "";
        String parte1 = day + "";
        String parte2 = month + "";
        String parte3 = year + "";
        if(day < 10)
        {
            parte1 = "0" + parte1;
        }
        if(month < 10)
        {
            parte2 = "0" + parte2;
        }
        if(year < 10)
        {
            parte3 = "0" + parte3;
        }
        devolverFecha = parte1 + "-" + parte2 + "-" + parte3 ;
        return devolverFecha; 
    }
}
