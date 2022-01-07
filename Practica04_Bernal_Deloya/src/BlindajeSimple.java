/**
 * Representa la blindaje simple de un automovil
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class BlindajeSimple implements Blindaje{


    /**
     * Metodo para obtener el costo del blindaje simple
     * @return el costo del blindaje simple
     */
    public int getCosto(){
        return 10;
    }


    /**
     * Metodo para obtener los puntos por defensa del blindaje simple
     * @return los puntos por defensa del blindaje simple
     */    
    public int getDefensa(){
        return 8;
    }


    /**
     * Representacion en cadena del blindaje simple
     * @return el blindaje simple en cadena
     */
    public String toString(){
        return "Simple"+
        "\n\tDefensa: "+getDefensa()+"pts"+
        "\n\tCosto: $"+ getCosto();
    }
}