package pkPoliRetosG1.serieFiguras;

public class F13_NumerosAscendentes {
    public static void g1_F13_NumerosAscFor(int N){
    for (int i = 1; i <= N; i++){
        for (int j = 1; j <= i; j++){
            System.out.print(j);
        }
        System.out.println();
    }
    }

    public static void g1_F13_NumerosAscWhile(int N){
    int i = 1;

    while (i <= N) {

        int j = 1;
        while (j <= i) {
            System.out.print(j);
            j++;
        }

        System.out.println();

        i++;
    }
    }


    public static void g1_F13_NumerosAscDoWhile(int N){
    int i = 1;
    do {
        int j = 1;
        do {
            System.out.print(j);
            j++;
        } while (j <= i);
        System.out.println();
        i++;
    } while (i <= N);
    }


}
