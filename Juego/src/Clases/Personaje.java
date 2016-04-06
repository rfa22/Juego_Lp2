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
    private int estado;
    
    public Personaje(String nombre,int vida,int posI,int posJ){
        this.nombre = nombre;
        //this.alto = alto;
        //this.ancho = ancho;
        this.posI = posI;
        this.posJ = posJ;
        this.vida = vida;
        this.estado=1;
    }
    
    public int verificarEnemigos(Mapa mapa){
        
        if(mapa.getCelda(posI, posJ-1).getContenido() == 'E'){ // W
            vida-=1;            
            return 4;  //ESTO SIGNIFICA QUE LE QUITO VIDA POR LO TANTO FUERA DE ESTE METODO TENDREMOS QUE ACTUALIZAR LA VIDA DE B A -1 TAMBIEN
        }
        else if(mapa.getCelda(posI-1, posJ-1).getContenido() == 'E'){ // NW
            vida-=1;            
            return 7;
        }
        else if(mapa.getCelda(posI-1, posJ).getContenido() == 'E'){ // N
            vida-=1;            
            return 8;
        }
        else if(mapa.getCelda(posI-1, posJ+1).getContenido() == 'E'){ // NE
            vida-=1;            
            return 9;
        }
        else if(mapa.getCelda(posI, posJ+1).getContenido() == 'E'){ // E
            vida-=1;            
            return 6;
        }
        else if(mapa.getCelda(posI+1, posJ+1).getContenido() == 'E'){ // SE
            vida-=1;            
            return 3;
        }
        else if(mapa.getCelda(posI+1, posJ).getContenido() == 'E'){ // S
            vida-=1;            
            return 2;
        }
        else if(mapa.getCelda(posI+1, posJ-1).getContenido() == 'E'){ // SW
            vida-=1;            
            return 1;
        }
        return 0;     
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
    
    public boolean verificaVida(){
        if (this.vida <= 0){
            return false; //MURIÓ
        }
        return true; // SIGUE VIVO
    }
    
}
