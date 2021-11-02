import java.util.Scanner;
/**
 * Representa el estado de atender de un robot
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class Atendiendo implements Estado{

    private Robot robot;


    /**
     * Constructor del estado Atendiendo
     * @param robot el robot a cambiar de estado
     */
    public Atendiendo(Robot robot){
        this.robot=robot;
    }


    /**
     * Pone en estado de activacion al robot
     */
    @Override
    public void activar(){
        System.out.println("El robot esta activado, no puede activarse de nuevo");
    }


    /**
     * Pone en estado suspendido del robot
     */
    @Override
    public void suspender(){
        System.out.println("El robot esta atendiendo, no puede suspenderse");
    }


    /**
     * Pone al robot en estado de atender a un cliente.
     * Este debe recibir un id de la hamburguesa para que el robot busque la hamburguesa
     */
    @Override
    public void atender(){
        //System.out.println("Buen dia! Este es nuestro menu:\n");
        System.out.println("Escribe el id de la hamburguesa que quieres: \n");        
        Scanner sc = new Scanner(System.in);
        int opcion;

        while (true){
			try {
				String opcionUsuario = sc.nextLine();
				opcion = Integer.parseInt(opcionUsuario);
				break;
			}catch (NumberFormatException ex){
                System.out.println("Elige un numero");
            }
        }
        robot.recibeOrden(opcion);
    }


    /**
     * Pone al robot a cocinar la orden del cliente
     * Verifica que antes haya recibido una orden
     */
    @Override
    public void cocinar(){
        if(!robot.getOrden()){
            System.out.println("No se ha recibido orden, eliga una al atender");
            return;
        }
        robot.setEstado(robot.getCocinando());
    }


    /** Representacion en cadena del estado Atendiendo
     * @return el estado de Atendiendo
     */
    @Override
    public String toString(){
        return "Atendiendo";
    }
}