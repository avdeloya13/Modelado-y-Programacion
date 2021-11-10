/**
 * Representa el tipo de Pan con ajonjoli
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class PanAjonjoli extends Baguette{
    
    /**
     * Constructor de la clase PanAjonjoli
     */
    public PanAjonjoli(){
        ticket = "Baguette con ajonjoli: $13\nIngredientes:\n";
    }


    /**
     * Devuelve el ticket de pan con ajonjoli
     * @return el ticket
     */
    public String getTicket(){
        return ticket;
    }


    /**
     * Devuelve el costo de pan con ajonjoli
     * @return el costo
     */
    public int getCosto(){
        return 13;
    }
}