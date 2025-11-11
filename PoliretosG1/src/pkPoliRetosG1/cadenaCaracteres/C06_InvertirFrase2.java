package pkPoliRetosG1.cadenaCaracteres;

public class C06_InvertirFrase2 {

    //For
    public static void g1_C06_InvertirFrase2For(String frase){
        String fraseInvertida = "";
        frase = frase.toLowerCase();

        for (int i = frase.length() - 1; i >= 0; i--){
            char c=frase.charAt(i);
            if ("aeiou".indexOf(c) == -1 && Character.isLetter(c)){
                fraseInvertida += Character.toUpperCase(c);
            }else{
                fraseInvertida += c;
            }
        }    
        System.out.println("Frase original: " + frase);
        System.out.println("Frase invertida con consonates en mayúsculas: " + fraseInvertida);
    }
    
    //While
    public static void g1_C06_InvertirFrase2While(String frase){
        String fraseInvertida = "";
        frase = frase.toLowerCase();
        int i = frase.length() - 1;

        while (i >= 0){
            char c=frase.charAt(i);
            if ("aeiou".indexOf(c) == -1 && Character.isLetter(c)){
                fraseInvertida += Character.toUpperCase(c);
            }else{
                fraseInvertida += c;
            }
            i--;
        }    
        System.out.println("Frase original: " + frase);
        System.out.println("Frase invertida con consonantes en mayúsculas: " + fraseInvertida);
    }  

    //Do While
    public static void g1_C06_InvertirFrase2DoWhile(String frase){
        String fraseInvertida = "";
        frase = frase.toLowerCase();
        int i = frase.length() - 1;

        do {
            char c=frase.charAt(i);
            if ("aeiou".indexOf(c) == -1 && Character.isLetter(c)){
                fraseInvertida += Character.toUpperCase(c);
            }else{
                fraseInvertida += c;
            }
            i--;
        } while (i >= 0);    
        System.out.println("Frase original: " + frase);
        System.out.println("Frase invertida con consonantes en mayúsculas: " + fraseInvertida);
    }

}
