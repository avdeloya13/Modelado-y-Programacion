/**
 * Representa el adaptador.
 * Haciendo uso del patron Adapter.
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class AdapterPizza implements Producto{
    //pizza a adaptar
    Pizza pizza;

    /**
     * Constructor de la clase AdapterPizza
     * @param pizza Pizza a adaptar a Baguette
     */
    public AdapterPizza(Pizza pizza){
        this.pizza = pizza;
    }


    /**
     * Devuelve el ticket de la pizza adaptada
     * @return el ticket
     */
    public String getTicket(){
        return "Pizza de tipo " + pizza.getTipo() + 
                "\nCon queso " + pizza.getQueso() +
                "\nCon carne " + pizza.getCarne() + 
                "\nCon masa " + pizza.getMasa() + "\n";
    }


    /**
     * Devuelve el costo de la pizza adaptada
     * @return el costo
     */
    public int getCosto(){
        return pizza.getPrecio();
    }


    /**
     * Metodo toString para imprimir el ticket al usuario
     */
    public String toString(){
        return "---TICKET---\n"+ getTicket() + "Costo total: $"+ getCosto()+"\n";
    }
}