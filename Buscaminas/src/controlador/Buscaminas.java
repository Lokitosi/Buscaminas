
package controlador;

import modelo.Tablero;
import vista.Ventana;


public class Buscaminas {
    
    public static Ventana ventanita;
    public static int cantMinas;
    public static Tablero tablero;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        cantMinas = 99;
        ventanita = new Ventana("Mi Buscaminas");
        tablero = new Tablero(0, 0);
        tablero.imprimirMatriz();
    }
    
}
