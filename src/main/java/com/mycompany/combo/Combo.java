

package com.mycompany.combo;


public class Combo {
private String tipoBase;
private String bebida;
private String acompanamiento;
private String extra;

public String getTipoBase() {
        return tipoBase;
    }
public void setTipoBase(String tipoBase) {
        this.tipoBase = tipoBase;
    }
public String getBebida() {
        return bebida;
    }
public void setBebida(String bebida) {
        this.bebida = bebida;
    }
public String getAcompanamiento() {
        return acompanamiento;
    }
public void setAcompanamiento(String acompanamiento) {
        this.acompanamiento = acompanamiento;
    }
public String getExtra() {
        return extra;
    }
public void setExtra(String extra) {
        this.extra = extra;
    }
public String toString() {
        return "Combo: " + tipoBase + "\n" +
               "Bebida: " + bebida + "\n" +
               "Acompañamiento: " + acompanamiento + "\n" +
               "Extra: " + extra;
    }
}
    
