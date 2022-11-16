package OperacionesMatematicas;

    public class Ejercicio7{
    public static void main(String[] args) {

        int tirada1=(int)(Math.random()*6+1);
        int tirada2=(int)(Math.random()*6+1);
        int tirada3=(int)(Math.random()*6+1);
        
        System.out.println("t1: "+tirada1);
        System.out.println("t2: "+tirada2);
        System.out.println("t3: "+tirada3);

        int resultadoMax=Math.max(tirada1,tirada2);
        resultadoMax=Math.max(resultadoMax,tirada3);

        //directamente: int resultadoMax=Math.max(tirada1,tirada2);
        
        System.out.println("el maximo es: "+resultadoMax);
        

        
    }
    }



