/**
 * Representa una Fabrica de Carrocerias
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class FabricaCarroceria extends AbstractFactory{


    /**
     * Regresa el componente especifico segun el tipo de fabrica
     * @param componente el tipo de componente que deseamos
     * @return el objeto que deseamos
     */
    protected Object getComponente(String componente){
        return getCarroceria(componente);
    }


    /**
     * Crea y regresa la carroceria segun el tipo que le pasemos
     * @param tipoCarroceria el tipo de carroceria que deseamos
     * @return la carroceria que deseamos
     */
    private Carroceria getCarroceria(String tipoCarroceria){
        if(tipoCarroceria == null){
            System.out.println("Opcion invalida, se pone carroceria casual");
            return new CarroceriaCasual();
        }
        else if(tipoCarroceria.equalsIgnoreCase("casual"))
            return new CarroceriaCasual();
        else if(tipoCarroceria.equalsIgnoreCase("camion"))
            return new CarroceriaCamion();
        else if(tipoCarroceria.equalsIgnoreCase("deportiva"))
            return new CarroceriaDeportiva();
        //si no entra en ningun caso, la opcion por defualt es carroseria casual
        System.out.println("Opcion invalida, se pone carroceria casual");
        return new CarroceriaCasual();
    }

}