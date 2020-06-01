/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import controlador.Buscaminas;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

/**
 *
 * @author sehjud
 */
public class PanelCentral extends JPanel {

    private JButton matriz[][];
    private int ancho, alto;


    public PanelCentral(int nivel) {
        if (nivel == 1) {
            ancho = 8;
            alto = 8;
        } else {
            if (nivel == 2) {
                ancho = alto = 16;
            } else {
                if (nivel == 3) {
                    ancho = 30;
                    alto = 16;
                }
            }
        }
        
        this.setLayout(new GridLayout(alto, ancho));
        matriz = new JButton[alto][ancho];
        
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                matriz[i][j] = new JButton();
                matriz[i][j].setBackground(java.awt.Color.lightGray);
                matriz[i][j].setFont(new Font("arial",Font.BOLD,50));
                matriz[i][j].addActionListener(Buscaminas.cb);
                this.add(matriz[i][j]);

            }
        }

    }

    /**
     * @return the matriz
     */
    public JButton[][] getMatriz() {
        return matriz;
    }

    /**
     * @param matriz the matriz to set
     */
    public void setMatriz(JButton[][] matriz) {
        this.matriz = matriz;
    }

    public int[] botonPresionado(JButton b) {
        int arr[] = new int[2];
        for (int i = 0; i < alto; i++) {
            for (int j = 0; j < ancho; j++) {
                if (b.equals(matriz[i][j])) {
                    arr[0] = i;
                    arr[1] = j;
                    return arr;
                }
            }
        }
        return null;
    }

    public void ocultarBoton(int f, int c, int num) {
        if (num == 0) {
            matriz[f][c].setVisible(false);
        } else {
            switch(num){
                case 1:
                    matriz[f][c].setForeground(java.awt.Color.BLUE);
                    break;
                case 2:
                        matriz[f][c].setForeground(java.awt.Color.GREEN);
                    break;
                case 3:
                        matriz[f][c].setForeground(java.awt.Color.yellow);
                    break;
                case 4:
                        matriz[f][c].setForeground(java.awt.Color.MAGENTA);
                    break;
                case 5:
                        matriz[f][c].setForeground(java.awt.Color.red);
                    break;
                case 6:
                        matriz[f][c].setForeground(java.awt.Color.darkGray);
                    break;
                case 7:
                        matriz[f][c].setForeground(java.awt.Color.cyan);
                    break;
                case 8:
                        matriz[f][c].setForeground(java.awt.Color.black);
                    break; 
            }
            matriz[f][c].setText(num + "");
            
        }
    }

    public void ponerBandera(int f, int c) {
        matriz[f][c].setText("ߛ");
   
    }

    

}
