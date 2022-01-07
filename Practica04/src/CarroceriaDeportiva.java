/**
 * Representa la carroceria deportiva de un automovil
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class CarroceriaDeportiva implements Carroceria{


    /**
     * Metodo para obtener el costo de la carroceria deportiva
     * @return el costo de la carroceria deportiva
     */
    public int getCosto(){
        return 40;
    }


    /**
     * Metodo para obtener los puntos por defensa de la carroceria deportiva
     * @return los puntos por defenesa de la carroceria deportiva
     */    
    public int getDefensa(){
        return 25;
    }


    /**
     * Representacion en cadena de la carroceria deportiva
     * @return el carroceria deportiva en cadena
     */
    public String toString(){
        return "Deportiva"+
        "\n\tDefensa: "+getDefensa()+"pts"+
        "\n\tCosto: $"+ getCosto();
    }
}