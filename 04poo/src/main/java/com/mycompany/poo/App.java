/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poo;

import Entidades.Rectangulo;
import Servicios.RectanguloServicios;

/*
Crear una clase Rectángulo que modele rectángulos por medio de un atributo privado
base y un atributo privado altura. La clase incluirá un método para crear el rectángulo
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
public class App {

    public static void main(String[] args) {
        
        RectanguloServicios rs = new RectanguloServicios();
        Rectangulo r1 = rs.crearRectangulo();
        rs.superficie(r1);
        rs.perimetro(r1);
        rs.dibujarRectangulo(r1);
    }
}
