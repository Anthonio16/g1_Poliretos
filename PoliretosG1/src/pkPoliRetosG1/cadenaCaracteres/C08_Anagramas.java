package pkPoliRetosG1.cadenaCaracteres;

import java.util.Scanner;

public class C08_Anagramas {
    private static final String [][] CONJUNTO ={
        {"delirar", "liderar"},
        {"ballena", "llenaba"},
        {"alondra", "ladrona"},
        {"amor", "roma"},
        {"gato", "toga"}
    };

    //For
    public static void g1_C08_AnagramasFor(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Anagramas (for)");
        for (int i = 0; i < CONJUNTO.length; i++){
            String palabra = CONJUNTO[i][0];
            String anagramaCorrecto = CONJUNTO[i][1];
            boolean correcto = false;

            System.out.println("\nPalabra: " + palabra);

            for (int j = 0; j < 3; j++){
                System.out.print("Intento " + j + ": Ingrese el anagrama:");               
                String respuesta = sc.nextLine().toLowerCase();

                if (respuesta.equalsIgnoreCase(anagramaCorrecto)){
                    System.out.println("Anagrama correcto!");
                    correcto = true;
                    break;
                } else {
                    System.out.println("Anagrama incorrecto.");
                }
            }
            if (!correcto){
                System.out.println("El anagrama correcto era: " + anagramaCorrecto);
            }
        }
    }

    //While
    public static void g1_C08_AnagramasWhile(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Anagramas (while)");
        int i = 0;
        while (i < CONJUNTO.length){
            String palabra = CONJUNTO[i][0];
            String anagramaCorrecto = CONJUNTO[i][1];
            boolean correcto = false;

            System.out.println("\nPalabra: " + palabra);

            int j = 0;
            while (j < 3){
                System.out.print("Intento " + j + ": Ingrese el anagrama:");
                String respuesta = sc.nextLine().toLowerCase();

                if (respuesta.equalsIgnoreCase(anagramaCorrecto)){
                    System.out.println("Anagrama correcto!");
                    correcto = true;
                    break;
                } else {
                    System.out.println("Anagrama incorrecto.");
                }
                j++;
            }
            if (!correcto){
                System.out.println("El anagrama correcto era: " + anagramaCorrecto);
            }
            i++;
        }
    }

    //Do While
    public static void g1_C08_AnagramasDoWhile(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Anagramas (do while)");
        int i = 0;
        do {
            String palabra = CONJUNTO[i][0];
            String anagramaCorrecto = CONJUNTO[i][1];
            boolean correcto = false;

            System.out.println("\nPalabra: " + palabra);

            int j = 0;
            do {
                System.out.print("Intento " + j + ": Ingrese el anagrama:");
                String respuesta = sc.nextLine().toLowerCase();

                if (respuesta.equalsIgnoreCase(anagramaCorrecto)){
                    System.out.println("Anagrama correcto!");
                    correcto = true;
                    break;
                } else {
                    System.out.println("Anagrama incorrecto.");
                }
                j++;
            } while (j < 3);
            if (!correcto){
                System.out.println("El anagrama correcto era: " + anagramaCorrecto);
            }
            i++;
        } while (i < CONJUNTO.length);
    }   
    
}
