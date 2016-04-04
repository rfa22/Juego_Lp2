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

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Menu extends JPanel implements ActionListener{
    JButton inicio = new JButton("Iniciar el juego");
    JButton salida = new JButton("Salir del juego");
    
    public Menu(){
        add(inicio);
        add(salida);
        inicio.addActionListener(this);
        salida.addActionListener(this);
    }
    
    public void actionPerformed(ActionEvent e){
        Object botonPulsado = e.getSource();
        if(botonPulsado == inicio){
            setBackground(Color.BLUE);
        }
        else{
            setBackground(Color.RED);
        }
         
        
    }
}
