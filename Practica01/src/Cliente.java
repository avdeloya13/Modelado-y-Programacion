import java.util.ArrayList;
/**
 * Clase que representa un cliente
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class Cliente implements Observador{
    private String nombre;
    private int dinero;
    //private Sujeto servicio;
    private ArrayList<Sujeto> servicios;

    /**
     * Metodo constructor de la clase Cliente
     */
    public Cliente(String nombre, int dinero){
        this.nombre = nombre;
        this.dinero = dinero;
        servicios = new ArrayList<Sujeto>();
    }


    /**
     * Nos da el nombre del cliente
     * @return el nombre del cliente
     */
    public String getNombre(){
        return nombre;
    }


    /**
     * Nos da la cantidad de dinero que tiene el cliente
     */
    public int getDinero(){
        return dinero;
    }


    /**
     * Da de alta al cliente a algún servicio, o en este caso, al sujeto.
     * @param sujeto el servicio al que se suscribe.
     * @param tipo el tipo de servicio que se suscribe.
     */
    public void alta(Sujeto sujeto, int tipo){
        if(!estaSuscrito(sujeto)){
            sujeto.agregar(this, tipo);
            servicios.add(sujeto);
        }
    }


    /**
     * Busca si un sujeto ya esta en la lista de sujetos
     * @param sujeto el sujeto a buscar
     * @return true si el sujeto ya esta en la lista. false en otro caso
     */    
    public boolean estaSuscrito(Sujeto sujeto){
        for (Sujeto s : servicios) {
            if(sujeto == s) 
            return true;
        }
        return false;

    }


    /**
     * Elimina la suscripcion del cliente a dicho servicio.
     * @param sujeto el servicio al que ya no va a estar suscrito
     */
    public void baja(Sujeto sujeto){
        //obtenemos el indice del sujeto
        int i = servicios.indexOf(sujeto);
        
        if(i>0){
            //eliminamos el servicio de la lista de sujetos
            servicios.remove(i);
            //asi como el cliente en la lista de clientes del servicio
            sujeto.eliminar(this);
        }
    }


    /**
     * Actualiza el dinero del cliente
     * @param quita el dinero a quitar del cliente
     */
    public void actualizaPago(int quita){
        this.dinero -= quita;
    }  

    /**
     * Representacion en cadena del cliente
     * @return la representacion en cadena del cliente
     */
    public String toString(){
        return ""+ getNombre()+ ", dinero: "+getDinero();
    }


}
