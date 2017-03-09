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
public class Tthreads extends Thread{
    //User declaration
    private boolean exitMain = false;
    private String msg;
    //End of user declaration
    public Tthreads(String msg) {
        super(msg);
        this.msg = msg;
    }
    @Override
    public void run() {
        
        int i = 0;
        
        while(i < 9) {
            System.out.println(msg);
            try {
                Thread.sleep((long) (.1*1000));
            } catch (Exception e) {
            }
            i++;
        }
        yield();
        
    }
}
