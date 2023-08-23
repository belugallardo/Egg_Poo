/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicios;

import Entidad.Movil;
import java.util.Arrays;
import java.util.Scanner;
/*
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
*/
/**
 *
 * @author belugallardo
 */
public class ServiciosMovil {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Movil cargarCelular(){
        Movil m1 = new Movil();
        
        System.out.println("Ingrse la marca del Celular");
        m1.setMarca(leer.nextLine());
        
        System.out.println("Ingrese el precio del Celular");
        m1.setPrecio(leer.nextDouble());
        leer.nextLine();
        
        System.out.println("Ingrese el modelo de celular");
        m1.setModelo(leer.nextLine());
        
        System.out.println("Ingrese el tamaño de la memoria RAM");
        m1.setMemoriaRam(leer.nextLine());
        
        System.out.println("Ingrese el almacenamiento");
        m1.setAlmacenamiento(leer.nextInt());
        
       return m1;
       
    }
    
    public int[] ingresarCodigo(Movil m1){
        Scanner leer = new Scanner(System.in);
        int [] codigo = new int [7];
        System.out.println("Ingrese el codigo numero a numero");
        for (int i = 0; i<7; i++){
            codigo[i]= leer.nextInt();
        }
        m1.setCodigo(codigo);
        return codigo;
    }
    
    public void mostrarCelular(Movil m1){
        System.out.println(m1.toString());
        System.out.println("El código es: " + Arrays.toString(m1.getCodigo()));
}
}
