
package modelo;

import controlador.Buscaminas;
import java.util.Random;

/**
 *
 * @author sehjud
 */
public class Tablero {
    
    private int tab[][];

    public Tablero(int x, int y) {
        tab = new int[16][30];
        Random r = new Random(System.currentTimeMillis());
        int contador=0;
        //colocar minas 
        while(contador<Buscaminas.cantMinas){
            int mx, my;
            mx = r.nextInt(30);
            my = r.nextInt(16);
            if(mx!=x&&my!=y&&tab[my][mx]!=9){
                tab[my][mx] = 9;
                contador++;
                // fin colocar minas 
                for (int i = -1; i < 2; i++) {
                    for (int j = -1; j < 2; j++) {
                        if(i!=0||j!=0){
                            try{
                            if(tab[my+i][mx+j]!=9)
                                tab[my+i][mx+j]++;
                            }catch(ArrayIndexOutOfBoundsException e){
                                //no hacer nada
                            }
                        }
                    }
                }
            }
            
            
        }
    }
    
    public void imprimirMatriz(){
        for (int i = 0; i < 16; i++) {
            for (int j = 0; j < 30; j++) {
                System.out.print(tab[i][j]+" ");
            }
            System.out.println("");
        }
    }
    
    

    /**
     * @return the tab
     */
    public int[][] getTab() {
        return tab;
    }

    /**
     * @param tab the tab to set
     */
    public void setTab(int[][] tab) {
        this.tab = tab;
    }
    
    
    
}
