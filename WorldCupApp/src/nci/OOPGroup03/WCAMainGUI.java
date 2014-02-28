/*
 * WorldCupApp
 * WCAMainGUI.java
 * 
 * Created by Niall Quinn on Feb 28, 2014
 * This Project is created for NCI Object-Oriented Programming Year 1, Group Assignment.
 * Copyright (c) Niall Quinn, Jonathan James Turner, James Walsh, John O'Shea. All rights reserved.
 * 
 */

package nci.OOPGroup03;
import java.awt.Color;
import javax.swing.*;
/**
 *
 * @author Niall Quinn
 */
public class WCAMainGUI extends JFrame {
    
    private JPanel viewpnl;
    private JLabel titlelbl;
    private JButton Mod1;
    private JButton Mod2;
    private JButton Mod3;
    private JButton Mod4;
    
    public WCAMainGUI() {
        //Size and location
        setSize(500, 500);
        setLocation(10, 10);
        
        //create the panel
        viewpnl = new JPanel();
        //Set panel layout
        viewpnl.setLayout(null);
        //set background color
        viewpnl.setBackground(Color.WHITE);
        
        add(viewpnl);
        
        titlelbl = new JLabel("World Cup App");
        
        Mod1 = new JButton("Module 1");
        Mod2 = new JButton("Module 2");
        Mod3 = new JButton("Module 3");
        Mod4 = new JButton("Module 4");
        
        //setting bounds of objects
        titlelbl.setBounds(50, 10, 400, 30);
        Mod1.setBounds(50, 50, 400, 60);
        Mod2.setBounds(50, 120, 400, 60);
        Mod3.setBounds(50, 190, 400, 60);
        Mod4.setBounds(50, 260, 400, 60);
        
        viewpnl.add(titlelbl);
        viewpnl.add(Mod1);
        viewpnl.add(Mod2);
        viewpnl.add(Mod3);
        viewpnl.add(Mod4);
        
    }
}
