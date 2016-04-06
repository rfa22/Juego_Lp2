/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

import java.util.Random;

/**
 *
 * @author PUCP
 */
public class Mapa {

    private int ancho;
    private int alto;
    private final Celda[][] mapa;

    public Mapa(int an, int al) {
        ancho = an; //18
        alto = al;  //16

        //creando mapa
        mapa = new Celda[alto][ancho];
        for (int i = 0; i < 10; i++) {
            mapa[0][i] = new Celda('♥');
        }

        for (int i = 1; i < alto; i++) //Marco del mapa lado izquierdo
        {
            mapa[i][0] = new Celda('║');
        }

        for (int i = 1; i < alto; i++) //Marco del mapa lado derecho
        {
            mapa[i][17] = new Celda('║');
        }

        for (int j = 1; j < ancho - 1; j++) //Marco del mapa lado arriba
        {
            mapa[1][j] = new Celda('=');
        }

        for (int j = 1; j < ancho - 1; j++) //Marco del mapa lado abajo
        {
            mapa[15][j] = new Celda('=');
        }

        for (int i = 2; i < alto - 1; i++) { //parte del mapa donde se mueve los jugadores
            for (int j = 1; j < ancho - 1; j++) {
                mapa[i][j] = new Celda(' ');
            }
            
        }

        //Crea enemigos                
        int enemigosGenerados = 0, obstaculosGenerados = 0;
        int randomI;
        int randomJ;
        int randomEnemigos;
        int randomObstaculos;
        randomEnemigos = (int)(Math.random()*3) +5;
        randomObstaculos = (int)(Math.random()*1) +3;
        while (true) {
            randomI = (int)(Math.random()*12) + 3;
            randomJ = (int)(Math.random()*13) + 3;            
            if (randomI != 9 && mapa[randomI][randomJ].getContenido() != 'E' && mapa[randomI][randomJ].getContenido() != 'O') {
                enemigosGenerados++;
                Enemigo e = new Enemigo("Minero Malo", 5, randomI, randomJ, 1);
                mapa[randomI][randomJ].setContenido('E');
                mapa[randomI][randomJ].setEstado(3); // 3 es oculto
            }
            if (enemigosGenerados == randomEnemigos) {
                break;
            }                                                
        }
        
        while (true){
            randomI = (int)(Math.random()*12) + 3;
            randomJ = (int)(Math.random()*13) + 3;            
            if (randomI != 9 && mapa[randomI][randomJ].getContenido() != 'E' && mapa[randomI][randomJ].getContenido() != 'O') {
                obstaculosGenerados++;
                Obstaculo e = new Obstaculo("Arbol Caido",randomI, randomJ);
                mapa[randomI][randomJ].setContenido('O');
                mapa[randomI][randomJ].setEstado(1);
            }
            if (obstaculosGenerados == randomObstaculos) {
                break;
            }  
        }

        for (int j = 0; j < ancho; j++) //division de las pantallas de A y B
        {
            mapa[8][j].setContenido('~');
        }
        
        mapa[6][17].setContenido('╬');
        mapa[13][17].setContenido('╬');

//        mapa[3][0].setContenido('A'); //posicionar al personaje A
//        mapa[9][0].setContenido('B'); //posicionar al personaje B               
    }

    public Celda getCelda(int i, int j) {
        return mapa[i][j];
    }

    public void reiniciaMapa() {
//        for(int i=0;i<10;i++){
//            mapa[0][i] = new Celda(' ');
//        }

        for (int i = 2; i < alto - 1; i++) {
            for (int j = 1; j < ancho - 1; j++) {
                if (mapa[i][j].getEstado() == 1) {
                    mapa[i][j].setContenido(mapa[i][j].getContenido());
                } else {
                    mapa[i][j].setContenido(' ');
                }

            }
        }
        for (int j = 0; j < ancho; j++) //division de las pantallas de A y B
        {
            mapa[8][j].setContenido('~');
        }
        
        mapa[6][17].setContenido('╬');
        mapa[13][17].setContenido('╬');
                
    }
    
    public void verificaDireccion(int posE,Personaje p){
        switch(posE){
            case 4:
            {
                mapa[p.getPosI()][p.getPosJ()-1].setEstado(0);
                break;
            }
            case 7:
            {
                mapa[p.getPosI()-1][p.getPosJ()-1].setEstado(0);
                break;
            }
            case 8:
            {
                mapa[p.getPosI()-1][p.getPosJ()].setEstado(0);
                break;
            }
            case 9:
            {
                mapa[p.getPosI()-1][p.getPosJ()+1].setEstado(0);
                break;
            }
            case 6:
            {
                mapa[p.getPosI()][p.getPosJ()+1].setEstado(0);
                break;
            }
            case 3:
            {
                mapa[p.getPosI()+1][p.getPosJ()+1].setEstado(0);
                break;
            }
            case 2:
            {
                mapa[p.getPosI()+1][p.getPosJ()].setEstado(0);
                break;
            }
            case 1:
            {
                mapa[p.getPosI()+1][p.getPosJ()-1].setEstado(0);
                break;
            }
        }
    }

    /**
     * @return the ancho
     */
    public int getAncho() {
        return ancho;
    }

    /**
     * @param ancho the ancho to set
     */
    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    /**
     * @return the alto
     */
    public int getAlto() {
        return alto;
    }

    /**
     * @param alto the alto to set
     */
    public void setAlto(int alto) {
        this.alto = alto;
    }
}
