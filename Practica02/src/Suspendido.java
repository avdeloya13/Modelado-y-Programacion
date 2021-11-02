/**
 * Representa el estado suspendido de un robot
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class Suspendido implements Estado{

    private Robot robot;


    /**
     * Constructor del estado Suspendido
     * @param robot el robot a cambiar de estado
     */
    public Suspendido(Robot robot){
        this.robot=robot;
    }


    /**
     * Representa el estado de activacion del robot y cambiamos de estado
     * a caminando
     */
    @Override
    public void activar(){
        robot.setEstado(robot.getCaminando());
        System.out.println("Robot activado");
    }


    /**
     * Suspende al robot
     */
    @Override
    public void suspender(){
        System.out.println("El robot esta suspendido, no puede suspenderse de nuevo");
    }


    /**
     * Hace que el robot atienda
     */
    @Override
    public void atender(){
        System.out.println("El robot esta suspendido, no puede atender clientes");
    }


    /**
     * Pone el robot a cocinar
     */
    @Override
    public void cocinar(){
        System.out.println("El robot esta suspendido, no puede cocinar");
    }

    
    /** Representacion en cadena del estado Caminando
     * @return el estado de Caminando
     */
    @Override
    public String toString(){
        return "Suspendido";
    }


}