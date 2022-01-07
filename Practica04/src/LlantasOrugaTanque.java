/**
 * Representa llantas oruga de tanque de un automovil
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class LlantasOrugaTanque implements Llantas{


    /**
     * Metodo para obtener el costo de las llantas oruga de tanque
     * @return el costo de las llantas oruga de tanque
     */
    public int getCosto(){
        return 55;
    }


    /**
     * Metodo para obtener los puntos por velocidad de las llantas oruga de tanque
     * @return los puntos por velocidad de las llantas oruga de tanque
     */
    public int getVelocidad(){
        return 18;
    }


    /**
     * Representacion en cadena de las llantas oruga de tanque
     * @return las llantas oruga de tanque en cadena
     */
    public String toString(){
        return "Oruga de Tanque"+
        "\n\tVelocidad: "+getVelocidad()+"pts"+
        "\n\tCosto: $"+ getCosto();
    }
}