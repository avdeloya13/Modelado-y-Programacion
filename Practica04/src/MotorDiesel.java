/**
 * Representa el motor diesel de un automovil
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class MotorDiesel implements Motor{


    /**
     * Metodo para obtener el costo del motor diesel
     * @return el costo del motor diesel
     */
    public int getCosto(){
        return 80;
    }

    
    /**
     * Metodo para obtener los puntos por velocidad del motor diesel
     * @return los puntos por velocidad del motor diesel
     */
    public int getVelocidad(){
        return 60;
    }


    /**
     * Representacion en cadena del motor diesel
     * @return el motor diesel en cadena
     */
    public String toString(){
        return "Diesel"+
        "\n\tVelocidad: "+getVelocidad()+"pts"+
        "\n\tCosto: $"+ getCosto();
    }
}