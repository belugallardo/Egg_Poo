/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author belugallardo
 */
public class Cir {
    private Double radio;
    
    //inicializar un construccion con el radio como parametro

    public Cir() {
    }

    
    public Cir(Double radio) {
        this.radio = radio;
    }

    //getter & setter del radio
    public Double getRadio() {
        return radio;
    }

    public void setRadio(Double radio) {
        this.radio = radio;
    }
    
}
