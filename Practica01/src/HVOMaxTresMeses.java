/**
 * Representa el cobro por el servicio HVOMax los primeros 3 meses de servicio
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class HVOMaxTresMeses implements CobroHVOMax{

    /**
     * Cobro por el servicio de HVOMax
     * @param cliente el cliente a cobrar
     * @return true si el cliente sigue en el servicio
     */
    public boolean cobrar(Cliente cliente){
        cliente.actualizaPago(0);
        System.out.println("Los primeros tres meses son gratis, "+cliente.getNombre()+
        " asi que aprovecha");
        return true;
    }
}
