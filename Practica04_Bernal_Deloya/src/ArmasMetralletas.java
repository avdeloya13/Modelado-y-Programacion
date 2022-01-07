/**
 * Representa metralletas como armas de un automovil
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class ArmasMetralletas implements Armas{


    /**
     * Metodo para obtener el costo de un metralletas
     * @return el costo del arma matralleta
     */
    public int getCosto(){
        return 53;
    }


    /**
     * Metodo para obtener los puntos por el ataque de las metrelletas
     * @return los puntos por ataque de las metralletas
     */
    public int getAtaque(){
        return 13;
    }


    /**
     * Representacion en cadena del arma metralleta
     * @return las metralleras en cadena
     */
    public String toString(){
        return "Metralletas"+
        "\n\tAtaque: "+getAtaque()+"pts"+
        "\n\tCosto: $"+ getCosto();
    }
}