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
public class GestorMapas {
    /*Es la clase encargada de gestionar los mapas, es decir, tener la lista de
    mapas que se emplearán en el juego*/
    private Mapa[] mapas;   
    
    public GestorMapas(){
        mapas = new Mapa[4];
    }
    
    public void addMapa(Mapa m){
        mapas[mapas.length] = m;
    }
    
    public Mapa devuelveMapa(int pos){        
        return mapas[pos];
    }
}
