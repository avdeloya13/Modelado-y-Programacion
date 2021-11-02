import java.util.Iterator;
/**
 * Iterador para hamburguesas
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 */
 //hacemos que nuestro Iterador extienda de Iterator para poder verlo asi
public interface Iterador extends Iterator{

    /**
     * Regresa el elemento siguiente de la estructura de datos que 
     * utilizan los menus
     * @return una hamburguesa
     */
    public Hamburguesa next();


    /**
     * Nos dice si tenemos mas elementos en nuestra estructura
     * donde guardamos los elementos
     * @return true si hay mas elementos
     * @return false en otro caso
     */
    public boolean hasNext();
}