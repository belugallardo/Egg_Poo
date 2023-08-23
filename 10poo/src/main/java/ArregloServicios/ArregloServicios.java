/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ArregloServicios;

import Entidad.Arreglo;
import java.util.Arrays;

/**
 *
 * @author belugallardo
 */
public class ArregloServicios {
    
    public Arreglo inicializarArregloA(){
        Arreglo newArreglo = new Arreglo();
        double [] arregloA = new double[50];
        
        for(int i = 0; i < 50; i++){
            arregloA[i] = Math.round(Math.random() * 100) / 10.0;
        }
      newArreglo.setArregloA(arregloA);
      
      for(int i = 0; i<50;i++){
          System.out.print(arregloA[i] + " - ");        
      }
        System.out.println("");
     return newArreglo; 
    }
    
    public Arreglo inicializarArregloB(Arreglo newArreglo){
        double[] arrayA = newArreglo.getArregloA();
        double[]arrayB = new double[20];
        
        Arrays.sort(arrayA);
        
        for(int i=0; i<10;i++){
            arrayB[i]=arrayA[i];
        }
        
        for (int i =10; i<20;i++){
            arrayB[i]=0.5;
        }
        newArreglo.setArregloA(arrayA);
        newArreglo.setArregloB(arrayB);
        return newArreglo;
    }
    
    public void mostrarArregloAOrdenado(Arreglo newArreglo){
        double[] arrayA = newArreglo.getArregloA();
         
         System.out.println("Arreglo A Ordenado");
         for(int i=0;i<50;i++){
             System.out.print(arrayA[i] + " - ");
         }
         System.out.println("");
    }
    
    public void mostrarArregloB(Arreglo newArreglo){
        double [] arrayB = newArreglo.getArregloB();
        
        System.out.println("Arreglo B");
         for(int i=0;i<20;i++){
             System.out.print(arrayB[i] + " - ");
         }
         System.out.println("");
    }
}
