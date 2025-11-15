package pkPoliRetosG1.AutomatasyGrafos;

import java.util.Scanner;


public class AutomatasGrafos {

    public AutomatasGrafos() {
        
    }

    public static void inicializarAutomatas() {
        System.out.println("-----------EJERCICIOS AUTÓMATAS Y GRAFOS--------------");
        Scanner scanner = new Scanner(System.in);
        String cadena;
        boolean resultado;

        // --- AG01: Automata a*b+c ---
        System.out.println("\nAG01) Validar Automata para la expresion: a*b+c");
        System.out.print("-> Ingrese la cadena: ");
        cadena = scanner.nextLine();
        // 
        resultado = Automata01.validarCadena(cadena);
        System.out.println("Resultado: " + (resultado ? "Cadena Válida" : "Cadena No Válida"));

        // --- AG02: Automata ab+ca ---
        System.out.println("\nAG02) Validar Automata para la expresion: ab+ca");
        System.out.print("-> Ingrese la cadena: ");
        cadena = scanner.nextLine();
        // 
        resultado = Automata02.validarCadena(cadena);
        System.out.println("Resultado: " + (resultado ? "Cadena Válida" : "Cadena No Válida"));

        // --- AG03: Automata a+|b+|c+ ---
        System.out.println("\nAG03) Validar Automata para la expresion: a+|b+|c+");
        System.out.print("-> Ingrese la cadena: ");
        cadena = scanner.nextLine();
        // 
        resultado = Automata03.validarCadena(cadena);
        System.out.println("Resultado: " + (resultado ? "Cadena Válida" : "Cadena No Válida"));
        
        // --- AG04: Automata 1+|0+1* ---
        System.out.println("\nAG04) Validar Automata para la expresion: 1+|0+1*");
        System.out.print("-> Ingrese la cadena (con 0s y 1s): ");
        cadena = scanner.nextLine();
        resultado = Automata04.validarCadena(cadena);
        System.out.println("Resultado: " + (resultado ? "Cadena Válida" : "Cadena No Válida"));

        // --- AG05: Compi01 (Numero Decimal) ---
        System.out.println("\nAG05) Validar si es un numero decimal (usando Regex)");
        System.out.print("-> Ingrese la cadena: ");
        cadena = scanner.nextLine();
        resultado = Compi01.esNumeroDecimal(cadena);
        System.out.println("Resultado: " + (resultado ? "Es Decimal" : "No Es Decimal"));

        // --- AG06: Compi02 (Validar Caracteres) ---
        System.out.println("\nAG06) Validar caracteres (a-z, 1-9, |, n, _, $)");
        System.out.print("-> Ingrese la cadena: ");
        cadena = scanner.nextLine();
        Compi02.validarCaracteres(cadena); // Este método imprime su propio resultado

        // --- AG07: Compi03 (Palabra Reservada) ---
        System.out.println("\nAG07) Validar palabra reservada (for, if, else, etc.)");
        System.out.print("-> Ingrese la palabra: ");
        cadena = scanner.nextLine();
        Compi03.validarPalabraReservada(cadena); // Este método imprime su propio resultado

        // --- AG08: Validador (Clave Segura) ---
        System.out.println("\nAG08) Validar clave segura (Mayus, Minus, Num, Especial)");
        System.out.print("-> Ingrese la clave: ");
        cadena = scanner.nextLine();
        Validador.validarCadena(cadena); // Este método imprime su propio resultado
    }
}