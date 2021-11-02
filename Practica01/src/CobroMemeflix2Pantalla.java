/**
 * Representa el cobro por el servicio Memeflix para 2 pantallas
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class CobroMemeflix2Pantalla implements CobroMemeflix{

    /**
     * Cobro por el servicio de Memeflix
     * @param cliente el cliente a cobrar
     * @return true si el cliente sigue en el servicio
     */
    public boolean cobrar(Cliente cliente){
        int dinero = cliente.getDinero();
        //verificamos que tenga dinero para pagar
        if (dinero < 150){
            System.out.println("Que pena, te has quedado sin dinero, trabaja "+cliente.getNombre());
            return false;
        }
        cliente.actualizaPago(150);
        System.out.println("Se ha cobrado al cliente "+ cliente.getNombre()+ 
    " $150 por el servicio de dos pantallas de Memeflix");
        return true;
    }  
}
