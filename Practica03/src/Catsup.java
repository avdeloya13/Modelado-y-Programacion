/**
 * Representa el ingrediente catsup de una Baguette
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class Catsup extends Ingredientes{
    
    /**
     * Constructor de la clase Catsup
     * @param baguette la baguette que va a tener catsup
     */
    public Catsup(Baguette baguette){
        super(baguette);
    }


    /**
     * Devuelve el ticket del costo de la baguette mas el precio de la catsup
     * @return el ticket
     */
    public String getTicket(){
        return baguette.getTicket() + "Con catsup: $5\n";
    }


    /**
     * Devuelve el costo de la catsup
     * @return el costo
     */
    public int getCosto(){
        return baguette.getCosto()+ 5;
    }
}