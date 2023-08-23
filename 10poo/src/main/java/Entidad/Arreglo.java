/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author belugallardo
 */
public class Arreglo {
    private double[] arregloA;
    private double[] arregloB;

    public Arreglo() {
        arregloA = new double[50];
        arregloB = new double[20];
    }

    public Arreglo(double[] arregloA) {
        this.arregloA = arregloA;
    }

    public double[] getArregloA() {
        return arregloA;
    }

    public void setArregloA(double[] arregloA) {
        this.arregloA = arregloA;
    }

    public double[] getArregloB() {
        return arregloB;
    }

    public void setArregloB(double[] arregloB) {
        this.arregloB = arregloB;
    }


   
    
    
}
