/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo;

import CadenaServicios.CadenaServicios;
import Entidad.Cadena;

/**
 *
 * @author belugallardo
 */
public class App {

    public static void main(String[] args) {
        CadenaServicios cs = new CadenaServicios();
        Cadena c1 = cs.cargarCadena();
        cs.mostrarVolcales(c1);
        cs.invertirFrase(c1);
        cs.vecesRepetido(c1);
        cs.compararLongitud(c1);
        cs.unirFrase(c1);
        cs.reemplazar(c1);
        boolean contiene = cs.contiene(c1);
        System.out.println("¿Contiene este caracter?" + contiene);
    }
}
