/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import java.awt.BorderLayout;
import java.awt.HeadlessException;
import javax.swing.JFrame;
import javax.swing.border.BevelBorder;


/**
 *
 * @author sehjud
 */
public class Ventana extends JFrame{
    
    private PanelSuperior ps;
    private PanelCentral pc;

    public Ventana(String title, int nivel) throws HeadlessException {
        //cosas de la ventana
        super(title);
        this.setBounds(100, 100, 700, 500);
        
        this.setVisible(true);
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        //elementos de la ventana
        ps = new PanelSuperior();
        pc = new PanelCentral(nivel);
        pc.setBorder( new BevelBorder(BevelBorder.LOWERED));
        this.add(ps, BorderLayout.NORTH);
        this.add(pc, BorderLayout.CENTER);
        
    }

    /**
     * @return the ps
     */
    public PanelSuperior getPs() {
        return ps;
    }

    /**
     * @param ps the ps to set
     */
    public void setPs(PanelSuperior ps) {
        this.ps = ps;
    }

    /**
     * @return the pc
     */
    public PanelCentral getPc() {
        return pc;
    }

    /**
     * @param pc the pc to set
     */
    public void setPc(PanelCentral pc) {
        this.pc = pc;
    }
    
    
    
}
