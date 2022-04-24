/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.com.gm.parqueo;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author KAREN
 */
public class PagoCam {
    static Scanner entrada=new Scanner(System.in);
    public PagoCam() {
        int tiempo; 
        int min = 1;
	int max = 1000;
        double precio=0;
        double numero=0;
        Scanner sorteo=new Scanner(System.in);
        System.out.println("***PARQUEO CAMIONES***");
        System.out.print("Tiempo en horas: ");
        tiempo=entrada.nextInt();
        Random random = new Random();
        
        if(tiempo==24){
            precio=15000;
        }
        else if(tiempo>24){
            precio=15000+((tiempo-24)*(15000/24));
        }else{
            if(tiempo<24){
                precio=10000;
            }
        }
        System.out.printf("Indique numero de sorteo: ");
        numero=sorteo.nextInt();
        int value = random.nextInt(max + min) + min;
        System.out.println("Numero de Sorteo: "+value);
        if(numero==500){
            System.out.println("Parqueo ganador");
            precio=2000;
        }
	
        System.out.println("Precio: $"+precio);
    }
    
    
}
