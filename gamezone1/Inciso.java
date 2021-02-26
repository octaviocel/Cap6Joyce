/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gamezone1;

/**
 *
 * @author DELL
 */
public class Inciso {
    private String respuesta;
    private Boolean correcto;

    public Inciso(String respuesta, Boolean correcto) {
        this.respuesta = respuesta;
        this.correcto = correcto;
    }

    public String getRespuesta() {
        return respuesta;
    }

    public void setRespuesta(String respuesta) {
        this.respuesta = respuesta;
    }

    public Boolean getCorrecto() {
        return correcto;
    } 
    
}
