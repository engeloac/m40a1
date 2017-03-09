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
    public void openWindow() {
        
        
    }
    public static void main(String[] args) {
        int i =0;
        TmainWindow frame = new TmainWindow();
        boolean frameWindow = true;
        boolean inGame = true;
        
        while(inGame) {
            if(frameWindow) {
                frame.setLocationRelativeTo(null);
                frame.setVisible(true);
                frame.setTitle("Batalla Naval");
                frame.setResizable(false);
                frameWindow = false;
            }
        }
    }
    
}
