/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package S11_31_E01;

/**
 *
 * @author CristhianRojas
 */
public class Bapskebolista_31 extends Personas_31{
      public Bapskebolista_31(int dorsal, String posicion, String pais, String nombre, int edad) {
        super(nombre, edad);
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.pais = pais;
    }
    
    //atributos
    int dorsal;
    String posicion;
    String pais;
    
    public void correr(){
    
    }
    
    public void asistencia(){
    }
}
