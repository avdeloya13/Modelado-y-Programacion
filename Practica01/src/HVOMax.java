import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Random;
/**
 * Representa el servicio HVOMax
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class HVOMax implements Sujeto{
    private ArrayList<Cliente> clientes;
    private String[] catalogo = {"Sau: El juego miedoso", "Dr. Casa", "The offise",
    "Un chou mas", "Titanes pacificos", "Furias titanescas", "La noche despues de ayer"};

    //atributo auxiliar para ir guardando los meses
    private HashMap<Cliente, Integer> historial;

    //Atributo que nos dice de qué manera va a cobrar
    private CobroHVOMax tipoCobro;

    /**
     * Método constructor, incializa la lista de clientes y el historial
     */
    public HVOMax(){
        this.clientes = new ArrayList<Cliente>();
        this.historial = new HashMap<Cliente, Integer>();
    }


    /**
     * Cambia la manera en como va a cobrar.
     * @param tipoCobro la nueva manera en que va a cobrar
     */
    public void setCobro(CobroHVOMax tipoCobro){
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
            /*agregamos al historial de cliente, este sirve para cuando
            hayan anulado su suscripcion y quieran volver.
            No es necesario verificar si ya está o no, ya que de estarlo solo lo sobreescribe*/
            historial.put(cliente, tipo);
            System.out.println("Bienvenido "+ cliente.getNombre() + " disfruta HVOMax");
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
            System.out.println("Vuelve, sigue dandonos tu dinero, " + cliente.getNombre());
        }
    }

    /** 
     * Cobra a todos los clientes por servicio
     * que implementa al sujeto
     * @param cliente la lista de clientes a cobrar
     */    
    public void cobrar(){    
        System.out.println("\u001B[35m"+"SerVicio de cobro de HVOMax");
        //recorre lista de clientes    
        Iterator<Cliente> it = clientes.iterator();
        while(it.hasNext()){
            Cliente cliente = it.next();
            Integer tipo= historial.get(cliente);
            //podemos asegurar que tipo nunca será igual a 0, ya que toma los clientes
            //de la lista de clientes
            if (tipo <= 3)
            setCobro(new HVOMaxTresMeses());
            if (tipo >= 4)
            setCobro(new HVOMaxCuatroMeses());
            //Manda a llamar le método cobro
            boolean sigue = tipoCobro.cobrar(cliente);
            //verificamos que siga teniendo suficiente dinero para seguir pagando
            if (!sigue){
                
                it.remove();
                
            }
            Integer nuevoMes = tipo+1;
            historial.put(cliente, nuevoMes);

        }
        System.out.println("Hemos cobrado a todos los usuarios de HVO");
        System.out.println(recomendaciones()+"\u001B[0m");
    }

    /**
     * Recomienda lo que el usuario puede ver del catalogo de HVOMax
     * @return las recomendaciones
     */
    public String recomendaciones(){
        Random r = new Random();
        String recomendaciones = "HVO quiere que te obsesiones con nuestro servicio viendo: ";
        for (int i =0; i<=2; i++){
            int indiceAzar = r.nextInt(catalogo.length);
            String elementoAzar = catalogo[indiceAzar];
            recomendaciones += elementoAzar +", ";
        }

        return recomendaciones;
    }
    
}
