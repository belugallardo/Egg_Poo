/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CadenaServicios;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class CadenaServicios {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Cadena cargarCadena(){
        System.out.println("Ingrese una frase");
        Cadena c1 = new Cadena();
        c1.setFrase(leer.nextLine());
        c1.setLongitud(c1.getFrase().length());
        return c1;
    }
    
    public void mostrarVolcales(Cadena c1){
        
        int vocal = 0;
        String frase = c1.getFrase();
        for (int i = 0; i < c1.getLongitud(); i++ ){
           char letra = frase.charAt(i);
            String letraStr = Character.toString(letra);
        if (letraStr.equals("a") || letraStr.equals("e") || letraStr.equals("i") || letraStr.equals("o") || letraStr.equals("u")) {
            vocal++;
        }
        }
        System.out.println("En esta frase hay " + vocal + " vocales.");
    }

    public void invertirFrase(Cadena c1){
        String frase = c1.getFrase();
        String nuevaFrase = "";
        for (int i = c1.getLongitud() -1; i >= 0; i--){
            char letra = frase.charAt(i);
            nuevaFrase += letra;
        }
        System.out.println(nuevaFrase);
    }
    
    public void vecesRepetido(Cadena c1){
        
        
        System.out.println("Ingrese un caracter");
        String caracter = leer.nextLine();
        
        String frase = c1.getFrase();
        int caract = 0;
        
        for(int i = 0; i < c1.getLongitud(); i++){
            char letra = frase.charAt(i);
            String letraStr = Character.toString(letra);
            if(letraStr.equals(caracter)){
                caract++;
            }
        }
        System.out.println("El caracter " + caracter + " se repite " + caract + " veces");
        
    }
    
    public void compararLongitud(Cadena c1){
        System.out.println("Ingrese otra frase");
        String otraFrase = leer.nextLine();
        if(c1.getLongitud()>otraFrase.length()){
            System.out.println("La frase inicial es mas larga que la secundaria");
        } else {
            System.out.println("La frase inicial es mas corta que la secundaria");
        }
    }
    
    public void unirFrase(Cadena c1){
        System.out.println("Ingrese otra frase");
        String otraFrase = leer.nextLine();
        String concat = c1.getFrase().concat(otraFrase);
        System.out.println(concat);
    }
    
    public void reemplazar(Cadena c1){
        String frase = c1.getFrase();
        String nuevaFrase = "";
        System.out.println("Ingrese un nuevo caracter para reemplazar");
        String nuevoCaracter = leer.nextLine();
        for(int i = 0; i < c1.getLongitud(); i++){
            char letra = frase.charAt(i);
            String letraStr = Character.toString(letra);
            if (letraStr.equals("a")){
                nuevaFrase += nuevoCaracter;
            }else{
                nuevaFrase += letra;
            }
        }
        System.out.println(nuevaFrase);
    }
    
    public boolean contiene(Cadena c1){
        String frase = c1.getFrase();
        System.out.println("Ingrese el caracter a buscar");
        String caracter = leer.nextLine();
        
        for(int i = 0; i< c1.getLongitud(); i++){
            char letra = frase.charAt(i);
            String letraStr = Character.toString(letra);
            if(letraStr.equals(caracter)){
                return true;
            }
        }
        return false;
        
    }
}
