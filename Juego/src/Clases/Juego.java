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
            String nombre;
            switch(option){
                case 1:
                    System.out.println("Ingrese su nombre:");
                    nombre = entrada.nextLine();
                    render.imprimeMapa(mapa);
                    
                    break;
            
                case 2:                    
                    System.out.println("Ha salido del juego");
                    System.exit(0);
                    break;
            }
        }
    }
    
}
