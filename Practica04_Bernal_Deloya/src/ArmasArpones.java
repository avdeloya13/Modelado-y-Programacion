/**
 * Representa arpones como armas de un auto
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class ArmasArpones implements Armas{
    
    /**
     * Metodo para obtener el costo de un arpon
     * @return el costo del arma arpon
     */
    public int getCosto(){
        return 50;
    }


    /**
     * Metodo para obtener los puntos por el ataque de los arpones
     * @return los puntos por ataque de los arpones
     */
    public int getAtaque(){
        return 10;
    }

    /**
     * Representacion en cadena del arma arpon
     * @return el arpon en cadena
     */
    public String toString(){
        return "Arpones"+
        "\n\tAtaque: "+getAtaque()+"pts"+
        "\n\tCosto: $"+ getCosto();
    }
}