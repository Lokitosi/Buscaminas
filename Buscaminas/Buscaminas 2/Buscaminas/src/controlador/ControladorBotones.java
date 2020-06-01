/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;
import javax.swing.JOptionPane;

/**
 *
 * @author sehjud
 */
public class ControladorBotones implements ActionListener, MouseListener {

    public int tipo =0;

    @Override
    public void actionPerformed(ActionEvent e) {
        // si el click es en el botton de la carita
        if (e.getSource().equals(Buscaminas.ventanita.getPs().getFunciones())) {
            Buscaminas.reiniciar();
                
        } else {
            // obtiene un arreglo ??
            int arr[] = Buscaminas.ventanita.getPc().botonPresionado((JButton) e.getSource());

            if (!Buscaminas.iniciado) {
                Buscaminas.nuevaPartida(arr[1], arr[0], 1);
                Buscaminas.iniciado = true;
                 
            }
            // si el boton que se presiona existe :
            if (arr != null) {
                if ((e.getModifiers() & 4) != 0) {
                    Buscaminas.colocarBandera(arr[0], arr[1]);
                    System.out.println("coloco bandera");
                    Buscaminas.nextLevel();
                } else {
                    if (tipo == 1) {
                        Buscaminas.partida.colocarBandera(arr[0], arr[1]);
                        Buscaminas.nextLevel();
                    } else {
                        Buscaminas.partida.destaparCasilla(arr[1], arr[0]);
                        Buscaminas.nextLevel();
                    }
                }
            }
        }
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        if (e.getButton() == MouseEvent.BUTTON3) {
            tipo = 1;
            System.out.println("modo bandera");
            
        }
        if (e.getButton() == MouseEvent.BUTTON1) {
            tipo = 2;
            System.out.println("Modo Mina");
        }
    }

    @Override
    public void mousePressed(MouseEvent e) {
    }

    @Override
    public void mouseReleased(MouseEvent e) {
    }

    @Override
    public void mouseEntered(MouseEvent e) {

    }

    @Override
    public void mouseExited(MouseEvent e) {

    }

}
