/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Operacion;
import java.util.Scanner;

/*
d) Método para crearOperacion(): que le pide al usuario los dos números y los guarda
en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el resultado al main.
f) Método restar(): calcular la resta de los números y devolver el resultado al main

g) Método multiplicar(): primero valida que no se haga una multiplicación por cero, si
fuera a multiplicar por cero, el método devuelve 0 y se le informa al usuario el error.
Si no, se hace la multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.

*/
/**
 *
 * @author belugallardo
 */
public class OperacionServicios {
    Scanner leer = new Scanner(System.in);
    
 public Operacion crearOperacion(){
     Operacion op = new Operacion();
             System.out.println("Ingrese el primer numero");
             op.setNumero1(leer.nextInt());
             System.out.println("Ingrese el segundo numero");
             op.setNumero2(leer.nextInt());
             return op;
 }   
 public int sumar(Operacion op){
     int suma;
     suma = op.getNumero1() + op.getNumero2();
     return suma;
 }
 
 public int restar(Operacion op){
     int resta;
     resta = op.getNumero1() - op.getNumero2();
     return resta;
 }
 
 public int multiplicar(Operacion op){
     int multiplicacion;
     multiplicacion = op.getNumero1() * op.getNumero2();
     if(multiplicacion == 0){
         System.out.println("Al ser uno de los numeros 0 ");
         return 0;
     }else{
        return multiplicacion; 
     }
     
 }
 
 public int dividir(Operacion op){
     /*primero valida que no se haga una división por cero, si fuera a pasar
una división por cero, el método devuelve 0 y se le informa al usuario el error se le
informa al usuario. Si no, se hace la división y se devuelve el resultado al main.*/
     
     
     int division;
     division = op.getNumero1()/op.getNumero2();
     
     if (division == 0){
         System.out.println("Al ser el primero numero 0 ");
         return 0;
     }else {
         return division;
     }
     
 }
}
