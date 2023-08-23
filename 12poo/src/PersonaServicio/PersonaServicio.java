/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PersonaServicio;

import Entidad.Persona;
import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

/*
Y los siguientes
métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
 */
/**
 *
 * @author belugallardo
 */
public class PersonaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        Persona p1 = new Persona();

        System.out.println("Ingrese su nombre:");
        p1.setNombre(leer.nextLine());

        System.out.println("Ingrese el dia de nacimiento en numeros");
        p1.setDia(leer.nextInt());

        System.out.println("Ingrese el mes de nacimiento en numeros");
        p1.setMes(leer.nextInt());

        System.out.println("Ingrese el año de su nacimiento");
        p1.setAnio(leer.nextInt());

        Calendar fecha = Calendar.getInstance();
        fecha.set(p1.getAnio(), p1.getMes() - 1, p1.getDia());
        p1.setNacimiento(fecha);

        return p1;
    }

    public int calcularEdad(Persona p1) {

        Calendar anioNacimiento = p1.getNacimiento();

        Calendar fechaActual = Calendar.getInstance();
        
        int edad = fechaActual.get(Calendar.YEAR) - anioNacimiento.get(Calendar.YEAR);
        return edad;
    }
    public boolean menorQue(int edad){
        System.out.println("Ingrese otra edad");
        int otraEdad = leer.nextInt();
        return otraEdad < edad;
    }
    
    public void mostrarPersona(Persona p1){
        System.out.println("El nombre de la persona es: " + p1.getNombre() + ", nació el día " + p1.getDia() + " del mes " + p1.getMes() + " de " + p1.getAnio() + " por ende su fecha de nacimiento es: " + p1.getNacimiento().getTime());
    }

}
