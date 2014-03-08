/*
 * WorldCupApp
 * WCAMainController.java
 * 
 * Created by Niall Quinn on Feb 28, 2014
 * This Project is created for NCI Object-Oriented Programming Year 1, Group Assignment.
 * Copyright (c) Niall Quinn, Jonathan James Turner, James Walsh, John O'Shea. All rights reserved.
 * 
 */

package nci.OOPGroup03;

/**
 *
 * @author Niall Quinn
 */
public class MainController {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MainWindow mainGui = new MainWindow();
        mainGui.setVisible(true);
        mainGui.initPanelsArray();
        
        /*
        IMPORTANT
        indexes:
        LIVE - 0
        RESULTS - 1
        */
        liveModule live = new liveModule();
        mainGui.add(live);
        live.setBounds(0,0,633,419);
        mainGui.panelsArray[0] = live;
        live.setVisible(false);
        
        ResultsModule results = new ResultsModule();
        mainGui.add(results);
        results.setBounds(0,0,633,419);
        mainGui.panelsArray[1] = results;
        results.setVisible(false);
    }
    
}
