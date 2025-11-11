package pkPoliRetosG1.Arrays;
import java.util.Scanner;

public class A01_PorcentajeNombre {

    //For
    public void g1_A01_porcentajeNombreFor(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre completo (palabras separadas por espacio): ");
        String nombreCompleto = sc.nextLine();
        String[] palabras = nombreCompleto.split(" ");

        System.out.println("Ingrese los porcentajes de carga separados por espacio (4 cantidades):");
        String[] porcentajesTexto = sc.nextLine().split(" ");
        int[] porcentajes = new int[porcentajesTexto.length];
        for (int i = 0; i < porcentajesTexto.length; i++) {
            porcentajes[i] = Integer.parseInt(porcentajesTexto[i]);
        }

        System.out.println();
        System.out.println(nombreCompleto);

        for (int i = 0; i < palabras.length; i++) {
            imprimirBarra(palabras[i], porcentajes[i]);
        }
    }
    
    //While
    public void g1_A01_porcentajeNombreWhile(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre completo (palabras separadas por espacio): ");
        String nombreCompleto = sc.nextLine();
        String[] palabras = nombreCompleto.split(" ");

        System.out.println("Ingrese los porcentajes de carga separados por espacio (4 cantidades):");
        String[] porcentajesTexto = sc.nextLine().split(" ");
        int[] porcentajes = new int[porcentajesTexto.length];
        int i = 0;

        while (i < porcentajesTexto.length) {
            porcentajes[i] = Integer.parseInt(porcentajesTexto[i]);
            i++;
        }

        System.out.println();
        System.out.println(nombreCompleto);

        i = 0;
        while (i < palabras.length) {
            imprimirBarra(palabras[i], porcentajes[i]);
            i++;
        }
    }

    //Do While
    public void g1_A01_porcentajeNombreDoWhile(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su nombre completo (palabras separadas por espacio): ");
        String nombreCompleto = sc.nextLine();
        String[] palabras = nombreCompleto.split(" ");

        System.out.println("Ingrese los porcentajes de carga separados por espacio (4 cantidades):");
        String[] porcentajesTexto = sc.nextLine().split(" ");
        int[] porcentajes = new int[porcentajesTexto.length];
        int i = 0;

        do {
            porcentajes[i] = Integer.parseInt(porcentajesTexto[i]);
            i++;
        } while (i < porcentajesTexto.length);

        System.out.println();
        System.out.println(nombreCompleto);

        i = 0;
        do {
            imprimirBarra(palabras[i], porcentajes[i]);
            i++;
        } while (i < palabras.length);
    }

    private void imprimirBarra(String palabra, int porcentaje) {
        int longitudBarra = 15;
        int llenado = (porcentaje * longitudBarra) / 100;

        StringBuilder barra = new StringBuilder("[");
        for (int j = 0; j < longitudBarra; j++) {
            if (j < llenado) {
                barra.append("=");
            } else {
                barra.append(" ");
            }
        }
        barra.append(">]");
        int letraMostrar = Math.max(2, (porcentaje * palabra.length()) / 100);
        if (letraMostrar > palabra.length()) {
            letraMostrar = palabra.length();
        } 
        String subPalabra = palabra.substring(0, letraMostrar);

        System.out.printf("%s %3d%% %s%n", barra.toString(), porcentaje, subPalabra);
    }

    
}
