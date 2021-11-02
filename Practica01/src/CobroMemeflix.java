/**
 * Representa el cobro por el servicio Memeflix
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public interface CobroMemeflix{
    /**
     * Cobro por el servicio de Memeflix
     * @param cliente el cliente a cobrar
     * @return true si el cliente sigue en el servicio
     */   
    public boolean cobrar(Cliente cliente);
}