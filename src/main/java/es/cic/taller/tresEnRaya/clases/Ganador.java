/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package es.cic.taller.tresEnRaya.clases;

import java.util.Arrays;

/**
 *
 * @author pedro
 */
public class Ganador {
        static boolean comprueba_ganador(int estado[][]) {

        boolean ganador;
        ganador = false;

        int acierto_d1[][] = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int acierto_d2[][] = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int acierto_i1[][] = {{1, 1, 1}, {0, 0, 0}, {0, 0, 0}};
        int acierto_i2[][] = {{0, 0, 0}, {1, 1, 1}, {0, 0, 0}};
        int acierto_i3[][] = {{0, 0, 0}, {0, 0, 0}, {1, 1, 1}};
        int acierto_j1[][] = {{1, 0, 0}, {1, 0, 0}, {1, 0, 0}};
        int acierto_j2[][] = {{0, 1, 0}, {0, 1, 0}, {0, 1, 0}};
        int acierto_j3[][] = {{0, 0, 1}, {0, 0, 1}, {0, 0, 1}};
        int compruebad1[][] = tres_en_raya.Producto.multiplic(estado, acierto_d1);
        int compruebad2[][] = tres_en_raya.Producto.multiplic(estado, acierto_d2);
        int compruebai1[][] = tres_en_raya.Producto.multiplic(estado, acierto_i1);
        int compruebai2[][] = tres_en_raya.Producto.multiplic(estado, acierto_i2);
        int compruebai3[][] = tres_en_raya.Producto.multiplic(estado, acierto_i3);
        int compruebaj1[][] = tres_en_raya.Producto.multiplic(estado, acierto_j1);
        int compruebaj2[][] = tres_en_raya.Producto.multiplic(estado, acierto_j2);
        int compruebaj3[][] = tres_en_raya.Producto.multiplic(estado, acierto_j3);

        if (Arrays.deepEquals(compruebad1, acierto_d1)
                | Arrays.deepEquals(compruebad2, acierto_d2)
                | Arrays.deepEquals(compruebai1, acierto_i1)
                | Arrays.deepEquals(compruebai2, acierto_i2)
                | Arrays.deepEquals(compruebai3, acierto_i3)
                | Arrays.deepEquals(compruebaj1, acierto_j1)
                | Arrays.deepEquals(compruebaj2, acierto_j2)
                | Arrays.deepEquals(compruebaj3, acierto_j3)) {
            ganador = true;

        }
        return ganador;
    }
}

