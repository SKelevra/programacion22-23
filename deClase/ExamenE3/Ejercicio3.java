package ExamenE3;

import java.util.Scanner;

import javax.lang.model.element.Element;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);

         System.out.println("tiene trabajo fijo: (si=1/no=2) ");
         int trabajo=s.nextInt();

         System.out.println("tiene cuenta con nosotros?: (si=1/no=2) ");
         int cuenta=s.nextInt();

         System.out.println("valor del piso deseado: ");
         int valorPiso=s.nextInt();

         System.out.println("cuanto tiene ahorrado: ");
         int ahorros=s.nextInt();
         int valorMitad=(valorPiso*50/100);
         int valorVeinte=(valorPiso*20/100);


         boolean puedoComprarPiso;
         if(trabajo==1 && cuenta==1 && valorMitad>=valorPiso ){
            puedoComprarPiso=true;
         }else if(trabajo==2 && cuenta==1 && valorVeinte>valorPiso ){
            puedoComprarPiso=true;

         }else{
            puedoComprarPiso=false;
         }

         System.out.println("el piso con valor: "+valorPiso);
         System.out.println("puedo comprarlo?: "+puedoComprarPiso);

    }
}
