package Tema3.TareasSeleccion;

import java.util.Scanner;

public class Concierto {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int aforoMax;
        float prEntrada;
        int entradasVendidas;
        float recaudacion;

        System.out.println("indique aforo maximo del local: ");
        aforoMax=s.nextInt();
        System.out.println("indique precio de cada entrada: ");
        prEntrada=s.nextFloat();
        System.out.println("indique nº entradas vendidas: ");
        entradasVendidas=s.nextInt();

        if(entradasVendidas<(aforoMax*0.2f)){
            System.out.println("el concierto queda cancelado");

            }else if(entradasVendidas<=(aforoMax*0.5f)){
                float prEntradaRebajado=prEntrada-(prEntrada*0.25f);
                prEntrada=prEntradaRebajado;
                recaudacion=prEntrada*entradasVendidas;

                System.out.println("==============================");
                System.out.println("aforo max:              "+aforoMax);
                System.out.println("entradas vendidas:      "+entradasVendidas);
                System.out.println("precio de cada entrada: "+prEntrada+" €");
                System.out.println("recaudacion:            "+recaudacion+" €");
    
        }else{};


    }
}
