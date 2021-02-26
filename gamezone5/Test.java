/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone5;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) throws InterruptedException {
        Scanner pen = new Scanner(System.in);
        Count21 juego= new Count21();
        
        System.out.println("WELCOME TO THE COUNT21");
        Integer ganador=0;
        
        while(juego.getAcomulado()<21){
            System.out.println("Tirada el jugador");
            Integer tiro=pen.nextInt();
            do{
                if(tiro<1 || tiro>3){
                    System.out.println("Valor no valido tira de nuevo");
                    tiro=pen.nextInt();
                }                
            }while(tiro<1 || tiro>3);
            juego.setTiroUser(tiro);
            if(juego.getAcomulado()==21){
                ganador=1;
            }else if(juego.getAcomulado()>21){
                ganador=2;
            }
            
            if(juego.getAcomulado()<21){
                System.out.println("La computadora esta tirando");
                juego.setTiroComp();
                if(juego.getAcomulado()==21){
                    ganador=2;
                }
                Thread.sleep(300);
            }
        }
        if(ganador==2){
            System.out.println("Gano la computadora");
        }else if(ganador==0){
            System.out.println("Gano el usuario");
        }
        
        
    }
}
