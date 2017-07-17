package es.cic.taller.tresEnRaya.clases;

/**
 *
 * @author pedro
 */
public class Jugador2 {

    static int[][] entrada(char mesa[][]) {
        int ocupado;
     //   ocupado = 0;
        int[][] jugador2 = new int[mesa.length][mesa.length];

        for (int i = 0; i < mesa.length; i++) {
            for (int j = 0; j < mesa.length; j++) {
                if ((mesa[i][j] == 'O')) {
                    ocupado = 1;
                }else {
                ocupado = 0;
                }
                jugador2[i][j] = ocupado;
            }
        }
        return jugador2;
    }
}
