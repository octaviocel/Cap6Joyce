/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class RentalDemo {
    public static void main(String[] args) {
        Scanner pen = new Scanner(System.in);
        Rental r1= new Rental();
        Rental.logo();
        
        System.out.println("Dame los minutos de renta por favor [60-7200]");
        Integer renta= pen.nextInt();
        do{            
            if(renta<60 || renta>7200){
                System.out.println("Por favor un numero valido [60-7200]");
                renta = pen.nextInt();
            }
        }while(renta<60 || renta>7200);
        
        r1.setHorasAndMin(renta);
        r1.mostrar();
        r1.rentas();
        
    }
}
