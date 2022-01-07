/**
 * Representa lanzallamas como armas de un automovil
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class ArmasLanzallamas implements Armas{


    /**
     * Metodo para obtener el costo de un lanzallamas
     * @return el costo del arma lanzallamas
     */
    public int getCosto(){
        return 55;
    }


    /**
     * Metodo para obtener los puntos por el ataque del lanzallamas
     * @return los puntos por ataque del lanzallamas
     */    public int getAtaque(){
        return 16;
    }


    /**
     * Representacion en cadena del arma lanzallamas
     * @return el lanzallamas en cadena
     */
    public String toString(){
        return "Lanzallamas"+
        "\n\tAtaque: "+getAtaque()+"pts"+
        "\n\tCosto: $"+ getCosto();
    }
}