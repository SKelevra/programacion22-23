package OperacionesMatematicas;

import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        double num;
        System.out.println("introduzca un num decimal: ");
        num=s.nextDouble();
        int vA=(int)Math.abs(num);
        
        System.out.println("su valor absoluto seria: "+vA);

        /*clase
        float n1=45.33f;
        sout("el valor abs de 1"+ Math.abs(n1));

        */
    }
}
