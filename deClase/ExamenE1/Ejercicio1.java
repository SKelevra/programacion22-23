
package ExamenE1;

import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;
import javax.sql.rowset.spi.SyncResolver;

public class Ejercicio1{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String texto= "El Viajero a través del Tiempo (pues convendrá llamarle así al hablar de él) nos exponía una misteriosa cuestión. Sus ojos grises brillaban lanzando centellas, y su rostro, habitualmente pálido, mostrábase
        encendido y animado. El fuego ardía fulgurante y el suave resplandor de las lámparas incandescentes, en forma de lirios de plata, se prendía en las burbujas que destellaban y subían dentro de nuestras copas.
        Nuestros sillones, construidos según sus diseños, nos abrazaban y acariciaban en lugar de someterse a que nos sentásemos sobre ellos; y había allí esa sibarítica atmósfera de sobremesa, cuando los pensamientos vuelan gráciles, libres de las trabas de la exactitud.(La maquina del tiempo, H.G.Wells)";
        
        //compruebo que el numero aleatorio no exceda el tamaño del texto
        int longitudTexto=texto.length();
        int posicAleatoria=(int)(Math.random()*(longitudTexto-1));
        String caracterBuscado=texto.charAt(posicAleatoria);
        //boolean esCaracter=caracterBuscado.isEmpty();
        System.out.println("el caracter en la posicion :"+posicAleatoria+" es: "+caracterBuscado);
        
        System.out.println("elige un caracter para sustituirlo en el texto por la 'e': ");
        String caracterSustituto=s.nextLine();
        String textoModificado=texto.replaceAll("e", caracterSustituto);
        System.out.println("el nuevo texto es: "+textoModificado);

        System.out.println("indique una palabra y le diremos si esta en el texto: ");
        String palabraBuscada=s.nextLine();
        String palabraBuscadaMinusc=palabraBuscada.toLowerCase();
        String textoMinus=texto.toLowerCase();
        boolean estaPalabra=textoMinus.equals(palabraBuscadaMinusc);
        estaPalabra?"esta":"no esta";




        

    }

}