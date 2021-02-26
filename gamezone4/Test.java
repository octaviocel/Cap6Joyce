/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone4;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Test {

    public static void main(String[] args) {
        Die usuario = new Die();
        Die computer = new Die();
        Scanner pen = new Scanner(System.in);
        Boolean t = false;
        System.out.println("Bienvenido al juego\n preciona 1 para comenzar");
        int u = pen.nextInt();
        do {
            if (u == 1) {
                if (computer.win() == false) {
                    System.out.println("Turno del usuario, preciona 1 para lanzar");
                    u = pen.nextInt();
                    usuario.lanzar();
                    int n = usuario.sumaAcomulada();
                    while (n == 1) {
                        System.out.println("Deseas lanzar de nuevo? teclea 1/ caso contrario cede el turno con 0");
                        int f = pen.nextInt();
                        if (f == 1) {
                            usuario.lanzar();
                            n = usuario.sumaAcomulada();
                            t = usuario.win();
                            if (t == true) {
                                n = 0;
                            }
                        } else {
                            System.out.println("Cediste tu turno");
                            n = 0;
                        }
                        
                    }
                }
                if (usuario.win() == false) {
                    System.out.println("Turno de la computer");
                    computer.lanzar();
                    int n = computer.sumaAcomulada();
                    while (n == 1) {
                        System.out.println("Pensara en lanzar de nuevo");
                        Double f = (Math.random());
                        if (f > 0.5) {
                            computer.lanzar();
                            n = computer.sumaAcomulada();
                            t = computer.win();
                            if (t == true) {
                                n = 0;
                            }
                        } else {
                            System.out.println("Cedio su turno");
                            n = 0;
                        }

                    }

                }

            } else {
                System.out.println("Numero incorrecto, Teclea 1 para lanzar");
            }
            System.out.println("Marcador "+usuario.getAcomulado() + "-" + computer.getAcomulado());
        } while (t != true);

        if (usuario.win()) {
            System.out.println("Felicidades le ganaste a la cumputadora");
        } else {
            System.out.println("Gano la computadora");
        }

    }
}
