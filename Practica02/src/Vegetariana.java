/**
 * Clase que representa una hamburguesa vegetariana
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class Vegetariana extends Hamburguesa{
    
    /**
     * Contructor de una hamburgesa Vegetariana
     * @param id el identificador de la hamburguesa
     * @param nombre el nombre de la hamburguesa
     * @param descripcion una breve descripcion de la hamburguesa
     * @param precio el precio de la hamburgesa
     * @param queso si la hamburguesa lleva queso
     */
    public Vegetariana(int id, String nombre, String descripcion,
                    int precio, boolean queso){
        this.id = id;
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.queso=queso;
        vegetariana = true;
    }


    /**
     * Metodo para agregar preparar carne de una hamburguesa.
     */
    public void prepararCarne(){
        System.out.println("Preparamos carne de soya para que cuides a los animales, tkm. (:");

    }
    
}