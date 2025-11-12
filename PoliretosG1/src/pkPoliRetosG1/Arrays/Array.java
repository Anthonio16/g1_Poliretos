package pkPoliRetosG1.Arrays;

public class Array {

    public Array(){
    }

    public void inicializarArrays(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) throws InterruptedException{

        A01_PorcentajeNombre.g1_A01_porcentajeNombreFor();
        A01_PorcentajeNombre.g1_A01_porcentajeNombreWhile();
        A01_PorcentajeNombre.g1_A01_porcentajeNombreDoWhile();

        A02_InicialesNombre.g1_A02_inicialesNombreFor();
        A02_InicialesNombre.g1_A02_inicialesNombreWhile();
        A02_InicialesNombre.g1_A02_inicialesNombreDoWhile();

        A03_DibujarPlanoYFuncion.g1_A03dibujarPlanoYFuncionDibujandoConNombreFor(primerNombre);
        A03_DibujarPlanoYFuncion.g1_A03dibujarPlanoYFuncionDibujandoConNombreWhile(primerNombre);
        A03_DibujarPlanoYFuncion.g1_A03dibujarPlanoYFuncionDibujandoConNombreDoWhile(primerNombre);

        A04_FormarX.g1_A04formarXConNombreyApellidoFor(primerNombre, primerApellido);
        A04_FormarX.g1_A04formarXConNombreyApellidoWhile(primerNombre, primerApellido);
        A04_FormarX.g1_A04formarXConNombreyApellidoDoWhile(primerNombre, primerApellido);

        A05_MatrizAleatoriaNombre.g1_A05generarMatrizConNombreAleatorioFor(primerNombre, segundoNombre, primerApellido, segundoApellido);
        A05_MatrizAleatoriaNombre.g1_A05generarMatrizConNombreAleatorioWhile(primerNombre, segundoNombre, primerApellido, segundoApellido);
        A05_MatrizAleatoriaNombre.g1_A05generarMatrizConNombreAleatorioDoWhile(primerNombre, segundoNombre, primerApellido, segundoApellido);
        
    }

}
