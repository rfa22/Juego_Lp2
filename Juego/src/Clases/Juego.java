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
        if(entrada.next().getClass() == String.class){
                limpiaPantalla();
            }
        /*Inicio del bucle principal del juego*/
        while(true){                          
            /**/            
            render.imprimeMenu();            
            Mapa mapa = new Mapa(18,16);            
            int option = entrada.nextInt();
            boolean condicion = true; // condicion de fin de juego
            String nombreA;
            String nombreB;
            String comando;
            switch(option){
                case 1:
                    for(int i=0; i<15; i++){
                        System.out.println();
                    }
                    for(int j=0;j<10;j++){
                        System.out.print('\t');
                    }
                    System.out.print("Ingrese el nombre del jugador A:");
                    nombreA = entrada.next();
                    System.out.println();
                    for(int j=0;j<10;j++){
                       System.out.print('\t');
                    }
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
                        if(comando.equals(".")){
                            limpiaPantalla();                            
                            for(int j=0;j<10;j++){
                                System.out.print('\t');
                            }
                            System.out.println("¿Esta seguro que desea salir?(S/N)");
                            String opcion = entrada.next();
                            if(opcion.equalsIgnoreCase("s")){
                                System.exit(0);
                            }
                            else if(opcion.equalsIgnoreCase("n")){
                                render.imprimeMapa(mapa, jugadorA, jugadorB);
                            }
                        }
                        int enemigosA = jugadorA.verificarEnemigos(mapa);
                        int enemigosB = jugadorB.verificarEnemigos(mapa);
                        interprete.ejecutaComando(comando,jugadorA,jugadorB, mapa,enemigosA,enemigosB);                        
                        if(enemigosA > 0)
                            jugadorB.setVida(jugadorB.getVida() - 1);
                        if(enemigosB > 0)
                            jugadorA.setVida(jugadorA.getVida() - 1);
                        if(!jugadorA.verificaVida()){
                            limpiaPantalla();
                            render.imprimeGameOver();                            
                            break;
                        }
                        if(jugadorA.getEstado() == 0 && jugadorB.getEstado() == 0){
                            limpiaPantalla();
                            render.imprimeCelebracion();
                            break;
                        }
                        limpiaPantalla();
                        mapa.reiniciaMapa();
                        render.imprimeMapa(mapa,jugadorA,jugadorB);                                                
                    }
                    break;
            
                case 2:                    
                    limpiaPantalla();
                    for(int i=0; i<15; i++){
                        System.out.println();
                    }
                    for(int j=0;j<10;j++){
                        System.out.print('\t');
                    }
                    System.out.println("Esta seguro?(S/N)");
                    String resp = entrada.next();
                    resp = resp.toUpperCase();
                    if(resp.equals("S") ){
                        for(int j=0;j<10;j++){
                            System.out.print('\t');
                        }
                        System.out.println("Ha salido del juego");
                        System.exit(0);
                    }
                    else if(resp.equals("N")){
                        limpiaPantalla();
                        break;
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
