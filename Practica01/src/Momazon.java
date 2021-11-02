import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
/**
 * Representa el servicio Momazon
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class Momazon implements Sujeto {
    private ArrayList<Cliente> clientes;
    private String[] catalogo = {"Sau: El juego miedoso", "La no independencia", 
    "Los inauditos", "La titere que da miedo", "Odizea: 2001", "Pleicula generica"};

    //atributo auxiliar para ir guardando el tipo de cobro de cada cliente
    //1= normal, 2 = premium, 0= sin suscripcion
    private HashMap<Cliente, Integer> historial;

    //Atributo que nos dice de qué manera va a cobrar
    private CobroMomazon tipoCobro;

    /**
     * Método constructor, incializa la lista de clientes y el historial
     */
    public Momazon(){
        this.clientes = new ArrayList<Cliente>();
        this.historial = new HashMap<Cliente, Integer>();
    }


    /**
     * Cambia la manera en como va a cobrar.
     * @param tipoCobro la nueva manera en que va a cobrar
     */
    public void setCobro(CobroMomazon tipoCobro){
        this.tipoCobro = tipoCobro;
    }


    /**
     * Agrega un cliente al servicio junto con el tipo de servicio
     * @param cliente el cliente a agregar
     * @param tipo el tipo de servicio
     */
    public void agregar(Cliente cliente, int tipo){
        //verificamos si el cliente ya ha sido agregado antes
        if(!contiene(cliente)) {
            clientes.add(cliente);
        }
        
        /*agregamos tambien al historial de cliente, este sirve para cuando
        hayan anulado su suscripcion y quieran volver.
        No es necesario verificar si ya está o no, ya que de estarlo solo lo sobreescribe*/
        historial.put(cliente, tipo);
        System.out.println("Bienvenido a Momazon, " + cliente.getNombre() + " disfruta nuestro contenido!");
    }
    
    
    /**
     * Verifica si el cliente esta en la lista de cliente
     * @return true si el cliente a buscar coincide con el cliente c de la lista
     * @return false en otro caso
     */
    private boolean contiene(Cliente cliente){    
        for(Cliente c: clientes){
            if(c == cliente){
            return true;
            }
        }
        return false;

    }


    /**
     * Elimina al cliente del servicio pero NO del historial, solo lo sobreescribe 
     * a sin servicio, tipo = 0
     * @param cliente el cliente a eliminar
     */
    public void eliminar(Cliente cliente){
        int i = clientes.indexOf(cliente);
        if(i>0){
            clientes.remove(i);
            System.out.println("Te echaremos de menos!... Vuelve!");
        }
        //actualizamos el historial para que aparezca que sin suscripcion
        historial.put(cliente, 0);
    }


    /** 
     * Cobra a todos los clientes por servicio
     * que implementa al sujeto
     * @param cliente la lista de clientes a cobrar
     */
    public void cobrar(){    
        System.out.println("\u001B[36m"+"Cobro de Momazon");
        //recorre lista de clientes    
        Iterator<Cliente> it = clientes.iterator();
        while(it.hasNext()){
            Cliente cliente = it.next();
            Integer tipo= historial.get(cliente);
            //podemos asegurar que tipo nunca será igual a 0, ya que toma los clientes
            //de la lista de clientes
            if (tipo == 1)
            setCobro(new CobroMomazonNormal());
            if (tipo == 2)
            setCobro(new CobroMomazonNormal());
            
            //Manda a llamar le método cobro
            boolean sigue = tipoCobro.cobrar(cliente);
            //verificamos que siga teniendo suficiente dinero para seguir pagando
            if (!sigue){
                //el iterador se encarga de eliminar el cliente
                it.remove();
                
            }

        }
        System.out.println("Se ha cobrado el servicio de Momazon, prros");
        System.out.println(recomendaciones()+"\u001B[0m");
    }


    /**
     * Recomienda lo que el usuario puede ver del catalogo de Momazon
     * @return las recomendaciones
     */
    public String recomendaciones(){
        Random r = new Random();
        String recomendaciones = "Momazon te recomienda: ";
        for (int i =0; i<=2; i++){
            int indiceAzar = r.nextInt(catalogo.length);
            String elementoAzar = catalogo[indiceAzar];
            recomendaciones += elementoAzar +", ";
        }

        return recomendaciones;
    }  
}
