/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ServiciosCir;

import Entidades.Cir;
import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class CirServicios {

    public Cir crearCircunsferencia() {
        Scanner leer = new Scanner(System.in);
        //Creacion del objeto
        Cir c1 = new Cir();
        //Pedido del radio
        System.out.println("Ingrese el radio de la circunsferencia");
        c1.setRadio(leer.nextDouble());
        return c1;
    }

    public void areaCircunsferencia(Cir c1) {
        //  para calcular el área de la circunferencia (Area = π ∗ radio2

        Double area;
        area = 3.1416 * (c1.getRadio() * c1.getRadio());
        System.out.println("El area es: " + area);
    }

    public void perimetro(Cir c1) {
        //Método perimetro(): para calcular el perímetro (Perimetro = 2 ∗ π ∗ radio)

        Double perimetro;
        perimetro = 2 * 3.1416 * c1.getRadio();
        System.out.println("El perimetro es: " + perimetro);
        
    }

}
