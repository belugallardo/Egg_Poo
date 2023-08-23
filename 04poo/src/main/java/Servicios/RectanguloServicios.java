/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Rectangulo;
import java.util.Scanner;

/*
La clase incluirá un método para crear el rectángulo
con los datos del Rectángulo dados por el usuario. También incluirá un método para
calcular la superficie del rectángulo y un método para calcular el perímetro del
rectángulo. Por último, tendremos un método que dibujará el rectángulo mediante
asteriscos usando la base y la altura. Se deberán además definir los métodos getters,
setters y constructores correspondientes.
Superficie = base * altura / Perímetro = (base + altura) * 2.
*/
/**
 *
 * @author belugallardo
 */
public class RectanguloServicios {
    Scanner leer = new Scanner(System.in);
    public Rectangulo crearRectangulo(){
        Rectangulo rec = new Rectangulo();
        System.out.println("Ingrese la base del rectangulo");
        rec.setBase(leer.nextInt());
        System.out.println("Ingrese la altura del rectangulo");
        rec.setAltura(leer.nextInt());
        return rec;
    }
    public void superficie(Rectangulo rec){
        int superficie;
        superficie = rec.getBase()* rec.getAltura();
        System.out.println("La superficie del rectangulo es " + superficie);
        
    }
    
    public void perimetro(Rectangulo rec){
        int perimetro;
        perimetro = (rec.getBase()* rec.getAltura())*2;
        System.out.println("El perimetro del rectangulo es " + perimetro);
    }
    public void dibujarRectangulo(Rectangulo rec){
        
        for (int i = 0; i < rec.getAltura(); i++){
            for (int j = 0; j < rec.getBase(); j++){
                
                System.out.print("*");
            }
            System.out.println("");
        }
        
    }
}
