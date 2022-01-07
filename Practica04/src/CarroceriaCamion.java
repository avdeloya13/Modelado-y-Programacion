/**
 * Representa la carroceria camion de un automovil
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class CarroceriaCamion implements Carroceria{


    /**
     * Metodo para obtener el costo de la carroceria camion
     * @return el costo de la carroceria camion
     */
    public int getCosto(){
        return 30;
    }

    
    /**
     * Metodo para obtener los puntos por defensa de la carroceria camion
     * @return los puntos por defenesa de la carroceria camion
     */
    public int getDefensa(){
        return 17;
    }


    /**
     * Representacion en cadena de la carroceria camion
     * @return el carroceria camion simple en cadena
     */
    public String toString(){
        return "Camion"+
        "\n\tDefensa: "+getDefensa()+"pts"+
        "\n\tCosto: $"+ getCosto();
    }
}