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

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Niall Quinn
 */
public class MainController {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*
            Initialise the relevant modules here and setup the visuals
        */
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
        live.setBounds(0,0,632,432);
        mainGui.panelsArray[0] = live;
        live.setVisible(false);
        
        ResultsModule results = new ResultsModule();
        mainGui.add(results);
        results.setBounds(0,0,632,432);
        mainGui.panelsArray[1] = results;
        results.setVisible(false);
        
        FixturesModule fixtures = new FixturesModule();
        mainGui.add(fixtures);
        fixtures.setBounds(0,0,632,432);
        mainGui.panelsArray[2] = fixtures;
        fixtures.setVisible(false);
        
        TeamsModule teams = new TeamsModule();
        mainGui.add(teams);
        teams.setBounds(0,0,632,432);
        mainGui.panelsArray[3] = teams;
        teams.setVisible(false);
        
        mainGui.loadUser();
        
    }
}
