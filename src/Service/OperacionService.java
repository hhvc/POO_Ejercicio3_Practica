/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Service;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author hecto
 */
public class OperacionService {
    
    Scanner leer = new Scanner(System.in);
    
    public Operacion crearOperacion(){
        
        Operacion o = new Operacion();
        
        System.out.println("Por favor, ingrese un número");
        o.setNumero1(leer.nextInt());
        System.out.println("Por favor, ingrese otro número");
        o.setNumero2(leer.nextInt());
        
        return o;
    }
    
    public int sumar(Operacion X){
        System.out.println("La suma es = " + (X.getNumero1()+X.getNumero2()));
        return (X.getNumero1()+X.getNumero2());
    }
    
    public int restar(Operacion X){
        System.out.println("La resta es= " + (X.getNumero1()- X.getNumero2()));
        return (X.getNumero1()-X.getNumero2());
    }
    
    public int multiplicar(Operacion X){
        
        if (X.getNumero1()==0 || X.getNumero2()==0){
            System.out.println("ERROR. Uno de los valores es CERO");
            return 0;
        } else return X.getNumero1()* X.getNumero2();
            
    }
    
        public double dividir(Operacion X){
        
        if (X.getNumero1()==0 || X.getNumero2()==0){
            System.out.println("ERROR. Uno de los valores es CERO");
            return 0;
        } else return X.getNumero1()/ X.getNumero2()*1.;
            
    }
}
