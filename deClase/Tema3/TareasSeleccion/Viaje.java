package Tema3.TareasSeleccion;

import java.util.Scanner;

public class Viaje {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // CONSTANTES
        final float PRGASOLINA = 1.75f;
        final int DISTANCIA = 550;
        final int PR_BILLETEAVION = 95;
        final int PR_BILLETETREN = 80;

        // VARIABLES
        float mediaConsumo = 0.08f;// l/km
        int suplemento = 20;
        float prTotal = 0;
        float tarifaReducida4 = 0.25f;
        float tarifaReducida3 = 0.1f;

        // ME ASEGURO QUE LA OPCION ESCOGIDA ES VALIDA
        int medioTransporte;

        System.out.println("indique como piensan viajar : coche(1)/avion(2)/tren(3)");
        medioTransporte = s.nextInt();

        boolean hayError = false;   //VBLE QUE CONTROLA SI HAY ERROR AL INTRODUCIR DATOS

        if (medioTransporte < 1 || medioTransporte > 3) {
            System.out.println("opcion incorrecta");
            hayError = true;
        }

        // ME ASEGURO QUE VIAJEROS SON UN NUMERO VALIDO
        int numViajeros = 0;

        if (!hayError){
            System.out.println("indique cuantas personas viajaran(2,3 o 4): ");
            numViajeros = s.nextInt();
            
            if (numViajeros < 2 || numViajeros > 4) {
                System.out.println("numero de viajeros incorrecto");
                hayError = true;
            }
        }

        // IF:   SI HAY ERROR SALE 
        // ELSE: ENGLOBA QUE NO HAY ERROR Y PERMITE CONTINUAR EL PROGRAMA:

        if  (hayError){
            System.out.println("ERROR");
        }else  {

        float prTotalPax = 0;
        String mTransporte = "";// VBLE QUE ME PERMITIRA EN LA SALIDA VER EL NOMBRE DEL MEDIO
        String tipoTarifa = "";
        boolean conSuplemento = false;// VBLE QUE USARE EN EL DESGLOSE
        float prTotalReducido = 0;

        switch (medioTransporte) {

            // COCHE
            case 1:
                mTransporte = "coche";
                prTotal = PRGASOLINA * DISTANCIA * mediaConsumo;
                prTotalPax = prTotal / numViajeros;
                break;

            // AVION
            case 2:
                mTransporte = "avion";
                System.out.println("llevan equipaje? (1-si/2-no) :");
                int equipaje = s.nextInt();

                if (equipaje == 1) {
                    prTotalPax = PR_BILLETEAVION + suplemento;
                    conSuplemento = true;
                } else {
                    prTotalPax = PR_BILLETEAVION;
                    conSuplemento = false;
                }
                break;

            // TREN
            case 3:
                mTransporte = "tren";

                if (numViajeros == 3) {
                    tipoTarifa = "reducida10%";
                    prTotal = (PR_BILLETETREN * 3);
                    prTotalReducido = prTotal - (prTotal * tarifaReducida3);
                    prTotalPax = prTotalReducido / 3;
                } else if (numViajeros == 4) {
                    tipoTarifa = "reducida25%";
                    prTotal = (PR_BILLETETREN * 4);
                    prTotalReducido = prTotal - (prTotal * tarifaReducida4);
                    prTotalPax = prTotalReducido / 4;
                } else {
                    prTotal = (PR_BILLETETREN * 2);
                    prTotalPax = PR_BILLETETREN;
                }

        }
        //SALIDA:
        System.out.println("");
        System.out.println("===============================");
        System.out.println("vais a viajar " + numViajeros + " personas");
        System.out.println("viajais en: " + mTransporte);
        System.out.println("precio por persona: " + prTotalPax + " €");

        // DESGLOSE:
        System.out.println("");
        System.out.println("           DESGLOSE           ");
        System.out.println("------------------------------");
        System.out.println("coste total del viaje:");

        switch (medioTransporte) {
            case 1:
                System.out.println(" gasolina(1.75€/l) + distancia a madrid(550km)+ consumo gasolina del coche(8l/100)= "
                                + prTotal + " €");
                break;
            case 2:
                System.out.println(
                        "precio del billete: " + PR_BILLETEAVION + "  suplemento por equipaje(20€): " + conSuplemento);
                break;
            case 3:
                System.out.println("precio billete " + PR_BILLETETREN + " x " + numViajeros + " personas" + " = "
                        + prTotal + " €");
                System.out.println("tarifa reducida: " + tipoTarifa);
                if (tipoTarifa.length() !=0) {  //le pongo : ".lenght" pq "tipoTarifa" lo considera objeto. No serviria: "!=0"
                    System.out.println("precio FINAL con reduccion: " + prTotalReducido + " €");

                } else {
                    System.out.println("NO se aplica descuento");
                }

                break;
        }

    }//end IF no hay error
    }
}
