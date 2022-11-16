package TEMA4_BUCLES;

import java.util.Scanner;

public class Ejer5.4.7 {
    public static void main(String[] args) {
        

        boolean encontrado=false;
        int numeroIntentos=4;
        Scanner s=new Scanner(System.in);

        do{
            System.out.println("introuduce la clave,tienes"+numeroIntentos+ " ");
            int numeroIntroducido=s.nextInt();
            if(!encontrado){
                numeroIntentos++;
            }
    
        }while(!encontrado  && (numeroIntentos>=0))
        


    }
}
