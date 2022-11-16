import java.util.Scanner;

public class EjercicioEvaluacion {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

//VARIABLES CONSTANTES:
        final int SUELDO_BASE=950;
        final int ANTIGUEDAD=150;
        final int BONIFICACION_HIJO=10;
        final float H_EXTRA=21.4f;
        final float FORMACION=0.05f;
//VARIABLES:
        int antiguedad;
        int extraAntiguedad=0;
        int hijos;
        int extraHijos;
        int horasExtra; //CONSIDERO QUE NO SE PUEDAN HACER MEDIAS HORAS
        float bonusHorasExtra=0;
        
        

        System.out.println("_________ PCFactorySA _____________");
        System.out.println("");
        
        System.out.println("antigüedad en la empresa: ");
        antiguedad=s.nextInt();
        extraAntiguedad=antiguedad*ANTIGUEDAD;
        
        System.out.println("numero de hijos: ");
        hijos=s.nextInt();
        extraHijos=hijos*BONIFICACION_HIJO;

        float bruto=SUELDO_BASE+extraAntiguedad+bonusHorasExtra+extraHijos;


        System.out.println("numero de horas extra este mes: ");
        horasExtra=s.nextInt();
        bonusHorasExtra=horasExtra*bonusHorasExtra;

        float descuentoFormación=bruto*FORMACION;
        float neto=bruto-descuentoFormación;

        System.out.println("---------------------------------------");
        System.out.println("   NOMINA       ");
        System.out.println("---------------------------------------");
        System.out.println("Salario Base       :  "+SUELDO_BASE+" €");
        System.out.println("Antigüedad         :  "+extraAntiguedad+" €");
        System.out.println("Bonus por hijo     :  "+extraHijos+" €");
        System.out.println("Horas extra        :  "+bonusHorasExtra+" €");
        System.out.println("---------------------------------------");
        System.out.println("Total bruto        :  "+bruto+" €");

        System.out.println("Descuento para formación:  "+descuentoFormación+" €");
        System.out.println("---------------------------------------");
        System.out.println("Total neto(TOTAL NOMINA)  "+neto+" €");



    }
}
