package pkPoliRetosG1.Loadings;

public class L06_DesplazamientoDeBarra {

    public static void g1_L06desplazarBarradeTresCaracteresFor() throws InterruptedException{
        //Usando for:
        System.out.println("1. FOR: ");
        char[] barra = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; //20 Caracteres

        for(int porcentaje = 0; porcentaje<= 100; porcentaje++){
            if (porcentaje < 5){ //Antes del 5%
                if (porcentaje % 5 == 0){ //El unico caso: 0
                    barra[porcentaje] = '<';
                    barra[porcentaje+1] = '=';
                    barra[porcentaje+2] = '>';
                }
            } else if (porcentaje <= 85){ //Desde el 5% hasta el 85%
                if (porcentaje % 5 == 0){ //Por cada 5% aumenta un caracter en la siguiente posicion
                    barra[(porcentaje/5)-1] = ' ';//Anterior posicion '<' se reemplaza por un ' ' 
                    barra[(porcentaje/5)] = '<';//Cambio de posición de caracter de '=' a '<'
                    barra[(porcentaje/5)+1] = '='; //Cambio de posición de caracter de '>' a '='
                    barra[(porcentaje/5)+2] = '>'; //Cambio de posición de caracter de ' ' a '>'
                } 
            }
            
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraEnString = new String(barra);
            System.out.print("\r[" + barraEnString + " ]" + porcentaje + " %");
            Thread.sleep(100);
        }
        System.out.println("Carga Completa.");
    }

    public static void g1_L06desplazarBarradeTresCaracteresWhile() throws InterruptedException{

        //Usando while:
        System.out.println("2. WHILE: ");
        char[] barra = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; //20 Caracteres

        int k = 0;
        while (k <= 100){
            if (k < 5){ //Antes del 5%
                if (k % 5 == 0){ //El unico caso: 0
                    barra[k] = '<';
                    barra[k+1] = '=';
                    barra[k+2] = '>';
                }
            } else if (k <= 85){ //Desde el 5% hasta el 85%
                if (k % 5 == 0){ //Por cada 5% aumenta un caracter en la siguiente posicion
                    barra[(k/5)-1] = ' ';//Anterior posicion '<' se reemplaza por un ' ' 
                    barra[(k/5)] = '<';//Cambio de posición de caracter de '=' a '<'
                    barra[(k/5)+1] = '='; //Cambio de posición de caracter de '>' a '='
                    barra[(k/5)+2] = '>'; //Cambio de posición de caracter de ' ' a '>'
                } 
            }
            
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraEnString = new String(barra);
            System.out.print("\r[" + barraEnString + " ]" + k + " %");
            Thread.sleep(100);
            k++;
        }
        System.out.println("Carga Completa.");
    }

    public static void g1_L06desplazarBarradeTresCaracteresDoWhile() throws InterruptedException{

        //Usando do-while:
        System.out.println("3. DO-WHILE: ");
        char[] barra = {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '}; //20 Caracteres

        int w = 0;
        do{
            if (w < 5){ //Antes del 5%
                if (w % 5 == 0){ //El unico caso: 0
                    barra[w] = '<';
                    barra[w+1] = '=';
                    barra[w+2] = '>';
                }
            } else if (w <= 85){ //Desde el 5% hasta el 85%
                if (w % 5 == 0){ //Por cada 5% aumenta un caracter en la siguiente posicion
                    barra[(w/5)-1] = ' ';//Anterior posicion '<' se reemplaza por un ' ' 
                    barra[(w/5)] = '<';//Cambio de posición de caracter de '=' a '<'
                    barra[(w/5)+1] = '='; //Cambio de posición de caracter de '>' a '='
                    barra[(w/5)+2] = '>'; //Cambio de posición de caracter de ' ' a '>'
                } 
            }
            
            //Para mostrar el arreglo completo, se lo convierte en string
            String barraEnString = new String(barra);
            System.out.print("\r[" + barraEnString + " ]" + w + " %");
            Thread.sleep(100);
            w++;
        }while (w <= 100);
        System.out.println("Carga Completa.");
    }

}
