package TEMA1;
import java.util.Scanner;

public class T1e13{

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        System.out.println("eres socio?");
        boolean socio=s.nextBoolean();
        System.out.println("has pagado cuotas?");
        boolean pagadoCuotas=s.nextBoolean();
        System.out.println("llevas zapas de deporte");
        boolean conZapas=s.nextBoolean();
        System.out.println("te han recomendado?");
        boolean recomendado=s.nextBoolean();
        System.out.println("dentro del periodo de pruebas?");
        boolean periodoPrueba=s.nextBoolean();

        boolean eresVip=(socio&&pagadoCuotas)||(recomendado&&periodoPrueba);
        System.out.println("eres vip: "+ eresVip);
        //hacer operador ternario

    }
}