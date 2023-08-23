/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo;

import Entidad.Matematica;
import MatematicaServicios.MatematicaServicios;

/**
 *
 * @author belugallardo
 */
public class App {

    public static void main(String[] args) {
       MatematicaServicios ms = new MatematicaServicios();
       Matematica m1 = ms.cargarNum();
       ms.devolverMayor(m1);
       ms.calcularPotencia(m1);
       ms.calculaRaiz(m1);
       
    }
}
