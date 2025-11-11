package pkPoliRetosG1.Arrays;
import java.util.Scanner;

public class A02_InicialesNombre {

    //For
    public void g1_A02_inicialesNombreFor() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre y apellido: ");
        String[] partes = sc.nextLine().split(" ");
        char inicial1 = Character.toUpperCase(partes[0].charAt(0));
        char inicial2 = Character.toUpperCase(partes[1].charAt(0));

        System.out.print("Ingrese el tamaño (mínimo 5): ");
        int n = sc.nextInt();
        System.out.print("Ingrese el carácter: ");
        char c = sc.next().charAt(0);

        System.out.println("\nResultado con FOR:\n");
        dibujarLetra(inicial1, n, c);
        System.out.println();
        dibujarLetra(inicial2, n, c);
    }

    //While
    public void g1_A02_inicialesNombreWhile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre y apellido: ");
        String[] partes = sc.nextLine().split(" ");
        char inicial1 = Character.toUpperCase(partes[0].charAt(0));
        char inicial2 = Character.toUpperCase(partes[1].charAt(0));

        System.out.print("Ingrese el tamaño (mínimo 5): ");
        int n = sc.nextInt();
        System.out.print("Ingrese el carácter: ");
        char c = sc.next().charAt(0);

        System.out.println("\nResultado con WHILE:\n");
        dibujarLetra(inicial1, n, c);
        System.out.println();
        dibujarLetra(inicial2, n, c);
    }

    //Do While
    public void g1_A02_inicialesNombreDoWhile() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre y apellido: ");
        String[] partes = sc.nextLine().split(" ");
        char inicial1 = Character.toUpperCase(partes[0].charAt(0));
        char inicial2 = Character.toUpperCase(partes[1].charAt(0));

        System.out.print("Ingrese el tamaño (mínimo 5): ");
        int n = sc.nextInt();
        System.out.print("Ingrese el carácter: ");
        char c = sc.next().charAt(0);

        System.out.println("\nResultado con DO WHILE:\n");
        dibujarLetra(inicial1, n, c);
        System.out.println();
        dibujarLetra(inicial2, n, c);
    }
    
    private void dibujarLetra(char letra, int n, char c) {
        switch (letra) {
            case 'A': dibujarA(n, c); break;
            case 'M': dibujarM(n, c); break;
            case 'P': dibujarP(n, c); break;
            case 'T': dibujarT(n, c); break;
            case 'L': dibujarL(n, c); break;
            default:
                System.out.println("Letra no disponible: " + letra);
        }
    }

    private void dibujarP(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == 0 || (i < n / 2 && j == n - 1) || (i == n / 2 && j < n - 1))
                    System.out.print(c);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    private void dibujarA(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((j == 0 || j == n - 1) && i != 0 || (i == 0 || i == n / 2) && j > 0 && j < n - 1)
                    System.out.print(c);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    private void dibujarM(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || (i == j && i <= n / 2) || (i + j == n - 1 && i <= n / 2))
                    System.out.print(c);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }  

    private void dibujarT(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || j == n / 2)
                    System.out.print(c);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }

    private void dibujarL(int n, char c) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (j == 0 || i == n - 1)
                    System.out.print(c);
                else
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
    
    
}
