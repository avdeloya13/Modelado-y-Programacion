/**
 * Representa el cobro por el servicio HVOMax a partir de 4 meses de servicio
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class HVOMaxCuatroMeses implements CobroHVOMax{

    /**
     * Cobro por el servicio de HVOMax
     * @param cliente el cliente a cobrar
     * @return true si el cliente sigue en el servicio
     */
    public boolean cobrar(Cliente cliente){
        int dinero = cliente.getDinero();
        //verificamos que tenga dinero para pagar
        if (dinero < 130){
            System.out.println("Esperamos vuelvas pronto!... porque ya no tendras meses gratis, "+
            cliente.getNombre());
            return false;
        }
        cliente.actualizaPago(130);
        System.out.println("Se te acabaron los 3 meses gratis "+cliente.getNombre()+
        " son $130");
        return true;
    }
}
