package pkPoliRetosG1.validadorAutomata;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Compi01 {
 
public static boolean esNumeroDecimal(String cadena) {
   
    String regex = "^[-+]?(\\d+(\\.\\d*)?|\\.\\d+)$";

    Pattern pattern = Pattern.compile(regex);
    Matcher matcher = pattern.matcher(cadena);
    

    return matcher.matches();
}
}