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
public class Mapa {
    
    private int ancho;
    private int alto;
    private Celda[][] mapa;
    
    public Mapa(int an, int al){
        ancho = an; //16
        alto = al;  //13
        
        //creando mapa
        Celda[][] mapa = new Celda[alto][ancho];
        
        for(int i=0; i<alto; i++)
            for(int j=0; j<ancho; j++)
                mapa[i][j].setContenido(' ');
        
        for(int j=0; j<ancho; j++) //division de las pantallas de A y B
           mapa[7][j].setContenido('-');
        
        mapa[0][3].setContenido('A'); //posicionar al personaje A
        mapa[0][9].setContenido('B'); //posicionar al personaje B               
    }
    
    public Celda getCelda(int i, int j){
        return mapa[i][j];
    }
    
    
   /* public void crearMapa(){
        
    }*/

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
