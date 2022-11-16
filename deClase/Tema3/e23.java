package Tema3;

import java.util.Scanner;

public class e23 {
    public static void main(String[] args) {
        
        Scanner s=new Scanner (System.in);

        final float IVA_GNRAL=0.21f;
        final float IVA_REDUCIDO=0.1f;
        final float IVA_SUPERREDUCIDO=0.04f;

        System.out.println("introduce la base imponible: ");
        float base=s.nextFloat();
        
        System.out.println("introduce el tipo IVA(general=g,reducido=r,superreducido=s):");
        s.nextLine();
        String tipo=s.nextLine();
        float prIva=0;
        switch (tipo){
            case "g":
                 prIva=base*IVA_GNRAL;
                break;
            case "r":
                 prIva=base*IVA_REDUCIDO;
                break;
            case "s":
                 prIva=base*IVA_SUPERREDUCIDO;
                break;
            default:
        }

        System.out.println("introduce el codigo promocional(nopro,mitad,meno5,5porc");
        String promo=s.nextLine();
        float prDto=0;
        switch (promo){
            case "nopro":
                prDto=prIva;
                break;
            case "mitad":
                prDto=prIva*(0.5f);
                break;
            case "meno5":
                prDto=prIva-5;
                break;
            case "5porc":
                prDto=prIva- (0.05f*prIva);
            default:
        }
        


        System.out.print("Base imponible          "+base);
        System.out.println("IVA  ("+tipo+")       "+prIva);
        System.out.println("Precio con IVA        "+(base+prIva));
        System.out.println("Cod. promo. ("+promo+" )"+prDto);
        System.out.println("TOTAL                 "+prDto);

    }
}
