/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.usr.objects;

/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class Threads extends Thread{
    public Threads(String msg) {
        super(msg);
    }
    @Override
    public void run() {
        System.out.println("com.usr.badlogic.Threads.run()");
    }
}
