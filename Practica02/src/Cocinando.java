/**
 * Representa el estado de cocinar de un robot
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class Cocinando implements Estado{

    private Robot robot;


    /**
     * Constructor del estado Cocinando     
     * @param robot el robot a cambiar de estado
     */
    public Cocinando(Robot robot){
        this.robot=robot;
    }


    /**
     * Pone en estado de activacion del robot
     */
    @Override
    public void activar(){
        System.out.println("El robot esta activado pues esta cocinando");
    }


    /**
     * Pone en estado suspendido al robot
     */
    @Override
    public void suspender(){
        System.out.println("El robot esta cocinando, no puede suspenderse");
    }


    /**
     * Pone al robot en estado de atendiendo a un cliente
     */
    @Override
    public void atender(){
        System.out.println("El robot esta cocinando, no puede atender");
    }


    /**
     * Representa el estado del robot cocinando la orden del cliente
     * Una vez que termine regresa al estado de suspendido
     */
    @Override
    public void cocinar(){
        System.out.println("Robot ya esta cocinando");
        robot.prepara();
        System.out.println("Su orden esta lista, nos vemos pronto!");
        robot.setEstado(robot.getSuspendido());
       
    }

    
    /** Representacion en cadena del estado Caminando
     * @return el estado de Caminando
     */
    @Override
    public String toString(){
        return "Cocinando";
    }
}