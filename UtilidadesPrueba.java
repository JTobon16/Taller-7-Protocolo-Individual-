/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Taller7;

/**
 *
 * @author altoc
 */
public class UtilidadesPrueba {

    public static void testSuma() {
        int resultado = Utilidades.suma(2, 3);
        System.out.println("Resultado de suma: " + resultado);
    }

    public static void testResta() {
        int resultado = Utilidades.resta(5, 3);
        System.out.println("Resultado de resta: " + resultado);
    }

    public static void testMultiplicacion() {
        int resultado = Utilidades.multiplicacion(4, 3);
        System.out.println("Resultado de multiplicacion: " + resultado);
    }

    public static void testDivision() {
        double resultado = Utilidades.division(6, 2);
        System.out.println("Resultado de division: " + resultado);
    }

    public static void ejecutarPruebas() {
        testSuma();
        testResta();
        testMultiplicacion();
        testDivision();
    }

    public static void main(String[] args) {
        ejecutarPruebas();
    }
}
