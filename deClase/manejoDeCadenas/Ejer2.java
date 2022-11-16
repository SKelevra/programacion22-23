package manejoDeCadenas;

import java.util.Scanner;

public class Ejer2 {
    
    public static void main(String[] args) {
        Scanner s =new Scanner(System.in);

        System.out.println("escriba un texto: ");
        String texto=s.nextLine();
        System.out.println("dime una posicion: ");
        int posicion=s.nextInt();

        s.close();
        //comprobamos que posicion sea valida
        boolean posicionValida=posicion<texto.length(); //o posicion<=texto.length()-1;

        char caracterBuscado=(posicionValida)?texto.charAt(posicion) : ' ';
        System.out.println("el caracter en la posicion: "+posicion+"es: "+caracterBuscado);


    }
}
