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
        for(int j=0;j<10;j++){
                System.out.print('\t');
            }
        for(int i = 0; i < a.getVida(); i++) {
            m.getCelda(0, i).setContenido('♥');            
            m.getCelda(0, i).imprimeCelda();
        }
        System.out.println("\n");
        
        for(int i = 1; i < fil; i++){
            for(int j=0;j<10;j++){
                System.out.print('\t');
            }
            for (int j = 0; j < col; j++) {
                m.getCelda(i, j).imprimeCelda();
            }
            System.out.println();
        }
        for(int i=0; i<15; i++){
            System.out.println();
        }
    }

    public void imprimeIntro(){
        for(int i=0; i<15; i++){
            System.out.println();
        }
        for(int j=0;j<10;j++){
                System.out.print('\t');
            }        
        System.out.println("LOS MUQUI-AMIGOS");        
    }
    public void imprimeMenu() {
//        for(int i=0; i<25; i++){
//            System.out.println();
//        }
        for(int j=0;j<10;j++){
                System.out.print('\t');
            }
        System.out.println("Elija una opción:");
        for(int j=0;j<10;j++){
                System.out.print('\t');
            }
        System.out.println("1.- Iniciar el juego");
        for(int j=0;j<10;j++){
                System.out.print('\t');
            }
        System.out.println("2.- Salir del juego");
    }
    
    public void imprimeInstrucciones(){
        for(int i=0; i<15; i++){
            System.out.println();
        }
        for(int j=0;j<10;j++){
                System.out.print('\t');
            }
        System.out.println("Instrucciones:");
        for(int j=0;j<10;j++){
                System.out.print('\t');
            }
        System.out.println("Personaje A:");
        for(int j=0;j<10;j++){
                System.out.print('\t');
            }
        System.out.println("Mover hacia arriba: W");
        for(int j=0;j<10;j++){
                System.out.print('\t');
            }
        System.out.println("Mover hacia abajo: S");
        for(int j=0;j<10;j++){
                System.out.print('\t');
            }
        System.out.println("Mover hacia la izquierda: A");
        for(int j=0;j<10;j++){
                System.out.print('\t');
            }
        System.out.println("Mover hacia la derecha: D");
        for(int j=0;j<10;j++){
                System.out.print('\t');
            }
        System.out.println("Movimiento especial 1: Q");
        for(int j=0;j<10;j++){
                System.out.print('\t');
            }
        System.out.println("Movimiento especial 2: E");
        for(int j=0;j<10;j++){
                System.out.print('\t');
            }
        System.out.println("Personaje B:");
        for(int j=0;j<10;j++){
                System.out.print('\t');
            }
        System.out.println("Mover hacia arriba: I");
        for(int j=0;j<10;j++){
                System.out.print('\t');
            }
        System.out.println("Mover hacia abajo: J");
        for(int j=0;j<10;j++){
                System.out.print('\t');
            }
        System.out.println("Mover hacia la izquierda: K");
        for(int j=0;j<10;j++){
                System.out.print('\t');
            }
        System.out.println("Mover hacia la derecha: L");        
        for(int j=0;j<10;j++){
                System.out.print('\t');
            }
        System.out.println("Movimiento especial 1: U");
        for(int j=0;j<10;j++){
                System.out.print('\t');
            }
        System.out.println("Movimiento especial 2: O");
        for(int j=0;j<10;j++){
                System.out.print('\t');
            }
        System.out.println("Pausa/Resumen: B");
    }
    
    public void imprimeCelebracion(){
        for(int i=0; i<15; i++){
            System.out.println();
        }
        for(int j=0;j<10;j++){
                System.out.print('\t');
            }
        System.out.println("        Felicitaciones!!");
        for(int j=0;j<10;j++){
                System.out.print('\t');
            }
        System.out.println("           Ganaste!!");
    }
    
    public void imprimeGameOver(){
        for(int i=0; i<15; i++){
            System.out.println();
        }
        for(int j=0;j<10;j++){
                System.out.print('\t');
            }
        System.out.println("        GAME OVER");
        for(int j=0;j<10;j++){
                System.out.print('\t');
            }
    }
    
}
