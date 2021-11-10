/**
 * Representa el ingrediente mostaza de una Baguette
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class Mostaza extends Ingredientes{
    
    /**
     * Constructor de la clase Mostaza
     * @param baguette la baguette que va a tener mostaza
     */
    public Mostaza(Baguette baguette){
        super(baguette);
    }


    /**
     * Devuelve el ticket del costo de la baguette mas el precio de la mostaza
     * @return el ticket
     */
    public String getTicket(){
        return baguette.getTicket() + "Con mostaza: $7\n";
    
    }


    /**
     * Devuelve el costo de la mostaza
     * @return el costo
     */
    public int getCosto(){
        return baguette.getCosto()+ 7;
    }
}