package Tema3.TareasSeleccion;

import java.util.Scanner;

public class Granja {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);

        float comidaDiaria;//lo q se compra
        int numAnimales;
        float kilosPorAnimal;//lo q comen cada uno

        System.out.println("indique cantidad de comida (kg)que compra diariamente: ");
        comidaDiaria=s.nextFloat();
        System.out.println("indique el numero de animales que hay: ");
        numAnimales=s.nextInt();
        System.out.println("cada animal come de media (kg): ");
        kilosPorAnimal=s.nextFloat();

        float cantidadDiaNecesaria=numAnimales*kilosPorAnimal;
       // float cantidadDiaDisponible=(comidaDiaria/numAnimales);

        if(cantidadDiaNecesaria<=comidaDiaria){
            System.out.println("hay suficiente comida para lo que se necesita");
        }else{
            System.out.println("NO hay suficiente ");
            float cantidadRacionalizadaPorAnimal=comidaDiaria/numAnimales;
            System.out.println("cada animal tendria "+cantidadRacionalizadaPorAnimal+" kg para el dia");
            float diferenciaDiaCantidad=cantidadDiaNecesaria-comidaDiaria;
            System.out.println("necesitamos comprar "+diferenciaDiaCantidad+" kg de comida");
        }


    }
}
