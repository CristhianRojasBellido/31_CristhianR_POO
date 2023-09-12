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
public class calculadora2 {
    public static int sumar(int a, int b) {
    return a + b;
  }

  public static int restar(int a, int b) {
    return a - b;
  }

  public static int multiplicar(int a, int b) {
    return a * b;
  }

  public static int dividir(int a, int b) {
    return a / b;
  }
  public void respuestas(){
    int suma = sumar(10, 5);
    System.out.println("Esto es una suma mno: "+suma);
    int resta = restar(10, 5);
    System.out.println("10 - 5 = " + resta);
    int multiplicacion = multiplicar(10, 5);
    System.out.println("10 * 5 = " + multiplicacion);
    int division = dividir(10, 5);
    System.out.println("10 / 5 = " + division);
  }
   
}
