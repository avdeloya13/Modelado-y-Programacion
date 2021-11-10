/**
 * Representa el ingrediente jitomate de una Baguette
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class Jitomate extends Ingredientes{
    
    /**
     * Constructor de la clase Jitomate
     * @param baguette la baguette que va a tener jitomate
     */
    public Jitomate(Baguette baguette){
        super(baguette);
    }


    /**
     * Devuelve el ticket del costo de la baguette mas el precio del jitomate
     * @return el ticket
     */
    public String getTicket(){
        return baguette.getTicket() + "Con jitomate: $8\n";
    
    }


    /**
     * Devuelve el costo del jitomate
     * @return el costo
     */
    public int getCosto(){
        return baguette.getCosto()+ 8;
    }
}