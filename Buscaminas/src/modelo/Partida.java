/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;



public class Partida {
    Tablero tablero;
    private int nivelDificultad;
    private int banderas;

   
    private int casillasDestapadas;

    public Partida(int c,int f, int nivelDificultad) {
        tablero = new Tablero(c,f);
        this.nivelDificultad = nivelDificultad;
    }
    
    
     public Tablero getTablero() {
        return tablero;
    }

    public void setTablero(Tablero tablero) {
        this.tablero = tablero;
    }
    
}
