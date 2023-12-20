package compilador;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author Luis David
 */
public class pruebas {
    
    public static void main(String[] args) {
        String cadena = "VFr1 = VF < r2;";
        
        // Buscar la posición del espacio en blanco
        int posicionEspacio = cadena.indexOf(' ');

        // Verificar si se encontró el espacio y extraer la subcadena
        if (posicionEspacio != -1) {
            String VFr1 = cadena.substring(0, posicionEspacio);
            System.out.println("VFr1: " + VFr1);
        } else {
            System.out.println("No se encontró un espacio en blanco en la cadena.");
        }
    }
}