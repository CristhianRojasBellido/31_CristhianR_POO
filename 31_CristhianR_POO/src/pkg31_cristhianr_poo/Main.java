/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg31_cristhianr_poo;

/**
 *
 * @author CristhianRojas
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
                // TODO code application logic here
         
        Persona random = new Persona();
        random.preguntar3();
        random.responder3();
 
       
        AutoNuevo jk = new AutoNuevo(); 
        jk.preguntar();
        jk.responde();
      
        
        
         PerroPitbul aea = new PerroPitbul(); 
          aea.preguntar();
          aea.responde();
        
       
        
        Calculadora cd = new Calculadora();
          cd.preguntar();
          cd.sumar();
          cd.dividir(); 
          cd.multiplicar(); 
          cd.restar();
          cd.responde();
    }
 }
    

