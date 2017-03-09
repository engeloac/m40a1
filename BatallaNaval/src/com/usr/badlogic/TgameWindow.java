/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.usr.badlogic;

import com.local.interfaces.TmainWindow;
import com.usr.objects.Tthreads;
import java.awt.BorderLayout;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Rectangle;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class TgameWindow extends javax.swing.JFrame{
    //User declaration
    private static Thread thread;
    private static Thread thread1;
    private static JFrame frame;
    private static JButton jButton1;
    private static JPanel jPanel1;
    //End of user declaration
    
    /*public TgameWindow() {
        setPreferredSize(new Dimension(500,600));
        frame = new JFrame("Jugando");
        jButton1 = new JButton();
        jPanel1 = new JPanel();        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLayout(new BorderLayout());
        frame.add(this, BorderLayout.CENTER);
        
        
        
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        this.add(jButton1);
        frame.pack();
        
        
        frame.setVisible(true);
        frame.setLocationRelativeTo(null);
        frame.add(jButton1);
        thread = new Tthreads("hola");
        thread.start();
        thread = new Tthreads("a");
        thread.start();
    }*/
    public TgameWindow() {
        jButton1 = new JButton();
        jPanel1 = new JPanel();
        
        //jButton1.setLocation(400, 500);
        jButton1.setBounds(100,150,100,30);
        jButton1.setText("hola esto es un boton");
        jButton1.setVisible(true);
        jButton1.setLayout(null);
        jPanel1.setSize(500, 600);
        this.add(jPanel1);
        
        jPanel1.add(jButton1);
        this.setLayout(null);
        this.setVisible(true);
        this.setSize(500, 600);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setLocationRelativeTo(null);
        
    }
    public static void main(String[] args) {  
         java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                
                //new TgameWindow().setVisible(true);
            }
        });
    }
     private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {                                      
        // TODO add your handling code here:
        TmainWindow frame = new TmainWindow();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        //dispose();
    } 
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {                                         
        // TODO add your handling code here:
    }                                        

}
