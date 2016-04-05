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
    
    public void imprimeMapa(Mapa m){
        int fil = m.getAlto();
        int col = m.getAncho();
        
        for(int i=0; i<fil; i++)
            for(int j=0; j<col; j++)                
                System.out.print(m.getCelda(i, j).getContenido());
            
        
    }
    
}
