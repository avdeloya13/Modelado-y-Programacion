/**
 * Representa una Pizza napolitana
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class PizzaNapolitana extends Pizza{

    /**
     * Constructor de la clase PizzaNapolitana
     */
    public PizzaNapolitana(){
        this.tipo = "Napolitana";
        this.queso = "chedar";
        this.carne = "filetes de anchoa";
        this.masa = "gruesa";
        this.precio = 140;
    }

    
    /**
     * Metodo toString para imprimir el ticket de la pizza al usuario
     */
    public String toString(){
        return "Pizza Napolitana, Precio "+getPrecio();
    }
}