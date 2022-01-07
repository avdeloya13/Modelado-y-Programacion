/**
 * Representa canones como armas de un automovil
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class ArmasCanones implements Armas{


    /**
     * Metodo para obtener el costo de un canon
     * @return el costo del arma canon
     */
    public int getCosto(){
        return 60;
    }


 
    /**
     * Metodo para obtener los puntos por el ataque de los canones
     * @return los puntos por ataque de los canones
     */
    public int getAtaque(){
        return 15;
    }


    /**
     * Representacion en cadena del arma canon
     * @return los canones en cadena
     */
    public String toString(){
        return "Canones"+
        "\n\tAtaque: "+getAtaque()+"pts"+
        "\n\tCosto: $"+ getCosto();
    }
}