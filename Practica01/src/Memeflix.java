import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
/**
 * Representa el servicio Memeflix
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class Memeflix implements Sujeto{
    private ArrayList<Cliente> clientes;
    private String[] catalogo = {"Sau: El juego miedoso", "Hiperman: el hombre de fierro",
    "Harry popoter: la colección comnpleta", "Shruek", "Tiempo de aventuras",
    "Las ranas ninja mutantes adolesentes"};

    //atributo auxiliar para ir guardando el tipo de cobro de cada cliente
    //1= 1 pantalla, 2= 2 pantallas, 4= 4 pantallas, 0= sin suscripcion
    private HashMap<Cliente, Integer> historial;

    //Atributo que nos dice de qué manera va a cobrar
    private CobroMemeflix tipoCobro;

    /**
     * Método constructor, incializa la lista de clientes y el historial
     */
    public Memeflix(){
        this.clientes = new ArrayList<Cliente>();
        this.historial = new HashMap<Cliente, Integer>();
    }


    /**
     * Cambia la manera en como va a cobrar.
     * @param tipoCobro la nueva manera en que va a cobrar
     */
    public void setCobro(CobroMemeflix tipoCobro){
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
            //significa que el cliente ya está y no lo tiene que volver a agregar
            System.out.println("El cliente "+ cliente.getNombre() + " ya se encuentra "+
             "utilizando Memeflix");
        }

        /*agregamos tambien al historial de cliente, este sirve para cuando
        hayan anulado su suscripcion y quieran volver.
        No es necesario verificar si ya está o no, ya que de estarlo solo lo sobreescribe*/
        historial.put(cliente, tipo);
        System.out.println("Esperamos disfrutes nuestro contenido memesocho!");
    }

    
    /** Busca si un cliente existe en la lista de clientes
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
            System.out.println("Te echaremos de menos!... Especialmente tu dinero, a ti no");
        }
        //actualizamos el historial para que aparezca que sin suscripcion
        historial.put(cliente, 0);
    }


    /** 
     * Cobra a todos los clientes por servicio
     * que implementa al sujeto
     */
    public void cobrar(){   
        System.out.println("\u001B[31m"+"Memeflix va a pasar lista a sus usuarios");
        Iterator<Cliente> it = clientes.iterator();
        while(it.hasNext()){
            Cliente cliente = it.next();
            Integer tipo= historial.get(cliente);
            //podemos asegurar que tipo nunca será igual a 0, ya que toma los clientes
            //de la lista de clientes
            if (tipo == 1)
            setCobro(new CobroMemeflix1Pantalla());
            if (tipo == 2)
            setCobro(new CobroMemeflix2Pantalla());
            if (tipo == 4)
            setCobro(new CobroMemeflix4Pantalla());
            //Manda a llamar le método cobro
            boolean sigue = tipoCobro.cobrar(cliente);
            //verificamos que siga teniendo suficiente dinero para seguir pagando
            if (!sigue){
                //eliminar(cliente);
                //clientes.remove(cliente);
                //Iterator<Cliente> t = clientes.iterator();
                //t.remove();
                it.remove();
                
            }

        }
        System.out.println("\u001B[31m"+"Se ha cobrado el servicio de Memeflix a nuestros usuarios");
        System.out.println(recomendaciones()+"\u001B[0m");
    }


    /** 
     * Recomendaciones de peliculas que ofrece el servicio
     * @return recomendaciones de 3 peliculas
     */
    public String recomendaciones(){
        Random r = new Random();
        String recomendaciones = "Memeflix sugiere que veas: ";
        for (int i =0; i<=2; i++){
            int indiceAzar = r.nextInt(catalogo.length);
            String elementoAzar = catalogo[indiceAzar];
            recomendaciones += elementoAzar +", ";
        }
        return recomendaciones;
    }  
}
