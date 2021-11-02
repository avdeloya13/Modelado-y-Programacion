/**
 * Representa el cobro por el servicio Momazon Normal
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class CobroMomazonNormal implements CobroMomazon{
    
    /**
     * Cobro por el servicio de Momazon
     * @param cliente el cliente a cobrar
     * @return true si el cliente sigue en el servicio
     */
    public boolean cobrar(Cliente cliente){
        int dinero = cliente.getDinero();
        //verificamos que tenga dinero para pagar
        if (dinero < 120){
            System.out.println("Te tenemos que dar de baja "+ cliente.getNombre()+ 
            " no tienes dinero, shabo.");
            return false;
        }
        cliente.actualizaPago(120);
        System.out.println("Te quitamos 120 peso, "+cliente.getNombre()+
        " por usar nuestros servicios normales de Momazon");
        return true;
    }  
}