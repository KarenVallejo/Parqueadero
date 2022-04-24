
package mx.com.gm.parqueo;

import java.util.Scanner;

public class Parqueo {

    private static Scanner teclado;
    public static void main(String[] args) {
        int menu=0;
        PagoM m;
        PagoC c;
        PagoCam cam;
               
        teclado = new Scanner(System.in);
        System.out.println("****PARQUEADERO****");
        System.out.println("Seleccione una Opcion: ");
        System.out.println("1. Moto");
        System.out.println("2. Carro");
        System.out.println("3. Camion");        
        menu=teclado.nextInt();
         switch(menu){
             case 1:
                    m = new PagoM();
                    break;
             case 2:
                    c = new PagoC();
                    break;
             case 3:
                    cam = new PagoCam();
                    break;
             default: System.out.println("Elija una opcion valida");
         }
    }

    
}
