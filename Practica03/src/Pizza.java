/**
 * Representa una Pizza
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public abstract class Pizza{

    //El tipo de pizza que va a ser
    String tipo;
    String queso;
    String carne;
    String masa;
    int precio;


    /**
     * Devuelve el tipo de pizza
     * @return el tipo
     */
    public String getTipo(){
        return tipo;
    }


    /**
     * Devuelve el tipo de queso de la pizza
     * @return el queso
     */
    public String getQueso(){
        return queso;
    }


    /**
     * Devuelve el tipo de la carne
     * @return la carne
     */
    public String getCarne(){
        return carne;
    }


    /**
     * Devuelve el tipo de la masa
     * @return la masa
     */
    public String getMasa(){
        return masa;
    }


    /**
     * Devuelve el precio de la pizza
     * @return el precio
     */
    public int getPrecio(){
        return precio;
    }

    
    /**
     * Metodo toString para imprimir el ticket de la pizza al usuario
     */
    @Override
    abstract public String toString();
}