/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.usr.badlogic;

import com.local.interfaces.TmainWindow;


/**
 *
 * @author SirBobby
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TmainWindow frame = new TmainWindow();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
        frame.setTitle("Batalla Naval");
        frame.setResizable(false);/*
        Thread hilo = new Threads("Proceso 1");
        hilo.start();*/
    }
    
}
