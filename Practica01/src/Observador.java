/**
 * Representa al observador en el patron Observer
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public interface Observador{

    /**
     * Actualiza el dinero del cliente
     * @param quita el dinero a quitar del cliente
     */
    public void actualizaPago(int quita);
}