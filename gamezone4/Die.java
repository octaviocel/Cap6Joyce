/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone4;

/**
 *
 * @author DELL
 */
public class Die {
    private Integer dado1;
    private Integer dado2;
    private Integer acomulado;
    
    public Die(){
        this.lanzar();
        this.acomulado=0;
    }
    
    public void lanzar(){
        this.dado1 = ((int)(Math.random() * 100) % 6 + 1);
        this.dado2 = ((int)(Math.random() * 100) % 6 + 1);
    }

    public Integer getDado1() {
        return dado1;
    }

    public Integer getDado2() {
        return dado2;
    }
    
    public Integer getAcomulado(){
        return acomulado;
    }
    
    public Boolean win(){
        return this.acomulado>100;
    }
    
    public Integer sumaAcomulada(){
        if((this.dado1!=1)||(this.dado2!=1)){
            System.out.println("No sacaste 1's");
            this.acomulado=this.acomulado+this.dado1+this.dado2;
            return 1;
        }else if((this.dado1==1)&&(this.dado2==1)){
            System.out.println("Upps sacaste dos 1");
            this.acomulado=0;
            return 2;
        }else if((this.dado1==1)||(this.dado2==1)){
            System.out.println("sacaste un 1");
            this.acomulado=this.acomulado+this.dado1+this.dado2;
            return 3;
        }else{
            return 0;
        }
    }
    
    
}
