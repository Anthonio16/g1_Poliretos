package pkPoliRetosG1.Loadings;

public class L12_DesplazarFigura {

    // La figura a animar, centrada para un ancho consistente
    private static final String[] FIGURA = {
        "    \\|||/   ",
        "   ( > < )   ",
        " oO0-(_)-Ooo "
    };
    private static final int MAX_DESPLAZAMIENTO = 15;
    private static final String SEPARADOR_FRAME = "---- (Siguiente Fotograma) ----\n";

    /**
     * Helper (ahora static) para añadir un fotograma.
     */
    private static void agregarFotograma(StringBuilder animacion, int padding) {
        StringBuilder pad = new StringBuilder();
        for (int i = 0; i < padding; i++) {
            pad.append(" ");
        }
        
        for (String linea : FIGURA) {
            animacion.append(pad.toString());
            animacion.append(linea);
            animacion.append("\n");
        }
        animacion.append(SEPARADOR_FRAME);
    }

    /**
     * Solución L12 usando bucles FOR.
     * Método public static void.
     */
    public static void animarConFor() {
        StringBuilder animacion = new StringBuilder();

        // Mover a la derecha
        for (int i = 0; i <= MAX_DESPLAZAMIENTO; i++) {
            agregarFotograma(animacion, i);
        }

        // Regresar a la izquierda
        for (int i = MAX_DESPLAZAMIENTO - 1; i >= 0; i--) {
            agregarFotograma(animacion, i);
        }
        
        // Imprime en lugar de retornar
        System.out.println(animacion.toString());
    }

    /**
     * Solución L12 usando bucles WHILE.
     * Método public static void.
     */
    public static void animarConWhile() {
        StringBuilder animacion = new StringBuilder();
        
        int i = 0;
        // Mover a la derecha
        while (i <= MAX_DESPLAZAMIENTO) {
            agregarFotograma(animacion, i);
            i++;
        }

        i = MAX_DESPLAZAMIENTO - 1;
        // Regresar a la izquierda
        while (i >= 0) {
            agregarFotograma(animacion, i);
            i--;
        }
        
        // Imprime en lugar de retornar
        System.out.println(animacion.toString());
    }

    /**
     * Solución L12 usando bucles DO-WHILE.
     * Método public static void.
     */
    public static void animarConDoWhile() {
        StringBuilder animacion = new StringBuilder();

        int i = 0;
        // Mover a la derecha
        do {
            agregarFotograma(animacion, i);
            i++;
        } while (i <= MAX_DESPLAZAMIENTO);

        i = MAX_DESPLAZAMIENTO - 1;
        // Regresar a la izquierda
        if (i >= 0) {
            do {
                agregarFotograma(animacion, i);
                i--;
            } while (i >= 0);
        }
        
        // Imprime en lugar de retornar
        System.out.println(animacion.toString());
    }
}