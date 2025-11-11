package pkPoliRetosG1.serieFiguras;

public class F11_EscaleraCreciente {
    public static void g1_F11_EscaleraCrecienteFor(int N){
    if (N <= 0) return;
    for (int i = 0; i < N; i++){
        int indent = i*i + 2*i;                // 0,3,8,15,24...
        for (int s = 0; s < indent; s++) System.out.print(" ");
        System.out.print("| ");
        for (int j = 0; j <= i; j++){
            System.out.print("_");
            if (j < i) System.out.print(" ");
        }
        System.out.println();
    }
    }

    public static void g1_F11_EscaleraCrecienteWhile(int N) {
    if (N <= 0) return;

    int i = 0;  // fila

    while (i < N) {

        // calcular indentación: i² + 2i
        int indent = i*i + 2*i;

        // imprimir indentación
        int s = 0;
        while (s < indent) {
            System.out.print(" ");
            s++;
        }

        // imprimir el "| "
        System.out.print("| ");

        // imprimir los "_" separados
        int j = 0;
        while (j <= i) {
            System.out.print("_");
            if (j < i) System.out.print(" ");
            j++;
        }

        System.out.println();

        i++;
    }
    }


    public static void g1_F11_EscaleraCrecienteDoWhile(int N){
    if (N <= 0) return;
    int i = 0;
    do {
        int indent = i*i + 2*i;
        for (int s = 0; s < indent; s++) System.out.print(" ");
        System.out.print("| ");
        int j = 0;
        do {
            System.out.print("_");
            if (j < i) System.out.print(" ");
            j++;
        } while (j <= i);
        System.out.println();
        i++;
    } while (i < N);
}


}
