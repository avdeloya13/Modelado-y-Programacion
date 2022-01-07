/**
 * Representa un automovil
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class Automovil{
    private Armas armas;
    private Blindaje blindaje; 
    private Carroceria carroceria; 
    private Motor motor;
    private Llantas llantas;


    /**
     * Constructor de la clase Automovil
     */
    public Automovil(Armas armas, Blindaje blindaje, Carroceria carroceria, Motor motor, Llantas llantas){
        this.armas = armas;
        this.blindaje = blindaje; 
        this.carroceria = carroceria;
        this.motor = motor;
        this.llantas = llantas;
    } 


    /**
     * Calcula y devuelve el precio total del automovil
     * @return el precio total
     */
    public int total(){
        int total = armas.getCosto() +
              blindaje.getCosto() +
              carroceria.getCosto()+
              motor.getCosto()+
              llantas.getCosto();
        return total;
    }


    /**
     * Representacion en cadena de los componentes del automovil
     * @return los componentes del automovil en cadena y su precio
     */
    public String toString(){
       return "El auto esta compuesto por:"+
       "\nArmas "+armas+
       "\nBlindaje "+blindaje+
       "\nCarroceria "+carroceria+
       "\nMotor "+motor+
       "\nLlantas "+llantas+
       "\nTotal $"+total();
    }   
}