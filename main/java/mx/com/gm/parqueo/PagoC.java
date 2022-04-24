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
public class PagoC {
    static Scanner entrada=new Scanner(System.in);
    public PagoC() {
        double tiempo;        
        System.out.println("***PARQUEO CARROS***");
        System.out.print("Tiempo minutos: ");
        tiempo=entrada.nextInt();
                
        double precio=0;
        if(tiempo<60){
            precio=1000;
        }
        else if(tiempo == 60)
        {
            precio=2000;
        }else
        {
            precio=2000+((tiempo-60)*(2000/60.0));
        }
        System.out.println("Precio: $"+precio);
    }
    
}
