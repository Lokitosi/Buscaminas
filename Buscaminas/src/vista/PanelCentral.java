
package vista;

import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JPanel;


public class PanelCentral extends JPanel {
    
    JButton matriz[][];

    public PanelCentral() {
        this.setLayout(new GridLayout(16, 30));
        matriz = new JButton[16][30];
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 30; j++) {
                matriz[i][j] = new JButton();
                matriz[i][j].setText("a");
                this.add(matriz[i][j]);
            }
        }
        
    }
    
    
    
}
