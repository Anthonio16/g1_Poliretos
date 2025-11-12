package pkPoliRetosG1.Arrays;

import java.util.Random;

public class A05_MatrizAleatoriaNombre {

    public static void g1_A05generarMatrizConNombreAleatorioFor(String nombre1, String nombre2, String apellido1, String apellido2) throws InterruptedException{
        
        String nombreCompleto = nombre1 + nombre2 + apellido1 + apellido2;

        char[] arregloNombreCompleto = nombreCompleto.toCharArray();

        int tamanio = 10;

        Random random = new Random();

        char[][] matrizCaracteresAleatorios = new char[tamanio][tamanio];

        //Usando for:
        for (int i = 0; i < nombreCompleto.length(); i++){

            int filaRand = random.nextInt(tamanio);
            int colRand = random.nextInt(tamanio);

            char letra = arregloNombreCompleto[i];

            if (matrizCaracteresAleatorios[filaRand][colRand] == '\0'){
                matrizCaracteresAleatorios[filaRand][colRand] = letra;
            } else {
                matrizCaracteresAleatorios[filaRand][colRand] = '*';
            }
            System.out.println("-------------------------");
            imprimirMatricesChar(matrizCaracteresAleatorios);
            System.out.println("-------------------------");
            Thread.sleep(200);
            
        }

        //Resultado:
        System.out.println("Resultado con FOR: ");
        imprimirMatricesChar(matrizCaracteresAleatorios);
    }

    public static void g1_A05generarMatrizConNombreAleatorioWhile(String nombre1, String nombre2, String apellido1, String apellido2) throws InterruptedException{
        
        String nombreCompleto = nombre1 + nombre2 + apellido1 + apellido2;

        char[] arregloNombreCompleto = nombreCompleto.toCharArray();

        int tamanio = 10;

        Random random = new Random();

        char[][] matrizCaracteresAleatorios = new char[tamanio][tamanio];

        //Usando while:
        int k = 0;
        while (k < nombreCompleto.length()){
            int filaRand = random.nextInt(tamanio);
            int colRand = random.nextInt(tamanio);

            char letra = arregloNombreCompleto[k];

            if (matrizCaracteresAleatorios[filaRand][colRand] == '\0'){
                matrizCaracteresAleatorios[filaRand][colRand] = letra;
            } else {
                matrizCaracteresAleatorios[filaRand][colRand] = '*';
            }

            imprimirMatricesChar(matrizCaracteresAleatorios);
            Thread.sleep(1000);
            k++;
        }

        //Resultado:
        System.out.println("Resultado con WHILE: ");
        imprimirMatricesChar(matrizCaracteresAleatorios);
    }

    public static void g1_A05generarMatrizConNombreAleatorioDoWhile(String nombre1, String nombre2, String apellido1, String apellido2) throws InterruptedException{
        
        String nombreCompleto = nombre1 + nombre2 + apellido1 + apellido2;

        char[] arregloNombreCompleto = nombreCompleto.toCharArray();

        int tamanio = 10;

        Random random = new Random();

        char[][] matrizCaracteresAleatorios = new char[tamanio][tamanio];

        //Usando do-while:
        int w = 0;
        do{
            int filaRand = random.nextInt(tamanio);
            int colRand = random.nextInt(tamanio);

            char letra = arregloNombreCompleto[w];

            if (matrizCaracteresAleatorios[filaRand][colRand] == '\0'){
                matrizCaracteresAleatorios[filaRand][colRand] = letra;
            } else {
                matrizCaracteresAleatorios[filaRand][colRand] = '*';
            }

            imprimirMatricesChar(matrizCaracteresAleatorios);
            Thread.sleep(500);
            w++;
        }while (w < nombreCompleto.length());

        //Resultado:
        System.out.println("Resultado con DO-WHILE: ");
        imprimirMatricesChar(matrizCaracteresAleatorios);
    }

    public static void imprimirMatricesChar(char[][] matriz){
         for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.print(" " + matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }

}
