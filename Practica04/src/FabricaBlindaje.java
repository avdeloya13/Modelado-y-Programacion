/**
 * Representa una Fabrica de Blindajes
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class FabricaBlindaje extends AbstractFactory{

    /**
     * Regresa el componente especifico segun el tipo de fabrica
     * @param componente el tipo de componente que deseamos
     * @return el objeto que deseamos
     */
    protected Object getComponente(String componente){
        return getBlindaje(componente);
    }


    /**
     * Crea y regresa el blindaje segun el tipo que le pasemos
     * @param tipoBlindaje el tipo de blindaje que deseamos
     * @return el blindaje que deseamos
     */
    private Blindaje getBlindaje(String tipoBlindaje){
        if(tipoBlindaje == null){
            System.out.println("Opcion invalida, se pone blindaje simple");
            return new BlindajeSimple();
        }
        else if(tipoBlindaje.equalsIgnoreCase("reforzado"))
            return new BlindajeReforzado();
        else if(tipoBlindaje.equalsIgnoreCase("simple"))
            return new BlindajeSimple();
        else if(tipoBlindaje.equalsIgnoreCase("tanque"))
            return new BlindajeTanque();
        //si no entra en ningun caso, la opcion por defualt es blindaje simple
        System.out.println("Opcion invalida, se pone blindaje simple");
        return new BlindajeSimple();
    }

}