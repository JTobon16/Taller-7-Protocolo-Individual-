/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller7;

/**
 *
 * @author altoc
 */
public class EmpleadoPrueba {

    
    public static void main(String[] args) {
        
        Empleado empleado = new Empleado ("Jonathan", 1500000);
        System.out.println("EMPLEADO:");
        System.out.println("---------");
        System.out.println("Nombre: "+empleado.getNombre());
        System.out.println("Salario: "+empleado.getSalario());
        
    }
    
}
