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
    /*Es la clase encargada de validar las acciones ingresadas por teclado (comandos)*/
    public void ejecutaComando(String comando, Personaje jugadorA, Personaje jugadorB, Mapa mapa,int posEA,int posEB) {
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
                comandoEspecialQ(jugadorA, mapa,posEA);
                break;
            }
            case "e": // comando especial
            {
                comandoEspecialE(jugadorA, mapa,posEA);
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
                comandoEspecialU(jugadorB, mapa,posEB);
                break;
            }
            case "o": // comando especial
            {
                comandoEspecialO(jugadorB, mapa,posEB);
                break;
            }
        }
    }
    /*Métodos que ejecutan los movimientos de los personajes*/
    public void moverArriba(Personaje jugador, Mapa mapa) {
        int i = jugador.getPosI() - 1, j = jugador.getPosJ();
        Celda techo = mapa.getCelda(i, j);
        /*Verificación si el movimiento a realizar sigue dentro del mapa,
        no pasa el límite con el espacio del otro jugador y no ha llegado aún a la puerta*/
        if (techo.getContenido() != '=' && techo.getContenido() != '~' && techo.getContenido() != '╬' && techo.getContenido() != 'E' && techo.getContenido() != 'O') {
            jugador.setPosI(jugador.getPosI() - 1);
            jugador.setEstado(1);
        }
        else if(techo.getContenido() == '╬'){
            jugador.setEstado(0);
        }
        if(mapa.getCelda(i-2, j).getEstado() == 3){
            mapa.getCelda(i-2, j).setEstado(1); // 1 es activo (visible)
        }
    }

    public void moverIzquierda(Personaje jugador, Mapa mapa) {
        int i = jugador.getPosI(), j = jugador.getPosJ() - 1;
        Celda techo = mapa.getCelda(i, j);
        if (techo.getContenido() != '║' && techo.getContenido() != '╬' && techo.getContenido() != 'E' && techo.getContenido() != 'O') {
            jugador.setPosJ(jugador.getPosJ() - 1);
            jugador.setEstado(1);
        }
        else if(techo.getContenido() == '╬'){
            jugador.setEstado(0);
        }
        if(mapa.getCelda(i, j-2).getEstado() == 3){
            mapa.getCelda(i, j-2).setEstado(1); // 1 es activo (visible)
        }
    }

    public void moverAbajo(Personaje jugador, Mapa mapa) {
        int i = jugador.getPosI() + 1, j = jugador.getPosJ();
        Celda techo = mapa.getCelda(i, j);
        if ((techo.getContenido() != '=' && techo.getContenido() != '~') && techo.getContenido() != '╬' && techo.getContenido() != 'E' && techo.getContenido() != 'O') {
            jugador.setPosI(jugador.getPosI() + 1);
            jugador.setEstado(1);            
        }        
        else if(techo.getContenido() == '╬'){
            jugador.setEstado(0);
        }
        if(mapa.getCelda(i+2, j).getEstado() == 3){
            mapa.getCelda(i+2, j).setEstado(1); // 1 es activo (visible)
        }
    }

    public void moverDerecha(Personaje jugador, Mapa mapa) {
        int i = jugador.getPosI(), j = jugador.getPosJ() + 1;
        Celda techo = mapa.getCelda(i, j);
        if (techo.getContenido() != '║' && techo.getContenido() != '╬' &&  techo.getContenido() != 'E' && techo.getContenido() != 'O') {
            jugador.setPosJ(jugador.getPosJ() + 1);
            jugador.setEstado(1);
        }
        else if(techo.getContenido() == '╬'){
            jugador.setEstado(0);
        }
        if(mapa.getCelda(i, j+3).getContenido() == 'E'){            
            mapa.getCelda(i, j+3).setEstado(1); // 1 es activo (visible)
            mapa.getCelda(i, j+3).setContenido('E');
        }
    }

    /*Métodos que ejecutan los comandos especiales para cada personaje.
    Ubican al enemigo y lo matan*/
    public void comandoEspecialQ(Personaje jugador, Mapa mapa,int posE) {    
        mapa.verificaDireccion(posE,jugador);
    }

    public void comandoEspecialE(Personaje jugador, Mapa mapa,int posE) {
        mapa.verificaDireccion(posE,jugador);
    }

    public void comandoEspecialU(Personaje jugador, Mapa mapa,int posE) {
        mapa.verificaDireccion(posE,jugador);
    }

    public void comandoEspecialO(Personaje jugador, Mapa mapa,int posE) {
        mapa.verificaDireccion(posE,jugador);
    }
}
