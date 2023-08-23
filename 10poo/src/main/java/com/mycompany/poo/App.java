/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo;

import ArregloServicios.ArregloServicios;
import Entidad.Arreglo;

/**
 *
 * @author belugallardo
 */
public class App {

    public static void main(String[] args) {
        ArregloServicios as = new ArregloServicios();
        Arreglo a1 = as.inicializarArregloA();
        as.inicializarArregloB(a1);
        as.mostrarArregloAOrdenado(a1);
        as.mostrarArregloB(a1);
    }
}
