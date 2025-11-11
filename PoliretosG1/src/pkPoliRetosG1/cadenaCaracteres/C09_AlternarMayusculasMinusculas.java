package pkPoliRetosG1.cadenaCaracteres;

public class C09_AlternarMayusculasMinusculas {
    
    //For
    public static void g1_C09_AlternarMayusculasMinusculasFor(String frase){
        String nuevaFrase = "";
        boolean mayuscula = true;

        for (int i = 0; i < frase.length(); i++){
            char caracter = frase.charAt(i);
            if (Character.isLetter(caracter)){
                if (mayuscula){
                    nuevaFrase += Character.toUpperCase(caracter);
                } else {
                    nuevaFrase += Character.toLowerCase(caracter);
                }
                mayuscula = !mayuscula;
            }else{
                nuevaFrase += caracter;
            }
        }
        System.out.println("Frase original: " + frase);
        System.out.println("Frase alternando mayúsculas y minúsculas: " + nuevaFrase);
    }

    //While
    public static void g1_C09_AlternarMayusculasMinusculasWhile(String frase){
        String nuevaFrase = "";
        boolean mayuscula = true;
        int i = 0;

        while (i < frase.length()){
            char caracter = frase.charAt(i);
            if (Character.isLetter(caracter)){
                if (mayuscula){
                    nuevaFrase += Character.toUpperCase(caracter);
                } else {
                    nuevaFrase += Character.toLowerCase(caracter);
                }
                mayuscula = !mayuscula;
            }else{
                nuevaFrase += caracter;
            }
            i++;
        }
        System.out.println("Frase original: " + frase);
        System.out.println("Frase alternando mayúsculas y minúsculas: " + nuevaFrase);
    }

    //Do While
    public static void g1_C09_AlternarMayusculasMinusculasDoWhile(String frase){
        String nuevaFrase = "";
        boolean mayuscula = true;
        int i = 0;

        do {
            char caracter = frase.charAt(i);
            if (Character.isLetter(caracter)){
                if (mayuscula){
                    nuevaFrase += Character.toUpperCase(caracter);
                } else {
                    nuevaFrase += Character.toLowerCase(caracter);
                }
                mayuscula = !mayuscula;
            }else{
                nuevaFrase += caracter;
            }
            i++;
        } while (i < frase.length());
        System.out.println("Frase original: " + frase);
        System.out.println("Frase alternando mayúsculas y minúsculas: " + nuevaFrase);
    }
    
}
