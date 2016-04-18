package Clases;

/**
 *
 * @author dam130
 */
public class Ecuaciones {
    private String ecuacion;
    private double miembro1,miembro2,terminoindependiente;
    
    public Ecuaciones(double miembro1, double miembro2, double terminoindependiente){
        this.miembro1=miembro1;
        this.miembro2=miembro2;
        this.terminoindependiente=terminoindependiente;
        String A="0",B="0",C="0";
        A=Double.toString(miembro1)+"x²";
        if(miembro2>0){
            B="+"+Double.toString(miembro2)+"x";
        }else if(miembro2<0){
            B=Double.toString(miembro2)+"x";
        }else;
        if(terminoindependiente>0){
            C="+"+Double.toString(terminoindependiente);
        }else if(terminoindependiente<0){
            C=Double.toString(terminoindependiente);
        }else;
        ecuacion=A+B+C;
    }
    
    public Ecuaciones(String ecuacion){
        
    }
    public String resolverEcuacion(){
        //(-B±√(B²-4*A*C))/2*A
        double A,B,C;
        A=miembro1;
        B=miembro2;
        C=terminoindependiente;
        
        return "X1="+(-B+Math.sqrt(Math.pow(B, 2)-4*A*C))/2*A+"\nX2="+(-B-Math.sqrt(Math.pow(B, 2)-4*A*C))/2*A;
    }
    
    public String getEcuacion(){
        return ecuacion;
    }
}
