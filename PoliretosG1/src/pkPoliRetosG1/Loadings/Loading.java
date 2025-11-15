
package pkPoliRetosG1.Loadings;

import java.util.Scanner;

public class Loading {

    

    public Loading(){
    }

    public static void inicializarLoadings(String primerNombre, String primerApellido, String 
    segundoApellido) throws InterruptedException{

        Scanner sc = new Scanner(System.in);

        char caracter;

        System.out.println("------------EJERCICIOS LOGINS (L01-L10)------------");

        System.out.println(" L01) Indicador de carga desde 0  a 100% usar los signos \\|/-| para simular un movimiento rotacional de carga 0% hasta 100% ");
        L01_CargaMovimientoRotacional.g1_L01indicarCargadeCeroACienFor();
        L01_CargaMovimientoRotacional.g1_L01indicarCargadeCeroACienWhile();
        L01_CargaMovimientoRotacional.g1_L01indicarCargadeCeroACienDoWhile();
        
        System.out.println("L02) Pedir un caracter para la simular la carga y la logitud de la barra es de 20 caracteres");
        System.out.println(">> Ingrese un caracter de su preferencia: ");
        caracter = sc.nextLine().charAt(0);
        L02_CargaConCaracter.g1_L02pedirCaracterYSimularCargaFor(caracter);
        L02_CargaConCaracter.g1_L02pedirCaracterYSimularCargaWhile(caracter);
        L02_CargaConCaracter.g1_L02pedirCaracterYSimularCargaDoWhile(caracter);

        System.out.println("L03) Pedir un caracter que se desplaza de izquierda a derecha en una la barra es de 20 caracteres ");
        System.out.println(">> Ingrese un caracter de su preferencia: ");
        caracter = sc.nextLine().charAt(0);
        L03_DesplazamientoDeCaracter.g1_L03pedirCaracterYDesplazarFor(caracter);
        L03_DesplazamientoDeCaracter.g1_L03pedirCaracterYDesplazarWhile(caracter);
        L03_DesplazamientoDeCaracter.g1_L03pedirCaracterYDesplazarDoWhile(caracter);

        System.out.println("L04) Waiting que inicia en 0  a 100% usar los signos o0o para simular un movimiento de ida y vuelta en el mismo puesto");
        L04_Waiting.g1_L04simularMovimientoWaitingFor();
        L04_Waiting.g1_L04simularMovimientoWaitingWhile();
        L04_Waiting.g1_L04simularMovimientoWaitingDoWhile();

        System.out.println("L05) Crear una barra es de 20 caracteres, la barra avanza cambiando la punta entre > -");
        L05_CargaCambiandoLaPunta.g1_L05avanzarBarraCambiandoPuntaFor();
        L05_CargaCambiandoLaPunta.g1_L05avanzarBarraCambiandoPuntaWhile();
        L05_CargaCambiandoLaPunta.g1_L05avanzarBarraCambiandoPuntaDoWhile();

        System.out.println("L06) Crear una barra, la barra <=> se desplaza de izquierda a derecha");
        L06_DesplazamientoDeBarra.g1_L06desplazarBarradeTresCaracteresFor();
        L06_DesplazamientoDeBarra.g1_L06desplazarBarradeTresCaracteresWhile();
        L06_DesplazamientoDeBarra.g1_L06desplazarBarradeTresCaracteresDoWhile();

        System.out.println("L07) Crear una barra es de 20 caracteres, la barra avanza cambiando la punta con movimiento rotacional signos \\|/-| ");
        L07_BarraCambiandoPuntaRotacional.g1_L07avanzarBarraConPuntaRotacionalFor();
        L07_BarraCambiandoPuntaRotacional.g1_L07avanzarBarraConPuntaRotacionalWhile();
        L07_BarraCambiandoPuntaRotacional.g1_L07avanzarBarraConPuntaRotacionalDoWhile();

        System.out.println("L08) Pedir el nombre y apellidos y realizar la carga mostrando letra a letra hasta el 100%");
        L08_CargaConNombreApellido.g1_L08realizarCargaConNombreyApellidoCompletoFor(primerNombre, primerApellido, segundoApellido);
        L08_CargaConNombreApellido.g1_L08realizarCargaConNombreyApellidoCompletoWhile(primerNombre, primerApellido, segundoApellido);
        L08_CargaConNombreApellido.g1_L08realizarCargaConNombreyApellidoCompletoDoWhile(primerNombre, primerApellido, segundoApellido);

        System.out.println("L09) Pedir y mostrar el nombre completo, mostrando solo una letra en la misma linea 0% hasta 100% ");
        L09_CargaUnaLetraPorLinea.g1_L09mostrarNombreCompletoUnaLetraPorLineaFor(primerNombre, primerApellido);
        L09_CargaUnaLetraPorLinea.g1_L09mostrarNombreCompletoUnaLetraPorLineaWhile(primerNombre, primerApellido);
        L09_CargaUnaLetraPorLinea.g1_L09mostrarNombreCompletoUnaLetraPorLineaDoWhile(primerNombre, primerApellido);

        System.out.println("L10) Generar un numero randon entre 10 a 100 para simular una carga de un archivo en kB.");
        L10_CargaDeArchivo.g1_L10simularDescargaDeArchivoFor();
        L10_CargaDeArchivo.g1_L10simularDescargaDeArchivoWhile();
        L10_CargaDeArchivo.g1_L10simularDescargaDeArchivoDoWhile();

        System.out.println("------------EJERCICIOS LOGINS (L11)------------");
        L11_NumeroRandom.generarConFor();
        L11_NumeroRandom.generarConWhile();
        L11_NumeroRandom.generarConDoWhile();

        System.out.println("------------EJERCICIOS LOGINS (L12)------------");
        L12_DesplazarFigura.animarConFor();
        L12_DesplazarFigura.animarConWhile();
        L12_DesplazarFigura.animarConDoWhile();
    }

}
