import java.util.Iterator;
import java.util.Iterator;
/**
 * Clase que representa un menu de hamburguesas normal
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class MenuGeneral implements Menu{
    
    //Las hamburguesas del menu
    private Hamburguesa[] hamburguesas; 

    private int cantidad=0;

    /**
     * Constructor del MenuGeneral 
     */
    public MenuGeneral(){
        hamburguesas = new Hamburguesa[6];
        
        Hamburguesa elGallo = new Normal(1,"El gallo","Hamburguesa con extra pollo",50,true);
        Hamburguesa laFiera = new Normal(2,"La fiera","Suculenta hamburguesa de res",60,true);
        Hamburguesa elCochino = new Normal(3,"El cochino","Hamburguesa con carne de cerdo de calidad",50,false);
        Hamburguesa laFit = new Vegetariana(4,"La fit","Hamburguesa de lechuga y sin maltrato animal",40,true);
        Hamburguesa laNutritiva = new Vegetariana(5,"La nutritiva","Hamburguesa con ensalada extra",40,false);

        hamburguesas[0] = elGallo;
        hamburguesas[1] = laFiera;
        hamburguesas[2] = elCochino;
        hamburguesas[3] = laFit;
        hamburguesas[4] = laNutritiva;
    }


    /** 
     * Clase interna privada para el iterator del menu general.
     */
     //Sobreescribimos los metodos de Iterador, pues extiende de Iterator
    private class IteradorMenuGeneral implements Iterador{
        private int posicion = 0; 

        /**
         * Regresa el elemento siguiente de la estructura de datos que 
         * utiliza la clase MenuGeneral
         * @return una hamburguesa
         */
        @Override
        public Hamburguesa next(){
            Hamburguesa h = hamburguesas[posicion];
            posicion +=1;
            return h;            
        }


        /**
         * Nos dice si tenemos mas elementos en nuestra estructura
         * donde guardamos los elementos
         * @return true si hay mas elementos
         * @return false en otro caso
         */
        @Override
        public boolean hasNext(){
            if(posicion >= hamburguesas.length || hamburguesas[posicion] == null)
                return false;
            return true;
            
        }

    }


    /**
     * Devuelve un iterador para iterar el iterable
     * @return iterador del menu general
    @Override
     */
    public Iterator getIterator(){
        return new IteradorMenuGeneral();
    }
}