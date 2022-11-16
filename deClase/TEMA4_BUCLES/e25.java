package TEMA4_BUCLES;

import java.util.Scanner;

public class e25 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int numero, invertido=0 , resto;
        System.out.println("introudce un numero ");
        numero=s.nextInt();

        if(numero<10){
            System.out.println("el numero debe conterner 2 caraceres");
            System.exit(0);
        }
        while(numero>0){
            resto=numero%10;
            invertido=invertido*10+resto;
            numero/=10; //para hacer numro cada vez menor
        }
        System.out.println("el numero invertido  "+invertido);

        s.close();
    }
}
