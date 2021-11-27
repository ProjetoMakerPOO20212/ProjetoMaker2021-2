/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetomaker;

/**
 *
 * @author Artur de Faria
 */
public class test {

    public static void main(String[] args) {
        int[][] aux = new int[4][4];
        aux[0][0] = 1;
        aux[0][1] = 0;
        aux[0][2] = 0;
        aux[0][3] = 1;
        
        aux[1][0] = 0;
        aux[1][1] = 1;
        aux[1][2] = 0;
        aux[1][3] = 0;
        
        aux[2][0] = 0;
        aux[2][1] = 0;
        aux[2][2] = 1;
        aux[2][3] = 0;
        
        aux[3][0] = 1;
        aux[3][1] = 0;
        aux[3][2] = 0;
        aux[3][3] = 1;
        
        int[] qtd = new int[4];
        
        //for (int i = 0; i < 4; i++) {
            
            for (int j = 0; j < 4; j++) {
                qtd[j]=0;
                for (int k = 0; k < 4; k++) {
                    qtd[j]+= aux[j][k];
                }
                System.out.println(qtd[j]);
            }
            
        //}
        
    }
}
