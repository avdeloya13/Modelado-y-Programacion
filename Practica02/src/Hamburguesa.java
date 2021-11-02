/**
 * Clase abstracta que representa una hamburguesa
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public abstract class Hamburguesa{
    
    //Atributos de clase
    protected int id;
    protected String nombre;
    protected String descripcion;

    protected int precio;
    protected boolean queso;
    protected boolean vegetariana;

    /**
     * Metodo para preparar una hamburguesa.
     * Utiliza el patron template.
     */
    public void preparar(){
        System.out.println("Preparando hamburguesa: "+getNombre());
        pan();
        mayonesa();
        mostaza();
        prepararCarne();
        carne();
        if(queso)
            queso();
        vegetales();
        catsup();       
    }


    /**
     * Metodo para agregar pan a una hamburguesa.
     */
    public void pan(){ 
        System.out.println("Agregando el pan");
    }
    

    /**
     * Metodo para agregar mayonesa a una hamburguesa.
     */
    public void mayonesa(){ 
        System.out.println("Agregando mayonesa...");
    }


    /**
     * Metodo para agregar mostaza a una hamburguesa.
     */
    public void mostaza(){ 
        System.out.println("Agregando mostaza...");
    }


    /**
     * Metodo para agregar preparar carne de una hamburguesa.
     */
    public abstract void prepararCarne();


    /**
     * Metodo para agregar carne a una hamburguesa.
     */
    public void carne(){
        System.out.println("Agregando la carne...");
     }
       
     
    /**
     * Metodo para agregar queso a una hamburguesa.
     */
    public void queso(){ 
        System.out.println("Agregando queso...");
    }


    /**
     * Metodo para agregar vegetales a una hamburguesa.
     */
    public void vegetales(){ 
        System.out.println("Colocando vegetales...");
    }


    /**
     * Metodo para agregar catsup a una hamburguesa.
     */
    public void catsup(){ 
        System.out.println("Agregando la catsup...\n");
    }

    /**
     * Representacion en cadena de una hamburguesa
     * @return representacion en cadena de una hamburgesa
     */
    @Override
    public String toString(){ 
        String representacion = "Id: " + this.id + 
        "\nNombre: " + this.nombre + 
        "\nDescripcion: " + this.descripcion +
        "\nPrecio: $" + this.precio + 
        "\nQueso: " +  (queso == true? "Afirmativo" : "Negativo")+ 
        "\nVegetariana: " + (vegetariana == true? "Si" : "No");
        return representacion+"\n";
    } 


    /**
     * Devuelve el nombre de la hamburguesa
     * @return el nombre de la hamburguesa
     */
    public String getNombre(){
        return nombre;
    }


    /**
     * Devuelve el id de la hamburguesa
     * @return el id de la hamburguesa
     */
    public int getId(){
        return id;
    }
}