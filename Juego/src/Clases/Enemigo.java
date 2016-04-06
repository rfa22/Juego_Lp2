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
public class Enemigo extends Personaje{
    private int dano;
    /*Constructor del Objeto Enemigo: La clase Enemigo hereda de Personaje*/
    public Enemigo(String nombre,int vida,int posI,int posJ,int dano){
        super(nombre,vida,posI,posJ);
        this.dano = dano;
    }
    
}
