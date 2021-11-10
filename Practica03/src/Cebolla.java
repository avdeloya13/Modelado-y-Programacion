/**
 * Representa el ingrediente cebolla de una Baguette
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class Cebolla extends Ingredientes{
    
    /**
     * Constructor de la clase Cebolla
     * @param baguette la baguette que va a tener cebolla
     */
    public Cebolla(Baguette baguette){
        super(baguette);
    }


    /**
     * Devuelve el ticket del costo de la baguette mas el precio de la cebolla
     * @return el ticket
     */
    public String getTicket(){
        return baguette.getTicket() + "Con cebolla: $6\n";
    }


    /**
     * Devuelve el costo de la cebolla
     * @return el costo
     */
    public int getCosto(){
        return baguette.getCosto()+ 6;
    }
}