/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioDate;

import Entidad.Date;
import java.util.Calendar;
import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class DateServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Calendar instanciarFecha(){
        Date d1 = new Date();
        
        System.out.println("Ingrese el dia");
        d1.setDia(leer.nextInt());
        
        System.out.println("Ingrese el mes");
        d1.setMes(leer.nextInt());
        
        System.out.println("Ingese el año");
        d1.setAnio(leer.nextInt());
        
        Calendar fecha = Calendar.getInstance();
        fecha.set(d1.getAnio(), d1.getMes() - 1, d1.getDia());
        return fecha;
    }
    public void mostrarFecha(Calendar fecha){
        System.out.println("Fecha ingresada: " + fecha.getTime());
    }
    
    public Calendar fechaActual(){
        Calendar fechaActual = Calendar.getInstance();
        System.out.println(fechaActual.getTime());
        return fechaActual;
    }
    
    public int diferenciaAnios(Calendar fecha, Calendar fechaActual){
       int diferencia = fechaActual.get(Calendar.YEAR) - fecha.get(Calendar.YEAR);
       return diferencia;
    }
}
