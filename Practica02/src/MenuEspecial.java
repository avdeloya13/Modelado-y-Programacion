import java.util.Hashtable;
import java.util.Iterator;
/**
 * Clase que representa un menu especial de hamburguesas
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * 
 */
public class MenuEspecial implements Menu{

    private Hashtable hamburguesas; 
    
    /**
     * Constructor del MenuEspecial 
     */
    public MenuEspecial(){
        hamburguesas = new Hashtable();
        
        Hamburguesa laBik = new Normal(20,"La bik","Hamburguesa con pollo rostizado a la BBQ",100,true);
        Hamburguesa laBikMak = new Normal(21,"La BikBak","Suculenta hamburguesa de res, pollo y cerdo",120,true);
        Hamburguesa misterios = new Normal(22,"Misterios","Hamburguesa misteriosa Atrevete a probarla, igual te da asco",100,false);
        Hamburguesa espantosa = new Vegetariana(23,"Espantosa","Hamburguesa da carne de soya",90,true);
        Hamburguesa digna= new Vegetariana(24,"Digna","Hamburguesa sin carne como Barba de Refil",90,false);

        hamburguesas.put(laBik.getNombre(), laBik);
        hamburguesas.put(laBikMak.getNombre(), laBikMak);
        hamburguesas.put(misterios.getNombre(), misterios);
        hamburguesas.put(espantosa.getNombre(), espantosa);
        hamburguesas.put(digna.getNombre(), digna);
    }


    /**
     * Devuelve un iterador para HashTable
     */
    public Iterator getIterator(){
        Iterator it = hamburguesas.values().iterator();
        return it;
    } 
}
