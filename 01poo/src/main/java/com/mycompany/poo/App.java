/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo;

import Entidades.Libro;
import Servicios.LibroServicio;

/**
 *
 * @author belugallardo
 */
public class App {

    public static void main(String[] args) {
        
        LibroServicio ls = new LibroServicio();
        Libro l1 = ls.altaLibro();
        
        ls.informarLibro(l1);
        
    }
}
