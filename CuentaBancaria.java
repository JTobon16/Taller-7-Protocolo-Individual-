/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Taller7;

/**
 *
 * @author altoc
 */
public class CuentaBancaria {
    
    private int numeroCuenta;
    private double saldo;
    public String tipoCuenta;
    
    
    

public CuentaBancaria (int numeroCuenta, double saldo, String tipoCuenta){
    this.numeroCuenta=numeroCuenta;
    this.saldo=saldo;
    this.tipoCuenta=tipoCuenta;
}

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void mostrarDetalles(){
        System.out.println("Numero de Cuenta: "+ numeroCuenta);
        System.out.println("El saldo es: "+saldo);
        System.out.println("Tipo de Cuenta: "+tipoCuenta);
    }
}
