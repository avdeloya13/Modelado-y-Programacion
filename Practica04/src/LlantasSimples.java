/**
 * Representa llantas simples de un automovil
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class LlantasSimples implements Llantas{


    /**
     * Metodo para obtener el costo de las llantas simples
     * @return el costo de las llantas simples
     */
    public int getCosto(){
        return 40;
    }

    
    /**
     * Metodo para obtener los puntos por velocidad de las llantas simples
     * @return los puntos por velocidad de las llantas simples
     */
    public int getVelocidad(){
        return 15;
    }


    /**
     * Representacion en cadena de las llantas simples
     * @return las llantas simples en cadena
     */    
    public String toString(){
        return "Simples"+
        "\n\tVelocidad: "+getVelocidad()+"pts"+
        "\n\tCosto: $"+ getCosto();
    }
}