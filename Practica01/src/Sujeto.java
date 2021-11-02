/**
 * Representa al sujeto en el patron Observer
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public interface Sujeto {
    
    /**
     * Agrega un cliente al servicio junto con el tipo de servicio
     * @param cliente el cliente a agregar
     * @param tipo el tipo de servicio
     */
    public void agregar(Cliente cliente, int tipo);

    /**
     * Elimina al cliente del servicio
     * @param cliente el cliente a eliminar
     */
    public void eliminar(Cliente cliente);

    /** 
     * Cobra a todos los clientes por servicio
     * que implementa al sujeto
     */
    public void cobrar();
    
}
