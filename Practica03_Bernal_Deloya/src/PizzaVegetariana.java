/**
 * Representa una Pizza vegetariana
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class PizzaVegetariana extends Pizza{

    /**
     * Constructor de la clase PizzaVegetariana
     */
    public PizzaVegetariana(){
        this.tipo = "Vegetariana";
        this.queso = "mozarella";
        this.carne = "de soya";
        this.masa = "delgada";
        this.precio = 100;
    }

    
    /**
     * Metodo toString para imprimir el ticket de la pizza al usuario
     */
    public String toString(){
        return "Pizza Vegetariana, Precio "+getPrecio();
    }
}