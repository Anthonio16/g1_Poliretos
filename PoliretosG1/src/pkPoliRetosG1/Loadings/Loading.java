package pkPoliRetosG1.Loadings;


public class Loading {

    public Loading(){
    }

    public void inicializarLoadings(char caracter, String primerNombre, String primerApellido, String 
    segundoApellido) throws InterruptedException{

        L01_CargaMovimientoRotacional.g1_L01indicarCargadeCeroACienFor();
        L01_CargaMovimientoRotacional.g1_L01indicarCargadeCeroACienWhile();
        L01_CargaMovimientoRotacional.g1_L01indicarCargadeCeroACienDoWhile();
        
        L02_CargaConCaracter.g1_L02pedirCaracterYSimularCargaFor(caracter);
        L02_CargaConCaracter.g1_L02pedirCaracterYSimularCargaWhile(caracter);
        L02_CargaConCaracter.g1_L02pedirCaracterYSimularCargaDoWhile(caracter);

        L04_Waiting.g1_L04simularMovimientoWaitingFor();
        L04_Waiting.g1_L04simularMovimientoWaitingWhile();
        L04_Waiting.g1_L04simularMovimientoWaitingDoWhile();

        L05_CargaCambiandoLaPunta.g1_L05avanzarBarraCambiandoPuntaFor();
        L05_CargaCambiandoLaPunta.g1_L05avanzarBarraCambiandoPuntaWhile();
        L05_CargaCambiandoLaPunta.g1_L05avanzarBarraCambiandoPuntaDoWhile();

        L06_DesplazamientoDeBarra.g1_L06desplazarBarradeTresCaracteresFor();
        L06_DesplazamientoDeBarra.g1_L06desplazarBarradeTresCaracteresWhile();
        L06_DesplazamientoDeBarra.g1_L06desplazarBarradeTresCaracteresDoWhile();

        L07_BarraCambiandoPuntaRotacional.g1_L07avanzarBarraConPuntaRotacionalFor();
        L07_BarraCambiandoPuntaRotacional.g1_L07avanzarBarraConPuntaRotacionalWhile();
        L07_BarraCambiandoPuntaRotacional.g1_L07avanzarBarraConPuntaRotacionalDoWhile();

        L08_CargaConNombreApellido.g1_L08realizarCargaConNombreyApellidoCompletoFor(primerNombre, primerApellido, segundoApellido);
        L08_CargaConNombreApellido.g1_L08realizarCargaConNombreyApellidoCompletoWhile(primerNombre, primerApellido, segundoApellido);
        L08_CargaConNombreApellido.g1_L08realizarCargaConNombreyApellidoCompletoDoWhile(primerNombre, primerApellido, segundoApellido);

        L09_CargaUnaLetraPorLinea.g1_L09mostrarNombreCompletoUnaLetraPorLineaFor(primerNombre, primerApellido);
        L09_CargaUnaLetraPorLinea.g1_L09mostrarNombreCompletoUnaLetraPorLineaWhile(primerNombre, primerApellido);
        L09_CargaUnaLetraPorLinea.g1_L09mostrarNombreCompletoUnaLetraPorLineaDoWhile(primerNombre, primerApellido);

        L10_CargaDeArchivo.g1_L10simularDescargaDeArchivoFor();
        L10_CargaDeArchivo.g1_L10simularDescargaDeArchivoWhile();
        L10_CargaDeArchivo.g1_L10simularDescargaDeArchivoDoWhile();

    }

}
