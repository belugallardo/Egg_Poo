/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo;

import Entidades.Cuenta;
import Servicios.CuentaServicios;

/**
 *
 * @author belugallardo
 */
public class App {

    public static void main(String[] args) {
       
        CuentaServicios cuen = new CuentaServicios();
        Cuenta c1 = cuen.crearCuenta();
        cuen.ingresar(c1);
        cuen.retirar(c1);
        cuen.extraccionRapida(c1);
        cuen.consultarSaldo(c1);
        cuen.consultarDatos(c1);
    }
}
