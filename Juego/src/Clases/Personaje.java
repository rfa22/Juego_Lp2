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
public class Personaje {
    
    private String nombre;
    private int vida;
    //private int ancho;
    //private int alto;
    private int posI;
    private int posJ;
    private int posIanterior;
    private int posJanterior;
    
    public Personaje(String nombre,int vida,int posI,int posJ){
        this.nombre = nombre;
        //this.alto = alto;
        //this.ancho = ancho;
        this.posI = posI;
        this.posJ = posJ;
        this.vida = vida;
        this.posIanterior = posI;
        this.posJanterior = posJ;
    }
    
    public void verificarEnemigos(Mapa mapa){
        
        if(mapa.getCelda(posI, posJ-1).getContenido() == 'E'){ // W
            vida-=1;
        }
        else if(mapa.getCelda(posI-1, posJ-1).getContenido() == 'E'){ // NW
            vida-=1;
        }
        else if(mapa.getCelda(posI-1, posJ).getContenido() == 'E'){ // N
            vida-=1;
        }
        else if(mapa.getCelda(posI-1, posJ+1).getContenido() == 'E'){ // NE
            vida-=1;
        }
        else if(mapa.getCelda(posI, posJ+1).getContenido() == 'E'){ // E
            vida-=1;
        }
        else if(mapa.getCelda(posI+1, posJ+1).getContenido() == 'E'){ // SE
            vida-=1;
        }
        else if(mapa.getCelda(posI+1, posJ).getContenido() == 'E'){ // S
            vida-=1;
        }
        else if(mapa.getCelda(posI+1, posJ-1).getContenido() == 'E'){ // SW
            vida-=1;
        }
                
    }
    
    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the vida
     */
    public int getVida() {
        return vida;
    }

    /**
     * @param vida the vida to set
     */
    public void setVida(int vida) {
        this.vida = vida;
    }

    /**
     * @return the ancho
     */
//    public int getAncho() {
//        return ancho;
//    }
//
//    /**
//     * @param ancho the ancho to set
//     */
//    public void setAncho(int ancho) {
//        this.ancho = ancho;
//    }
//
//    /**
//     * @return the alto
//     */
//    public int getAlto() {
//        return alto;
//    }
//
//    /**
//     * @param alto the alto to set
//     */
//    public void setAlto(int alto) {
//        this.alto = alto;
//    }

    /**
     * @return the posI
     */
    public int getPosI() {
        return posI;
    }

    /**
     * @param posI the posI to set
     */
    public void setPosI(int posI) {
        this.posI = posI;
    }

    /**
     * @return the posY
     */
    public int getPosJ() {
        return posJ;
    }

    /**
     * @param posJ the posJ to set
     */
    public void setPosJ(int posJ) {
        this.posJ = posJ;
    }

    /**
     * @return the posIanterior
     */
    public int getPosIanterior() {
        return posIanterior;
    }

    /**
     * @param posIanterior the posIanterior to set
     */
    public void setPosIanterior(int posIanterior) {
        this.posIanterior = posIanterior;
    }

    /**
     * @return the posJanterior
     */
    public int getPosJanterior() {
        return posJanterior;
    }

    /**
     * @param posJanterior the posJanterior to set
     */
    public void setPosJanterior(int posJanterior) {
        this.posJanterior = posJanterior;
    }

    
}
