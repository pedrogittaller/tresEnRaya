package es.cic.taller.tresEnRaya.clases;

import java.io.*;
import java.util.Arrays;

/**
 *
 * @author pedro
 */
public class Tres_en_raya {
    static char mesa_juego[][] = {{'_','_','_'}, {'_','_','_'}, {'_','_','_'}};
public static void tablero(){
    
        for (int i = 0; i < mesa_juego.length; i++) {
                    for (int j = 0; j < mesa_juego.length; j++) {
                            System.out.print(mesa_juego[i][j]+" ");
                    } 
                     System.out.println("");
                 }}

    public static void main(String[] args) throws IOException {
        InputStreamReader conv = new InputStreamReader(System.in);
        BufferedReader entrada = new BufferedReader(conv);

        String leido;
      int entrada_i;
      int entrada_j;
      
        char p;
        boolean comprueba_ganador;

        

        System.out.println("Este es el juego del tres en raya");
        System.out.println("Comienza el jugador 1. Introduzca posición desde esquina superior derecha");

        comprueba_ganador = false;

        int ocupado[][] = new int[3][3];

        while (comprueba_ganador == false) {

            System.out.println("Jugador1. Introduzca la fila (valores entre 1 y 3).");
            leido = entrada.readLine();
            entrada_i = ((Integer.parseInt(leido)) - 1);
            System.out.println("Jugador1. Introduzca la columna (valores entre 1 y 3).");
            leido = entrada.readLine();
            entrada_j = ((Integer.parseInt(leido)) - 1);
            p = mesa_juego[entrada_i][entrada_j];
            if (p != '_') {
                while (p != '_') {

                    System.out.println("La posición está ocupada. Pruebe con otra posición");
                    System.out.println("Jugador1. Introduzca la fila (valores entre 1 y 3).");
                    leido = entrada.readLine();
                    entrada_i = ((Integer.parseInt(leido)) - 1);
                    System.out.println("Jugador1. Introduzca la columna (valores entre 1 y 3).");
                    leido = entrada.readLine();
                    entrada_j = ((Integer.parseInt(leido)) - 1);
                    p = mesa_juego[entrada_i][entrada_j];
                }
            }
            if (p == '_') {
                mesa_juego[entrada_i][entrada_j] = 'X';
                 System.out.println("");
                System.out.println("Este es el estado del juego");//presentacion de la mesa de juego
                tablero();
                System.out.println("");
                
                ocupado = Jugador1.entrada(mesa_juego);
                comprueba_ganador = tres_en_raya.Ganador.comprueba_ganador(ocupado);

                if (comprueba_ganador == true) {
                    System.out.println("Ha ganado el jugador 1.");
                    break;
                }
            }
            System.out.println("Jugador2. Introduzca la fila (valores entre 1 y 3).");
            leido = entrada.readLine();
            entrada_i = ((Integer.parseInt(leido)) - 1);
            System.out.println("Jugador2. Introduzca la columna (valores entre 1 y 3).");
            leido = entrada.readLine();
            entrada_j = ((Integer.parseInt(leido)) - 1);
            p = mesa_juego[entrada_i][entrada_j];
            if ( p != '_') {
                while (p != '_') {
                    System.out.println("La posición está ocupada. Pruebe con otra posición");
                    System.out.println("Jugador2. Introduzca la fila (valores entre 1 y 3).");
                    leido = entrada.readLine();
                    entrada_i = ((Integer.parseInt(leido)) - 1);
                    System.out.println("Jugador2. Introduzca la columna (valores entre 1 y 3).");
                    leido = entrada.readLine();
                    entrada_j = ((Integer.parseInt(leido)) - 1);
                    p = mesa_juego[entrada_i][entrada_j];
                }
            }
            if (p == '_') {
                mesa_juego[entrada_i][entrada_j] = 'O';
                System.out.println("Este es el estado del juego");//presentacion de la mesa de juego
                System.out.println("");
                tablero();
                System.out.println("");
                ocupado = Jugador2.entrada(mesa_juego);
                comprueba_ganador = tres_en_raya.Ganador.comprueba_ganador(ocupado);
                if (comprueba_ganador == true) {
                    System.out.println("Ha ganado el jugador 2.");
                    break;
                }

            }

        }
    }

}
