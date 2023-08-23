/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author belugallardo
 */
public class LibroServicio {

    public Libro altaLibro() {

//instanciar un objeto
        Libro l1 = new Libro();
        // completar los datos
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese el ISBN del Libro");
        l1.setIsbn(leer.nextInt());
         leer.nextLine();
        
         System.out.println("Ingrese el Titulo del Libro");
        l1.setTitulo(leer.nextLine());
         
        
        System.out.println("Ingrese el Autor del Libro");
        l1.setAutor(leer.next());
         leer.nextLine();
         
        System.out.println("Ingrese el numero de paginas del Libro");
        l1.setPaginas(leer.nextInt());
         leer.nextLine();
        return l1;

    }
    
    public void informarLibro(Libro l1){
        System.out.println("El libro " + l1.getTitulo() + " con ISBN " + l1.getIsbn() + " del Autor " + l1.getAutor() + " tiene " + l1.getPaginas() + " paginas" );     
    }
}