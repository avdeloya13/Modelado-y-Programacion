/**
 * Representa la blindaje reforzado de un automovil
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class BlindajeReforzado implements Blindaje{


    /**
     * Metodo para obtener el costo del blindaje reforzado
     * @return el costo del blindaje reforzado
     */
    public int getCosto(){
        return 30;
    }
    
    
    /**
     * Metodo para obtener los puntos por defensa del blindaje reforzado
     * @return los puntos por defenesa del blindaje reforzado
     */
    public int getDefensa(){
        return 25;
    }


    /**
     * Representacion en cadena del blindaje reforzado
     * @return el blindaje reforzado en cadena
     */
    public String toString(){
        return "Reforzado"+
        "\n\tDefensa: "+getDefensa()+"pts"+
        "\n\tCosto: $"+ getCosto();
    }
}