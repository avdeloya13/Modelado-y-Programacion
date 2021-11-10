/**
 * Representa los ingredientes de un Baguette
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public abstract class Ingredientes extends Baguette{
    
    Baguette baguette;


    /**
     * Constructor de la clase
     * @param beguette el baguette a decorar
     */
    public Ingredientes(Baguette baguette){
        this.baguette = baguette;

    }


    /**
     * Devuelve el ticket del Baguette
     * @return el ticket
     */
    public String getTicket(){
        return baguette.getTicket();
    }


    /**
     * Devuelve el costo del Baguette
     * @return el costo
     */
    public int getCosto(){
        return baguette.getCosto();
    }
}