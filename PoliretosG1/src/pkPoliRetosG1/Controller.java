package pkPoliRetosG1;
<<<<<<< HEAD
//import pkPoliRetosG1.Arrays;
//import pkPoliRetosG1.Persona;
=======

<<<<<<< HEAD
import java.util.InputMismatchException;
>>>>>>> 399095472dfccc5c5a020e3c1879a120ce3ed083
=======

>>>>>>> 13b1e65ee818f3e2e0d26f79c38ed4b888b58074
import java.util.Scanner;

import pkPoliRetosG1.serieFiguras.Figuras;
import pkPoliRetosG1.Arrays.Array;
import pkPoliRetosG1.Loadings.Loading;
import pkPoliRetosG1.cadenaCaracteres.CadenaCaracteres;



public class Controller {

<<<<<<< HEAD
<<<<<<< HEAD
    private String nombre1;
    private String nombre2;
    private String apellido1;
    private String apellido2;
    //private Integer termino;
    private Persona persona;
=======
    private final Scanner in = new Scanner(System.in);
>>>>>>> 399095472dfccc5c5a020e3c1879a120ce3ed083
=======
>>>>>>> 13b1e65ee818f3e2e0d26f79c38ed4b888b58074

    Scanner sc = new Scanner(System.in);
    

    public void run() throws InterruptedException {
        printHeader();



        System.out.println(">> Ingrese su Primer Nombre: ");
        String primerNombre = sc.nextLine();
        System.out.println(">> Ingrese su Segundo Nombre: ");
        String segundoNombre = sc.nextLine();
        System.out.println(">> Ingrese su Primer Apellido:");
        String primerApellido = sc.nextLine();
        System.out.println(">> Ingrese su Segundo Apellido:");
        String segundoApellido = sc.nextLine();

        //Series numericas


        //Series de caracteres


        //Figuras

        //5-19
        Figuras.inicializarFiguras();

        //Cadena de caracteres
        CadenaCaracteres.inicializarCadenasCaracteres();

        //Arrays
        Array.inicializarArrays(primerNombre, segundoNombre, primerApellido, segundoApellido);
        

        //Loading
        Loading.inicializarLoadings(primerNombre, primerApellido, primerApellido);

        //Recursion


        //Grafos y Automatas

        System.out.println("¡Gracias! Programa finalizado.");
        
    }

    private void printHeader() {
        System.out.println("-----ESCUELA POLITECNICA NACIONAL------");
		System.out.println("-----------------POLIRETOS-------------");
		System.out.println("--------------Programacion II----------");
		System.out.println("------------------GRUPO 1--------------");
        System.out.println("---------------------------------------");
		System.out.println("Integrantes: --------------------------");
		System.out.println("  Alban Salazar Emilio Fabian----------");
		System.out.println("  Alcivar Gomez Alan Nahin-------------");
        System.out.println("  Almeida Reyes Anthonny Joel----------");
		System.out.println("  Alomoto Granizo Ariana Thais---------");
        System.out.println("  Astudillo Campos Josue Sebastian-----");
		System.out.println("Curso: GR2SW---------------------------");
		System.out.println("---------------------------------------");
		System.out.println("_______________________________________");
    }

    
}
