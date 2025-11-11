package pkPoliRetosG1.Loadings;

public class L08_CargaConNombreApellido {

    public void g1_L08realizarCargaConNombreyApellidoCompletoFor (String nombre1, String apellido1, String apellido2) throws InterruptedException{
        String nombreCompleto = nombre1 + " " + apellido1 + " " + apellido2;

        double tamanio1 = nombreCompleto.length();
        

        double porcentajePorCaracter = (100/ tamanio1);
        
        //Usando for
        System.out.println("1. FOR: ");
        char[] barra = new char[(int) tamanio1];

        for(int i = 0; i<barra.length; i++){ //Relleno del arreglo con ' '
            barra[i] = ' ';
        }

        int posicionFor = 0;
        for (double porcentaje = 0; porcentaje <= 100; porcentaje += porcentajePorCaracter){
            //Conversion de String a Array para ubicar caracter por caracter en la barra
            if ((porcentaje % porcentajePorCaracter == 0) && (porcentaje != 0)) {
                barra[posicionFor] = nombreCompleto.charAt(posicionFor);
                posicionFor++;
            }
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraString = new String(barra);
            System.out.println("[" + barraString + "]" + porcentaje + "%" );
            Thread.sleep(100);
        }
        System.out.println("Carga Completa.");
    }

    public void g1_L08realizarCargaConNombreyApellidoCompletoWhile (String nombre1, String apellido1, String apellido2) throws InterruptedException{
        String nombreCompleto = nombre1 + " " + apellido1 + " " + apellido2;

        double tamanio1 = nombreCompleto.length();
        

        double porcentajePorCaracter = (100/ tamanio1);

        //Usando while
        System.out.println("2. WHILE: ");
        char[] barra = new char[(int) tamanio1]; 
        int i = 0;
        while (i < barra.length){ //Relleno del arreglo con ' '
            barra[i] = ' ';
            i++;
        }

        double k1 = 0;
        int posicionWhile = 0;
        while(k1 <= 100){
            //Conversion de String a Array para ubicar caracter por caracter en la barra
            if (k1 % porcentajePorCaracter == 0 && k1 != 0) {
                barra[posicionWhile] = nombreCompleto.charAt(posicionWhile);
                posicionWhile++;
            }
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraString = new String(barra);
            System.out.println("[" + barraString + "]" + k1 + "%" );
            Thread.sleep(100);
            k1+=porcentajePorCaracter;
        }
        System.out.println("Carga Completa.");
    }

    public void g1_L08realizarCargaConNombreyApellidoCompletoDoWhile (String nombre1, String apellido1, String apellido2) throws InterruptedException{
        String nombreCompleto = nombre1 + " " + apellido1 + " " + apellido2;

        double tamanio1 = nombreCompleto.length();
        
        double porcentajePorCaracter = (100/ tamanio1);

        //Usando do-while
        System.out.println("3. DO-WHILE: ");
        char[] barra = new char[(int) tamanio1];
        int i = 0;
        do{ //Relleno del arreglo con ' '
            barra[i] = ' ';
            i++;
        }while (i < barra.length);

        double w = 0;
        int posicionDoWhile = 0;
        do{
            //Conversion de String a Array para ubicar caracter por caracter en la barra
            if (w % porcentajePorCaracter == 0 && w != 0) {
                barra[posicionDoWhile] = nombreCompleto.charAt(posicionDoWhile);
                posicionDoWhile++;
            }
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraString = new String(barra);
            System.out.println("[" + barraString + "]" + w + "%" );
            Thread.sleep(100);
            w+= porcentajePorCaracter;
        } while (w <= 100);
        System.out.println("Carga Completa.");
    }

}
