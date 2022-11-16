package manejoDeCadenas;
import java.util.Scanner;

public class Ejer6 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        String texto= "En la casa de Juan estaban Pedro, Luis y Mario, todos jugando al Formite";

        System.out.println("quien estaba en la case de Juan");
        String quienEstaba=s.nextLine();
        String textoMinus= texto.toLowerCase();
        String quienEstabaMinus=quienEstaba.toLowerCase();
        System.out.println();

        boolean estaba=(textoMinus.indexOf(quienEstabaMinus)>=0);
        System.out.println((estaba)? quienEstaba+"si esta": quienEstaba+"no estaba");


        

    }
}
