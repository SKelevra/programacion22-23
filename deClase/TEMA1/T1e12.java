package TEMA1;
import java.util.Scanner;

public class T1e12{
    public static void main(String[] args) {
        
    Scanner s =new Scanner(System.in);

    System.out.println("esta lloviendo?");
    boolean estaLloviendo=s.nextBoolean();
    
    System.out.println("has terminado tus tareas?");
    boolean tareasFinalizadas=s.nextBoolean();

    System.out.println("necesitas ir a biblio?");
    boolean irBiblio=s.nextBoolean();

    boolean puedoSalir=(!estaLloviendo && tareasFinalizadas)||irBiblio;

    System.out.println("puedes ir a la calle: "+puedoSalir);
    System.out.println((puedoSalir)?"puedes salir " : "te quedas en casa");
    System.out.println(((!estaLloviendo && tareasFinalizadas)||));

    }
}