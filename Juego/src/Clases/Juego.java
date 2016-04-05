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
        while(true){            
            System.out.println("Elija una opción:");
            System.out.println("1.- Iniciar el juego");
            System.out.println("2.- Salir del juego");
            Scanner entrada = new Scanner(System.in);
            InterpreteComandos interprete = new InterpreteComandos();
            Renderizador render = new Renderizador();            
            Mapa mapa = new Mapa();
            int option = entrada.nextInt();
            boolean condicion = true; // condicion de fin de juego
            String nombreA;
            String nombreB;
            switch(option){
                case 1:
                    System.out.println("Ingrese el nombre del jugador A:");
                    nombreA = entrada.nextLine();
                    System.out.println("Ingrese el nombre del jugador B:");
                    nombreB = entrada.nextLine();
                    limpiaPantalla();
                    render.imprimeMapa(mapa);
                    while(condicion){
                        System.out.println("Turno del jugador A");
                    }
                    break;
            
                case 2:                    
                    System.out.println("Ha salido del juego");
                    System.exit(0);
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
