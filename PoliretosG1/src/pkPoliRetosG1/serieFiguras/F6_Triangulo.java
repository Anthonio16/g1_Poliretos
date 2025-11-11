package pkPoliRetosG1.serieFiguras;

public class F6_Triangulo {
    public static void g1_F6_TrianguloFor(int N){
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
    public static void g1_F6_TrianguloDoWhile(int N){
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

    public static void g1_F6_TrianguloWhile(int N){
    int r = 0;  // controla la fila

        while (r < N) {

        // imprimir espacios
        int p = 0;
        while (p < r) {
            System.out.print(" ");
            p++;
        }

        // imprimir asteriscos
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



}
    