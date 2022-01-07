/**
 * Representa una Fabrica de Armas
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class FabricaArmas extends AbstractFactory{


    /**
     * Regresa el componente especifico segun el tipo de fabrica
     * @param componente el tipo de componente que deseamos
     * @return el objeto que deseamos
     */
    protected Object getComponente(String componente){
        return getArmas(componente);
    }


    /**
     * Crea y regresa el arma segun el tipo que le pasemos
     * @param tipoArmas el tipo de arma que deseamos
     * @return el arma que deseamos
     */
    private Armas getArmas(String tipoArmas){
        if(tipoArmas == null){
			System.out.println("Opcion invalida, se pone arpones como arma");
            return new ArmasArpones();
        }
        else if(tipoArmas.equalsIgnoreCase("arpones")) 
            return new ArmasArpones();
        else if(tipoArmas.equalsIgnoreCase("canones"))
            return new ArmasCanones();
        else if(tipoArmas.equalsIgnoreCase("metralletas"))  
            return new ArmasMetralletas();
        else if(tipoArmas.equalsIgnoreCase("lanzallamas"))  
            return new ArmasLanzallamas();
        else if(tipoArmas.equalsIgnoreCase("sierras"))  
            return new ArmasSierras();
        //si no entra en ningun caso, la opcion por defualt son arpones
        System.out.println("Opcion invalida, se pone arpones como arma");
        return new ArmasArpones();
    }
}