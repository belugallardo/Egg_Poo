/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
/*
Declarar una clase llamada Circunferencia que tenga como atributo privado el radio de
tipo real. A continuación, se deben crear los siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda en el atributo del
objeto.
d) Método area(): para calcular el área de la circunferencia (Area = π ∗ radio2).
e) Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio).
*/
package com.mycompany.poo;

import Entidades.Cir;
import ServiciosCir.CirServicios;

/**
 *
 * @author belugallardo
 */
public class App {

    public static void main(String[] args) {
        CirServicios cs = new CirServicios();
        Cir c1 = cs.crearCircunsferencia();
        cs.areaCircunsferencia(c1);
        cs.perimetro(c1);
    }
}
