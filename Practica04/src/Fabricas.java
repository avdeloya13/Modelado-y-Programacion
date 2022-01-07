/**
 * Representa una fabrica que hace las fabricas de los componentes
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class Fabricas{

    
    /**
     * Metodo que va a crear la fabrica de los componentes de un automovil
     * @param opcion la fabrica a crear
     * @return el tipo de fabrica deseada
     */
    public static AbstractFactory getFactory(String opcion){
        if(opcion.equalsIgnoreCase("armas"))
            return new FabricaArmas();
        else if(opcion.equalsIgnoreCase("blindaje"))
            return new FabricaBlindaje();
        else if(opcion.equalsIgnoreCase("carroceria"))
            return new FabricaCarroceria();
        else if(opcion.equalsIgnoreCase("motor"))
            return new FabricaMotor();
        else if(opcion.equalsIgnoreCase("llanta"))
			return new FabricaLlantas();
		return null;
	}
}