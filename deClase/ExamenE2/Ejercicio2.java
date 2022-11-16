package ExamenE2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

import javax.swing.text.DateFormatter;

public class Ejercicio2 {
    public static void main(String[] args) {
        
        Scanner s=new Scanner(System.in);

        int dia=(int)Math.random()*365;
        int mes=(int)Math.random()*12;
        int anio=(int)Math.random()*30+2000;


        String fechaGenerada=(""+anio+","+mes+","+dia);
        
        //fecha buscada
        LocalDate fecha=LocalDate.of(anio, mes, dia);
        
        //creo patron solicitado
        DateTimeFormatter formatoSolicitado=DateTimeFormatter.ofPattern("'Es el dia ' EE'de' LLLL  '(' ')de' yyyy");
               
        //uso mi patron 
        System.out.println(fecha.format(formatoSolicitado));
    
        //diferencia entre las fechas
        LocalDate fechaFinAnio=LocalDate.of(anio,12,31);
        long diasQFaltan=ChronoUnit.DAYS.between(fecha, fechaFinAnio);
        System.out.println("faltan "+diasQFaltan+" dias para fin de año");

    }
}
