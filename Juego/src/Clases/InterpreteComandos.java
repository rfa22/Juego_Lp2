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
public class InterpreteComandos {
    
    
    
    public void ejecutaComando(String comando,Personaje jugador){
            switch(comando){
                case "w":
                {
                    moverArriba(jugador);
                    break;
                }
                
                case "a":
                {
                    moverIzquierda(jugador);
                    break;
                }
                
                case "s":
                {
                    moverAbajo(jugador);
                    break;
                }
                
                case "d":
                {
                    moverDerecha(jugador);
                    break;
                }
                case "q": //comando especial
                {
                    comandoEspecialQ(jugador);
                    break;
                }
                case "e": // comando especial
                {
                    comandoEspecialE(jugador);
                    break;
                }
                    
            }    
    }
        
    public void moverArriba(Personaje jugador){
        jugador.setPosI(jugador.getPosI()-1);
                
    }
    
    public void moverIzquierda(Personaje jugador){
        jugador.setPosJ(jugador.getPosJ()-1);
    }
    
    public void moverAbajo(Personaje jugador){
        jugador.setPosI(jugador.getPosI()+1);
    }
    
    public void moverDerecha(Personaje jugador){
        jugador.setPosJ(jugador.getPosJ()+1);
    }
    
    public void comandoEspecialQ(Personaje jugador){
        
    }
    
    public void comandoEspecialE(Personaje jugador){
        
    }
}