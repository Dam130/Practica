package Clases;

/**
 *
 * @author dam130
 */
public class Ecuacion {
    private String ecuacion;
    private double miembro1,miembro2,terminoindependiente;
    
//    public Ecuacion(double miembro1, double miembro2, double terminoindependiente){
//        this.miembro1=miembro1;
//        this.miembro2=miembro2;
//        this.terminoindependiente=terminoindependiente;
//        String A="0",B="0",C="0";
//        A=Double.toString(miembro1)+"x\u00b2";
//        if(miembro2>0){
//            B="+"+Double.toString(miembro2)+"x";
//        }else if(miembro2<0){
//            B=Double.toString(miembro2)+"x";
//        }else;
//        if(terminoindependiente>=0){
//            C="+"+Double.toString(terminoindependiente);
//        }else if(terminoindependiente<0){
//            C=Double.toString(terminoindependiente);
//        }else;
//        ecuacion=A+B+C;
//    }
    
    public Ecuacion(int[] valores){
        String[] indice=new String[]{"x\u2079","x\u2078","x\u2077","x\u2076","x\u2075","x\u2074","x\u00b3","x\u00b2","x",""};
        ecuacion="";
        if(valores.length>9){
            System.out.println("El grado es demasioado alto");
        }else if(valores.length<2){
            System.out.println("El grado es demasiado bajo");
        }else{
            for(int numero=0;numero<=valores.length;numero++){
                if(valores[numero]<=0){
                    ecuacion.concat("+"+valores[numero]+indice);
                }else{
                    ecuacion.concat("-"+valores[numero]+indice);
                }
                
            }
        }
    }
    
    public String montarEcuacion(){
        return ecuacion;
    }
    
    public int[] separarEcuacion(){
        int[] numeros=new int[10];
        int x=0;
        for (int i=0;i<=ecuacion.length();i++){
            if(Character.isDigit(ecuacion.charAt(i))){
                numeros[x]=ecuacion.charAt(i);
                x++;
            }
        }
        return numeros;
    }
    
}
