/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone2;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test {
    public static void main(String[] args) {
        RandomGuess numero= new RandomGuess();
        Boolean acierto=false;
        Scanner pen= new Scanner(System.in);
        int n;
        do{
            System.out.println("Adivina el numero:");
            n= pen.nextInt();
        }while(numero.verifica(n)!=true);
    }
}
