/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Cuenta;
import java.util.Scanner;

/*
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
/**
 *
 * @author belugallardo
 */
public class CuentaServicios {
Scanner leer = new Scanner(System.in).useDelimiter("\n"); 
    
    public Cuenta crearCuenta() {
        
        Cuenta cu = new Cuenta();
        
        System.out.println("Inserte su numero de cuenta");
        cu.setNumeroCuenta(leer.nextInt());

        System.out.println("Inserte su DNI");
        cu.setDniCliente(leer.nextLong());
        
        System.out.println("Inserte su saldo actual");
        cu.setSaldoActual(leer.nextInt());
        
        return cu;

    }
    
    public void ingresar(Cuenta cu){
        System.out.println("Escriba el monto de dinero a ingresar");
        double ingreso = leer.nextInt();
        cu.setSaldoActual((int) (cu.getSaldoActual() + ingreso)) ;
        System.out.println("Su saldo actual es de " + cu.getSaldoActual());
    }
    
    public void retirar(Cuenta cu){
        System.out.println("Escriba el monto de dinero a retirar");
        double  retiro = leer.nextInt();
        
        if (retiro > cu.getSaldoActual()){
            cu.setSaldoActual(0);
            System.out.println("Su saldo actual es de 0");
        }else{
            cu.setSaldoActual((int) (cu.getSaldoActual()- retiro));
            System.out.println("Su saldo actual es de " + cu.getSaldoActual());
        }
       
    }
     public void extraccionRapida(Cuenta cu){
         double max;
         max = (int) (cu.getSaldoActual()*0.2);
         leer.nextLine();
         System.out.println("Solo puede extraer " + max
                 + "¿Cuanto dinero desea extraer?");
         double extraer = leer.nextInt();
         
         if (extraer <= max){
             cu.setSaldoActual((int) (cu.getSaldoActual() - extraer));
             System.out.println("Puede extraer ese monto, su saldo actual es de " + cu.getSaldoActual());
         }else {
             System.out.println("No puede extraer ese monto");
         }
         
    }
     
     public void consultarSaldo(Cuenta cu){
         System.out.println("Su saldo actual es de " + cu.getSaldoActual());
     }
     
     public void consultarDatos(Cuenta cu){
         System.out.println(cu.toString());
     }
}
