/**
 * Representa el tipo de Pan normal
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class PanNormal extends Baguette{

    /**
     * Constructor de la clase PanNormal
     */
    public PanNormal(){
        ticket = "Baguette con pan Normal: $10\nIngredientes:\n";
    }


    /**
     * Devuelve el ticket de pan normal
     * @return el ticket
     */
    public String getTicket(){
        return ticket;
    }


    /**
     * Devuelve el costo de pan normal
     * @return el costo
     */
    public int getCosto(){
        return 10;
    }
}