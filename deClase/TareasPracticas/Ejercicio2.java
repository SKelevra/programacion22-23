package TareasPracticas;

import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        
        System.out.println("nombre jugador atacante: ");
        String nombreAtq=s.nextLine();
        
        System.out.println("nombre jugador defensor: ");
        String nombreDef=s.nextLine();

        System.out.println("cual es el acierto (%) de tiros de 2: ");
        float porcentaje2=s.nextFloat();
       
        System.out.println("cual es el acierto (%) de tiros de 3: ");
        float porcentaje3=s.nextFloat();
        
        System.out.println("nº veces que defensor logra fallo del atacante: ");
        int fallosConseguidos=s.nextInt();
        
        System.out.println("decision de tiro ¿de 2 o de 3?: ");
        int decisionTiro=s.nextInt();
        float porcentajeTiro=(decisionTiro==2)?porcentaje2:porcentaje3;
        
        double numAzarAtaq=Math.random();
        double numAzarDef=Math.random();
        //TIRO 
        boolean mete=(numAzarAtaq*porcentajeTiro)>(numAzarDef*fallosConseguidos*10);

        //FORMA BRUTA
        //boolean mete2=(Math.random()*porcentaje2>(math.random()*numAzarDef*10));
        // boolean mete3=(Math.random()*porcentaje3>(math.random()*numAzarDef*10));
        
        //  (numeroAlAzarAtaque (0-100)* %AciertoTipoSeleccionado) >
        //     (numeroAlAzarDefensa (0-10)* EficaciaDefensa * 10)

        //yo:System.out.println(" el jugador "+ nombreAtq + "ha encestado de 2 sobre el jugador "+ nombreDef +);
        String haMetidoCanasta=(meteTiro)? "ha encenstado": "no ha encestado";
        System.out.println("el jugador"+nombreAtq+haMetidoCanasta+"de"+ decisionTiro+
                                        nombreDef+"("+);

    }
}
