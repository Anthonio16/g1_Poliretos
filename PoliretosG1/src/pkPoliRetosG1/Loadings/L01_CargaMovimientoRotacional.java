package pkPoliRetosG1.Loadings;

public class L01_CargaMovimientoRotacional {


    public static void g1_L01indicarCargadeCeroACienFor() throws InterruptedException{
        
        char[] rotacion = {'|', '/', '-', '\\'};

        int pos = 0;

        //Usando for:
        System.out.println("1. FOR: ");
        for(int i = 0; i <= 100; i++){
            System.out.print("\r " + rotacion[pos] + " " + i + " %");
            Thread.sleep(100);
            
            if (pos == 3) pos = 0;
            else pos++;
        }
    }

    public static void g1_L01indicarCargadeCeroACienWhile() throws InterruptedException{
        
        char[] rotacion = {'|', '/', '-', '\\'};

        int pos = 0;

        //Usando while
        System.out.println("2. WHILE: ");
        int k = 0;
        pos = 0;
        while(k <= 100){
            System.out.print("\r " + rotacion[pos] + " " + k + " %");
            Thread.sleep(100);
            
            if (pos == 3) pos = 0;
            else pos++;

            k++;
        }

    }

    public static void g1_L01indicarCargadeCeroACienDoWhile() throws InterruptedException{
        
        char[] rotacion = {'|', '/', '-', '\\'};

        int pos = 0;

        //Usando do-while
        System.out.println("3. DO-WHILE: ");
        int w = 0;
        pos = 0;
        do{
            System.out.print("\r " + rotacion[pos] + " " + w + " %");
            Thread.sleep(100);
            
            if (pos == 3) pos = 0;
            else pos++;

            w++;
        } while (w <= 100);


    }

}
