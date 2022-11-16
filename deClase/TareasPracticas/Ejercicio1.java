package TareasPracticas;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int dia=25;
        int mes=10;
        int anio=2022;
        int hora=12;
        int min=45;

        LocalDateTime fechaExamen= LocalDateTime.of(anio,mes,dia,hora,min);// esta es mi fecha examen
        DateTimeFormatter formatoAlfonso=DateFormatter.ofPattern("'el examen sera el ' EEEE',' dd 'de' LLLL 'del' yy");//ya tengo mi patron creado
       
        //uso mi patron para imrprimir:
        System.out.println(fechaExamen.format(formatoAlfonso));
       
        // el between devuelve un long
        long horasQFaltan=ChronoUnit.HOURS.between(LocalDateTime.now(),fechaExamen);
        System.out.println("faltan "+horasQFaltan+" horas para el examen");


    }
}
