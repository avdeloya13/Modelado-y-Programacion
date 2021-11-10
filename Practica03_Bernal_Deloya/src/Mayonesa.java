/**
 * Representa el ingrediente mayonesa de una Baguette
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class Mayonesa extends Ingredientes{
    
    /**
     * Constructor de la clase Mayonesa
     * @param baguette la baguette que va a tener mayonesa
     */
    public Mayonesa(Baguette baguette){
        super(baguette);
    }


    /**
     * Devuelve el ticket del costo de la baguette mas el precio de la mayonesa
     * @return el ticket
     */
    public String getTicket(){
        return baguette.getTicket() + "Con mayonesa: $5\n";    
    }


    /**
     * Devuelve el costo de la mayonesa
     * @return el costo
     */
    public int getCosto(){
        return baguette.getCosto()+ 5;
    }
}