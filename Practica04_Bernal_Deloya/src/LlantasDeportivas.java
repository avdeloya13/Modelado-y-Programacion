/**
 * Representa llantas deportivas de un automovil
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class LlantasDeportivas implements Llantas{


    /**
     * Metodo para obtener el costo de las llantas deportivas
     * @return el costo de las llantas deportivas
     */
    public int getCosto(){
        return 60;
    }


    /**
     * Metodo para obtener los puntos por velocidad de las llantas deportivas
     * @return los puntos por velocidad de las llantas simples
     */
    public int getVelocidad(){
        return 20;
    }

    
    /**
     * Representacion en cadena de las llantas deportivas
     * @return las llantas deportivas en cadena
     */
    public String toString(){
        return "Deportivas"+
        "\n\tVelocidad: "+getVelocidad()+"pts"+
        "\n\tCosto: $"+ getCosto();
    }
}