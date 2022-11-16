package TEMA1;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

/*
 * leer de teclado un caracter y dos valores
 * si es la s entonces sumo 2 valores enteros
 * si no es s muestro los caracteres con esos codigos ASCII
 * el 65 y 66 corresponden a la A y la B respectivamente
 */

 public class T1epropuesto{
    public static void main(String[] args) {
         Scanner s=new Scanner(System.in);
         System.out.println("introduce un caracter: ");
         char c=s.next().charAt(0);
         System.out.println("introduce 1º valor: ");
         int v1=s.nextInt();
         System.out.println("introduce 2º valor: ");
         int v2=s.nextInt();

         /*
         boolean ese=(c=='s');
         int rdo=v1+v2;
         boolean noEse=(c!='s');*/
         int rdo=v1+v2;
        System.out.println("el rdo es:"+(c=='s')? rdo :);




    
}
 }