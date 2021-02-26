/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone2;

/**
 *
 * @author DELL
 */
public class RandomGuess {
    private Integer numero;
    private Integer contador;

    public RandomGuess() {
        this.numero = ((int)(Math.random() * 100) % 100 + 1);
        this.contador=0;
    }
    
    public void lanzar(){
        this.numero = ((int)(Math.random() * 100) % 100 + 1);
    }

    public Integer getNumero() {
        return numero;
    }
    
    public Boolean verifica(Integer n){
        if(n==this.numero){
            System.out.println("Excelente ganaste\n Lo lograste en "+ (this.contador+1)+" intentos.");
            return true;
        }else if(this.numero<n){
            System.out.println("Un poco alto el numero, intenta de nuevo");
            this.contador++;
            return false;
        }else{
            System.out.println("Numero bajo, intenta de nuevo");
            this.contador++;
            return false;
        }
    }
}
