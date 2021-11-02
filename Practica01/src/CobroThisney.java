/**
 * Representa el cobro por el servicio Thisney
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public interface CobroThisney{

    /**
     * Cobro por el servicio de Thisney
     * @param cliente el cliente a cobrar
     * @return true si el cliente sigue utilizando el servicio
     */
    public boolean cobrar(Cliente cliente);
}