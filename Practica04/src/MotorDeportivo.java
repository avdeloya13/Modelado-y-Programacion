/**
 * Representa el motor deportivo de un automovil
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class MotorDeportivo implements Motor{


    /**
     * Metodo para obtener el costo del motor deportivo
     * @return el costo del motor deportivo
     */
    public int getCosto(){
        return 70;
    }

    
    /**
     * Metodo para obtener los puntos por velocidad del motor deportivo
     * @return los puntos por velocidad del motor deportivo
     */
    public int getVelocidad(){
        return 50;
    }


    /**
     * Representacion en cadena del motor deportivo
     * @return el motor deportivo en cadena
     */
    public String toString(){
        return "Turbo"+
        "\n\tVelocidad: "+getVelocidad()+"pts"+
        "\n\tCosto: $"+ getCosto();
    }
}