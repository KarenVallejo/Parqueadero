/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.parqueo;

import java.util.Scanner;

/**
 *
 * @author KAREN
 */
public class PagoM{
    static Scanner teclado=new Scanner(System.in);
    
    public PagoM() {
        int horaE = 0;
        int minE = 0;
        int horaS = 0;
        int minS = 0;
        String tmp;
        
        System.out.println("***PARQUEADERO MOTOS***");
        do{
                    System.out.println("\nHora de entrada -24h- (HH:mm)");
                    tmp = teclado.next()+":";
                    Scanner hora = new Scanner(tmp).useDelimiter(":");
                    horaE = hora.nextInt();
                    minE = hora.nextInt();
                    hora.close();
                }while(!horaValida(horaE,minE));
                do{
                    System.out.println("\nHora de salida-24h- (HH:mm)");
                    tmp = teclado.next()+":";
                    Scanner hora = new Scanner(tmp).useDelimiter(":");
                    horaS = hora.nextInt();
                    minS = hora.nextInt();
                    hora.close();
                }while(!horaValida(horaS,minS) || horaS<horaE);
                      
        
        double precio=0;
        minS = calcularMinutos(horaE, minE, horaS, minS);
        if(minS<=180){
            precio=3000;
        }
        else 
        {
            precio=((minS-180)*(1000/60.0))+3000;
            System.out.println("Tiempo: "+minS+" equivalen a: "+minS/60.0+" horas");
        }
        System.out.println("Tiempo: "+minS+" minutos \nPrecio: $"+precio);
    }
    
    public boolean horaValida(int hora, int min){
        return (hora>=0&&hora<24)&&(min>=0&&min<60);
    }
    
    public int calcularMinutos(int hIni, int mIni, int hFin, int mFin){
        return  (mFin - mIni) + (hFin - hIni) * 60;
    }
    
}
