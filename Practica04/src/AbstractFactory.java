/**
 * 
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public abstract class AbstractFactory{


    /**
     * Regresa el componente especifico segun el tipo de fabrica
     * @param componente el tipo de componente que deseamos
     * @return el objeto que deseamos
     */
    protected abstract Object getComponente(String componente);  
}