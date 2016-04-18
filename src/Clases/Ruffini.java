/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author dam130
 */
public class Ruffini {
    
    private int grado;
    private double numeros[]=new double[grado];
    
    public Ruffini(int grado){
        int entrada=0;
        if(grado<=3){
            for(int i=0;i<=grado;i++){
            numeros[i]=entrada;
            }
        }else if(grado==2){
            System.out.println("Ecuacion de 2º grado");
        }
        
    }
}
