/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author alulab14
 */
public class Renderizador {
    
    
    public Renderizador(){
        
    }    
    
    public void imprimeMapa(Mapa m,Personaje a,Personaje b){
        int fil = m.getAlto();
        int col = m.getAncho();
                                                        
        m.getCelda(a.getPosI(), a.getPosJ()).setContenido('A');
        m.getCelda(b.getPosI(), b.getPosJ()).setContenido('B');
        for(int i=0;i<10;i++){
            m.getCelda(0, i).setContenido('♥');
            m.getCelda(0, i).imprimeCelda();
        }
        System.out.println();
        for(int i=1; i<col; i++){
            for(int j=0; j<fil; j++){                           
                m.getCelda(i, j).imprimeCelda();
            }
            System.out.println();
        }                
    }    
}
