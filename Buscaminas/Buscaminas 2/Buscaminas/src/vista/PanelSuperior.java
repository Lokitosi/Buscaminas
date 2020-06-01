/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Buscaminas;
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author sehjud
 */
public class PanelSuperior extends JPanel {
    
    private JLabel tiempo;
    public JLabel contadorBanderas;
    public JLabel contadorCasillas;
    private JButton funciones;
    public JButton tipoClick;

    public PanelSuperior() {
        tipoClick = new JButton("flag");
        tipoClick.addMouseListener(Buscaminas.cb);
        
        
        funciones = new JButton(":)");
        funciones.addActionListener(Buscaminas.cb);
        
        tiempo = new JLabel("00:00");
        tiempo.setBackground(Color.black);
        tiempo.setOpaque(true);
        tiempo.setForeground(Color.red);
        
        contadorBanderas = new JLabel("Banderas: "+Buscaminas.cantBanderas+"");
        contadorBanderas.setBackground(Color.DARK_GRAY);
        contadorBanderas.setOpaque(true);
        contadorBanderas.setForeground(Color.red);
        
        contadorCasillas = new JLabel("casillas restantes : "+Buscaminas.cantCasillas);
        contadorCasillas.setBackground(Color.DARK_GRAY);
        contadorCasillas.setOpaque(true);
        contadorCasillas.setForeground(Color.red);
        
        this.setLayout(new GridLayout(1, 5));
        this.add(contadorBanderas);
        this.add(contadorCasillas);
        this.add(funciones);
        this.add(tipoClick);
        this.add(tiempo);
        

        
    }
    public void setCantBanderas(int c){
        contadorBanderas.setText("Banderas: "+ (1+c));
    }
    
    public void setCantDestapadas(int d){
        contadorCasillas.setText("Casillas: "+d+"");
    }
    
    /**
     * @return the tiempo
     */
    public JLabel getTiempo() {
        return tiempo;
    }

    /**
     * @param tiempo the tiempo to set
     */
    public void setTiempo(JLabel tiempo) {
        this.tiempo = tiempo;
    }

    /**
     * @return the contadorMinas
     */

    public JLabel getContadorCasillas() {
        return contadorCasillas;
    }

    public void setContadorCasillas(JLabel contadorCasillas) {
        this.contadorCasillas = contadorCasillas;
    }

 

    /**
     * @return the funciones
     */
    public JButton getFunciones() {
        return funciones;
    }

    /**
     * @param funciones the funciones to set
     */
    public void setFunciones(JButton funciones) {
        this.funciones = funciones;
    }
    
}
