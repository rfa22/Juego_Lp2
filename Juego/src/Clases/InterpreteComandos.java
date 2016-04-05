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
    
    
    
    public void ejecutaComando(String comando,Personaje jugadorA,Personaje jugadorB){
            switch(comando){
                case "w":
                {
                    moverArriba(jugadorA);
                    break;
                }
                
                case "a":
                {
                    moverIzquierda(jugadorA);
                    break;
                }
                
                case "s":
                {
                    moverAbajo(jugadorA);
                    break;
                }
                
                case "d":
                {
                    moverDerecha(jugadorA);
                    break;
                }
                case "q": //comando especial
                {
                    comandoEspecialQ(jugadorA);
                    break;
                }
                case "e": // comando especial
                {
                    comandoEspecialE(jugadorA);
                    break;
                }
                
                case "i":
                {
                    moverArriba(jugadorB);
                    break;
                }
                
                case "j":
                {
                    moverIzquierda(jugadorB);
                    break;
                }
                
                case "k":
                {
                    moverAbajo(jugadorB);
                    break;
                }
                
                case "l":
                {
                    moverDerecha(jugadorB);
                    break;
                }
                case "u": //comando especial
                {
                    comandoEspecialQ(jugadorB);
                    break;
                }
                case "o": // comando especial
                {
                    comandoEspecialE(jugadorB);
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