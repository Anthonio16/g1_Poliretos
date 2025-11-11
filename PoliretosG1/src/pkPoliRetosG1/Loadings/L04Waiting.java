package pkPoliRetosG1.Loadings;

public class L04Waiting {


    public void g1_L04simularMovimientoWaitingFor() throws InterruptedException{
        String[] simbolo = {"o0o", "oo0", "o0o", "0oo"};

        int pos = 0;

        //Usando for:
        System.out.println("1. FOR: ");
        for(int i = 0; i <= 100; i++){
            System.out.println(" " + simbolo[pos] + " " + i + " %");
            Thread.sleep(100);
            
            if (pos == 3) pos = 0;
            else pos++;
        }

    }

    public void g1_L04simularMovimientoWaitingWhile() throws InterruptedException{
        String[] simbolo = {"o0o", "oo0", "o0o", "0oo"};

        int pos = 0;

        //Usando while
        System.out.println("2. WHILE: ");
        int k = 0;
        pos = 0;
        while(k <= 100){
            System.out.println(" " + simbolo[pos] + " " + k + " %");
            Thread.sleep(100);
            
            if (pos == 3) pos = 0;
            else pos++;

            k++;
        }

    }

    public void g1_L04simularMovimientoWaitingDoWhile() throws InterruptedException{
        String[] simbolo = {"o0o", "oo0", "o0o", "0oo"};

        int pos = 0;

        //Usando do-while
        System.out.println("3. DO-WHILE: ");
        int w = 0;
        pos = 0;
        do{
            System.out.println(" " + simbolo[pos] + " " + w + " %");
            Thread.sleep(100);
            
            if (pos == 3) pos = 0;
            else pos++;

            w++;
        } while (w <= 100);
    }

}
