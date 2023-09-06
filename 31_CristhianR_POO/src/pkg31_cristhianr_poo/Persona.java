/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg31_cristhianr_poo;

import java.util.Scanner;

/**
 *
 * @author CristhianRojas
 */
class Persona {
    String nombre;
    int edad;
   

    public void preguntar3() {
        Scanner o =new Scanner(System.in);
        System.out.println("Ingrese el nombre: ");
         nombre = o.nextLine();
        System.out.println("Ingrese la edad: ");
         edad =o.nextInt();
    }

    public void responder3() {
        System.out.println("¿cual es su nombre " + nombre  +  edad);
        System.out.println("¿cual es su nombre " + nombre + " ¿ cual es su edad " +   edad);
        
 }  
}
