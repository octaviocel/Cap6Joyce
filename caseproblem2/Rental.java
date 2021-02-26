/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caseproblem2;

/**
 *
 * @author DELL
 */
public class Rental {

    private final static int HORA = 60;
    private final static int RENTAHORA = 40;

    private String contrato;
    private Integer horas;
    private Integer min;
    private Integer precio;

    public Rental() {
        this.setContrato("A000");
        this.setHorasAndMin(0);
    }

    public Rental(String contrato, Integer min) {
        this.setContrato(contrato);
        this.setHorasAndMin(min);
    }

    public void setContrato(String contrato) {
        this.contrato = contrato;
    }

    public void setHorasAndMin(Integer min) {
        this.horas = min/HORA;
        this.min = min;
        if (min <= 40) {
            this.precio = (this.horas * RENTAHORA) + this.min;
        } else {
            this.precio = (this.horas * RENTAHORA) + RENTAHORA;
        }
    }

    public static void masLargo(Rental r1, Rental r2) {
        if (r1.getHoras().equals(r2.getHoras())) {
            if (r1.getMin().equals(r2.getMin())) {
                System.out.println("Los tiempos son iguales");
                r1.mostrar();
            } else if (r1.getMin() > r2.getMin()) {
                System.out.println("El mas largo es:");
                r1.mostrar();
            } else {
                System.out.println("El mas largo es:");
                r2.mostrar();
            }
        } else if (r1.getHoras() > r2.getHoras()) {
            System.out.println("El mas largo es:");
            r1.mostrar();
        } else {
            System.out.println("El mas largo es:");
            r2.mostrar();
        }
        System.out.println();
    }

    public String getContrato() {
        return contrato;
    }

    public Integer getHoras() {
        return horas;
    }

    public Integer getMin() {
        return min;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void mostrar() {
        System.out.println(String.format("Renta No. %s\nHoras: %d\nMinutos: %d\nCosto total: $%d", this.contrato, this.horas, this.min, this.precio));
    }

    public static void logo() {
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<");
        System.out.println("<   Sammy’s Seashore   <");
        System.out.println("< Rents Beach Equipmen <");
        System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<");
    }

    public void rentas(){
        for (int i = 0; i < this.horas; i++) {
            System.out.println("Coupon good for 10 percent off next rental");
        }
    }
}
