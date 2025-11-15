package pkPoliRetosG1.AutomatasyGrafos;

public class Automata01 {
    // automata a*b+c

    static final int e = -10;

    static int[][] mt = {
            // a b c
            { 0, 1, e },
            { e, 1, 2 },
            { e, e, e }
    };

    public static int obtenerColumna(char c) {
        return switch (c) {
            case 'a' -> 0;
            case 'b' -> 1;
            case 'c' -> 2;
            default -> -1;
        };
    }

    public static boolean validarCadena(String cadena) {
        int estadoActual = 0;
        for (int i = 0; i < cadena.length(); i++) {
            char simbolo = cadena.charAt(i);
            int columna = obtenerColumna(simbolo);

            if (columna == -1) {
                return false;
            }

            estadoActual = mt[estadoActual][columna];

            if (estadoActual == e) {
                return false;
            }
        }

        return estadoActual == 2;
    }
}