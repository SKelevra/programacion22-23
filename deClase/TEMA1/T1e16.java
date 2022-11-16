package TEMA1;
import java.lang.module.FindException;
import java.util.Scanner;

public class T1e16 {
    public static void main(String[] args) {
        

        Scanner s=new Scanner(System.in);

//entradas infantiles a 15,50€ y de adultos a 20€. 
//En caso de que el importe sea mayor a 100€ se aplicará un descuento del 5%.

        final float ENTRADA_ADULTO=20f;
        final float ENTRADA_NINIO=15.50f;
        final float DTO=0.05f;

        System.out.println("entradas de adulto: ");
        int adultos=s.nextInt();
        System.out.println("entradas niño: ");
        int ninio=s.nextInt();

        float precioEntradas=(adultos*ENTRADA_ADULTO)+(ninio*ENTRADA_NINIO);
        precioEntradas=(precioEntradas>100 )? precioEntradas-(precioEntradas*DTO) :precioEntradas;

        System.out.println("el precio final de entradas es:  "+precioEntradas+" €");


    }


}
