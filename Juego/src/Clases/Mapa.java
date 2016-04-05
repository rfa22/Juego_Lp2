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
    private final Celda[][] mapa;
    
    public Mapa(int an, int al){
        ancho = an; //18
        alto = al;  //16
        
        //creando mapa
        mapa = new Celda[alto][ancho];
        for(int i=0;i<10;i++){
            mapa[0][i] = new Celda('♥');
        }
        
        for(int i=1; i<alto;i++) //Marco del mapa lado izquierdo
            mapa[i][0] = new Celda('║');
        
        for(int i=1; i<alto;i++) //Marco del mapa lado derecho
            mapa[i][17] = new Celda('║');
        
        for(int j=1; j<ancho-1;j++) //Marco del mapa lado arriba
            mapa[1][j] = new Celda('=');
        
        for(int j=1; j<ancho-1;j++) //Marco del mapa lado abajo
            mapa[15][j] = new Celda('=');
        
        
        for(int i=2; i<alto-1;i++){ //parte del mapa donde se mueve los jugadores
            for(int j=1; j<ancho-1; j++){
                mapa[i][j] = new Celda(' ');                                
            }
        }             
                                        
        for(int j=0; j<ancho; j++) //division de las pantallas de A y B
           mapa[8][j].setContenido('-');
        
//        mapa[3][0].setContenido('A'); //posicionar al personaje A
//        mapa[9][0].setContenido('B'); //posicionar al personaje B               
    }
    
    public Celda getCelda(int i, int j){
        return mapa[i][j];
    }
    
    public void reiniciaMapa(){
//        for(int i=0;i<10;i++){
//            mapa[0][i] = new Celda(' ');
//        }
        
        for(int i=2; i<alto-1;i++){
            for(int j=1; j<ancho-1; j++){
                if(mapa[i][j].getEstado()==1){
                    mapa[i][j].setContenido(mapa[i][j].getContenido());
                }
                else{
                    mapa[i][j].setContenido(' ');
                }
                
            }
        }
        for(int j=0; j<ancho-1; j++) //division de las pantallas de A y B
           mapa[8][j].setContenido('~');
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
