/**
 * Representa el cobro por el servicio Thisney a partir del 4to mes de servicio
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class ThisneyCuatroMeses implements CobroThisney{

    /**
     * Cobro por el servicio de Thisney
     * @param cliente el cliente a cobrar
     * @return true si el cliente sigue utilizando el servicio
     */
    public boolean cobrar(Cliente cliente){
        int dinero = cliente.getDinero();
        //verificamos que tenga dinero para pagar
        if (dinero < 150){
            System.out.println("Que pena, te has quedado sin dinero, trabaja."
            + cliente.getNombre()+
            " No le copiamos a Memeflix, ellos nos copiaron a nosotros"); 
           return false;
        }
        cliente.actualizaPago(150);
        System.out.println("Te cobramos $150 por los 4 meses de Thisney, "+
        cliente.getNombre()+". Te lo advertimos");
        return true;
    }
}