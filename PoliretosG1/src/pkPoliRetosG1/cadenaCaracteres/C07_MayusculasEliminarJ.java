package pkPoliRetosG1.cadenaCaracteres;

public class C07_MayusculasEliminarJ {

    //For
    public static void g1_C07_MayusculasEliminarJFor(String frase){
        String original = frase;
        String nuevaFrase = "";
        frase = frase.toUpperCase();

        for (int i = 0; i < frase.length(); i++){
            char caracter = frase.charAt(i);
            if (caracter != 'J'){
                nuevaFrase += caracter;
            }
        }
        System.out.println("Frase original: " + original);
        System.out.println("Frase en mayúsculas sin 'J': " + nuevaFrase);
    }

    //While
    public static void g1_C07_MayusculasEliminarJWhile(String frase){
        String original = frase;
        String nuevaFrase = "";
        frase = frase.toUpperCase();
        int i = 0;

        while (i < frase.length()){
            char caracter = frase.charAt(i);
            if (caracter != 'J'){
                nuevaFrase += caracter;
            }
            i++;
        }
        System.out.println("Frase original: " + original);
        System.out.println("Frase en mayúsculas sin 'J': " + nuevaFrase);
    }

    //Do While
    public static void g1_C07_MayusculasEliminarJDoWhile(String frase){
        String original = frase;
        String nuevaFrase = "";
        frase = frase.toUpperCase();
        int i = 0;

        do {
            char caracter = frase.charAt(i);
            if (caracter != 'J'){
                nuevaFrase += caracter;
            }
            i++;
        } while (i < frase.length());
        System.out.println("Frase original: " + original);
        System.out.println("Frase en mayúsculas sin 'J': " + nuevaFrase);
    }
    
}
