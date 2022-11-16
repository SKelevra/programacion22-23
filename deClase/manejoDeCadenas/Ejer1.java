package manejoDeCadenas;

import java.util.Scanner;

public class Ejer1 {
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);
        System.out.println("escriba un texto: ");
        String texto=s.nextLine();

        int longitud=texto.length();
        System.out.println("la cadena:"+texto+"tiene un numero de caracteres de:  "+longitud);



    }
}
