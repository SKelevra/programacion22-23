package OperacionesMatematicas;

import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("introduce los sg: ");
        int sg=s.nextInt();
        
        int min= sg/60;//   =(int)Math.ceil(sg/60.0 );
        //float min=sg/60.0f;                
        s.close();
        System.out.println("estamos en el minuto "+min);


    }


}
