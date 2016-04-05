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
    
    private int estado; // si esta 0(desactivo) se imprime # ,si esta en 1(activado) se imprime el contenido
    private char contenido;
    /*
    VACIO -> ' '
    JUGADOR A -> A
    JUGADOR B -> B
    OBSTACULO -> O
    DUO -> D
    ENEMIGO -> E    
    */

    public Celda(char c){
        contenido = c;
        estado = 0;
    }
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
    
    public void imprimeCelda(){
        System.out.print(getContenido());
    }

    /**
     * @return the estado
     */
    public int getEstado() {
        return estado;
    }

    /**
     * @param estado the estado to set
     */
    public void setEstado(int estado) {
        this.estado = estado;
    }
    
}
