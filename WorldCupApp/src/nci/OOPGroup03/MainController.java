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
        
        mainGui.setUserLabelString("Hello, "+ loadUser());
        
    }
    
    static String loadUser() {
        /*
            Attempt to load a user from the file users.wca
            If file not found, create a new user and write to file
            NOTE: this will fire a method to take user details from the user
            in future builds.
        */
        
        String userName = "";
        WCUser user;
        try {
            FileInputStream in = new FileInputStream("users.wca");
            ObjectInputStream ois = new ObjectInputStream(in);
            user= (WCUser) (ois.readObject());
            System.out.println("User " + user.userName + " found!");
        } catch (IOException | ClassNotFoundException e) {
      //No user?
        //Make a new one
            System.out.println("User not found, creating a new one");
            user = new WCUser("USERNAME");
            try {
                FileOutputStream out = new FileOutputStream("users.wca");
                ObjectOutputStream oos = new ObjectOutputStream(out);
                oos.writeObject(user);
                oos.flush();
            } catch (IOException ex) {
                System.out.println("Problem serializing: " + e);
                return "";
            }
        }
        return user.userName;
    }   
}
