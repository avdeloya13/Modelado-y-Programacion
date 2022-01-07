/**
 * Representa una Fabrica de Motores
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class FabricaMotor extends AbstractFactory{

    /**
     * Regresa el componente especifico segun el tipo de fabrica
     * @param componente el tipo de componente que deseamos
     * @return el objeto que deseamos
     */
    protected Object getComponente(String componente){
        return getMotor(componente);
    }


    /**
     * Crea y regresa el motor segun el tipo que le pasemos
     * @param tipoMotor el tipo de motor que deseamos
     * @return el motor que deseamos
     */
    private Motor getMotor(String tipoMotor){
        if(tipoMotor == null){
            System.out.println("Opcion invalida, se pone motor simple");
            return new MotorDiesel();
        }
        else if(tipoMotor.equalsIgnoreCase("deportivo"))
            return new MotorDeportivo();
        else if(tipoMotor.equalsIgnoreCase("diesel"))
            return new MotorDiesel();
        else if(tipoMotor.equalsIgnoreCase("turbo"))
            return new MotorTurbo();
        //si no entra en ningun caso, la opcion por defualt es diesel
        System.out.println("Opcion invalida, se pone motor diesel");
        return new MotorDiesel();
    }

}