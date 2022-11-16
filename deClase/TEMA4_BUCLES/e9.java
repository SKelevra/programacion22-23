package TEMA4_BUCLES;

import java.util.Scanner;

public class e9 {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);
        
        System.out.println("introduce un numero: ");
        int num=s.nextInt();
        int numeroGuardado = num;
        int contador=0;
        s.close();

        if(num>0){
        while(num > 0){
            num = num / 10;
            contador++;

            }
        
        }else{
        System.out.println("el num debe ser mayor q 0");
    }
    
    System.out.println("el :"+numeroGuardado+" tiene "+contador+" digitos");
 } 
}

