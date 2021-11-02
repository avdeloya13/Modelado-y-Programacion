/**
 * Representa el cobro por el servicio Thisney los primeros 3 meses
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class ThisneyTresMeses implements CobroThisney{

    /**
     * Cobro por el servicio de Thisney
     * @param cliente el cliente a cobrar
     * @return true si el cliente sigue utilizando el servicio
     */
    public boolean cobrar(Cliente cliente){
        int dinero = cliente.getDinero();
        //verificamos que tenga dinero para pagar
        if (dinero < 120){
            System.out.println("Que pena, te has quedado sin dinero, trabaja."
            + cliente.getNombre()+
            " No le copiamos a Memeflix, ellos nos copiaron a nosotros"); 
            return false;
        }
        cliente.actualizaPago(120);
        System.out.println("Te cobramos $120 por los primeros 3 meses de Thisney, "+
        cliente.getNombre()+". Cuidadito porque ya vas pa los 4");
        return true;
    }
}