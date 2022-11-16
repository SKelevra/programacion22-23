package TEMA1;
import java.util.Scanner;

public class T1e20 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("indica tu renta: ");
        int renta=s.nextInt();

        System.out.println("nota del 1 trimestre: ");
        float t1=s.nextFloat();
        System.out.println("nota del 2 trimestre: ");
        float t2=s.nextFloat();
        System.out.println("nota del 3 trimestre: ");
        float t3=s.nextFloat();

        float media=(t1+t2+t3)/3;
        System.out.println("tu nota media es: "+ media);
        System.out.println("tu renta es: "+renta+" €");

        boolean beca=((media>=8)&&(renta<20000))||((media>=5)&&(renta<4000));
        System.out.println("A: tienes derecho a beca -> "+beca);
        //CON OPERADOR TERNARIO:
        boolean beca2=((media>=8)&&(renta<20000))||((media>=5)&&(renta<4000))? beca:beca;
        System.out.println("B: tienes derecho a beca -> "+beca2);


    }
}
