/**
 * Representa sierras como armas de un automovil
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class ArmasSierras implements Armas{


    /**
     * Metodo para obtener el costo de una sierra
     * @return el costo del arma sierra
     */
    public int getCosto(){
        return 40;
    }


    /**
     * Metodo para obtener los puntos por el ataque de las sierras
     * @return los puntos por ataque de las sierras
     */
    public int getAtaque(){
        return 20;
    }

    /**
     * Representacion en cadena del arma sierras
     * @return las sierras en cadena
     */
    public String toString(){
        return "Sierras"+
        "\n\tAtaque: "+getAtaque()+"pts"+
        "\n\tCosto: $"+ getCosto();
    }
}