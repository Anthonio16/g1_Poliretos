package pkPoliRetosG1.serieFiguras;

public class F14_TrianguloPascal {
    public static void g1_F14_PascalFor(int N){
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

        // imprimir con espacios
        for (int s = 0; s < (N - i); s++) System.out.print(" ");
        for (int j = 0; j < current.length; j++){
            System.out.print(current[j] + " ");
        }
        System.out.println();

        previous = current;
    }
    }

    public static void g1_F14_PascalWhile(int N){
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

        // ----- imprimir espacios de centrado -----
        int s = 0;
        while (s < (N - i)) {
            System.out.print(" ");
            s++;
        }

        // ----- imprimir valores de la fila actual -----
        j = 0;
        while (j < current.length) {
            System.out.print(current[j] + " ");
            j++;
        }

        System.out.println();

        previous = current;   // pasar fila actual a "previous"
        i++;
    }
    }


    public static void g1_F14_PascalDoWhile(int N){
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

        int s = 0;
        while (s++ < (N - i)) System.out.print(" ");

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
