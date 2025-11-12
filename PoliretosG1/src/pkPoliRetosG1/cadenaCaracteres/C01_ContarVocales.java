package pkPoliRetosG1.cadenaCaracteres;

public class C01_ContarVocales {

    //For
    public static void g1_C01_ContarVocalesFor(String frase){
        int contador = 0;
        frase = frase.toLowerCase();
        if (frase.isEmpty()) {
            System.out.println("Frase vacía, no hay vocales.");
            return;
        }
        for (int i = 0; i < frase.length(); i++){
            char caracter = frase.charAt(i);
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
                contador++;
            }
        }
        System.out.println("Frase: " + frase);
        System.out.println("Número de vocales: " + contador);
    }

    //While
    public static void g1_C01_ContarVocalesWhile(String frase){
        int contador = 0;
        frase = frase.toLowerCase();
        int i = 0;
        while (i < frase.length()){
            char caracter = frase.charAt(i);
            if (frase.isEmpty()) {
                System.out.println("Frase vacía, no hay vocales.");
                return;
            }
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
                contador++;
            }
            i++;
        }
        System.out.println("Frase: " + frase);
        System.out.println("Número de vocales: " + contador);
    }

    //Do While
    public static void g1_C01_ContarVocalesDoWhile(String frase){
        int contador = 0;
        frase = frase.toLowerCase();
        int i = 0;
        do {
            char caracter = frase.charAt(i);
            if (frase.isEmpty()) {
                System.out.println("Frase vacía, no hay vocales.");
                return;
            }
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u'){
                contador++;
            }
            i++;
        } while (i < frase.length());
        System.out.println("Frase: " + frase);
        System.out.println("Número de vocales: " + contador);
    }
    
}
