/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.usr.badlogic;

import com.usr.objects.Threads;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import javax.swing.JFrame;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class TgameWindow extends Canvas{
    //User declaration
    private static Thread thread;
    private static JFrame frame;
    //End of user declaration
    
    public TgameWindow() {
        setPreferredSize(new Dimension(500,600));
        frame = new JFrame("Jugando");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        frame.add(this, BorderLayout.CENTER);
        frame.pack();
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        thread = new Threads("hola");
        thread.start();
    }
    public void main(String[] args) {
        
        
    }
    
}
