package pkPoliRetosG1;

public class Parametro {
    
    private String primerNombre;
    private String segundoNombre;
    private String primerApellido;
    private String segundoApellido;
    private int numeroDeTermino;
    private int numeroDeNivelOTamanio;
    private String frase;

    
    public Parametro(String primerNombre, String segundoNombre, String primerApellido, String segundoApellido) {
        setPrimerNombre(primerNombre);
        setSegundoNombre(segundoNombre);
        setPrimerApellido(primerApellido);
        setSegundoApellido(segundoApellido);
    }

    
    public String getPrimerNombre() {
        return primerNombre;
    }


    public void setPrimerNombre(String primerNombre) {
        this.primerNombre = primerNombre;
    }


    public String getSegundoNombre() {
        return segundoNombre;
    }


    public void setSegundoNombre(String segundoNombre) {
        this.segundoNombre = segundoNombre;
    }


    public String getPrimerApellido() {
        return primerApellido;
    }


    public void setPrimerApellido(String primerApellido) {
        this.primerApellido = primerApellido;
    }


    public String getSegundoApellido() {
        return segundoApellido;
    }


    public void setSegundoApellido(String segundoApellido) {
        this.segundoApellido = segundoApellido;
    }


}
