/**
 * Representa el cobro por el servicio Memeflix para 1 pantalla
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class CobroMemeflix1Pantalla implements CobroMemeflix{

    /**
     * Cobro por el servicio de Memeflix
     * @param cliente el cliente a cobrar
     * @return true si el cliente sigue en el servicio
     */  
    public boolean cobrar(Cliente cliente){
    int dinero = cliente.getDinero();
    //verificamos que tenga dinero para pagar
    if (dinero < 100){
        System.out.println("Que pena, te has quedado sin dinero, trabaja "+cliente.getNombre());
        return false;
    }
    cliente.actualizaPago(100);
    System.out.println("Se ha cobrado al cliente "+ cliente.getNombre()+ 
    " $100 por el servicio de una pantalla de Memeflix");
    return true;
    } 
}
