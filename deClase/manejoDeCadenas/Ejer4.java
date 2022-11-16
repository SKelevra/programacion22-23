package manejoDeCadenas;
import java.util.Scanner;

public class Ejer4 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        System.out.println("escriba un texto: ");
        String texto=s.nextLine();
        System.out.println("diga caracter para reemplazar: ");
        char aReemplazar=s.next().charAt(0);    //MAL: String aReemplazar=s.nextLine();
        System.out.println("diga caracter que reemplaza: ");
        char qReemplaza=s.next().charAt(0);    //MAL: String aReemplazar=s.nextLine();

        s.close();
        String textoModificado=texto.replace(aReemplazar, qReemplaza);

       System.out.println("texto original: "+texto);
       System.out.println("texto modificado: "+textoModificado);


    }
}