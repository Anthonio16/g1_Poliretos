package pkPoliRetosG1.cadenaCaracteres;

public class C02_ContarConsonantes {
    
    //For
    public static void g1_C02_ContarConsonantesFor(String frase){
        int contador = 0;
        frase = frase.toLowerCase();
        for (int i = 0; i < frase.length(); i++){
            char caracter = frase.charAt(i);
            if ((caracter >= 'a' && caracter <= 'z') && !(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u')){
                contador++;
            }
        }
        System.out.println("Frase: " + frase);
        System.out.println("Número de consonantes: " + contador);
    }

    //While
    public static void g1_C02_ContarConsonantesWhile(String frase){
        int contador = 0;
        frase = frase.toLowerCase();
        int i = 0;
        while (i < frase.length()){
            char caracter = frase.charAt(i);
            if ((caracter >= 'a' && caracter <= 'z') && !(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u')){
                contador++;
            }
            i++;
        }
        System.out.println("Frase: " + frase);
        System.out.println("Número de consonantes: " + contador);
    }

    //Do While
    public static void g1_C02_ContarConsonantesDoWhile(String frase){
        int contador = 0;
        frase = frase.toLowerCase();
        int i = 0;
        do {
            char caracter = frase.charAt(i);
            if ((caracter >= 'a' && caracter <= 'z') && !(caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u')){
                contador++;
            }
            i++;
        } while (i < frase.length());
        System.out.println("Frase: " + frase);
        System.out.println("Número de consonantes: " + contador);
    }
    
}
