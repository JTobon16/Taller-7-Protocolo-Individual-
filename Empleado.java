/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller7;

/**
 *
 * @author altoc
 */
public class Empleado {
    
    
    public String nombre;
    public double salario;


public Empleado (String nombre, double salario){
    this.nombre=nombre;
    setSalario(salario);   
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        if (salario>=1200000){
            this.salario=salario;
        }else {
                System.out.println("El salario debe ser mayor al minimo vigente");}
    }



}
