package pkPoliRetosG1.serieFiguras;
public class F9_PiramideEscaleras{
    public static void g1_F9_PiramidePeldañosFor(int N){
    if (N <= 0) return;
    // fila 0 (pico)
    for (int s = 0; s < 2*(N-1) - 1; s++) System.out.print(" ");
    System.out.println("_");
    // filas 1..N-1
    for (int i = 1; i < N; i++){
        int left = 2*(N-1 - i) - 1; if (left < 0) left = 0;
        int gap  = 4*i - 3;
        for (int s = 0; s < left; s++) System.out.print(" ");
        System.out.print("_|");
        for (int s = 0; s < gap;  s++) System.out.print(" ");
        System.out.println("|_");
    }
    }

    public static void g1_F9_PiramidePeldañosWhile(int N){
    if (N <= 0) return;

    // ----- fila 0 (pico) -----
    int s = 0;
    int picoSpaces = 2*(N - 1) - 1;
    while (s < picoSpaces) {
        System.out.print(" ");
        s++;
    }
    System.out.println("_");

    // ----- filas 1..N-1 -----
    int i = 1;
    while (i < N) {

        // calcular left
        int left = 2*(N - 1 - i) - 1;
        if (left < 0) left = 0;

        // imprimir left espacios
        int k = 0;
        while (k < left) {
            System.out.print(" ");
            k++;
        }

        // imprimir "_|"
        System.out.print("_|");

        // calcular gap
        int gap = 4*i - 3;

        // imprimir gap espacios
        k = 0;
        while (k < gap) {
            System.out.print(" ");
            k++;
        }

        // imprimir "|_"
        System.out.println("|_");

        i++;
    }
    }



    public static void g1_F9_PiramidePeldañosDoWhile(int N){
    if (N <= 0) return;
    int s = 0; 
    int peakSpaces = 2*(N-1) - 1;
    while (s++ < peakSpaces) System.out.print(" ");
    System.out.println("_");

    int i = 1;
    do {
        int left = 2*(N-1 - i) - 1; if (left < 0) left = 0;
        int gap  = 4*i - 3;

        int k = 0; while (k++ < left) System.out.print(" ");
        System.out.print("_|");
        k = 0; while (k++ < gap)  System.out.print(" ");
        System.out.println("|_");

        i++;
    } while (i < N);
    }


}