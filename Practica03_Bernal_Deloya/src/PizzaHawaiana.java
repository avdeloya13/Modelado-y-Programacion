/**
 * Representa una Pizza hawaiana
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class PizzaHawaiana extends Pizza{
    
    /**
     * Constructor de la clase PizzaHawaiana
     */
    public PizzaHawaiana(){
        this.tipo = "Hawaiana";
        this.queso = "chedar";
        this.carne = "molida";
        this.masa = "delgada";
        this.precio = 110;
    }

    
    /**
     * Metodo toString para imprimir el ticket de la pizza al usuario
     */
    public String toString(){
        return "Pizza Hawaiana, Precio "+getPrecio();
    }
}