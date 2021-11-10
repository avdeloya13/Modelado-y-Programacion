/**
 * Representa el ingrediente lechuga de una Baguette
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class Lechuga extends Ingredientes{
    

    /**
     * Constructor de la clase Lechuga
     * @param baguette la baguette que va a tener lechuga
     */
    public Lechuga(Baguette baguette){
        super(baguette);
    }


    /**
     * Devuelve el ticket del costo de la baguette mas el precio de la lechuga
     * @return el ticket
     */
    public String getTicket(){
        return baguette.getTicket() + "Con lechuga: $8\n";
    
    }


    /**
     * Devuelve el costo de la lechuga
     * @return el costo
     */
    public int getCosto(){
        return baguette.getCosto()+ 8;
    }
}