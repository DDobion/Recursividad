package recursividad;

public class Clase_texto {
    public static String TextoEspejo(String nombre) {
        StringBuilder textoEspejo = new StringBuilder();
        
        // String de derecha a izquierda = en forma de espejo
        for (int i = nombre.length() - 1; i >= 0; i--) {
            textoEspejo.append(nombre.charAt(i));
        }
        
        return textoEspejo.toString();
    }
}
