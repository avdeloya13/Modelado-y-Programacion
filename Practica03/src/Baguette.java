/**
 * Representa un Baguette
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public abstract class Baguette implements Producto{

    String ticket;
    int precio;


    /**
     * Devuelve el ticket de la Baguette
     * @return el ticket
     */
    public String getTicket(){
        return ticket = "Baguette con pan ";
    }


    /**
     * Devuelve el costo de la Baguette
     * Cada clase de cada tipo de pan lo va a implementar de acuerdo a su precio
     * @return el costo
     */
    abstract public int getCosto();


    /**
     * Metodo toString para imprimir el ticket al usuario
     */
    public String toString(){
        return "---TICKET---\n"+ getTicket() + "Costo total: $"+ getCosto()+"\n";
    }
}