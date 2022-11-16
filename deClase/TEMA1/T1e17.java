package TEMA1;
import java.util.Scanner;

public class T1e17 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

      //V =⅓ πr2h 
      final float PI=3.1416f;
      

      System.out.println("introduzca el valor del radio: ");
      float radio=s.nextFloat();
      System.out.println("introuduzca la altura: ");
      float altura=s.nextFloat();
      
      float volumen=(PI*(radio*radio)*altura)/3;
      System.out.println("el volumen es: "+ volumen);


    }
}
