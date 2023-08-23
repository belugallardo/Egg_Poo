/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg11poo;

import ServicioDate.DateServicio;
import java.util.Calendar;

/*
Pongamos de lado un momento el concepto de POO, ahora vamos a trabajar solo con la
clase Date. En este ejercicio deberemos instanciar en el main, una fecha usando la clase
Date, para esto vamos a tener que crear 3 variables, dia, mes y anio que se le pedirán al
usuario para poner el constructor del objeto Date. Una vez creada la fecha de tipo Date,
deberemos mostrarla y mostrar cuantos años hay entre esa fecha y la fecha actual, que
se puede conseguir instanciando un objeto Date con constructor vacío.
Ejemplo fecha: Date fecha = new Date(anio, mes, dia);
Ejemplo fecha actual: Date fechaActual = new Date();
*/
/**
 *
 * @author belugallardo
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        DateServicio ds = new DateServicio();
        Calendar d1 = ds.instanciarFecha();
        Calendar d2 = ds.fechaActual();
        ds.mostrarFecha(d1);
      
        int diferencia = ds.diferenciaAnios(d1, d2);
        System.out.println("Hay " + diferencia + " años de diferencia");
    }
    
}
