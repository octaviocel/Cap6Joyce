/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone5;

/**
 *
 * @author DELL
 */
public class Count21 {


    private Integer tiroUser;
    private Integer tiroComp;
    private Integer acomulado;

    public Count21(){
        this.acomulado=0;
    }
    
    public void setTiroUser(Integer tiro){
        this.tiroUser=tiro;
        this.acomulado+=this.tiroUser;
    }
    
    public Integer getAcomulado(){
        return acomulado;
    }
    
    public void setTiroComp() {
        switch (this.acomulado) {
            case 1:
                this.tiroComp = 1;
                break;
            case 2:
                this.tiroComp = 1;
                break;
            case 3:
                this.tiroComp = 3;
                break;
            case 4:
                this.tiroComp = 3;
                break;
            case 5:
                this.tiroComp = 3;
                break;
            case 6:
                this.tiroComp = 2;
                break;
            case 7:
                this.tiroComp = 1;
                break;
            case 8:
                this.tiroComp = 1;
                break;
            case 9:
                this.tiroComp = 3;
                break;
            case 10:
                this.tiroComp = 2;
                break;
            case 11:
                this.tiroComp = 3;
                break;
            case 12:
                this.tiroComp = 2;
                break;
            case 13:
                this.tiroComp = 1;
                break;
            case 14:
                this.tiroComp = 3;
                break;
            case 15:
                this.tiroComp = 2;
                break;
            case 16:
                this.tiroComp = 1;
                break;
            case 17:
                this.tiroComp = 1;
                break;
            case 18:
                this.tiroComp = 3;
                break;
            case 19:
                this.tiroComp = 2;
                break;
            case 20:
                this.tiroComp = 1;
                break;
            default:
                this.tiroComp = 1;
        }
        this.acomulado+=this.tiroComp;
    }
}
