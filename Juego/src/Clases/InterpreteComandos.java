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
    
    
    
    public void reconoceComando(String comando){
            switch(comando){
                case "w":
                {
                    moverArriba();
                    break;
                }
                
                case "a":
                {
                    moverIzquierda();
                    break;
                }
                
                case "s":
                {
                    moverAbajo();
                    break;
                }
                
                case "d":
                {
                    moverDerecha();
                    break;
                }
                case "q": //comando especial
                {
                    comandoEspecialQ();
                    break;
                }
                case "e": // comando especial
                {
                    comandoEspecialE();
                    break;
                }
                    
            }    
    }
    
    public void moverArriba(){
                
    }
    
    public void moverIzquierda(){
        
    }
    
    public void moverAbajo(){
        
    }
    
    public void moverDerecha(){
        
    }
    
    public void comandoEspecialQ(){
        
    }
    
    public void comandoEspecialE(){
        
    }
}
