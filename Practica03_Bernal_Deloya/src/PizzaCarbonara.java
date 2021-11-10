/**
 * Representa una Pizza carbonara
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class PizzaCarbonara extends Pizza{

    /**
     * Constructor de la clase PizzaCarbonara
     */
    public PizzaCarbonara(){
        this.tipo = "Carbonara";
        this.queso = "mozarella";
        this.carne = "bacon";
        this.masa = "gruesa";
        this.precio = 110;
    }

    
    /**
     * Metodo toString para imprimir el ticket de la pizza al usuario
     */
    public String toString(){
        return "Pizza Carbonara, Precio "+getPrecio();
    }
}