package pkPoliRetosG1.Loadings;

public class L05CargaCambiandoLaPunta {

    public void g1_L05avanzarBarraCambiandoPuntaFor() throws InterruptedException{
        //Usando for:
        System.out.println("1. FOR: ");
        char[] barra = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; //20 Caracteres

        for(int porcentaje = 0; porcentaje<= 100; porcentaje++){
            if (porcentaje < 10){ //Antes del 10%
                if (porcentaje % 5 == 0 && porcentaje != 0){ //Por cada 5% aumenta un caracter
                    barra[(porcentaje/5)-1] = '>';
                }
            } else { //Desde el 10%
                if (porcentaje % 5 == 0){ //Por cada 5% aumenta un caracter en la siguiente posicion
                    if (porcentaje % 2 == 0){ //Porcentaje par
                        barra[(porcentaje/5)-1] = '-';//Cambio de posición de caracter al siguiente
                    } else {
                        barra[(porcentaje/5)-1] = '>';//Cambio de posición de caracter al siguiente
                    }
                    barra[(porcentaje/5)-2] = '='; //Anterior posicion se reemplaza por un '=' 
                } 
            }
            
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraEnString = new String(barra);
            System.out.println("[" + barraEnString + " ]" + porcentaje + " %");
            Thread.sleep(100);
        }
        System.out.println("Carga Completa.");

    }

    public void g1_L05avanzarBarraCambiandoPuntaWhile() throws InterruptedException{
        //Usando while:
        System.out.println("2. WHILE: ");
        char[] barra = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; //20 Caracteres

        int k = 0;
        while (k <= 100){
            if (k < 10){ //Antes del 10%
                if (k % 5 == 0 && k != 0){ //Por cada 5% aumenta un caracter
                    barra[(k/5)-1] = '>';
                }
            } else { //Desde el 10%
                if (k % 5 == 0){ //Por cada 5% aumenta un caracter en la siguiente posicion
                    if (k % 2 == 0){ //Porcentaje par
                        barra[(k/5)-1] = '-';//Cambio de posición de caracter al siguiente
                    } else {
                        barra[(k/5)-1] = '>';//Cambio de posición de caracter al siguiente
                    }
                    barra[(k/5)-2] = '='; //Anterior posicion se reemplaza por un '=' 
                } 
            }
            
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraEnString = new String(barra);
            System.out.println("[" + barraEnString + " ]" + k + " %");
            Thread.sleep(100);
            k++;
        }
        System.out.println("Carga Completa.");

    }

    public void g1_L05avanzarBarraCambiandoPuntaDoWhile() throws InterruptedException{


        //Usando do-while:
        System.out.println("3. DO-WHILE: ");
        char[] barra = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; //20 Caracteres

        int w = 0;
        do{
            if (w < 10){ //Antes del 10%
                if (w % 5 == 0 && w != 0){ //Por cada 5% aumenta un caracter
                    barra[(w/5)-1] = '>';
                }
            } else { //Desde el 10%
                if (w % 5 == 0){ //Por cada 5% aumenta un caracter en la siguiente posicion
                    if (w % 2 == 0){ //Porcentaje par
                        barra[(w/5)-1] = '-';//Cambio de posición de caracter al siguiente
                    } else {
                        barra[(w/5)-1] = '>';//Cambio de posición de caracter al siguiente
                    }
                    barra[(w/5)-2] = '='; //Anterior posicion se reemplaza por un '=' 
                } 
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
