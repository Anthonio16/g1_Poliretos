package pkPoliRetosG1.serieFiguras;

public class F5_TrianguloInverso {
    public static void g1_F5_TrianguloInversoFor(int N){
    int W = 2*N - 1;
    for (int r = 0; r < N; r++){
        // padding izquierdo
        for (int p = 0; p < r; p++) System.out.print(" ");
        // asteriscos
        int stars = 2*(N - r) - 1;
        for (int k = 0; k < stars; k++) System.out.print("*");
        System.out.println();
    }

    }

    public static void g1_F5_TrianguloInversoWhile(int N){
    int r = 0;                         // fila

        while (r < N) {

        // padding izquierdo
        int p = 0;
        while (p < r) {
            System.out.print(" ");
            p++;
        }

        // asteriscos
        int stars = 2*(N - r) - 1;
        int k = 0;
        while (k < stars) {
            System.out.print("*");
            k++;
        }

        System.out.println();

        r++;
        }
    }


    public static void g1_F5_TrianguloInversoDoWhile(int N){
    int r = 0;
    int W = 2*N - 1;
    if (N <= 0) return;
    do {
        int p = 0;
        do { if (p >= r) break; System.out.print(" "); p++; } while(true);

        int stars = 2*(N - r) - 1;
        int k = 0;
        do { if (k >= stars) break; System.out.print("*"); k++; } while(true);

        System.out.println();
        r++;
    } while (r < N);
    }



}
