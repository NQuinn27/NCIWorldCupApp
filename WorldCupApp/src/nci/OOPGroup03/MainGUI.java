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
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.*;
/**
 *
 * @author Niall Quinn
 */
public class MainGUI extends JFrame {
    
    private JPanel viewpnl;
    private JLabel titlelbl;
    private JButton Mod1;
    private JButton Mod2;
    private JButton Mod3;
    private JButton Mod4;
    
    public MainGUI() {
        //Size and location
        setSize(500, 750);
        setLocation(10, 10);
        setTitle("World Cup 2014");
        //create the panel
        
        Image image = null;

        try 
            {image = ImageIO.read(new File("resources/btnBlue.png"));}
        catch (IOException e)
            {e.printStackTrace();}
//                
//         
//        viewpnl = new BackgroundPanel(image);
//        //Set panel layout


        
        viewpnl = new JPanel();
        //set background color
        Color color = new Color(0.152f, 0.58f, 0.0f, 1.0f);
        viewpnl.setBackground(color);
         viewpnl.setLayout(null);
        add(viewpnl);
        
        titlelbl = new JLabel("World Cup App");
        
        ImageIcon buttonIcon = new ImageIcon(image);
        
        Mod1 = new JButton("Module 1");
        Mod2 = new JButton("Module 2");
        Mod3 = new JButton("Module 3");
        Mod4 = new JButton("Module 4");
        
        //setting bounds of objects
        titlelbl.setBounds(50, 10, 400, 30);
        Mod1.setBounds(50, 50, 400, 60);
        Color cMod1 = new Color(0.094f, 0.392f, 0.419f, 0.8f);
        Mod1.setForeground(cMod1);
        
        Mod2.setBounds(50, 120, 400, 60);
        Mod3.setBounds(50, 190, 400, 60);
        Mod4.setBounds(50, 260, 400, 60);
        
        viewpnl.add(titlelbl);
        viewpnl.add(Mod1);
        viewpnl.add(Mod2);
        viewpnl.add(Mod3);
        viewpnl.add(Mod4);
        
        CustomButton cButton = new CustomButton("Test",
                                    new Color(0.094f, 0.392f, 0.419f, 0.8f),
                                    new Color(0.094f, 0.392f, 0.419f, 0.8f),
                                    false);
        cButton.setBounds(50, 400, 400, 60);
        viewpnl.add(cButton);
       
//        Mod1.setIcon(buttonIcon);
//        Mod2.setIcon(buttonIcon);
//        Mod3.setIcon(buttonIcon);
//        Mod4.setIcon(buttonIcon);
    }
}
