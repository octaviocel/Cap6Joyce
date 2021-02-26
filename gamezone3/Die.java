/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone3;

/**
 *
 * @author DELL
 */
public class Die {
    private Integer dados;
    
    public Die(){
        this.lanzar();
    }
    
    public void lanzar(){
        this.dados = ((int)(Math.random() * 100) % 12 + 2);
    }

    public Integer getCara() {
        return this.dados;
    }    
    
    public Boolean verifica(Integer n){
        return this.dados==n;
    }
}
