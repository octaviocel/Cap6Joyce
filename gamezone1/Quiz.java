/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone1;

import java.util.ArrayList;

/**
 *
 * @author DELL
 */
public class Quiz {

    private ArrayList<Pregunta> quiz;
    private Integer aciertos;

    public Quiz() {
        this.quiz = new ArrayList();
        this.aciertos = 0;
    }

    public void addPregunta(String pregunta) {
        quiz.add(new Pregunta(pregunta));
    }

    public void addInciso(Integer pr, Inciso x) {
        Pregunta r = quiz.get(pr - 1);
        r.setInciso(x.getRespuesta(), x.getCorrecto());
        quiz.set(pr - 1, r);

    }

    /*
    public void setIncisos(String inciso, Boolean correcto){
        if(this.inci<5){
            this.quiz[inci].setInciso(inciso, correcto);
        }
        inci++;
        
    }
     */
    public void calificacion() {
        System.out.println("Su calificacion ha sido: " + (this.aciertos / 2 * 100));
    }

    public void verificaPregunta(Integer g,Integer i) {
        if (quiz.get(g).getCorrecto(i)) {
            System.out.println("Respuesta correcta");
            this.aciertos++;
        } else {
            System.out.println("incorrecto");
        }
    }

    public void imprimir(Integer j) {

        System.out.println(quiz.get(j).toString());

    }

}
