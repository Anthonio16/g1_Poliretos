package pkPoliRetosG1.validadorAutomata;

public class Compi03 {


    public void validarPalabraReservada(String cadena) {
        for (int i = 0; i < cadena.length(); i++) {
            if (cadena.equals("for") || cadena.equals("for ") || cadena.equals("ifelse") ||
                    cadena.equals("ifelse ") || cadena.equals("else")
                    || cadena.equals("if") || cadena.equals("if ") || cadena.equals("else") || cadena.equals("else ")
                    || cadena.equals("foreach") || cadena.equals("foreach ")) {

            } else {
                System.out.println("No existe esa palabra: ");
                return;
            }
        }
        System.out.println("La palabra reservada es:" + cadena);

    }
}
