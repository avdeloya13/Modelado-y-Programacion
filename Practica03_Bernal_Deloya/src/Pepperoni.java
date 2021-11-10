/**
 * Representa el ingrediente pepperoni de una Baguette
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class Pepperoni extends Ingredientes{
    
    /**
     * Constructor de la clase Pepperoni
     * @param baguette la baguette que va a tener pepperoni
     */
    public Pepperoni(Baguette baguette){
        super(baguette);
    }


    /**
     * Devuelve el ticket del costo de la baguette mas el precio del pepperoni
     * @return el ticket
     */
    public String getTicket(){
        return baguette.getTicket() + "Con pepperoni: $15\n";
    
    }


    /**
     * Devuelve el costo del pepperoni mas el costo de la baguette
     * @return el costo
     */
    public int getCosto(){
        return baguette.getCosto()+ 15;
    }
}