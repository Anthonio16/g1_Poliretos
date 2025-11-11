package pkPoliRetosG1.serieFiguras;

public class F10_PiramideSignosDescendente {
    public static void g1_F10_EscaleraAlternaFor(int N){
    if (N <= 0) return;

    for (int i = 0; i < N; i++){
        if (i == 0){
            System.out.println("_+_");
        } 
        else if (i == N - 1){
            int spaces = 3 + 4*(i - 1);
            for (int s = 0; s < spaces; s++) System.out.print(" ");
            System.out.println("|");
        }
        else {
            int spaces = 3 + 4*(i - 1);
            for (int s = 0; s < spaces; s++) System.out.print(" ");
            char signo = (i % 2 == 1) ? '-' : '+';
            System.out.println("|_" + signo + "_");
        }
    }
    }

    public static void g1_F10_EscaleraAlternaWhile(int N){
    if (N <= 0) return;

    int i = 0;

    while (i < N) {

        if (i == 0) {
            // primer peldaño "_+_"
            System.out.println("_+_");
        } 
        else if (i == N - 1) {
            // último peldaño imprime solo "|"
            int spaces = 3 + 4*(i - 1);

            int s = 0;
            while (s < spaces) {
                System.out.print(" ");
                s++;
            }

            System.out.println("|");
        }
        else {
            // peldaños intermedios con alternancia de signos
            int spaces = 3 + 4*(i - 1);

            int s = 0;
            while (s < spaces) {
                System.out.print(" ");
                s++;
            }

            char signo = (i % 2 == 1) ? '-' : '+';
            System.out.println("|_" + signo + "_");
        }

        i++;
    }
    }



    public static void g1_F10_EscaleraAlternaDoWhile(int N){
    if (N <= 0) return;
    int i = 0;

    do {
        if (i == 0){
            System.out.println("_+_");
        } 
        else if (i == N - 1){
            int spaces = 3 + 4*(i - 1);
            int s = 0;
            while (s < spaces){ System.out.print(" "); s++; }
            System.out.println("|");
        }
        else {
            int spaces = 3 + 4*(i - 1);
            int s = 0;
            while (s < spaces){ System.out.print(" "); s++; }
            char signo = (i % 2 == 1) ? '-' : '+';
            System.out.println("|_" + signo + "_");
        }
        i++;
    } while (i < N);
    }


}
