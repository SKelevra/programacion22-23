package TEMA4_BUCLES;

import java.util.Scanner;

public class e32 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int numero;
        System.out.println("introduce un numero  ");

        numero=s.nextInt();
        String listadoPares="";// guardo todos los pares q m van dando
        int sumatorioPares=0;
        int numeroOperativo=numero;
        while(numeroOperativo>0){

            int resto=numeroOperativo%10;
            //veo si es par
            if(resto%2==0){
                sumatorioPares+=resto;
                listadoPares=resto+listadoPares;

            }
            numeroOperativo=numeroOperativo/10;
        }
        System.out.println("digitos pares  "+listadoPares);
        System.out.println("suma de los pares  "+sumatorioPares);
    }
}
