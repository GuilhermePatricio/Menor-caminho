/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import javax.swing.JLabel;
import GUI.LayoutTerreno;
/**
 *
 * @author Gui
 */
public class Matriz {

    Cores cor = new Cores();
    
    public int[][] preencheMatrizNUM() {

        int[][] matriz = {
            {100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 100, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150},
            {100, 10, 10, 100, 10, 100, 10, 100, 10, 10, 10, 10, 10, 10, 10, 150, 150, 150, 150, 150, 150, 150, 20, 20, 20, 20, 20, 150, 150, 150, 150, 150, 150, 20, 20, 20, 20, 150, 150, 150, 150, 150},
            {100, 10, 10, 100, 10, 10, 10, 100, 10, 100, 10, 10, 10, 10, 10, 10, 150, 150, 150, 150, 150, 20, 20, 20, 20, 20, 20, 20, 150, 150, 150, 150, 20, 20, 20, 20, 20, 20, 150, 150, 150, 150},
            {100, 10, 100, 100, 10, 100, 10, 100, 10, 100, 10, 10, 100, 10, 10, 10, 10, 150, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 150, 150},
            {100, 10, 10, 10, 10, 100, 10, 100, 10, 100, 10, 10, 100, 10, 10, 10, 10, 150, 20, 150, 150, 20, 20, 20, 20, 20, 20, 20, 150, 150, 150, 150, 20, 20, 20, 20, 20, 20, 150, 150, 150, 150},
            {100, 10, 100, 100, 10, 100, 10, 100, 10, 100, 10, 100, 100, 100, 10, 10, 10, 150, 20, 150, 150, 150, 20, 20, 20, 20, 20, 150, 150, 150, 150, 180, 150, 20, 20, 20, 20, 150, 180, 150, 150, 150},
            {100, 10, 100, 100, 10, 100, 10, 10, 10, 100, 10, 10, 10, 10, 10, 10, 10, 150, 20, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 180, 150, 150, 150, 150, 150, 150, 180, 150, 150, 150},
            {100, 10, 100, 100, 100, 100, 10, 100, 100, 100, 10, 10, 10, 10, 10, 10, 10, 150, 20, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 180, 150, 150, 150, 150, 150, 150, 180, 150, 10, 150},
            {100, 10, 10, 100, 10, 10, 10, 10, 10, 100, 10, 10, 180, 10, 10, 10, 10, 150, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 20, 150, 150, 180, 150, 150, 150, 150, 150, 150, 180, 150, 10, 150},
            {100, 100, 100, 100, 10, 100, 100, 100, 10, 10, 10, 180, 180, 180, 10, 10, 10, 150, 20, 150, 150, 150, 150, 150, 20, 150, 150, 150, 20, 150, 150, 180, 150, 150, 150, 150, 150, 150, 180, 150, 10, 150},
            {100, 10, 10, 100, 10, 10, 10, 10, 10, 10, 180, 180, 180, 180, 180, 10, 10, 150, 150, 150, 100, 100, 100, 150, 150, 150, 100, 100, 100, 100, 100, 180, 10, 10, 150, 150, 10, 10, 180, 10, 10, 150},
            {100, 10, 10, 100, 10, 10, 100, 10, 10, 10, 10, 180, 180, 180, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 180, 180, 180, 180, 180, 180, 180, 180, 180, 10, 10, 150},
            {100, 10, 10, 100, 10, 10, 100, 10, 10, 10, 10, 10, 180, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 180, 10, 10, 100, 10, 10, 10, 10, 10, 100, 10, 150},
            {100, 10, 10, 100, 10, 10, 100, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 100, 100, 100, 10, 10, 10, 100, 100, 100, 100, 10, 10, 10, 180, 10, 10, 10, 10, 10, 10, 100, 10, 100, 10, 150},
            {100, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 180, 10, 100, 10, 100, 10, 100, 100, 10, 100, 10, 150},
            {100, 10, 100, 100, 100, 100, 100, 10, 100, 100, 100, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 180, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 150},
            {100, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 180, 180, 180, 180, 180, 180, 180, 180, 180, 180, 10, 10, 10, 10, 10, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150},
            {100, 10, 10, 10, 10, 10, 10, 10, 10, 180, 10, 10, 100, 10, 100, 10, 10, 180, 10, 10, 10, 10, 10, 10, 10, 10, 180, 10, 10, 10, 180, 10, 150, 20, 20, 20, 20, 20, 20, 20, 20, 150},
            {100, 10, 100, 10, 10, 100, 10, 10, 10, 180, 10, 10, 10, 10, 10, 10, 10, 180, 10, 100, 10, 10, 10, 10, 100, 10, 180, 180, 180, 180, 180, 10, 150, 20, 150, 20, 20, 150, 20, 20, 20, 150},
            {100, 10, 100, 10, 10, 100, 10, 10, 10, 180, 10, 10, 100, 10, 100, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 180, 10, 10, 10, 10, 10, 150, 20, 150, 150, 150, 150, 150, 150, 150, 150},
            {100, 10, 100, 10, 10, 100, 10, 10, 10, 180, 10, 10, 10, 10, 10, 10, 10, 180, 10, 10, 10, 10, 10, 10, 10, 10, 180, 10, 10, 10, 150, 10, 150, 20, 20, 20, 20, 20, 20, 20, 20, 150},
            {100, 10, 100, 10, 10, 100, 10, 10, 10, 180, 10, 100, 100, 100, 100, 10, 10, 180, 10, 100, 10, 10, 10, 10, 100, 10, 10, 10, 10, 10, 150, 10, 150, 20, 150, 150, 150, 150, 20, 150, 150, 150},
            {100, 10, 10, 10, 10, 10, 10, 10, 10, 180, 10, 10, 10, 10, 10, 10, 10, 180, 10, 10, 10, 10, 10, 10, 10, 10, 180, 10, 150, 10, 150, 10, 150, 20, 20, 20, 20, 20, 20, 20, 20, 150},
            {100, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 100, 100, 100, 100, 10, 10, 180, 180, 180, 180, 10, 10, 180, 180, 180, 180, 10, 150, 10, 150, 10, 150, 150, 150, 20, 20, 150, 150, 150, 150, 150},
            {100, 100, 100, 100, 100, 100, 100, 10, 10, 100, 100, 100, 100, 100, 100, 100, 100, 100, 10, 10, 10, 10, 10, 10, 10, 10, 180, 10, 150, 10, 150, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 150},
            {100, 100, 100, 100, 100, 100, 10, 10, 100, 100, 100, 100, 100, 10, 100, 100, 100, 100, 10, 100, 100, 100, 10, 10, 10, 10, 180, 10, 150, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 150},
            {100, 10, 100, 10, 100, 10, 10, 10, 100, 100, 100, 100, 10, 10, 10, 100, 100, 100, 10, 100, 100, 100, 10, 10, 10, 10, 180, 10, 150, 10, 10, 10, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150},
            {150, 10, 10, 10, 100, 10, 10, 10, 100, 100, 100, 10, 10, 10, 10, 10, 100, 100, 10, 10, 10, 10, 10, 10, 10, 10, 180, 10, 10, 10, 10, 10, 10, 10, 10, 150, 10, 10, 10, 10, 10, 150},
            {150, 10, 10, 10, 100, 10, 10, 10, 100, 100, 100, 100, 10, 10, 10, 100, 100, 100, 10, 100, 10, 10, 10, 10, 10, 10, 180, 10, 10, 10, 10, 10, 10, 10, 10, 150, 10, 10, 10, 10, 10, 150},
            {150, 10, 10, 10, 10, 10, 10, 10, 10, 100, 100, 100, 100, 10, 100, 100, 100, 10, 10, 100, 10, 10, 10, 10, 10, 10, 180, 180, 180, 10, 180, 180, 180, 180, 10, 150, 10, 150, 150, 150, 150, 150},
            {150, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 180, 10, 10, 10, 10, 10, 10, 10, 150},
            {150, 150, 150, 150, 150, 150, 150, 150, 150, 10, 10, 10, 10, 150, 150, 150, 150, 150, 150, 150, 10, 10, 150, 150, 150, 150, 10, 10, 10, 10, 10, 10, 10, 180, 150, 150, 150, 150, 150, 150, 10, 150},
            {150, 20, 20, 20, 20, 20, 20, 20, 150, 10, 10, 10, 10, 150, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 150, 10, 10, 10, 10, 10, 10, 10, 180, 150, 150, 150, 150, 150, 150, 150, 150},
            {150, 20, 150, 150, 20, 20, 20, 20, 150, 10, 10, 10, 10, 150, 10, 10, 10, 10, 10, 10, 10, 10, 100, 10, 10, 150, 10, 10, 180, 180, 180, 180, 180, 180, 180, 180, 150, 150, 180, 180, 180, 150},
            {150, 20, 150, 150, 20, 20, 20, 20, 150, 10, 10, 10, 10, 150, 10, 100, 10, 10, 180, 180, 10, 10, 100, 10, 10, 150, 10, 10, 180, 180, 150, 180, 180, 180, 180, 180, 150, 150, 180, 180, 180, 150},
            {150, 20, 20, 20, 20, 20, 20, 20, 150, 10, 10, 150, 10, 150, 10, 10, 10, 10, 180, 180, 10, 10, 100, 10, 10, 150, 10, 10, 180, 180, 180, 180, 150, 150, 180, 180, 150, 150, 180, 180, 180, 150},
            {150, 20, 20, 20, 20, 20, 20, 20, 150, 10, 10, 150, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 150, 10, 10, 180, 180, 180, 180, 150, 150, 180, 180, 150, 150, 180, 180, 180, 150},
            {150, 20, 20, 20, 20, 20, 20, 150, 150, 150, 150, 150, 10, 10, 100, 10, 10, 10, 10, 10, 100, 100, 100, 10, 10, 150, 10, 10, 180, 180, 180, 180, 180, 180, 180, 180, 150, 150, 180, 180, 180, 150},
            {150, 20, 20, 20, 20, 20, 20, 20, 20, 150, 150, 150, 10, 10, 100, 10, 180, 180, 180, 10, 10, 100, 10, 10, 10, 150, 10, 10, 180, 180, 180, 180, 180, 180, 180, 180, 150, 150, 180, 180, 180, 150},
            {150, 20, 20, 20, 20, 20, 20, 20, 20, 150, 150, 150, 10, 10, 100, 10, 10, 10, 10, 10, 10, 100, 10, 10, 10, 150, 10, 10, 180, 180, 180, 180, 180, 180, 180, 180, 180, 180, 180, 180, 180, 150},
            {150, 20, 20, 20, 20, 20, 20, 20, 20, 20, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 150, 150, 150, 180, 180, 180, 180, 180, 180, 180, 180, 180, 180, 180, 180, 180, 150},
            {150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150, 150}

        };

        return matriz;
    }

    public JLabel[][] converteMatriz(int matrizNUM[][], JLabel mapa[][]) {

        for (int l = 0; l < matrizNUM.length; l++) {
            for (int c = 0; c < matrizNUM.length; c++) {
                LayoutTerreno terreno = new LayoutTerreno();
                mapa[l][c] = terreno;
                switch (matrizNUM[l][c]) {
                    case 10:
                        mapa[l][c].setBackground(cor.getVerdeGrama());
                        break;
                    case 20:
                        mapa[l][c].setBackground(cor.getMarromAreia());
                        break;
                    case 100:
                        mapa[l][c].setBackground(cor.getVerdeFloresta());
                        break;
                    case 150:
                        mapa[l][c].setBackground(cor.getMarromMontanha());
                        break;
                    case 180:
                        mapa[l][c].setBackground(cor.getAzulAgua());
                        break;
                    default:
                        break;
                }
            }
        }
        return mapa;
    }

    public int[][] modificaTerreno(int matrizNUM[][], int linha, int coluna, int terreno) {
        matrizNUM[linha][coluna] = terreno;
        return matrizNUM;
    }

}
