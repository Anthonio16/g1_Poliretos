package pkPoliRetosG1.cadenaCaracteres;

public class C05_InvertirFrase {

    //For
    public static void g1_C05_InvertirFraseFor(String frase){
        String fraseInvertida = "";
        for (int i = frase.length() - 1; i >= 0; i--){
            char c = frase.charAt(i);
            if (esVocal(c)){
                fraseInvertida += Character.toUpperCase(c);
            }else{
                fraseInvertida += Character.toLowerCase(c);
            }
        }
        System.out.println("Frase original: " + frase);
        System.out.println("Frase invertida con vocales en mayúsculas: " + fraseInvertida);
    }

    //While
    public static void g1_C05_InvertirFraseWhile(String frase){
        String fraseInvertida = "";
        int i = frase.length() - 1;
        while (i >= 0){
            char c = frase.charAt(i);
            if (esVocal(c)){
                fraseInvertida += Character.toUpperCase(c);
            }else{
                fraseInvertida += Character.toLowerCase(c);
            }
            i--;
        }
        System.out.println("Frase original: " + frase);
        System.out.println("Frase invertida con vocales en mayúsculas: " + fraseInvertida);
    }

    //Do While
    public static void g1_C05_InvertirFraseDoWhile(String frase){
        String fraseInvertida = "";
        int i = frase.length() - 1;
        do {
            char c = frase.charAt(i);
            if (esVocal(c)){
                fraseInvertida += Character.toUpperCase(c);
            }else{
                fraseInvertida += Character.toLowerCase(c);
            }
            i--;
        } while (i >= 0);
        System.out.println("Frase original: " + frase);
        System.out.println("Frase invertida con vocales en mayúsculas: " + fraseInvertida);
    }

    private static boolean esVocal(char c){
        c = Character.toLowerCase(c);
        return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
    }
    
}
