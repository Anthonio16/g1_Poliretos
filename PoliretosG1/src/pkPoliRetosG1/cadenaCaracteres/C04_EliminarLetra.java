package pkPoliRetosG1.cadenaCaracteres;

public class C04_EliminarLetra {

    //For
    public static void g1_C04_EliminarLetraFor(String frase, char letra){
        String nuevaFrase = "";
        frase = frase.toLowerCase();
        letra = Character.toLowerCase(letra);

        for (int i = 0; i < frase.length(); i++){
            char caracter = frase.charAt(i);
            if (caracter != letra){
                nuevaFrase += caracter;
            }
        }
        System.out.println("Frase original: " + frase);
        System.out.println("Frase sin la letra '" + letra + "': " + nuevaFrase);
    }
    
    //While
    public static void g1_C04_EliminarLetraWhile(String frase, char letra){
        String nuevaFrase = "";
        frase = frase.toLowerCase();
        letra = Character.toLowerCase(letra);

        int i = 0;
        while (i < frase.length()){
            char caracter = frase.charAt(i);
            if (caracter != letra){
                nuevaFrase += caracter;
            }
            i++;
        }
        System.out.println("Frase original: " + frase);
        System.out.println("Frase sin la letra '" + letra + "': " + nuevaFrase);
    }

    //Do While
    public static void g1_C04_EliminarLetraDoWhile(String frase, char letra){
        String nuevaFrase = "";
        frase = frase.toLowerCase();
        letra = Character.toLowerCase(letra);

        int i = 0;
        do {
            char caracter = frase.charAt(i);
            if (caracter != letra){
                nuevaFrase += caracter;
            }
            i++;
        } while (i < frase.length());
        System.out.println("Frase original: " + frase);
        System.out.println("Frase sin la letra '" + letra + "': " + nuevaFrase);
    }
    
}
