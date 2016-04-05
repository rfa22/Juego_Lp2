/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author PUCP
 */
public class InterpreteComandos {

    public void ejecutaComando(String comando, Personaje jugadorA, Personaje jugadorB, Mapa mapa) {
        switch (comando) {
            case "w": {
                moverArriba(jugadorA, mapa);
                break;
            }

            case "a": {
                moverIzquierda(jugadorA, mapa);
                break;
            }

            case "s": {
                moverAbajo(jugadorA, mapa);
                break;
            }

            case "d": {
                moverDerecha(jugadorA, mapa);
                break;
            }
            case "q": //comando especial
            {
                comandoEspecialQ(jugadorA, mapa);
                break;
            }
            case "e": // comando especial
            {
                comandoEspecialE(jugadorA, mapa);
                break;
            }

            case "i": {
                moverArriba(jugadorB, mapa);
                break;
            }

            case "j": {
                moverIzquierda(jugadorB, mapa);
                break;
            }

            case "k": {
                moverAbajo(jugadorB, mapa);
                break;
            }

            case "l": {
                moverDerecha(jugadorB, mapa);
                break;
            }
            case "u": //comando especial
            {
                comandoEspecialQ(jugadorB, mapa);
                break;
            }
            case "o": // comando especial
            {
                comandoEspecialE(jugadorB, mapa);
                break;
            }
        }
    }

    public void moverArriba(Personaje jugador, Mapa mapa) {
        int i = jugador.getPosI() - 1, j = jugador.getPosJ();
        Celda techo = mapa.getCelda(i, j);
        if (techo.getContenido() != '=') {
            jugador.setPosI(jugador.getPosI() - 1);
        }
    }

    public void moverIzquierda(Personaje jugador, Mapa mapa) {
        int i = jugador.getPosI(), j = jugador.getPosJ() - 1;
        Celda techo = mapa.getCelda(i, j);
        if (techo.getContenido() != '║') {
            jugador.setPosJ(jugador.getPosJ() - 1);
        }
    }

    public void moverAbajo(Personaje jugador, Mapa mapa) {
        int i = jugador.getPosI() + 1, j = jugador.getPosJ();
        Celda techo = mapa.getCelda(i, j);
        if (techo.getContenido() != '=') {
            jugador.setPosI(jugador.getPosI() + 1);
        }
    }

    public void moverDerecha(Personaje jugador, Mapa mapa) {
        int i = jugador.getPosI(), j = jugador.getPosJ() + 1;
        Celda techo = mapa.getCelda(i, j);
        if (techo.getContenido() != '║') {
            jugador.setPosJ(jugador.getPosJ() + 1);
        }
    }

    public void comandoEspecialQ(Personaje jugador, Mapa mapa) {

    }

    public void comandoEspecialE(Personaje jugador, Mapa mapa) {

    }
}
