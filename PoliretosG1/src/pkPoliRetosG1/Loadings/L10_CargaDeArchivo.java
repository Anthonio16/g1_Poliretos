package pkPoliRetosG1.Loadings;

import java.util.Random;

public class L10_CargaDeArchivo {

    public static void g1_L10simularDescargaDeArchivoFor() throws InterruptedException{

        Random random = new Random(); //Crea un objeto perteneciente al paquete estándar de Java

        int longitudBarra = 25;
        
        //Usando for:
        System.out.println("1. FOR: ");
        char[] barra = new char[longitudBarra];
        //Relleno de ' ' en el arreglo de Barra
        for(int i = 0; i < barra.length; i++){
            barra[i] = ' ';
        }

        double tamanio = random.nextInt(91) + 10;
        double proporcionDescarga = tamanio/ (double)longitudBarra;
        System.out.println("Downloading Grupo1-PoliretosFOR-main.zip (" + tamanio + " kb)");
        String barraString = new String(barra);
        //Sin aun descargar nada
        System.out.print("\r " + "\u001B[33m" + barraString + " \u001B[0m " + String.format("%.1f", 0.0) + " / " +  tamanio + " kb");
        //Descarga de archivo
        
        for (int pos = 0; pos < longitudBarra; pos++){
            
            double descargando = (pos + 1) * proporcionDescarga;
            barra[pos] = '-';
            
            //Para mostrar el arreglo completo de barra, se lo convierte en string
        	barraString = new String(barra);
        	System.out.print("\r " + "\u001B[33m" + barraString + " \u001B[0m " + String.format("%.1f", descargando) + " / " +  tamanio + " kb");
        	//El \u001B[33m cambia el texto a magenta hasta \u001B[0m, que es obligatorio para que el color no se propague al resto del texto, es decir, restablece el color al normal
        	//El String.format("%.1f", descargando) redondea el numero a una cifra decimal al mostrarse
        	Thread.sleep(250);
        }

        System.out.println("DOWNLOADED.");
    }

    public static void g1_L10simularDescargaDeArchivoWhile() throws InterruptedException{

        Random random = new Random(); //Crea un objeto perteneciente al paquete estándar de Java

        int longitudBarra = 25;

        //Usando while
        System.out.println("2. WHILE: ");
        char[] barra = new char[longitudBarra];
        //Relleno de ' ' en el arreglo de Barra
        int i = 0;
        while (i < barra.length){
            barra[i] = ' ';
            i++;
        }

        int pos = 0;
        double tamanio = random.nextInt(91) + 10;
        double proporcionDescarga = tamanio/ (double)longitudBarra;
        System.out.println("Downloading Grupo1-PoliretosWHILE-main.zip (" + tamanio + " kb)");
        //Em 0.0 kb
        String barraString = new String(barra);
        System.out.print("\r " + "\u001B[31m" + barraString + " \u001B[0m " + String.format("%.1f", 0.0) + " / " +  tamanio + " kb");
        
        //Descarga de archivo
        while (pos < longitudBarra){

            double descargando = (pos + 1) * proporcionDescarga;
            barra[pos] = '-';
            
            //Para mostrar el arreglo completo de barra, se lo convierte en string
        	barraString = new String(barra);
        	System.out.print("\r " + "\u001B[31m" + barraString + " \u001B[0m " + String.format("%.1f", descargando) + " / " +  tamanio + " kb");
        	//El \u001B[31m cambia el texto a rojo hasta \u001B[0m, que es obligatorio para que el color no se propague al resto del texto, es decir, restablece el color al normal
        	//El String.format("%.1f", descargando) redondea el numero a una cifra decimal al mostrarse
        	Thread.sleep(250);

            pos++;
        }

        System.out.println("DOWNLOADED.");

    }

    public static void g1_L10simularDescargaDeArchivoDoWhile() throws InterruptedException{

        Random random = new Random(); //Crea un objeto perteneciente al paquete estándar de Java

        int longitudBarra = 25;

        //Usando do-while
        System.out.println("3. DO-WHILE: ");
        char[] barra = new char[longitudBarra];
        //Relleno de ' ' en el arreglo de Barra
        int i = 0; 
        do{ 
            barra[i] = ' ';
            i++;
        } while (i < barra.length);

        int pos = 0;
        double tamanio = random.nextInt(91) + 10;
        double proporcionDescarga = tamanio/ (double)longitudBarra;
        System.out.println("Downloading Grupo1-PoliretosDO_WHILE-main.zip (" + tamanio + " kb)");
        //En 0.0kb
        String barraString = new String(barra);
        System.out.print("\r " +"\u001B[36m" + barraString + " \u001B[0m " + String.format("%.1f", 0.0) + " / " +  tamanio + " kb");
        
        //Descarga de archivo
        pos = 0;
        do{ 

            double descargando = (pos + 1) * proporcionDescarga;
            barra[pos] = '-';
            
            //Para mostrar el arreglo completo de barra, se lo convierte en string
        	barraString = new String(barra);
        	System.out.print("\r " + "\u001B[36m" + barraString + " \u001B[0m " + String.format("%.1f", descargando) + " / " +  tamanio + " kb");
        	//El \u001B[36m cambia el texto a cian hasta \u001B[0m, que es obligatorio para que el color no se propague al resto del texto, es decir, restablece el color al normal
        	//El String.format("%.1f", descargando) redondea el numero a una cifra decimal al mostrarse
        	Thread.sleep(250);

            pos++;
        } while (pos < longitudBarra);

        System.out.println("DOWNLOADED.");
    }


}
