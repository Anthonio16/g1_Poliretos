package pkPoliRetosG1.serieFiguras;

public class F8_EscaleraAscendente {
    public static void g1_F8_EscaleraEspejoFor(int N){
        for (int i = 0; i < N; i++){
        int spaces = 2*(N - 1 - i) - 1;
        if (spaces < 0) spaces = 0;

         for (int s = 0; s < spaces; s++){
            System.out.print(" ");
            }

         System.out.print("_");

         if (i > 0){
                System.out.print("|");
            }

         System.out.println();
        }
    }

    public static void g1_F8_EscaleraEspejoWhile(int N){
    int i = 0;

        while (i < N) {

            int spaces = 2*(N - 1 - i) - 1;
            if (spaces < 0) spaces = 0;

            // imprimir espacios
            int s = 0;
            while (s < spaces) {
            System.out.print(" ");
            s++;
            }

            // imprimir el guión bajo
            System.out.print("_");

            // imprimir la barra si no es la primera fila
            if (i > 0) {
                System.out.print("|");
            }

            System.out.println();

            i++;
        }
    }


    public static void g1_F8_EscaleraEspejoDoWhile(int N){
    int i = 0;

    do {
        int spaces = 2*(N - 1 - i) - 1;
        if (spaces < 0) spaces = 0;

         int s = 0;
            do {
            if (s >= spaces) break;
            System.out.print(" ");
            s++;
            } while (true);

            System.out.print("_");

            if (i > 0){
            System.out.print("|");
         }

            System.out.println();

            i++;

        } while (i < N);
    }


}
