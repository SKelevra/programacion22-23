package OperacionesMatematicas;

import java.util.Scanner;

public class Ejercicio2 {
    
    public static void main(String[] args) {
        Scanner s=new Scanner (System.in);

        System.out.println("introduzca un num: ");
        int num=s.nextInt();    // double base=s.nextdouble();
        System.out.println("introduce el exponente: ");
        int exp=s.nextInt();    //double exponente=______
        
        int resultado=(int)Math.pow(num, exp);  // double rdo=Math.pow(base,exponente);
        System.out.println(num+ "elevado a  "+exp+" da:  ");

    }
}
