import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;
/**
 * Clase que representa un menu que cambia cada dia
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class MenuCambiante implements Menu{
    
    //Menu de hamburguesas que cambian cada dia
    private ArrayList hamburguesas;

    //Posibles hamburguesas para estar en el menu
    private Hamburguesa[] posibles = new Hamburguesa[8];

    /**
     * Metodo constructor para un MenuCambiante.
     */
    public MenuCambiante(){ 
        
        Hamburguesa vaca = new Normal(10,"La vaca","Hamburguesa de vacuno con jamon",50,true);
        Hamburguesa extraQueso = new Vegetariana(11,"Extra queliciosa","Hamburguesa con queso extra",50,true);
        Hamburguesa ranchera = new Normal(12,"Ranchera","Hamburguesa de pollo a la ranchera",50,true);
        Hamburguesa vegana = new Vegetariana(13,"Vegana","Hamburguesa vegana y sin maltrato anymal",60,false);
        Hamburguesa cangreburger = new Normal(14,"Cangreburger","Traida desde fondo de bikini, una rica cangreburger",90,false);
        Hamburguesa dobleCarneRes = new Normal(15,"Mucha res","Hamburguesa con doble de carne de res",60,true);
        Hamburguesa dobleCarnePollo = new Normal(16,"Mucho pollo","Hamburguesa con doble de carne de pollo",60,true);
        Hamburguesa tocino = new Normal(17,"Tocino","Hamburguesa con tocino",50,false);
        //llena las posibles hamburguesas que podría tener el menu
        posibles[0] = vaca;
        posibles[1] = extraQueso;
        posibles[2] = ranchera;
        posibles[3] = vegana;
        posibles[4] = cangreburger;
        posibles[5] = dobleCarneRes;
        posibles[6] = dobleCarnePollo;
        posibles[7] = tocino;

        hamburguesas = new ArrayList();
        //llena al azar el menu cambiante
	    rellena();
    }


    /**
     * Metodo que agrega hamburguesas al menu, con base al arreglo 
     * de posibles hamburguesas. 
     */
    public void rellena(){
        hamburguesas.clear();
        Random r = new Random();
        for(int i = 0; i <= 3; i++){
            int numeroRandom = r.nextInt(8);
            Hamburguesa seleccionada = posibles[numeroRandom];
            //si la hamburguesa No esta en la lista entonces la agrega
            if (!hamburguesas.contains(seleccionada))
                hamburguesas.add(seleccionada);  
        }
    }


    /**
     * Devuelve un iterador para iterar el iterable
     * @return iterador del menu cambiante
     */
    @Override
    public Iterator getIterator(){
        Iterator it = hamburguesas.iterator();
        return it;
    }
}
