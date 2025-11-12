package pkPoliRetosG1.cadenaCaracteres;

public class C03_EliminarVocal {

    //For
    public static void g1_C03_EliminarVocalFor(String frase, char vocal){
        frase = frase.toLowerCase();
        vocal = Character.toLowerCase(vocal);

        if (vocal != 'a' && vocal != 'e' && vocal != 'i' && vocal != 'o' && vocal != 'u') {
            System.out.println("Error: Debe ingresar una vocal válida (a, e, i, o, u).");
            return;
        }

        String nuevaFrase = "";
        for (int i = 0; i < frase.length(); i++){
            char caracter = frase.charAt(i);
            if (caracter != vocal){
                nuevaFrase += caracter;
            }
        }
        System.out.println("Frase original: " + frase);
        System.out.println("Frase sin la vocal: " + nuevaFrase);
    }

    //While
    public static void g1_C03_EliminarVocalWhile(String frase, char vocal){
        frase = frase.toLowerCase();
        vocal = Character.toLowerCase(vocal);

        if (vocal != 'a' && vocal != 'e' && vocal != 'i' && vocal != 'o' && vocal != 'u') {
            System.out.println("Error: Debe ingresar una vocal válida (a, e, i, o, u).");
            return;
        }

        String nuevaFrase = "";
        int i = 0;
        while (i < frase.length()){
            char caracter = frase.charAt(i);
            if (caracter != vocal){
                nuevaFrase += caracter;
            }
            i++;
        }
        System.out.println("Frase original: " + frase);
        System.out.println("Frase sin la vocal: " + nuevaFrase);
    }

    //Do While
    public static void g1_C03_EliminarVocalDoWhile(String frase, char vocal){
        frase = frase.toLowerCase();
        vocal = Character.toLowerCase(vocal);
        
        if (vocal != 'a' && vocal != 'e' && vocal != 'i' && vocal != 'o' && vocal != 'u') {
            System.out.println("Error: Debe ingresar una vocal válida (a, e, i, o, u).");
            return;
        }
        String nuevaFrase = "";
        int i = 0;
        do {
            char caracter = frase.charAt(i);
            if (caracter != vocal){
                nuevaFrase += caracter;
            }
            i++;
        } while (i < frase.length());
        System.out.println("Frase original: " + frase);
        System.out.println("Frase sin la vocal: " + nuevaFrase);
    }
    
}
