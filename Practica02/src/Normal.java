/**
 * Clase que representa una hamburguesa Normal
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class Normal extends Hamburguesa{

    /**
     * Contructor de una hamburgesa normal, 
     * @param id el identificador de la hamburguesa
     * @param nombre el nombre de la hamburguesa
     * @param descripcion una breve descripcion de la hamburguesa
     * @param precio el precio de la hamburgesa
     * @param queso si la hamburguesa lleva queso
     */
    public Normal(int id, String nombre, String descripcion,
                    int precio, boolean queso){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.queso=queso;
        vegetariana = false;
    }


    /**
     * Metodo para agregar preparar carne de una hamburguesa.
     */
    public void prepararCarne(){
        System.out.println("Preparamos carne de res extra grasosa pa que engordes");

    } 
}
