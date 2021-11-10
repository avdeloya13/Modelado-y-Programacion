import java.util.Scanner;
/**
 * Clase principal Main
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class Main{

    /**
     * Metodo auxiliar en el que se le pide al cliente que elija una pizza
     * del menu. Parecido a el patron Factory
     * @return la pizza elegida por el cliente
     */
    public static Pizza daPizza(){
        Scanner sc = new Scanner(System.in);
        while(true){
            String op = sc.nextLine();
            switch(op){
            case "1": return new PizzaHawaiana();
            case "2": return new PizzaVegetariana();
            case "3": return new PizzaNapolitana();
            case "4": return new PizzaCarbonara();
            case "5": return new PizzaMexicana();
            default : System.out.println("Opcion de pizza invalida, vuelva a elegir");
            break;
            }
        }
    }

    
    /**
     * Metodo auxiliar en el que se le pide al cliente que elija el
     * pan para la baguette. Parecido a el patron Factory
     * @return la baguette elegida por el cliente
     */
    public static Baguette daBaguette(){
        Scanner sc = new Scanner(System.in);
        while(true){
            String op = sc.nextLine();
            switch(op){
            case "1": return new PanIntegral();
            case "2": return new PanAjonjoli();
            case "3": return new PanNormal();
            default : System.out.println("Opcion de pan invalido, vuelva a elegir");
            break;
            }
        }
    }


    /**
     * Metodo auxiliar en el que se le pide al cliente que elija los 
     * ingredientes de la baguette que quiere. Parecido a el patron Factory
     * @param inicial la baguette elegida por el cliente a decorar
     * @return la baguette decorada por el cliente
     */
    public static Baguette decora(Baguette inicial){
        Scanner sc = new Scanner(System.in);
        System.out.println("\n*Selecciona los ingredientes que quieres poner*");
        System.out.println("1.- Pollo\n2.- Pepperoni\n3.- Jamon\n4.- Lechuga\n5.- Jitomate\n6.- Cebolla"+
        "\n7.- Mostaza\n8.- Catsup\n9.- Mayonesa\n0.- Listo\n");
        while(true){
            String op = sc.nextLine();
            switch(op){
            case "1": inicial = new Pollo(inicial); System.out.println("Pollo agregado"); break;
            case "2": inicial = new Pepperoni(inicial); System.out.println("Pepperoni agregado"); break;
            case "3": inicial = new Jamon(inicial); System.out.println("Jamon agregado"); break;
            case "4": inicial = new Lechuga(inicial); System.out.println("Lechuga agregada"); break;
            case "5": inicial = new Jitomate(inicial); System.out.println("Jitomate agregado"); break;
            case "6": inicial = new Cebolla(inicial); System.out.println("Cebolla agregada"); break;
            case "7": inicial = new Mostaza(inicial); System.out.println("Mostaza agregada"); break;
            case "8": inicial = new Catsup(inicial); System.out.println("Catsup agregada"); break;
            case "9": inicial = new Mayonesa(inicial); break;
            case "0": return inicial;

            default : System.out.println("Opcion de ingrediente invalido, vuelva a elegir");
            break;
            }
        }
    }
    

    //metodo main de prueba
    public static void main(String[] args){

        //Entrada del usuario
        Scanner sc = new Scanner(System.in);        
        //Ponemos string para evitar hacer un try catch (Puede ser un poco sucio hacer esto pero es lo que hay)
        String op;

        do{
            System.out.println("\nBienvenido a WaySub! Selecciona que prefieres\n1.-Baguette\n2.-Pizza\n0.-Salir\n");
            op = sc.nextLine();

            switch(op){

                case "1":
                    System.out.println("\n***MENU BAGUETTES***\nSelecciona un tipo de pan");
                    System.out.println("1.- Integral\n2.- Ajonjoli\n3.- Normal");
                    Baguette elegida = daBaguette();
                    Baguette decorada = decora(elegida);
                    System.out.println(decorada);

                break;
                
                case "2":
                    System.out.println("\n***MENU DE PIZZAS***\nSelecciona la pizza");
                    System.out.println("1.- Hawaiana $110\n2.- Vegetariana $100\n3.- Napolitana $140" + 
                    "\n4.- Carbonara $110\n5.- Mexicana $150");
                    System.out.println("Elige tu pizza");

                    //mandamos a llamar el metodo auxiliar, nos devuelve una pizza
                    Pizza pizzaElegida = daPizza();
                    //adaptamos la pizza que nos devolvio el metodo auxiliar
                    Producto adaptador = new AdapterPizza(pizzaElegida);
                    //imprimimos la pizza ya adaptada
                    System.out.println(adaptador);
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