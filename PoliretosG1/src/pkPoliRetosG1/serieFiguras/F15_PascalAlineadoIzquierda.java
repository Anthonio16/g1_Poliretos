package pkPoliRetosG1.serieFiguras;

public class F15_PascalAlineadoIzquierda {
    public static void g1_F15_PascalIzqFor(int N){
    int[] previous = new int[N];

    for (int i = 0; i < N; i++){
        int[] current = new int[i + 1];

        for (int j = 0; j <= i; j++){
            if (j == 0 || j == i){
                current[j] = 1;
            } else {
                current[j] = previous[j-1] + previous[j];
            }
        }

        // imprimir alineado a la izquierda
        for (int j = 0; j < current.length; j++){
            System.out.print(current[j] + " ");
        }
        System.out.println();

        previous = current;
    }
    }

    public static void g1_F15_PascalIzqWhile(int N){
    int[] previous = new int[N];

    int i = 0;
    while (i < N) {

        int[] current = new int[i + 1];

        // ----- construir la fila i -----
        int j = 0;
        while (j <= i) {
            if (j == 0 || j == i) {
                current[j] = 1;
            } else {
                current[j] = previous[j - 1] + previous[j];
            }
            j++;
        }

        // ----- imprimir la fila alineada a la izquierda -----
        j = 0;
        while (j < current.length) {
            System.out.print(current[j] + " ");
            j++;
        }

        System.out.println();

        previous = current;  // actualizar fila anterior
        i++;
    }
    }



    public static void g1_F15_PascalIzqDoWhile(int N){
    int[] previous = new int[N];
    int i = 0;

    do {
        int[] current = new int[i + 1];
        int j = 0;

        do {
            if (j == 0 || j == i){
                current[j] = 1;
            } else {
                current[j] = previous[j-1] + previous[j];
            }
            j++;
        } while (j <= i);

        j = 0;
        do {
            System.out.print(current[j] + " ");
            j++;
        } while (j < current.length);

        System.out.println();
        previous = current;
        i++;

    } while (i < N);
}


}
