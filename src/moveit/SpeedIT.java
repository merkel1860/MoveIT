/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moveit;

import java.awt.Dimension;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
//import static moveit.MoveIT.objCircle;

/**
 *
 * @author sonne
 */
public class SpeedIT extends Thread{
    
    ///////////////////////////////////////
    private Dimension dim = new Dimension();      // Surface
    public boolean flagKillThread = false;
    
    ////////////////////////////////////////
    /*
            this is the arrow sense
            UP --> 38
            Down --> 40
            LEFT --> 37
            RIGHT --> 39
    */
    int way;
    ///////////////////////////////////////////////////////////
    public static MoveIT objDaemon; 

    public static MoveIT getDaemon() {
        return objDaemon;
    }

//    public static void setDaemon(MoveIT d) {
//        SpeedIT.objDaemon = d;
//    }
    
    //***********************************************************
    public void run(){
        
        System.out.println(Thread.currentThread().getName());
        while(!flagKillThread){
            System.out.println(Thread.currentThread().getName());
            try {
                    Thread.sleep(1000);
                    System.out.println("Im chillling");
            } catch (InterruptedException ex) {
                Logger.getLogger(SpeedIT.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        System.out.println("It is over!");
    }
    ///////////////////////////////////////////////////////////////////
    public void setRide(Dimension d, int sense){
        this.dim = d;
        this.way = sense;
    }
    ///////////////////////////////////////////////////////////////////

    public boolean isFlagKillThread() {
        return flagKillThread;
    }

    public void setFlagKillThread(boolean flagKillThread) {
        this.flagKillThread = flagKillThread;
    }
    
    ////////////////////////////////////////////////////////////////////

           
    
}
