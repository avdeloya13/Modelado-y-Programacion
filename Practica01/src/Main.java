/**
 * Clase principal Main
 * @author Bernal Marquez Erick
 * @author Deloya Andrade Ana Valeria
 * @version 1
 */
public class Main {


    public static void main(String[] args) {
        //creamos los clientes
        Cliente alicia = new Cliente("Alicia",12000);
        Cliente bob = new Cliente("Bob",700);
        Cliente cesar = new Cliente("Cesar",5000);
        Cliente diego = new Cliente("Diego",7000);
        Cliente erika = new Cliente("Erika",9000);
        
        //creamos los servicios
        Sujeto memeflix = new Memeflix();
        Sujeto momazon = new Momazon();
        Sujeto twitsh = new Twitsh();
        Sujeto thisney = new Thisney();
        Sujeto hvo = new HVOMax();

        //-------------Contratacion de servicios por cliente--------------
        //alicia contrata todos con la version más cara
        alicia.alta(memeflix, 4);
        alicia.alta(momazon, 2);
        alicia.alta(twitsh, 2);
        //le pasamos un uno por el primer mes
        alicia.alta(thisney, 1);
        alicia.alta(hvo, 1);

        //bob también contrata la version cara
        bob.alta(memeflix, 4);
        bob.alta(momazon, 2);
        bob.alta(twitsh, 2);
        //le pasamos un uno por el primer mes
        bob.alta(thisney, 1);
        bob.alta(hvo, 1);

        //cesar solo contrata hvo y disney
        cesar.alta(thisney, 1);
        cesar.alta(hvo, 1);

        //diego se suscribe a memeflix de dos pantallas y momazon premium
        diego.alta(memeflix, 2);
        diego.alta(momazon, 2);

        /*erika se suscribe a memeflix para 4 pantallas
        twitsh normal y hvo
        */
        erika.alta(memeflix, 4);
        erika.alta(twitsh, 1);
        erika.alta(hvo, 1);

        //----------Veamos el estado de cada uno de los clientes--------
        System.out.print("\nEstado de clientes:\n"+
        alicia+"\n"+
        bob+"\n"+
        cesar+"\n"+
        diego+"\n"+
        erika+"\n");

        //--------------Meses---------------
        //1 mes, los servicio son los que cobran
        System.out.print("\n-----------1 mes---------\n");
        memeflix.cobrar();
        momazon.cobrar();
        twitsh.cobrar();
        thisney.cobrar();
        hvo.cobrar();
        //----Estado de los clientes
        System.out.print("\nEstado de clientes:\n"+
        alicia+"\n"+
        bob+"\n"+
        cesar+"\n"+
        diego+"\n"+
        erika+"\n");
        
        
        //2 mes, diego se suscribe a twitsh en su version normal
        System.out.print("\n-----------2 mes---------\n");
        diego.alta(twitsh, 1);
        memeflix.cobrar();
        momazon.cobrar();
        twitsh.cobrar();
        thisney.cobrar();
        hvo.cobrar();
        //----Estado de los clientes
        System.out.print("\nEstado de clientes:\n"+
        alicia+"\n"+
        bob+"\n"+
        cesar+"\n"+
        diego+"\n"+
        erika+"\n");


        //3 mes, diego se suscribe a disney y cancela memeflix
        System.out.print("\n-----------3 mes---------\n");
        diego.alta(thisney, 1); diego.baja(memeflix);
        memeflix.cobrar();
        momazon.cobrar();
        twitsh.cobrar();
        thisney.cobrar();
        hvo.cobrar();
        //----Estado de los clientes
        System.out.print("\nEstado de clientes:\n"+
        alicia+"\n"+
        bob+"\n"+
        cesar+"\n"+
        diego+"\n"+
        erika+"\n");


        //4to mes, diego se suscribe a memeflix para 4 dispositivos
        System.out.print("\n-----------4 mes---------\n");
        diego.alta(memeflix, 4);
        memeflix.cobrar();
        momazon.cobrar();
        twitsh.cobrar();
        thisney.cobrar();
        hvo.cobrar();
        //----Estado de los clientes
        System.out.print("\nEstado de clientes:\n"+
        alicia+"\n"+
        bob+"\n"+
        cesar+"\n"+
        diego+"\n"+
        erika+"\n");


        //5to mes, erika cancela memeflix y contrata momazon premium
        System.out.print("\n-----------5 mes---------\n");
        erika.baja(memeflix);
        erika.alta(momazon, 2);
        //cambia a twitsh premium
        erika.baja(twitsh);  erika.alta(twitsh, 2);
        memeflix.cobrar();
        momazon.cobrar();
        twitsh.cobrar();
        thisney.cobrar();
        hvo.cobrar();
        //----Estado de los clientes
        System.out.print("\nEstado de clientes:\n"+
        alicia+"\n"+
        bob+"\n"+
        cesar+"\n"+
        diego+"\n"+
        erika+"\n");


        //6to mes
        System.out.print("\n-----------6 mes---------\n");
        memeflix.cobrar();
        momazon.cobrar();
        twitsh.cobrar();
        thisney.cobrar();
        hvo.cobrar();
        //----Estado de los clientes
        System.out.print("\nEstado de clientes:\n"+
        alicia+"\n"+
        bob+"\n"+
        cesar+"\n"+
        diego+"\n"+
        erika+"\n");


        //7mo mes
        System.out.print("\n-----------7 mes---------\n");
        memeflix.cobrar();
        momazon.cobrar();
        twitsh.cobrar();
        thisney.cobrar();
        hvo.cobrar();
        //----Estado de los clientes
        System.out.print("\nEstado de clientes:\n"+
        alicia+"\n"+
        bob+"\n"+
        cesar+"\n"+
        diego+"\n"+
        erika+"\n");
        

        //8vo mes, erika cancela sus servicios
        System.out.print("\n-----------8 mes---------\n");
        erika.baja(twitsh); erika.baja(hvo); erika.baja(momazon);
        memeflix.cobrar();
        momazon.cobrar();
        twitsh.cobrar();
        thisney.cobrar();
        hvo.cobrar();
        //----Estado de los clientes
        System.out.print("\nEstado de clientes:\n"+
        alicia+"\n"+
        bob+"\n"+
        cesar+"\n"+
        diego+"\n"+
        erika+"\n");


        //9no mes
        System.out.print("\n-----------9 mes---------\n");
        memeflix.cobrar();
        momazon.cobrar();
        twitsh.cobrar();
        thisney.cobrar();
        hvo.cobrar();
        //----Estado de los clientes
        System.out.print("\nEstado de clientes:\n"+
        alicia+"\n"+
        bob+"\n"+
        cesar+"\n"+
        diego+"\n"+
        erika+"\n");


        //10mo mes
        System.out.print("\n-----------10 mes---------\n");
        erika.alta(thisney,1);
        memeflix.cobrar();
        momazon.cobrar();
        twitsh.cobrar();
        thisney.cobrar();
        hvo.cobrar();
        //----Estado de los clientes
        System.out.print("\nEstado de clientes:\n"+
        alicia+"\n"+
        bob+"\n"+
        cesar+"\n"+
        diego+"\n"+
        erika+"\n");


        //11vo mes
        System.out.print("\n-----------11 mes---------\n");
        memeflix.cobrar();
        momazon.cobrar();
        twitsh.cobrar();
        thisney.cobrar();
        hvo.cobrar();
        //----Estado de los clientes
        System.out.print("\nEstado de clientes:\n"+
        alicia+"\n"+
        bob+"\n"+
        cesar+"\n"+
        diego+"\n"+
        erika+"\n");


        //12vo mes
        System.out.print("\n-----------12 mes---------\n");
        memeflix.cobrar();
        momazon.cobrar();
        twitsh.cobrar();
        thisney.cobrar();
        hvo.cobrar();
        //----Estado de los clientes
        System.out.print("\nEstado de clientes:\n"+
        alicia+"\n"+
        bob+"\n"+
        cesar+"\n"+
        diego+"\n"+
        erika+"\n");

    }
    
}
