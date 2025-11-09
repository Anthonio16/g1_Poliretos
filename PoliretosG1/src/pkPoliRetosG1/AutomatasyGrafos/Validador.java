package pkPoliRetosG1.validadorAutomata;

public class Validador {
public void validarCadena(String cadena) {
        boolean tieneMayuscula = false;
        boolean tieneMinuscula = false;
        boolean tieneNumero = false;
        boolean tieneCaracterEspecial = false;
        for (int i = 0; i < cadena.length(); i++) {
            char c = cadena.charAt(i);
            if (c >= 'A' && c <= 'Z') {
                tieneMayuscula = true;
            } else if (c >= 'a' && c <= 'z') {
                tieneMinuscula = true;
            } else if (c >= '0' && c <= '9') {
                tieneNumero = true;
            } else if ("!@#$%^&*()-+".indexOf(c) != -1) {
                tieneCaracterEspecial = true;
            } else {
                System.out.println("Clave invalida: contiene un caracter no permitido");
                return;
            }

        }
        if (tieneMayuscula && tieneMinuscula && tieneNumero && tieneCaracterEspecial) {
            System.out.println("Clave valida");
        } else {
            System.out.println(
                    "Clave invalida: debe contener al menos una mayuscula, una minuscula, un numero y un caracter especial");
        }
    }

}
