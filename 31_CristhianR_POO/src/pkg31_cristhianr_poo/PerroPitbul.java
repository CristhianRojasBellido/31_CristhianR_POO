/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg31_cristhianr_poo;

import javax.swing.JOptionPane;

/**
 *
 * @author CristhianRojas
 */
class PerroPitbul {
    String xd1;
    String xd2;
    String xd3;
    String xd4;
    String xd5;

    
     public void preguntar(){
    xd1 = JOptionPane.showInputDialog("Ingrse el nombre del animal: ") ;
    xd2 = JOptionPane.showInputDialog("Su mordida es la mas: ") ;
    xd4 = JOptionPane.showInputDialog("Su comida favorita es: ") ;
    xd5 = JOptionPane.showInputDialog("Ellos son amados por: ") ;
 
    }
     public void responde(){
    JOptionPane.showMessageDialog(null,"El nombre es : " + xd1);
    JOptionPane.showMessageDialog(null,"Su mordida es : " + xd2);
    JOptionPane.showMessageDialog(null,"Ellos comen : " + xd4);
    JOptionPane.showMessageDialog(null,"Le temen a los(as) : " + xd5);
    }   

     
}
