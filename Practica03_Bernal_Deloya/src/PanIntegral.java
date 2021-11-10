/**
 * Representa el tipo de Pan integral
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class PanIntegral extends Baguette{
    
    /**
     * Constructor de la clase PanIntegral
     */
    public PanIntegral(){
        ticket = "Baguette con pan integral: $15\nIngredientes:\n";
    }


    /**
     * Devuelve el ticket de pan con integral
     * @return el ticket
     */
    public String getTicket(){
        return ticket;
    }


    /**
     * Devuelve el costo de pan integral
     * @return el costo
     */
    public int getCosto(){
        return 15;
    }
}