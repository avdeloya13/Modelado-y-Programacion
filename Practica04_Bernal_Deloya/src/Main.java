import java.util.Scanner; 
/**
 * Clase principal main
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class Main{
    

    public static void main(String[] args) {
        //fabrica productora
        Fabricas fabrica = new Fabricas();
        //creamos las fabricas de cada componente
        AbstractFactory FabricaArmas = fabrica.getFactory("armas");
        AbstractFactory FabricaBlindaje = fabrica.getFactory("blindaje");
        AbstractFactory FabricaCarroceria = fabrica.getFactory("carroceria");
        AbstractFactory FabricaMotor = fabrica.getFactory("motor");
        AbstractFactory FabricaLlantas = fabrica.getFactory("llanta");
        //damos 620 al usuario
        int dinero = 620;

        Scanner sc = new Scanner(System.in);
        String op;

        do{
            System.out.println("\nSelecciona una opcion para crear tu automovil "+
            "\n**Cuentas con: $"+ dinero +
            "\n1.- Arma el auto tu mismo"+
            "\n2.- Auto simple   : $200"+
            "\n3.- Auto deportivo: $220"+
            "\n4.- Auto mutante  : $240"+
            "\n0.- Salir");
            op = sc.nextLine();

            switch(op){

                case "1":
                //armas
                System.out.println("\nSelecciona una opcion de armas "+
                "\n-Arpones    : 10pts, $50"+
                "\n-Lanzallamas: 16pts, $55"+
                "\n-Canones    : 15pts, $60"+
                "\n-Sierras    : 20pts, $40"+
                "\n-Metralleta : 13pts, $53");
                String armasOpcion = sc.nextLine();
                Armas armas = (Armas)FabricaArmas.getComponente(armasOpcion);

                //blindaje
                System.out.println("\nSelecciona una opcion de blindaje "+
                "\n-simple   : 8pts, $10"+
                "\n-reforzado: 25pts, $30"+
                "\n-tanque   : 15pts, $20");
                String blindajeOpcion = sc.nextLine();
                Blindaje blindajes = (Blindaje)FabricaBlindaje.getComponente(blindajeOpcion);

                //carroceria
                System.out.println("\nSelecciona una opcion de carroceria "+
                "\n-casual   : 10pts, $20"+
                "\n-camion   : 17pts, $30"+
                "\n-deportiva: 25pts, $40");
                String carroceriaOpcion = sc.nextLine();
                Carroceria carroceria = (Carroceria)FabricaCarroceria.getComponente(carroceriaOpcion);

                //motor
                System.out.println("\nSelecciona una opcion de motor "+
                "\n-deportivo: 50pts, $70"+
                "\n-diesel   : 60pts, $80"+
                "\n-turbo    : 70pts, $90");
                String motorOpcion = sc.nextLine();
                Motor motor = (Motor)FabricaMotor.getComponente(motorOpcion);

                //llantas
                System.out.println("\nSelecciona una opcion de llantas "+
                "\n-simple         : 15pts, $40"+
                "\n-deportivas     : 20pts, $60"+
                "\n-off-road       : 15pts, $50"+
                "\n-oruga de tanque: 18pts, $55");
                String llantasOpcion = sc.nextLine();
                Llantas llantas = (Llantas)FabricaLlantas.getComponente(llantasOpcion);
                
                Automovil autoOpcion = new Automovil(armas, blindajes, carroceria, motor, llantas);
                    if(dinero < autoOpcion.total()){
                        System.out.println("Dinero insuficiente");
                        break;
                    }//el auto no puede ser entregado, es decir, impreso
                    
                    dinero -= autoOpcion.total();
                    System.out.println(autoOpcion);
                    System.out.println("Te sobra $"+dinero);

                break;
    
                case "2":
                    //tiene una s de simple
                    Armas armasS = (Armas)FabricaArmas.getComponente("arpones");
                    Blindaje blindajeS = (Blindaje)FabricaBlindaje.getComponente("simple");
                    Carroceria carroceriaS = (Carroceria)FabricaCarroceria.getComponente("casual");
                    Motor motorS = (Motor)FabricaMotor.getComponente("diesel");
                    Llantas llantaS = (Llantas)FabricaLlantas.getComponente("simple");
        
                    Automovil autoS = new Automovil(armasS, blindajeS, carroceriaS, motorS, llantaS);
                    if(dinero < autoS.total()){
                        System.out.println("Dinero insuficiente");
                        break;
                    }//el auto no puede ser entregado, es decir, impreso
                    
                    dinero -= autoS.total();
                    System.out.println(autoS);
                    System.out.println("Te sobra $"+dinero);
                break;

                case "3":
                    //tiene una d de deportivo
                    Armas armasD = (Armas)FabricaArmas.getComponente("lanzallamas");
                    Blindaje blindajeD = (Blindaje)FabricaBlindaje.getComponente("reforzado");
                    Carroceria carroceriaD = (Carroceria)FabricaCarroceria.getComponente("deportiva");
                    Motor motorD = (Motor)FabricaMotor.getComponente("deportivo");
                    Llantas llantaD = (Llantas)FabricaLlantas.getComponente("deportivas");
        
                    Automovil autoD = new Automovil(armasD, blindajeD, carroceriaD, motorD, llantaD);
                    if(dinero < autoD.total()){
                        System.out.println("Dinero insuficiente");
                        break;
                    }//el auto no puede ser entregado, es decir, impreso

                    dinero -= autoD.total();
                    System.out.println(autoD);
                    System.out.println("Te sobra $"+dinero);
                break;

                case "4":
                    //tiene una m de mutante
                    Armas armasM = (Armas)FabricaArmas.getComponente("metralleta");
                    Blindaje blindajeM = (Blindaje)FabricaBlindaje.getComponente("tanque");
                    Carroceria carroceriaM = (Carroceria)FabricaCarroceria.getComponente("camion");
                    Motor motorM = (Motor)FabricaMotor.getComponente("turbo");
                    Llantas llantaM = (Llantas)FabricaLlantas.getComponente("off-road");

                    Automovil autoM = new Automovil(armasM, blindajeM, carroceriaM, motorM, llantaM);
                    if(dinero < autoM.total()){
                        System.out.println("Dinero insuficiente");
                        break;
                    }//el auto no puede ser entregado, es decir, impreso
                    
                    dinero -= autoM.total();
                    System.out.println(autoM);
                    System.out.println("Te sobra $"+dinero);
                break;
    
                case "0": 
                    System.out.println("Opcion salir, hasta pronto");
                return;
    
                default: 
                    System.out.println("Opcion invalida");
                break;
            }
        }while(true);
    }
}