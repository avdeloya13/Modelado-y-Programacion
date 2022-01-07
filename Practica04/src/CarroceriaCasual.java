/**
 * Representa la carroceria casual de un automovil
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class CarroceriaCasual implements Carroceria{


    /**
     * Metodo para obtener el costo de la carroceria casual
     * @return el costo de la carroceria casual
     */
    public int getCosto(){
        return 20;
    }

    
    /**
     * Metodo para obtener los puntos por defensa de la carroceria casual
     * @return los puntos por defenesa de la carroceria casual
     */
    public int getDefensa(){
        return 10;
    }


    /**
     * Representacion en cadena de la carroceria casual
     * @return el carroceria casual simple en cadena
     */
    public String toString(){
        return "Casual"+
        "\n\tDefensa: "+getDefensa()+"pts"+
        "\n\tCosto: $"+ getCosto();
    }
}