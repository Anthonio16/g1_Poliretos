package pkPoliRetosG1.serieFiguras;

public class F12_NumerosDescendientes {
    public static void g1_F12_NumerosDescFor(int N){
    for (int i = N; i >= 1; i--){
        for (int j = 1; j <= i; j++){
            System.out.print(j);
        }
        System.out.println();
    }
    }

    public static void g1_F12_NumerosDescWhile(int N){
    int i = N;

    while (i >= 1) {

        int j = 1;
        while (j <= i) {
            System.out.print(j);
            j++;
        }

        System.out.println();

        i--;
    }
    }


    public static void g1_F12_NumerosDescDoWhile(int N){
    int i = N;
    do {
        int j = 1;
        do {
            System.out.print(j);
            j++;
        } while (j <= i);
        System.out.println();
        i--;
    } while (i >= 1);
    }


}
