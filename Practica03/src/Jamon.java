/**
 * Representa el ingrediente jamon de una Baguette
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class Jamon extends Ingredientes{
    
    /**
     * Constructor de la clase Jamon
     * @param baguette la baguette que va a tener jamon
     */
    public Jamon(Baguette baguette){
        super(baguette);
    }


    /**
     * Devuelve el ticket del costo de la baguette mas el precio del jamon
     * @return el ticket
     */
    public String getTicket(){
        return baguette.getTicket() + "Con jamon: $12\n";
    
    }


    /**
     * Devuelve el costo del jamon
     * @return el costo
     */
    public int getCosto(){
        return baguette.getCosto()+ 12;
    }
}