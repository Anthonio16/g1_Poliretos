package pkPoliRetosG1.Arrays;

public class A04_FormarX {

    public static void g1_A04formarXConNombreyApellidoFor(String nombre1, String apellido1){

        int tamanio = (nombre1.length()>apellido1.length())? nombre1.length() : apellido1.length();

        char [][] nombreXApellido = new char[tamanio][tamanio];

        char[] arrNombre = nombre1.toCharArray();
        char[] arrApell = apellido1.toCharArray();
            
        //Usando for
        for (int i = 0; i < nombre1.length(); i++){
            nombreXApellido[i][i] = arrNombre[i];
        }
        for (int i= 0; i < apellido1.length(); i++){
            nombreXApellido[i][tamanio-i-1] = arrApell[i];
        }

        //Se muestra el resultado
        System.out.println("Resultado con DO: ");
        imprimirMatricesChar(nombreXApellido);
    }

    public static void g1_A04formarXConNombreyApellidoWhile(String nombre1, String apellido1){

        int tamanio = (nombre1.length()>apellido1.length())? nombre1.length() : apellido1.length();

        char [][] nombreXApellido = new char[tamanio][tamanio];

        char[] arrNombre = nombre1.toCharArray();
        char[] arrApell = apellido1.toCharArray();

        //Usando while
        int k = 0;
        while(k < nombre1.length()){
            nombreXApellido[k][k] = arrNombre[k];
            k++;
        }
        k = 0 ;
        while(k < apellido1.length()){
            nombreXApellido[k][tamanio-k-1] = arrApell[k];
            k++;
        }

        //Se muestra el resultado
        System.out.println("Resultado con WHILE: ");
        imprimirMatricesChar(nombreXApellido);
    }

    public static void g1_A04formarXConNombreyApellidoDoWhile(String nombre1, String apellido1){

        int tamanio = (nombre1.length()>apellido1.length())? nombre1.length() : apellido1.length();

        char [][] nombreXApellido = new char[tamanio][tamanio];

        char[] arrNombre = nombre1.toCharArray();
        char[] arrApell = apellido1.toCharArray();
        
        //Usando do-while
        int w = 0;
        do{
            nombreXApellido[w][w] = arrNombre[w];
            w++;
        }while (w < nombre1.length());
        
        w = 0;
        do{
            nombreXApellido[w][tamanio-w-1] = arrApell[w];
            w++;
        }while (w < apellido1.length());


        //Se muestra el resultado
        System.out.println("Resultado con DO-WHILE: ");
        imprimirMatricesChar(nombreXApellido);
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
