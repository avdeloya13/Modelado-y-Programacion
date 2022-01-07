/**
 * Representa la blindaje tanque de un automovil
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class BlindajeTanque implements Blindaje{


    /**
     * Metodo para obtener el costo del blindaje tanque
     * @return el costo del blindaje tanque
     */
    public int getCosto(){
        return 20;
    }

    
    /**
     * Metodo para obtener los puntos por defensa del blindaje tanque
     * @return los puntos por defensa del blindaje tanque
     */
    public int getDefensa(){
        return 15;
    }


    /**
     * Representacion en cadena del blindaje tanque
     * @return el blindaje tanque en cadena
     */
    public String toString(){
        return "Tanque"+
        "\n\tDefensa: "+getDefensa()+"pts"+
        "\n\tCosto: $"+ getCosto();
    }
}