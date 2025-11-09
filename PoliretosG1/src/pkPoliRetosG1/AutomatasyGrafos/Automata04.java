package pkPoliRetosG1.validadorAutomata;

public class Automata04 {
    // automata 1+|0+1*

    final int e = -10;

    int[][] mt = {
      
        {  e ,  1  },
        {  2 ,  1  }, 
        {  2 ,  3  }, 
        {  e ,  3  },  
    };

    public int obtenerColumna(char c) {
        return switch (c) {
            case '0' -> 0;
            case '1' -> 1;
            default -> -1; 
        };
    }


    public boolean validarCadena(String cadena) {
    
        if (cadena.isEmpty()) {
            return false;
        }

        int estadoActual = 0; 

       
        for (int i = 0; i < cadena.length(); i++) {
            char simbolo = cadena.charAt(i);
            
          
            int columna = obtenerColumna(simbolo);

            
            if (columna == -1) {
                return false; 
            }

           
            estadoActual = mt[estadoActual][columna];

           
            if (estadoActual == e) {
                return false; 
            }
        }

        return (estadoActual == 2 || estadoActual == 3);
    }
}