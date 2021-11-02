/**
 * Representa el cobro por el servicio Twitsh Premium
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class CobroTwitshPremium implements CobroTwitsh{
        
    /**
     * Cobro por el servicio de Twitsh
     * @param cliente el cliente a cobrar
     * @return true si el cliente sigue utilizando el servicio
     */
    public boolean cobrar(Cliente cliente){
        int dinero = cliente.getDinero();
        //verificamos que tenga dinero para pagar
        if (dinero < 90){
            System.out.println("No tienes money, ni modo "+ cliente.getNombre()+
            " te damos de baja");
            return false;
        }
        cliente.actualizaPago(90);
        System.out.println("Te cobramos $90 pesos por ver a tus streamers favoritos, "+
        cliente.getNombre()+". Gracias, ¿Ves como twitsh premium no cobra tanto?.");
        return true;
    }
    
}
