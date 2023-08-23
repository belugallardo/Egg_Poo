/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CursoServicio;

import Entidad.Curso;
import java.util.Scanner;

/*
método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.

*/
/**
 *
 * @author belugallardo
 */
public class CursoServicio {
    Curso cu = new Curso();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Curso cargarAlumnos(){
        String [] alumno = new String[5];
        
        for(int i = 0; i<5;i++){
            System.out.println("Ingrese el nombre del alumno");
            alumno[i] = leer.nextLine();
        }
        cu.setAlumno(alumno);
        return cu;
    }
    public Curso crearCurso(Curso cu){
        System.out.println("Ingrese el nombre del curso");
        cu.setNombreCurso(leer.nextLine());
        
        System.out.println("Ingrese la cantidad de horas por dia de este curso");
        cu.setCantidadHorasPorDia(leer.nextInt());
        
        System.out.println("Ingrese la cantidad de dias por semana");
        cu.setCantidadDiasPorSemana(leer.nextInt());
        
        System.out.println("Ingrese el turno: mañana / tarde");
        cu.setTurno(leer.nextLine());
        
        System.out.println("Ingrese el valor por hora");
        cu.setPrecioPorHora(leer.nextInt());
        return cu;
    }
    public int calcularGananciaSemanal(Curso cu){
        int ganancia = cu.getPrecioPorHora()*cu.getCantidadHorasPorDia()*cu.getAlumno().length*cu.getCantidadDiasPorSemana();
        return ganancia;
    }
}
