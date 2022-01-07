/**
 * Representa el motor turbo de un automovil
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class MotorTurbo implements Motor{


    /**
     * Metodo para obtener el costo del motor turbo
     * @return el costo del motor turbo
     */
    public int getCosto(){
        return 90;
    }

    
    /**
     * Metodo para obtener los puntos por velocidad del motor Turbo
     * @return los puntos por velocidad del motor turbo
     */
    public int getVelocidad(){
        return 70;
    }


    /**
     * Representacion en cadena del motor turbo
     * @return el motor turbo en cadena
     */
    public String toString(){
        return "Turbo"+
        "\n\tVelocidad: "+getVelocidad()+"pts"+
        "\n\tCosto: $"+ getCosto();
    }
}