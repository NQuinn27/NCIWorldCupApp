/*
 * WorldCupApp
 * CustomButton.java
 * 
 * Created by Niall Quinn on Feb 28, 2014
 * This Project is created for NCI Object-Oriented Programming Year 1, Group Assignment.
 * Copyright (c) Niall Quinn, Jonathan James Turner, James Walsh, John O'Shea. All rights reserved.
 * 
 */

package nci.OOPGroup03;
import java.awt.Color;
import java.awt.Image;
import javax.swing.*;
import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.EmptyBorder;
import javax.swing.border.LineBorder;
/**
 *
 * @author Niall Quinn
 */
public class CustomButton extends JButton {
    
    private Image image;
    
    public CustomButton(String text, Color foreGround, Color background, boolean opaque) {
        this.setForeground(foreGround);
        this.setBackground(foreGround);
        Border line = new LineBorder(Color.BLACK);
        Border margin = new EmptyBorder(5, 15, 5, 15);
        Border compound = new CompoundBorder(line, margin);
        this.setBorder(compound);
        this.setOpaque(opaque);
    }
    
}
