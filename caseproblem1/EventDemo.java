/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class EventDemo {
    public static void main(String[] args) {
        Scanner pen = new Scanner(System.in);
        Event evento= new Event();
        Event.logo();
        
        System.out.println("Dame el numero de invitados por favor [5-100]");
        Integer invitados= pen.nextInt();
        do{
            if(invitados<5 || invitados>100){
                System.out.println("Por favor un numero valido de invitados [5-100]");
                invitados = pen.nextInt();
            }
        }while(invitados<5 || invitados>100);
         
        evento.setEvento("A001");
        evento.setInvitados(invitados);
        evento.mostrar();
        evento.invitacion();
        
    }
}
