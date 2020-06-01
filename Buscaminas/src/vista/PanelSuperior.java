
package vista;

import controlador.Buscaminas;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class PanelSuperior extends JPanel {
    
    private JLabel tiempo;
    private JLabel contadorMinas;
    private JButton funciones;

    public PanelSuperior() {
        tiempo = new JLabel("00:00");
        contadorMinas = new JLabel(Buscaminas.cantMinas+"");
        funciones = new JButton(":)");
        tiempo.setBackground(Color.black);
        tiempo.setForeground(Color.red);
        contadorMinas.setBackground(Color.black);
        contadorMinas.setForeground(Color.red);
        this.setLayout(new GridLayout(1, 3));
        this.add(contadorMinas);
        this.add(funciones);
        this.add(tiempo);
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
    public JLabel getContadorMinas() {
        return contadorMinas;
    }

    /**
     * @param contadorMinas the contadorMinas to set
     */
    public void setContadorMinas(JLabel contadorMinas) {
        this.contadorMinas = contadorMinas;
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
