/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juego;

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
        Ventana miVentana = new Ventana();        
        while(true){            
            System.out.println("Elija una opción:");
            System.out.println("1.- Iniciar el juego");
            System.out.println("2.- Salir del juego");
            Scanner entrada = new Scanner(System.in);
            int option = entrada.nextInt();
            switch(option){
                case 1:
                
                    break;
            
                case 2:                    
                    System.out.println("Ha salido del juego");
                    break;
            }
        }
    }
    
}
