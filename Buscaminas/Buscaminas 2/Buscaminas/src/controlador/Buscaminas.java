/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import javax.swing.JOptionPane;
import modelo.Partida;

import vista.PanelCentral;
import vista.Ventana;

/**
 *
 * @author sehjud
 */
public class Buscaminas {

    public static Ventana ventanita;
    public static int cantBanderas;
    public static int cantCasillas;
    public static int cantMinas;
    public static Partida partida;
    public static PanelCentral panel;
    public static boolean iniciado;
    public static ControladorBotones cb = new ControladorBotones();

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        iniciado = false;
        ventanita = new Ventana("Buscaminas Nivel " + 1, 1);

    }

    public static void Peerdio() {
        JOptionPane.showMessageDialog(ventanita, "Has caido en una mina :(");
        reiniciar();
    }

    public static void nuevaPartida(int c, int f, int nivel) {
        partida = new Partida(c, f, nivel);
    }

    public static void reiniciar() {
        iniciado = false;
        ventanita.setVisible(false);
        ventanita = new Ventana("Buscaminas Nivel " + 1, 1);
    }

    public static void colocarBandera(int f, int c) {
        ventanita.getPc().ponerBandera(f, c);
        ventanita.getPs().setCantBanderas(cantBanderas);
        
    }

    public static void destaparCasilla(int f, int c, int text) {
        ventanita.getPc().ocultarBoton(f, c, text);
        ventanita.getPs().setCantDestapadas(cantCasillas);
        
    }

    public static void nextLevel() {
        int lvl1 = 64;
        int lvl2 = 256;
        int lvl3 = 40;
            // error en panel 
            if ((partida.getCasillasDestapadas() + partida.getBanderas() == lvl1)) {
                JOptionPane.showMessageDialog(null,"has ganado :)");
                nuevaPartida(16,16,2);
            }else{
                System.out.println("en este momento hay: \n"
                        + "casillas destapadas: "+partida.getCasillasDestapadas()
                +"\n Casillas bandera: "+ partida.getBanderas());
            }
          
    }
}
