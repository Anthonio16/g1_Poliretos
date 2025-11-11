package pkPoliRetosG1.serieFiguras;

public class F7_EscaleraDescendente {
    public static void g1_F7_EscaleraFor(int N){
    for (int i = 0; i < N; i++){
        if (i == 0){
            System.out.println("_");
        } else {
            int spaces = 2*i - 1;
            for (int s = 0; s < spaces; s++){
                System.out.print(" ");
            }
            System.out.println("|_");
        }
    }
    }

    public static void g1_F7_EscaleraWhile(int N){
    int i = 0;

    while (i < N) {
        
        if (i == 0) {
            System.out.println("_");
        } else {
            int spaces = 2*i - 1;  // 1, 3, 5 ...

            int s = 0;
            while (s < spaces) {
                System.out.print(" ");
                s++;
            }

            System.out.println("|_");
        }

        i++;
    }
    }

    public static void g1_F7_EscaleraDoWhile(int N){
    int i = 0;
    do {
        if (i == 0){
            System.out.println("_");
        } else {
            int spaces = 2*i - 1;
            int s = 0;
            do {
                if (s >= spaces) break;
                System.out.print(" ");
                s++;
            } while (true);
            System.out.println("|_");
        }
        i++;
    } while (i < N);
    }



}