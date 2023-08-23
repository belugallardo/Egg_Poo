/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MatematicaServicios;

import Entidad.Matematica;

/**
 *
 * @author belugallardo
 */
public class MatematicaServicios {
    
    public Matematica cargarNum(){
        Matematica m1 = new Matematica();
        m1.setNum1((int) (Math.random()*100.0));
        System.out.println("Numero 1:" + m1.getNum1());
        m1.setNum2((int) (Math.random()*100.0));
        System.out.println("Numero 2:" + m1.getNum2());
        return m1;
    }
    
    public void devolverMayor(Matematica m1){
        if(m1.getNum1()>m1.getNum2()){
            System.out.println("El numero " + m1.getNum1() + " es mayor que " + m1.getNum2()) ;
        }else{
            System.out.println("El numero " + m1.getNum2() + " es mayor que " + m1.getNum1()) ;
        }
    }
    
    public void calcularPotencia(Matematica m1){
        int redondeo1 = (int) m1.getNum1();
        int redondeo2 = (int) m1.getNum2();
        if(redondeo1 > redondeo2){
           int potencia = (int) Math.pow(redondeo1, redondeo2);
            System.out.println("El numero " + redondeo1 + " elevado a " + redondeo2 + " es " + potencia);
        }else{
            int potencia = (int) Math.pow(redondeo2,redondeo1);
            System.out.println("El numero " +redondeo2 + " elevado a " + redondeo1 + " es " + potencia);
        }
    }
    
    public void calculaRaiz(Matematica m1){
        if (m1.getNum1()> m1.getNum2()){
            int valorAbsoluto = (int) Math.abs(m1.getNum2());
            double raizCuadrada = Math.sqrt(valorAbsoluto);
            System.out.println("La raiz cuadrada de " + valorAbsoluto + " es " + raizCuadrada);
        } else{
             int valorAbsoluto = (int) Math.abs(m1.getNum1());
            double raizCuadrada = Math.sqrt(valorAbsoluto);
            System.out.println("La raiz cuadrada de " + valorAbsoluto + " es " + raizCuadrada);
        }
    }
}
