package pkPoliRetosG1.cadenaCaracteres;

import java.util.Scanner;

public class CadenaCaracteres {

    public CadenaCaracteres() {
    }
    public static void inicializarCadenasCaracteres() {
        Scanner sc = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("===EJERCICIOS CADENA DE CARACTERES ===");
            System.out.println("1. Contar Vocales");
            System.out.println("2. Contar Consonantes");
            System.out.println("3. Eliminar Vocal");
            System.out.println("4. Eliminar Letra");
            System.out.println("5. Invertir Frase (vocales mayúsculas)");
            System.out.println("6. Invertir Frase (consonantes mayúsculas)");
            System.out.println("7. Mayúsculas y eliminar 'J'");
            System.out.println("8. Anagramas");
            System.out.println("9. Alternar Mayúsculas y Minúsculas");
            System.out.println("0. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese una frase: ");
                    String frase1 = sc.nextLine();
                    C01_ContarVocales.g1_C01_ContarVocalesFor(frase1);
                    break;

                case 2:
                    System.out.print("Ingrese una frase: ");
                    String frase2 = sc.nextLine();
                    C02_ContarConsonantes.g1_C02_ContarConsonantesFor(frase2);
                    break;

                case 3:
                    System.out.print("Ingrese una frase: ");
                    String frase3 = sc.nextLine();
                    System.out.print("Ingrese una vocal a eliminar: ");
                    char vocal = sc.nextLine().charAt(0);
                    C03_EliminarVocal.g1_C03_EliminarVocalFor(frase3, vocal);
                    break;

                case 4:
                    System.out.print("Ingrese una frase: ");
                    String frase4 = sc.nextLine();
                    System.out.print("Ingrese una letra a eliminar: ");
                    char letra = sc.nextLine().charAt(0);
                    C04_EliminarLetra.g1_C04_EliminarLetraFor(frase4, letra);
                    break;

                case 5:
                    System.out.print("Ingrese una frase: ");
                    String frase5 = sc.nextLine();
                    C05_InvertirFrase.g1_C05_InvertirFraseFor(frase5);
                    break;

                case 6:
                    System.out.print("Ingrese una frase: ");
                    String frase6 = sc.nextLine();
                    C06_InvertirFrase2.g1_C06_InvertirFrase2For(frase6);
                    break;

                case 7:
                    System.out.print("Ingrese una frase: ");
                    String frase7 = sc.nextLine();
                    C07_MayusculasEliminarJ.g1_C07_MayusculasEliminarJFor(frase7);
                    break;

                case 8:
                    C08_Anagramas.g1_C08_AnagramasFor();
                    break;

                case 9:
                    System.out.print("Ingrese una frase: ");
                    String frase9 = sc.nextLine();
                    C09_AlternarMayusculasMinusculas.g1_C09_AlternarMayusculasMinusculasFor(frase9);
                    break;

                case 0:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Intente nuevamente.");
                    break;
            }

            System.out.println(); // Línea en blanco
        } while (opcion != 0);
    }
}