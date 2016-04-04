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

import java.awt.Toolkit;
import javax.swing.*;
import java.awt.*;
public class Ventana extends JFrame {
    public Ventana(){
        Toolkit mipantalla = Toolkit.getDefaultToolkit();
        Dimension tamanioPantalla = mipantalla.getScreenSize();
        int alturaPantalla = tamanioPantalla.height;
        int anchoPantalla = tamanioPantalla.width;
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setTitle("Nombre del juego");
        setBounds(0,0,1024,768);
        Menu laminaMenu = new Menu();
        add(laminaMenu);
    }
}
