/**
 * Representa llantas off-road de un automovil
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class LlantasOffRoad implements Llantas{


    /**
     * Metodo para obtener el costo de las llantas off-road
     * @return el costo de las llantas off-road
     */
    public int getCosto(){
        return 50;
    }


    /**
     * Metodo para obtener los puntos por velocidad de las llantas off road
     * @return los puntos por velocidad de las llantas off road
     */
    public int getVelocidad(){
        return 15;
    }


    /**
     * Representacion en cadena de las llantas off road
     * @return las llantas off road en cadena
     */
    public String toString(){
        return "Off-Road"+
        "\n\tVelocidad: "+getVelocidad()+"pts"+
        "\n\tCosto: $"+ getCosto();
    }
}