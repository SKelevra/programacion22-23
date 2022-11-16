package Tema3.TareasSeleccion;

import java.util.Scanner;

public class CalculosMentales {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        int num1=(int)(Math.random()*99+1);
        int num2=(int)(Math.random()*99+1);

        int operacion=(int)(Math.random()*3);
        
        System.out.println("los numeros son:  "+num1+" y "+num2);

        String operacionMat="";
        int resultadoMat=0;
        switch(operacion){
            case 0:
            operacionMat="sumar";
            resultadoMat=num1+num2;
            break;
            case 1:
            operacionMat="restar";
            resultadoMat=num1-num2;
            break;
            case 2:
            operacionMat="multiplicar";
            resultadoMat=num1*num2;
            break;
        }
        System.out.println("la operacion matematica es: "+operacionMat);
        System.out.print("indique el resultado de "+operacionMat+" "+num1+" y "+num2+ " : ");
        int resultado=s.nextInt();
        if(resultado==resultadoMat){
            System.out.println("Bravo!, el resultado es correcto");
        }else{
            System.out.println("el rdo NO es correcto");
        }



        

    }
    
}
