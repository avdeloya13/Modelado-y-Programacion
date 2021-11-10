/**
 * Representa una Pizza mexicana
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class PizzaMexicana extends Pizza{

    /**
     * Constructor de la clase PizzaMexicana
     */
    public PizzaMexicana(){
        this.tipo = "Mexicana";
        this.queso = "machego";
        this.carne = "molida";
        this.masa = "delgada";
        this.precio = 150;
    }

    
    /**
     * Metodo toString para imprimir el ticket de la pizza al usuario
     */
    public String toString(){
        return "Pizza Mexicana, Precio "+getPrecio();
    }
}