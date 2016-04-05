/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author alulab14
 */
public class Renderizador {

    public Renderizador() {

    }

    public void imprimeMapa(Mapa m, Personaje a, Personaje b) {
        int fil = m.getAlto();
        int col = m.getAncho();

        m.getCelda(a.getPosI(), a.getPosJ()).setContenido('A');
        m.getCelda(b.getPosI(), b.getPosJ()).setContenido('B');
        for (int i = 0; i < 10; i++) {
            m.getCelda(0, i).setContenido('♥');
            m.getCelda(0, i).imprimeCelda();
        }
        System.out.println("\n");
        for (int i = 1; i < col; i++) {
            for (int j = 0; j < fil; j++) {
                m.getCelda(i, j).imprimeCelda();
            }
            System.out.println();
        }
    }

    public void imprimeMenu() {
        System.out.println("Elija una opción:");
        System.out.println("1.- Iniciar el juego");
        System.out.println("2.- Salir del juego");
    }
    
    public void imprimeInstrucciones(){
        System.out.println("Instrucciones:");
        System.out.println("\nPersonaje A:");
        System.out.println("Mover hacia arriba: W");
        System.out.println("Mover hacia abajo: S");
        System.out.println("Mover hacia la izquierda: A");
        System.out.println("Mover hacia la derecha: D");
        System.out.println("Movimiento especial 1: Q");
        System.out.println("Movimiento especial 2: E");
        System.out.println("\nPersonaje B:");
        System.out.println("Mover hacia arriba: I");
        System.out.println("Mover hacia abajo: J");
        System.out.println("Mover hacia la izquierda: K");
        System.out.println("Mover hacia la derecha: L");        
        System.out.println("Movimiento especial 1: U");
        System.out.println("Movimiento especial 2: O");
        System.out.println("\nPausa/Resumen: B");
    }
}
