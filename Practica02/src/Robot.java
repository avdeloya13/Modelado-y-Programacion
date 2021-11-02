import java.util.ArrayList;
import java.util.Iterator;
/**
 * Clase que representa un robot
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class Robot{
    //Posibles estados del robot
    private Estado caminando;
    private Estado suspendido;
    private Estado cocinando;
    private Estado atendiendo;
    private Estado actual;

    //Menus del robot
    private ArrayList hamburguesas;

    private boolean orden;
    //hamburguesa a cocinar
    private Hamburguesa cocina;

    /**
     * Constructor del Robot
     */    
    public Robot(){
        caminando = new Caminando(this);
        suspendido = new Suspendido(this);
        cocinando = new Cocinando(this);
        atendiendo = new Atendiendo(this);
        actual = suspendido;
        hamburguesas = new ArrayList();
        orden = false;
    }


    /**
     * Llena la lista de hamburguesas del robot con el menu dado
     * @param menu el menu con el que rellenar la lista de hamburguesas
     */
    public void llena(Menu menu){
        Iterator it = menu.getIterator();
        while(it.hasNext()){
            Hamburguesa h = (Hamburguesa)it.next();
            hamburguesas.add(h);
        }
    }

    /**
     * Muestra el menu de hamburguesas del robot sin acceder a la lista
     * Solo a sus elementos
     */
    public void mostrarMenu(){
        Iterator ith = hamburguesas.iterator();
        while(ith.hasNext()){
            Hamburguesa h = (Hamburguesa)ith.next();
            System.out.println(h);
        }
    }

 
    /**
     * Busca si el id del parametro se encuentra en nuestra
     * lista de hamburguesas
     * @param id el id a buscar en la lista
     */
    public void recibeOrden(int id){
        Iterator ith = hamburguesas.iterator();
        while(ith.hasNext()){
            Hamburguesa h = (Hamburguesa)ith.next();
            if(h.getId() == id){
                cocina = h;
                orden = true;
                return;
            }
        }
        cocina = null;
        orden = false;
    }


    /**
     * Preparacion de una hamburguesa, una vez que se cocine vuelve a poner la orden la orden en falso
     */
    public void prepara(){
        //si hay entonces va a preparar la hamburguesa verificando que no sea null
        if(cocina != null) {
            cocina.preparar(); 
            orden = false;
        }

        else System.out.print("Lamentamos no tener su hamburguesa, vuelva pronto, por favor."+
        " No queremos perder clientes ):");
        //la orden sigue siendo false
    }


    /***
     * Regresa true si tenemos la orden del cliente o false si no es asi
     * @return la orden
     */
    public boolean getOrden(){
        return orden;
    }
    

    /**
     * Activa el robot en el estado actual
     */
    public void activar(){
        actual.activar();
    }


    /**
     * Suspende el robot en el estado actual
     */
    public void suspender(){
        actual.suspender();
    }


    /**
     * El robot atiende en el estado actual
     */
    public void atender(){
        actual.atender();
    }


    /**
     * El robot se pone a cocinar en el estado actual
     */
    public void cocinar(){
        actual.cocinar();
    }


    /**
     * Regresa el estado de apagado
     * @return el estado Apagado 
     */
    public Estado getCaminando(){
        return caminando;
    }


    /**
     * Regresa el estado de suspendido
     * @return el estado Suspendido
     */
    public Estado getSuspendido(){
        return suspendido;
    }


    /**
     * Regresa el estado de cocinando
     * @return el estado Cocinando
     */
    public Estado getCocinando(){
        return cocinando;
    }


    /**
     * Regresa el estado de Atendiendo
     * @return el estado Atendiendo
     */
    public Estado getAtendiendo(){
        return atendiendo;
    }

    
    /**
     * Cambia el estado actual al robot por un nuevo estado
     * @param actual el estado al que se desea cambiar
     */
    public void setEstado(Estado actual){
        this.actual = actual;

    }

    /**
     * Regresa el estado actual del robot
     * @return el estado estado actual del robot
     */
    public Estado getEstado(){
        return actual;
    }
}