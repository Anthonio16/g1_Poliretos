package pkPoliRetosG1.Loadings;

import java.util.Random;



public class L11_NumeroRandom {

   
    private static final int ANCHO_VISUAL = 15;
    private static final int ALTO_MAX = 8;
    

    private static final Random rand = new Random();

 
    
    private static int[] generarAlturas() {
        int[] alturas = new int[ANCHO_VISUAL];
        for (int i = 0; i < ANCHO_VISUAL; i++) {
            alturas[i] = rand.nextInt(ALTO_MAX + 1); 
        }
        return alturas;
    }

  
    public static void generarConFor() {
        StringBuilder visual = new StringBuilder();
        int[] alturas = generarAlturas();

        for (int y = ALTO_MAX; y >= 0; y--) {
            for (int x = 0; x < ANCHO_VISUAL; x++) {
                if (alturas[x] >= y) {
                    visual.append("= ");
                } else {
                    visual.append("  ");
                }
            }
            visual.append("\n");
        }
        // Imprime en lugar de retornar
        System.out.println(visual.toString());
    }

   
    public static void generarConWhile() {
        StringBuilder visual = new StringBuilder();
        int[] alturas = generarAlturas();

        int y = ALTO_MAX;
        while (y >= 0) {
            int x = 0;
            while (x < ANCHO_VISUAL) {
                if (alturas[x] >= y) {
                    visual.append("= ");
                } else {
                    visual.append("  ");
                }
                x++;
            }
            visual.append("\n");
            y--;
        }
        // Imprime en lugar de retornar
        System.out.println(visual.toString());
    }

    
    public static void generarConDoWhile() {
        StringBuilder visual = new StringBuilder();
        int[] alturas = generarAlturas();

        int y = ALTO_MAX;
        if (ALTO_MAX < 0) return; 

        do {
            int x = 0;
            if (ANCHO_VISUAL > 0) { 
                do {
                    if (alturas[x] >= y) {
                        visual.append("= ");
                    } else {
                        visual.append("  ");
                    }
                    x++;
                } while (x < ANCHO_VISUAL);
            }
            visual.append("\n");
            y--;
        } while (y >= 0);
        
       
        System.out.println(visual.toString());
    }
}