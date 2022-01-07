/**
 * Representa una Fabrica de Llantas
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class FabricaLlantas extends AbstractFactory{

    /**
     * Regresa el componente especifico segun el tipo de fabrica
     * @param componente el tipo de componente que deseamos
     * @return el objeto que deseamos
     */
    protected Object getComponente(String componente){
        return getLlantas(componente);
    }

    /**
     * Crea y regresa la llanta segun el tipo que le pasemos
     * @param tipoLlantas el tipo de llanta que deseamos
     * @return la llanta que deseamos
     */
    private Llantas getLlantas(String tipoLlantas){
        if(tipoLlantas == null){
            System.out.println("Opcion invalida, se pone llantas simples");
            return new LlantasSimples();
        }
        else if(tipoLlantas.equalsIgnoreCase("simple"))
            return new LlantasSimples();
        else if(tipoLlantas.equalsIgnoreCase("deportivas"))
            return new LlantasDeportivas();
        else if(tipoLlantas.equalsIgnoreCase("off-road"))
            return new LlantasOffRoad();
        else if(tipoLlantas.equalsIgnoreCase("oruga de tanque"))
            return new LlantasOrugaTanque();
        //si no entra en ningun caso, la opcion por defualt son llantas simples        
        System.out.println("Opcion invalida, se pone llantas simples");
        return new LlantasSimples();
    }

}