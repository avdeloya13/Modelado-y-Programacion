import java.util.Scanner;
/**
 * Clase principal Main
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class Main {
    
    
    public static void main(String[] args) {
        //creacion de menus y robot
        Menu menuG = new MenuGeneral();
        Menu menuC = new MenuCambiante();
        Menu menuE = new MenuEspecial();
        Robot robot = new Robot();
        //llenamos el robot de los menus
        robot.llena(menuG);
        robot.llena(menuC);
        robot.llena(menuE);
        
        Scanner sc = new Scanner(System.in);
		int opcion;

        do{
			System.out.println("\nSelecciona que deseas hacer con robot\n"+
                "***Estado: "+robot.getEstado()+"***"+
				"\n1.- Activar.\n" +
				"2.- Atender.\n" + 
				"3.- Cocinar.\n" + 
				"4.- Suspender.\n" +
				"0.- Terminar simulacion.\n");

				while (true){
					try {
						String opcionUsuario = sc.nextLine();
						opcion = Integer.parseInt(opcionUsuario);
						break;
					}catch (NumberFormatException ex){
						System.out.println("Por favor elige la opcion VALIDA\n"
							+ "***Estado: "+robot.getEstado()+"***"+
							"\n1.- Activar.\n" +
							"2.- Atender.\n" + 
							"3.- Cocinar.\n" + 
							"4.- Suspender.\n" +
							"0.- Terminar simulacion.\n");
					}
				}

				switch(opcion){
					case 1:
						robot.activar();
						break;

					case 2:
						robot.atender();
						break;

					case 3:
						robot.cocinar();
						break;

					case 4:
						robot.suspender();
						break;

					case 0:
						break;

					default:
						System.out.println("\nPor favor elige la opcion que deseas ejecutar.");
						break;
				}
		}while(opcion != 0);
    }
}	
