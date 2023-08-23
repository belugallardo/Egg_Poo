/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;

/*
Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
*/
/**
 *
 * @author belugallardo
 */
public class PersonaServicios {
    Scanner leer = new Scanner(System.in);
    
    public Persona crearPersona(){
        
        Persona p1 = new Persona();
        
        System.out.println("Ingrese su nombre");
        p1.setNombre(leer.nextLine());
        
        System.out.println("Ingrese su edad");
        p1.setEdad(leer.nextInt());
        
        System.out.println("Ingrese su sexo:\n"
                + "H - hombre\n"
                + "M - mujer\n "
                + "O - otro");
        String sexo = leer.nextLine();
        if (sexo.equalsIgnoreCase("H") || sexo.equalsIgnoreCase("M") || sexo.equalsIgnoreCase("O")){
            char carac = sexo.charAt(0);
            p1.setSexo(carac);
        } else{
            System.out.println("La opcion no es valida, se le asignara OTRO");
            p1.setSexo('O');
        }
        
        System.out.println("Ingrese su peso");
        p1.setPeso(leer.nextInt());
        
        System.out.println("Ingrese su altura");
        p1.setAltura(leer.nextDouble());
        
        return p1;
        
    }
    public int calcularIMC(Persona p1){
       
        int imc = (int) (p1.getPeso()/(p1.getAltura()*p1.getAltura()));
        if (imc < 20){
            return -1;
        } else if(imc >= 20 || imc <= 25 ){
            return 0;
        } else {
            return 1;
        }
    }
    
    public boolean esMayorDeEdad(Persona p1){
        /*
        Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
        devuelve un booleano.
         */
        return p1.getEdad()>= 18;
       
    }
           
}
