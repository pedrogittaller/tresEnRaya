/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cic.taller.tresEnRaya.clases;

/**
 *
 * @author pedro
 */
public class Producto {
    
    static int[][] multiplic(int array1[][], int array2[][]) {

        int arrayx[][] = new int[array1.length][array1.length];
        int producto = 0;

        for (int i = 0; i < array1.length; i++) {
            for (int j = 0; j < array1.length; j++) {
                  producto = (array1[i][j] * array2[i][j]);
                  arrayx[i][j]=producto;
                } 
            }
        return arrayx;
    }
    
}

