package pkPoliRetosG1.Arrays;

public class A03_DibujarPlanoYFuncion {

    public void g1_A03dibujarPlanoYFuncionDibujandoConNombreFor(String nombre1){
        int longitudNombreEnX = nombre1.length();
        int enY = longitudNombreEnX;

        //Plano de Coordenadas
        String[][] planoDeCoordenadas = new String [(longitudNombreEnX+2)][(enY+2)];//+2 Por los indices y linea de separacion
        //Transformacion de String a Arreglo de Caracteres
        char[] arregloNombre = nombre1.toCharArray();
        
        
        
        //lleno la matriz de caracteres ' ' 
        for (int i = 0; i < longitudNombreEnX+2; i++){
            for (int j = 0; j < enY+2; j++){
                planoDeCoordenadas[i][j] = " ";
            }
        }

        //1. Creacion del plano de coordenadas
        int temp; //Temporal para los indices
        //Valores en Y
        temp = enY;
        for (int i = 0; i < planoDeCoordenadas.length ; i++){
            if (i == planoDeCoordenadas.length-1) planoDeCoordenadas[i][0] = "  ";
            else 
                planoDeCoordenadas[i][0] = " " + temp; //casteo a char dado que es una matriz de strings
                temp = temp - 1;
            
        }

        //Linea de separacion
        for (int i = 0; i < planoDeCoordenadas.length ; i++){
            planoDeCoordenadas[i][1] = "|";
        }

        //Colocar eje x
        for (int i = 2; i < planoDeCoordenadas[0].length; i++){ //empiezo desde la ultima fila y 3ra columna para colocar los indices
            planoDeCoordenadas[planoDeCoordenadas.length-1][i] = "" + (i-1);
        }
        //Linea de separacion
        for (int i = 2; i < planoDeCoordenadas[0].length; i++){ //empiezo desde la penuultima fila y 3ra columna para colocar la linea de separacion
            planoDeCoordenadas[planoDeCoordenadas.length-2][i] = "_";
        }

        //Usando for:
        for (int i = 0; i < nombre1.length(); i++){
            planoDeCoordenadas[(nombre1.length())-i-1][i+2] = "" + arregloNombre[i];
        }

        //Se muestra el resultado
        System.out.println("Resultado con FOR: ");
        imprimirMatricesString(planoDeCoordenadas);
    }

    public void g1_A03dibujarPlanoYFuncionDibujandoConNombreWhile(String nombre1){
        int longitudNombreEnX = nombre1.length();
        int enY = longitudNombreEnX;

        //Plano de Coordenadas
        String[][] planoDeCoordenadas = new String [(longitudNombreEnX+2)][(enY+2)];//+2 Por los indices y linea de separacion
        //Transformacion de String a Arreglo de Caracteres
        char[] arregloNombre = nombre1.toCharArray();
        
        
        int i = 0;
        int j = 0;
        //lleno la matriz de caracteres ' ' 
        while(i < longitudNombreEnX+2){
            while( j < enY+2){
                planoDeCoordenadas[i][j] = " ";
                j++;
            }
            j = 0;
            i++;
        }

        //1. Creacion del plano de coordenadas
        int temp; //Temporal para los indices
        temp = enY;
        i = 0;
        j = 0;
        //Colocar eje y
        while(i < planoDeCoordenadas.length){
            if (i == planoDeCoordenadas.length-1) planoDeCoordenadas[i][0] = "  ";
            else 
                planoDeCoordenadas[i][0] = " " + temp; //casteo a char dado que es una matriz de strings
                temp = temp - 1;
            i++;
            
        }

        //Linea de separacion
        i = 0; 
        while(i < planoDeCoordenadas.length){
            planoDeCoordenadas[i][1] = "|";
            i++;
        }

        //Colocar eje x
        i = 2; 
        while (i < planoDeCoordenadas[0].length){ //empiezo desde la ultima fila y 3ra columna para colocar los indices
            planoDeCoordenadas[planoDeCoordenadas.length-1][i] = "" + (i-1);
            i++;
        }
        //Linea de separacion
        i = 2; 
        while(i < planoDeCoordenadas[0].length){ //empiezo desde la penuultima fila y 3ra columna para colocar la linea de separacion
            planoDeCoordenadas[planoDeCoordenadas.length-2][i] = "_";
            i++;
        }

        //Usando while
        i = 0;
        while (i < nombre1.length()){
        	planoDeCoordenadas[(nombre1.length())-i-1][i+2] = "" + arregloNombre[i];
        	i++;
        }

        //Se muestra el resultado
        System.out.println("Resultado con WHILE: ");
        imprimirMatricesString(planoDeCoordenadas);
    }

    public void g1_A03dibujarPlanoYFuncionDibujandoConNombreDoWhile(String nombre1){
        int longitudNombreEnX = nombre1.length();
        int enY = longitudNombreEnX;

        //Plano de Coordenadas
        String[][] planoDeCoordenadas = new String [(longitudNombreEnX+2)][(enY+2)];//+2 Por los indices y linea de separacion
        //Transformacion de String a Arreglo de Caracteres
        char[] arregloNombre = nombre1.toCharArray();
        
        
        
        //lleno la matriz de caracteres ' ' 
        int i = 0;
        int j = 0;
        do{
            do{
                planoDeCoordenadas[i][j] = " ";
                j++;
            } while (j < enY+2);
            j = 0;
            i++;
        } while (i < longitudNombreEnX+2);

        //1. Creacion del plano de coordenadas
        int temp; //Temporal para los indices
        //Colocar eje y
        //Valores en Y
        temp = enY;
        i = 0;

        do{
            if (i == planoDeCoordenadas.length-1) planoDeCoordenadas[i][0] = "  ";
            else 
                planoDeCoordenadas[i][0] = " " + temp; //casteo a char dado que es una matriz de strings
                temp = temp - 1;
            i++;
        } while (i < planoDeCoordenadas.length);

        //Linea de separacion
        i = 0; 
        do{
            planoDeCoordenadas[i][1] = "|";
            i++;
        } while (i < planoDeCoordenadas.length);

        //Colocar eje x
        i = 2; 
        do{ //empiezo desde la ultima fila y 3ra columna para colocar los indices
            planoDeCoordenadas[planoDeCoordenadas.length-1][i] = "" + (i-1);
            i++;
        }while (i < planoDeCoordenadas[0].length);

        //Linea de separacion
        i = 2; 
        do{ //empiezo desde la penuultima fila y 3ra columna para colocar la linea de separacion
            planoDeCoordenadas[planoDeCoordenadas.length-2][i] = "_";
            i++;
        } while (i < planoDeCoordenadas[0].length);

        //Usando do-while
        i = 0;
        do  {
        	planoDeCoordenadas[(nombre1.length())-i-1][i+2] = "" + arregloNombre[i];
        	i++;
        } while (i < nombre1.length());

        //Se muestra el resultado
        System.out.println("Resultado con DO-WHILE: ");
        imprimirMatricesString(planoDeCoordenadas);
    }

    public void imprimirMatricesString(String[][] matriz){
        for (int i = 0; i < matriz.length; i++){
            for (int j = 0; j < matriz[0].length; j++){
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println("");
        }
    }
}
