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
import java.util.*;
import javax.swing.*;
import java.awt.*;

public class Juego {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        InterpreteComandos interprete = new InterpreteComandos();
        Renderizador render = new Renderizador();            
        render.imprimeIntro();
        while(true){                                                
            if(entrada.next().getClass() == String.class){
                limpiaPantalla();
                render.imprimeMenu();
            }
            Mapa mapa = new Mapa(18,16);            
            int option = entrada.nextInt();
            int turno=1;
            boolean condicion = true; // condicion de fin de juego
            String nombreA;
            String nombreB;
            String comando;
            switch(option){
                case 1:
                    System.out.print("Ingrese el nombre del jugador A:");
                    nombreA = entrada.next();
                    System.out.println();
                    System.out.print("Ingrese el nombre del jugador B:");
                    nombreB = entrada.next();
                    System.out.println();
                    limpiaPantalla();
                    Personaje jugadorA = new Personaje(nombreA,10,4,1);
                    Personaje jugadorB = new Personaje(nombreB,10,12,1);
                    render.imprimeInstrucciones();
                    if(entrada.next().getClass() == String.class){
                        limpiaPantalla();
                    }
                    limpiaPantalla();                    
                    render.imprimeMapa(mapa,jugadorA,jugadorB);                    
                    while(condicion){
                        comando = entrada.next();                        
                        interprete.ejecutaComando(comando,jugadorA,jugadorB);
                        jugadorA.verificarEnemigos(mapa);
                        jugadorB.verificarEnemigos(mapa);
                        limpiaPantalla();
                        mapa.reiniciaMapa();
                        render.imprimeMapa(mapa,jugadorA,jugadorB);                                                
                    }
                    break;
            
                case 2:      
                    System.out.println("Esta seguro?(S/N)");
                    String resp = entrada.next();
                    if(resp.equals("S")){
                        System.out.println("Ha salido del juego");
                        System.exit(0);
                    }
                    else if(resp.equals("N")){
                        limpiaPantalla();
                        render.imprimeMenu();                        
                    }
                    break;
            }
        }
    }
    
    public static void limpiaPantalla(){
        for(int i=0; i<100; i++){
            System.out.println();
        }
    }
    
}
