/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem1;

/**
 *
 * @author DELL
 */
public class Event {

    private final static Integer PRECIOINVITADOALTO = 35;
    private final static Integer PRECIOINVITADOBAJO = 32;
    private final static Integer TIPOEVENTO = 50;

    private String nevento;
    private Integer invitados;
    private Integer precio;

    public Event() {
        this.nevento = "A000";
        this.invitados = 0;
    }

    public Event(String nevento, Integer invitados) {
        this.setEvento(nevento);
        this.setInvitados(invitados);
    }

    public Boolean isLargeEvent() {
        return this.invitados >= 50;
    }

    public void setEvento(String nevento) {
        this.nevento = nevento;
    }

    public void setInvitados(Integer invitados) {
        this.invitados = invitados;
        if (isLargeEvent()) {
            this.precio = invitados * PRECIOINVITADOBAJO;
        } else {
            this.precio = invitados * PRECIOINVITADOALTO;
        }
    }
    
    public void invitacion(){
        for (int i = 0; i < this.invitados; i++) {
            System.out.println("Please come to my event");
        }
    }

    public String getNevento() {
        return nevento;
    }

    public Integer getInvitados() {
        return invitados;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void mostrar() {
        System.out.println(String.format("Evento No.%s\nTotal Invitados: %d\nCosto Total: $%d", this.nevento, this.invitados, this.precio));
        this.costo();
    }

    private void costo() {
        
        if (this.invitados >= 50) {
            System.out.println("Evento grande");
            System.out.println("Precio por invitado $32");
        } else {
            System.out.println("Evento chico");
            System.out.println("Precio por invitado $35");
        }
    }

    public static void logo() {
        System.out.println("----------------------");
        System.out.println("-  Carly’s Catering  -");
        System.out.println("-    party foods     -");
        System.out.println("----------------------");
    }
    
    public static void masGrande(Event e1,Event e2){
        if(e1.getInvitados().equals(e2.getInvitados())){
            System.out.println("Son eventos iguales");
            e1.mostrar();
        }else if(e1.getInvitados()<e2.getInvitados()){
            System.out.println("El evento mas garnde es:");
            e2.mostrar();
        }else{
            System.out.println("El evento mas garnde es:");
            e1.mostrar();
        }
        System.out.println();
    } 
}
