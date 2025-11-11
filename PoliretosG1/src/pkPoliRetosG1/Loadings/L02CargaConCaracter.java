package pkPoliRetosG1.Loadings;

public class L02CargaConCaracter {

    public void g1_L02pedirCaracterYSimularCargaFor(char caracter) throws InterruptedException{


        //Usando for:
        System.out.println("1. FOR: ");
        char[] barra = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; //20 Caracteres

        for(int porcentaje = 0; porcentaje<= 100; porcentaje++){
            
            if (porcentaje % 5 == 0 && porcentaje != 0){ //Por cada 5% aumenta un caracter
                barra[(porcentaje/5)-1] = caracter;
            }

            //Para mostrar el arreglo completo, se lo convierte en string
            String barraEnString = new String(barra);
            System.out.println("[" + barraEnString + " ]" + porcentaje + " %");
            Thread.sleep(100);
        }
        System.out.println("Carga Completa.");

    }


    public void g1_L02pedirCaracterYSimularCargaWhile(char caracter) throws InterruptedException{


        //Usando while:
        System.out.println("2. WHILE: ");
        char[] barra = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; //20 Caracteres

        int k = 0;
        while (k <= 100){
            if (k % 5 == 0 && k != 0){ //Por cada 5% aumenta un caracter
                barra[(k/5)-1] = caracter;
            }

            //Para mostrar el arreglo completo, se lo convierte en string
            String barraEnString = new String(barra);
            System.out.println("[" + barraEnString + " ]" + k + " %");
            Thread.sleep(100);
            k++;
        }
        System.out.println("Carga Completa.");
    }

    public void g1_L02pedirCaracterYSimularCargaDoWhile(char caracter) throws InterruptedException{

        //Usando do-while:
        System.out.println("3. DO-WHILE: ");
        char[] barra = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; //20 Caracteres

        int w = 0;
        do{
            if (w % 5 == 0 && w != 0){ //Por cada 5% aumenta un caracter
                barra[(w/5)-1] = caracter;
            }

            //Para mostrar el arreglo completo, se lo convierte en string
            String barraEnString = new String(barra);
            System.out.println("[" + barraEnString + " ]" + w + " %");
            Thread.sleep(100);
            w++;
        }while (w <= 100);
        System.out.println("Carga Completa.");
    }

}
