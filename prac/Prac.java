/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prac;

/**
 *
 * @author CristhianRojas
 */
public class Prac {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        calculadora1 rb = new calculadora1();
        rb.sumar(10, 20);
        rb.restar(9, 2);
        rb.multiplicar(9, 5);
        rb.dividir(100, 2);
        
        calculadora2 rb1 = new calculadora2();
        rb1.respuestas();
    }
    
}
