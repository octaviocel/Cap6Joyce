/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone1;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test {

    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        quiz.addPregunta("¿Dani es el mas guapo de software?");
        quiz.addPregunta("De que color es el mar?");
        quiz.addInciso(1, new Inciso("si", true));
        quiz.addInciso(1, new Inciso("no", false));
        quiz.addInciso(1, new Inciso("Talvez", false));
        quiz.addInciso(1, new Inciso("No rafa lo es xd", false));
        quiz.addInciso(2, new Inciso("verde", true));
        quiz.addInciso(2, new Inciso("rojo", false));
        quiz.addInciso(2, new Inciso("blanco", false));
        quiz.addInciso(2, new Inciso("no tiene color", false));

        //quiz.imprimir();
        int n=3;
        Scanner pen= new Scanner(System.in);
        System.out.println("Responde cada pregunta correctamente");
        for (int i = 0; i < 2; i++) {
            quiz.imprimir(i);
            quiz.verificaPregunta(i,pen.nextInt());
            n++;
        }
        quiz.calificacion();
            
        
        
    }
}
