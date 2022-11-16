public class EjemploCompareTo{

public static void main(String[] args) {

    String apell1="lopez";
    String apell2="garcia";
    System.out.println(apell1.compareTo(apell2)>0?);
    


    //longitud de una cadena
    String cadena="en un lugar dela Mancha";
    int longitud=cadena.length();
    System.out.println("la cadena tiene longitud= "+longitud);


    //pouedo sacar ultimo caracter
    char ultimo=cadena.charAt(longitud-1);
    char primero=cadena.charAt(0);
    int posicionD=cadena.indexOf("de");

    //buscar un caracter
    char letraD='d';
    int posicionD2=cadena.indexOf(letraD);
    char letraA='a';
    int posicionA=cadena.indexOf(letraA);
    int posicionAA=cadena.indexOf(letraA,posicionA);


    String lugar="mancha";
    int posicionLugar=cadena.indexOf(lugar);
    //operacion ternaria
    System.out.println(((posicionLugar==0) ? lugar+"Si" : lugar +"No")+"esta en la cadena");


    //convertir a mayuscula o minuscula
    //String cadenaMinuscula=cadena.toLowerCase();
    //String cadenaMayuscula=cadena.toUpperCase();

    String lugarMinusc=lugar.toLowerCase();
    String cadenaMayusc=cadena.toLowerCase();
    posicionLugar=cadena.indexOf(lugarMinusc);
    System.out.println((posicionLugar >= 0)? lugar+"si":lugar+"no");

    //reemplazar
    cadena.replace('a','x'); //para todos
    System.out.println(cadenaModificada);
    
    cadenaModificada=cadena.replaceAll("un", "h");
    cadenaModificada=cadena.replaceFirst("a", "x");

    //eliminar espacios delante y detras
    String saludo="     hola y adios     ";
    System.out.println(""+saludo+" ");
    System.out.println(" "+saludo.trim()+" ");

    //cortar
    String[]trozos =cadena.split("de"); // =cadena.split(" ");  --> nos lo cortaria en espacios en blancos
    int cantidadTrozos=trozos.length; //nos dice cantidad de trozos
    String trozo0=trozos[0];
    String trozo1=trozos[1];

    //cortar cadenas --> subString
    String cadenaDesde5=cadena.substring(5);

    //concatenar
    String saludo2="hola";
    String saludo3="y adios";
    System.out.println(saludo2+saludo3);
    saludo2.concat(saludo3);
}
}