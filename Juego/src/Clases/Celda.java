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
public class Celda {
    
    private char estado; // puede que sea usado para algo (usado,activo,etc)
    private char contenido;
    /*
    VACIO -> ' '
    JUGADOR A -> A
    JUGADOR B -> B
    OBSTACULO -> O
    DUO -> D
    ENEMIGO -> E    
    */

    /**
     * @return the contenido
     */
    public char getContenido() {
        return contenido;
    }

    /**
     * @param contenido the contenido to set
     */
    public void setContenido(char contenido) {
        this.contenido = contenido;
    }
    
    
    
}
