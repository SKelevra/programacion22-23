package Tema3;

import java.util.Scanner;


public class e21{
    public static void main(String[] args) {
        
    
    Scanner s=new Scanner(System.in);

    System.out.println("introduce nota 1 examen: ");
    float nota1=s.nextFloat();
    System.out.println("introduce nota del 2º examen: ");
    float nota2=s.nextFloat();

    float media=(nota1+nota2)/2;
    boolean estaAprobado;
    if(media>=5){
         estaAprobado=true;
    }else{
        s.nextLine(); //limpio buffer
        System.out.println("cual ha sido nota de recuperacion?:(apto/no apto) ");
        String recuperacion=s.nextLine();
        if(recuperacion.equals("apto")){
            media=5;
            estaAprobado=true;
        }else{
            estaAprobado=false;
        }
    }
    System.out.println("nota 1º examen: "+nota1);
    System.out.println("nota 2 examen: "+nota2);
    System.out.println("la nota de programacion es: "+media);
    
}
}
