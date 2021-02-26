/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone3;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test {

    public static void main(String[] args) {
        Die dados = new Die();
        Scanner pen = new Scanner(System.in);
        int n = 2, numero;
        System.out.println("Bienvenido a tira dos dados, dame el numero que deseas adivinar");
        numero = pen.nextInt();

        do {
            System.out.println("Lanza el dado, teclea 1");
            int f = pen.nextInt();
            if (f == 1) {
                dados.lanzar();
                if (dados.verifica(numero)) {
                    System.out.println("Excelente ganaste");
                    n = -2;
                } else {
                    if(n!=0){
                         System.out.println("Intenta de nuevo, te quedan " + n + " intentos");
                    }
                }
                n--;
            }else{                
                System.out.println("Numero incorrecto, por favor teclea 1 para lanzar");
            }
        } while (n > -1);
        if (n != -2) {
            System.out.println("Lo siento ya perdiste");
        }
    }
}
