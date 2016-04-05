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
        ancho = an; //16
        alto = al;  //13
        
        //creando mapa
        mapa = new Celda[ancho][alto];
        for(int i=0;i<10;i++){
            mapa[0][i] = new Celda('♥');
        }
        for(int i=1; i<ancho;i++){
            for(int j=0; j<alto; j++){
                mapa[i][j] = new Celda('#');                                
            }
        }
                                        
        for(int j=0; j<alto; j++) //division de las pantallas de A y B
           mapa[7][j].setContenido('-');
        
//        mapa[3][0].setContenido('A'); //posicionar al personaje A
//        mapa[9][0].setContenido('B'); //posicionar al personaje B               
    }
    
    public Celda getCelda(int i, int j){
        return mapa[i][j];
    }
    
    public void reiniciaMapa(){
//        for(int i=0;i<10;i++){
//            mapa[1][i] = new Celda('♥');
//        }
        for(int i=1; i<ancho;i++){
            for(int j=1; j<alto; j++){
                if(mapa[i][j].getEstado()==1){
                    mapa[i][j].setContenido(mapa[i][j].getContenido());
                }
                else{
                    mapa[i][j].setContenido('#');
                }
            }
        }
        for(int j=0; j<alto; j++) //division de las pantallas de A y B
           mapa[7][j].setContenido('-');
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
