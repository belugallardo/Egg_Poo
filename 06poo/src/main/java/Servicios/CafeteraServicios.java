/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Cafetera;
import java.util.Scanner;

/*
Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.
*/
/**
 *
 * @author belugallardo
 */
public class CafeteraServicios {
Scanner leer = new Scanner(System.in);
    public Cafetera llenarCafetera(){
        Cafetera c1= new Cafetera();
        c1.setCantidadActual(c1.getCapacidadMaxima());
        System.out.println("La capacidad actual es de " + c1.getCantidadActual());
        return c1;
    }
    public void servirTaza(Cafetera c1){
        System.out.println("Ingrese el tamaño de la taza vacia");
        int taza = leer.nextInt();
        
        if(taza< c1.getCantidadActual()){
            System.out.println("La taza se lleno completamente");
            c1.setCantidadActual(c1.getCantidadActual() - taza);
            System.out.println("La capacidad actual de la cafetera es de " + c1.getCantidadActual());
        } else{
            
            int falta;
            falta = (int) (taza - c1.getCantidadActual());
            System.out.println("La taza no se ha llenado\n"
                    + "le falta para completar " + falta );
            
        }
        
        
    }
    
    public void vaciarCafetera(Cafetera c1){
        c1.setCantidadActual(0);
    }
    public void agregarCafe(Cafetera c1){
        int resto = (int) (c1.getCapacidadMaxima() - c1.getCantidadActual());
        
        System.out.println("Ingrese la cantidad que desee agregar a la cafetera, solo puede ingresar hasta " + resto);
        int agrega = leer.nextInt();
        
        if(agrega > resto){
            System.out.println("No puede ingresar esa cantidad");
        } else {
            c1.setCantidadActual(c1.getCantidadActual() + agrega);
            System.out.println("La cafetera tiene una capacidad de" + c1.getCantidadActual() );
        }
    }
    
}
