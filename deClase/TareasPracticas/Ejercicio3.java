package TareasPracticas;

public class Ejercicio3 {
    public static void main(String[] args) {
        
        String texto="Muchos años después," + 
        "frente al pelotón de fusilamiento, el coronel Aureliano Buendia había de"+
        "recordar aquella tarde remota en que su padre lo llevó a conocer el"+
        "hielo. (Cien años de soledad. G. García Márquez).";

        int indiceInicial=texto.indexOf("(");
        int indiceFinal=texto.indexOf(")");

        String infoTexto=texto.substring(indiceInicial+1, indiceFinal);
        System.out.println("libro: "+ infoTexto);

        int numCaracteres=texto.length();
        //System.out.println(numCaracteres);
       //yo: int numAleatorio=(int)(Math.random()*numCaracteres);

        int posicion=(int)(Math.random()*(texto.length()-1));//-1 pq empieza con el caracter 1
        char caracterBuscado=texto.charAt(posicion);

        String[]palabras=texto.split(" ");
        int numPalabras=palabras.length;
        int palabraBuscada= (int)(Math.random()*(numPalabras-1));
        String palabra=palabras[palabraBuscada];
        System.out.println("la palabra en la posicion "+palabraBuscada+" es "+ palabra);

        String textoMinuscula=texto.toLowerCase();
        String respuesta="Buendia";
        respuesta=respuesta.toLowerCase();
        int posicionRespuesta=textoMinuscula.indexOf(respuesta);
        System.out.println((posicionRespuesta>=0)?"bien" : "mal");

    }
}
