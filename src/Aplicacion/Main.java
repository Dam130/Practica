package Aplicacion;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import Clases.*;


public class Main {
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
//        System.out.println("x\u00B2");
//        System.out.println(Math.sqrt(25));
        InputStreamReader objeto=new InputStreamReader(System.in);
        BufferedReader teclado=new BufferedReader(objeto);
        double miembro1,miembro2,terminoindependiente;
        
        System.out.println("Miembro1");
        miembro1=Double.parseDouble(teclado.readLine());
        System.out.println("Miembro2");
        miembro2=Double.parseDouble(teclado.readLine());
        System.out.println("termino independiente");
        terminoindependiente=Double.parseDouble(teclado.readLine());
        
        Ecuaciones ecuacion=new Ecuaciones(miembro1,miembro2,terminoindependiente);
        System.out.println(ecuacion.getEcuacion());
        System.out.println("El resultado es: "+ecuacion.resolverEcuacion());
    }
}
