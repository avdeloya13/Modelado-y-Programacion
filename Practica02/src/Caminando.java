/**
 * Representa el estado de caminar de un robot
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class Caminando implements Estado{

    private Robot robot;


    /**
     * Constructor del estado Caminando
     * @param robot el robot a cambiar de estado
     */
    public Caminando(Robot robot){
        this.robot=robot;
    }


    /**
     * Hace que se active el robot
     */
    @Override
    public void activar(){
        System.out.println("El robot esta activado pues esta caminando");
    }


    /**
     *Pone en estado suspendido al robot
     */
    @Override
    public void suspender(){
        robot.setEstado(robot.getSuspendido());
        System.out.println("Robot suspendido");
    }


    /**
     * El robot ha dejado de caminar y cambia de estado a atender
     */
    @Override
    public void atender(){
        System.out.println("Buen dia! Este es nuestro menu:\n");
        robot.mostrarMenu();
        robot.setEstado(robot.getAtendiendo());
        System.out.println("Robot atendiendo");
    }


    /**
     * Pone a cocinar al robot
     */
    @Override
    public void cocinar(){
        System.out.println("El robot esta caminando, no puede cocinar");
    }


    /** 
     * Representacion en cadena del estado Caminando
     * @return el estado de Caminando
     */
    @Override
    public String toString(){
        return "Caminando";
    }
}