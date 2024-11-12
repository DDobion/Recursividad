package recursividad;

import java.util.Scanner;

public class Recursividad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un texto:");
        String texto = scanner.nextLine();
        
        String Espejo = Clase_texto.TextoEspejo(texto);
        
        System.out.println("Texto en forma de espejo: " + Espejo);
    }
    
}
