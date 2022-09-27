/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ejercicio3_practico;

import Entidad.Operacion;
import Service.OperacionService;

/**
 *
 * @author hecto
 */
public class POO_Ejercicio3_Practico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        OperacionService OS = new OperacionService();
        
        Operacion O = OS.crearOperacion();
        
        int suma = OS.sumar(O);
        int resta = OS.restar(O);
        int multiplicacion = OS.multiplicar(O);
        double division = OS.dividir(O);
        
        
        System.out.println("Hicimos un par de operaciones y la suma nos dio =" + suma + " y la resta nos dio = " + resta);
        System.out.println("Las otras operaciones son:");
        System.out.println("Multiplicación que dio por resultado: " + multiplicacion);
        System.out.println("División que dio por resultado: "+division);
        
    }
    
}
