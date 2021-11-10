/**
 * Representa el ingrediente pollo de una Baguette
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class Pollo extends Ingredientes{

    /**
     * Constructor de la clase Pollo
     * @param baguette la baguette que va a tener pollo
     */
    public Pollo(Baguette baguette){
        super(baguette);
    }    


    /**
     * Devuelve el ticket del costo de la baguette mas el precio del pollo
     * @return el ticket
     */
    public String getTicket(){
        return baguette.getTicket() + "Con pollo: $9\n";
    
    }


    /**
     * Devuelve el costo del pollo mas el costo de la baguette
     * @return el costo
     */
    public int getCosto(){
        return baguette.getCosto()+ 9;
    }
}