package pkPoliRetosG1.Loadings;

public class L09_CargaUnaLetraPorLinea {

    public static void g1_L09mostrarNombreCompletoUnaLetraPorLineaFor(String nombre, String apellido) throws InterruptedException{
        String nombreCompleto = nombre + apellido; 

        double tamanio1 = nombreCompleto.length();
        
        double porcentajePorCaracter = (100/ tamanio1);
        
        //Usando for
        System.out.println("1. FOR: ");
        char[] barra = new char[(int) tamanio1];
        for(int i = 0; i<barra.length; i++){ //Relleno del arreglo con ' '
            barra[i] = ' ';
        }
        int posicionFor = 0;
        for (double porcentaje = 0; porcentaje <= 101; porcentaje += porcentajePorCaracter){
            //Conversion de String a Array para ubicar caracter por caracter en la barra
            if (porcentaje == 0) {
                barra[posicionFor] = ' '; //Empieza con 0 caracteres en 0%
            } else if (porcentaje == porcentajePorCaracter){
                barra[posicionFor] = nombreCompleto.charAt(posicionFor); //Empieza con el primer caracter en el primer porcentajePorCaracter
                posicionFor++;
            } else {
                barra[posicionFor] = nombreCompleto.charAt(posicionFor); 
                barra[posicionFor-1] = ' '; //Anterior caracter se reemplaza por un ' ' 
                posicionFor++;
            }
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraString = new String(barra);
            System.out.print("\r" + barraString + " " + String.format("%.1f",porcentaje) + "%" );
            Thread.sleep(100);
        }
        System.out.println("Carga Completa.");

    }

    public static void g1_L09mostrarNombreCompletoUnaLetraPorLineaWhile(String nombre, String apellido) throws InterruptedException{
        String nombreCompleto = nombre + apellido; 

        double tamanio1 = nombreCompleto.length();
        
        double porcentajePorCaracter = (100/ tamanio1);

        //Usando while
        System.out.println("2. WHILE: ");
        char[] barra = new char[(int) tamanio1]; //20 Caracteres
        int i = 0;
        while (i < barra.length){ //Relleno del arreglo con ' '
            barra[i] = ' ';
             i++;
        }
        double k1 = 0;
        int posicionWhile = 0;
        while(k1 <= 101){
            //Conversion de String a Array para ubicar caracter por caracter en la barra
            //Conversion de String a Array para ubicar caracter por caracter en la barra
            if (k1 == 0) {
                barra[posicionWhile] = ' '; //Empieza con 0 caracteres en 0%
            } else if (k1 == porcentajePorCaracter){
                barra[posicionWhile] = nombreCompleto.charAt(posicionWhile); //Empieza con el primer caracter en el primer porcentajePorCaracter
                posicionWhile++;
            } else {
                barra[posicionWhile] = nombreCompleto.charAt(posicionWhile); 
                barra[posicionWhile-1] = ' '; //Anterior caracter se reemplaza por un ' ' 
                posicionWhile++;
            }
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraString = new String(barra);
            System.out.print("\r" + barraString + " " + String.format("%.1f",k1) + "%" );
            Thread.sleep(100);
            k1+=porcentajePorCaracter;
        }
        System.out.println("Carga Completa.");

    }

    public static void g1_L09mostrarNombreCompletoUnaLetraPorLineaDoWhile(String nombre, String apellido) throws InterruptedException{
        String nombreCompleto = nombre + apellido; 

        double tamanio1 = nombreCompleto.length();
        
        double porcentajePorCaracter = (100/ tamanio1);

        //Usando do-while
        System.out.println("3. DO-WHILE: ");
        char[] barra = new char[(int) tamanio1]; //20 Caracteres
        int i = 0;
        do{ //Relleno del arreglo con ' '
            barra[i] = ' ';
            i++;
        }while (i < barra.length);
        double w = 0;
        int posicionDoWhile = 0;
        do{
            //Conversion de String a Array para ubicar caracter por caracter en la barra
            if (w == 0) {
                barra[posicionDoWhile] = ' '; //Empieza con 0 caracteres en 0%
            } else if (w == porcentajePorCaracter){
                barra[posicionDoWhile] = nombreCompleto.charAt(posicionDoWhile); //Empieza con el primer caracter en el primer porcentajePorCaracter
                posicionDoWhile++;
            } else {
                barra[posicionDoWhile] = nombreCompleto.charAt(posicionDoWhile); 
                barra[posicionDoWhile-1] = ' '; //Anterior caracter se reemplaza por un ' ' 
                posicionDoWhile++;
            }
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraString = new String(barra);
            System.out.println("\r" + barraString + " " + String.format("%.1f", w) + "%" );
            Thread.sleep(100);
            w+= porcentajePorCaracter;
        } while (w <= 101);
        System.out.println("Carga Completa.");
    }

}
