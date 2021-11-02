/**
 * Representa los estados de un Robot
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public interface Estado{

    /**
     * Representa el estado de activacion del robot
     */
    public void activar();

    
    /**
     * Representa el estado suspendido del robot
     */
    public void suspender();


    /**
     * Representa el estado del robot atendiendo a un cliente
     */
    public void atender();


    /**
     * Representa el estado del robot cocinando la orden del cliente
     */
    public void cocinar();
}