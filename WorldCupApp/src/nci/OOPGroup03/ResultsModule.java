/*
 * This module will display the results of played matches for the FIFA world cup 2014
 * It will be controlled by a varible called select which the user sets using the jComboBox.
 * This will toggle the visability of 8 jPanels (one for each group) so the respective panel is visable
 * @johnoshea x13104977
 * 
 * PROGRESS LOG:
 * 
 * Commit 1: Basic layout was established. The main Panels dimensions were agreed upon by the group. 
 *           I'm going to controll the module with a single jComboBox.
 *           The content will be displayed in seperate jPanels. I haven't decided how I'll display info inside the panels yet (ie. labels, text areas etc...).
 * 
 * Commit 2: Didn't actually get any coding done, I just planned out my next commit on paper and read into using the jComboBox.
 *           Fixed a problem in regards to importing the swing layout library.
 * 
 * Commit 3: Added a button and coded the event handeler. (See line 114). On click, this button takes the selected value from the jComboBox.
 *           This value is then stored in the variable String select. The event handler also exicutes a switch statement (written using else if for now) (see line 135).
 *           This statement will toggle the respective panel to visable and the other 7 to invisable.
 * 
 * Commit 4: I decided to remove the Button as Niall suggested I could controll the toggeling entirely from the jComboBox
 *           I created a jPanel to display results for Group A. I designed it using jLables, there is probably a better way to do it.
 *           I'll look into better ways to design the panel, this is just a prototype.
 *           I created the methood Hide() to .setVisible(false) for all panels.
 *           I Added in the code to invoke hide on all the jComboBox options, an the code to show group A when A is selected.         
 * 
 * Commit 5: Filled in the countries in all the groups and created methoods for each group.
 *           Each methood will swapout the text in the labels (see for yourself what I mean).
 *           Changed backgrounds to white.
 * 
 * Commit 6: I agreed with the group that the data needed to be stored outside of the java application.
 *           I decided that it will be stored in .txt files. Each group will have it's own .txt file.
 *           The text file will contain a html table (I like html so I decided to do it this way for simplicity).
 *           As it is now, the text files are stored in a directory called resultsTexts.
 *           They are read in using the Scanner (called io). They will all throw exceptions if they can't find the files but as of now it's working perfectly.
 *           Niall is using a webserver to host .xml files for his module. To keep the project together, I will test my idea (see next line) on my own webserver, but we will ultimatly aim to host everything together on his.
 *           The idea will be to move the text files to Niall's webserver. I will then access them in a similar method used to access local .txt files.
 *           The reason we will host such data on the web server is that it allows us update the data after the user has downloaded the application (eg. as the competition progresses).
 *           A lot of the previous code has been removed (as the output was previously designed using jLabels and the methods A,B,C etc... did completly different things.
 * 
 * Commit 6: TODO: 1. Design the panels to display the results a little better. 
 *                 2. Get the files on the webserver.
 *                 3. Tweak the line "io=new Scanner(new File("resultsTexts/groupA.txt"));" to access a file over http rather than a local file.
 *                 4. Set the fonts (agree on this with group).
 * 
 * Commit 7: TODO: 1. Bug testing and troubleshooting.
 *                 2. Any last font or design changes (agree w/ group).
 *                 3. Bug test entire project (do this as a group).
 */
package nci.OOPGroup03;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author johnoshea
 */
public class ResultsModule extends javax.swing.JPanel {

    //Creates new form ResultsModule
     
    public ResultsModule() {
        initComponents();
    }
    // This Scanner will be used to read from .txt files.
    private Scanner io;
    // The Scanner will store the data it reads into these Strings.
    String outA, outB, outC, outD, outE, outF, outG, outH;
    //There is one of these methods for each group in the World Cup
    //The methood reads the .txt file and populates the respective string.
    //Each string is only populated when it is requested by the user.
    //This prevents unnecissary use of memory and data retrieval accross the network
    public void A(){
                        //opens the file
                        try{io=new Scanner(new File("resultsTexts/groupA.txt"));
                        }
                        catch(Exception e){System.out.println("Couldn't find file");
                        }
                        //reads the file
                        outA = io.nextLine();
                        //closes the file
                        io.close();
                        //populates the respective string
                        outLable.setText(outA);
                        //sets the title string
                        groupString.setText("Group A");
                    }
    public void B(){
                        try{io=new Scanner(new File("resultsTexts/groupB.txt"));
                        }
                        catch(Exception e){System.out.println("Couldn't find file");
                        }
                        outB = io.nextLine();                  
                        io.close();
                        outLable.setText(outB);
                        groupString.setText("Group B");
                    }
    public void C(){
                        try{io=new Scanner(new File("resultsTexts/groupC.txt"));
                        }
                        catch(Exception e){System.out.println("Couldn't find file");
                        }
                        outC = io.nextLine();                  
                        io.close();
                        outLable.setText(outC);
                        groupString.setText("Group C");
                    }
    public void D(){
                        try{io=new Scanner(new File("resultsTexts/groupD.txt"));
                        }
                        catch(Exception e){System.out.println("Couldn't find file");
                        }
                        outD = io.nextLine();                  
                        io.close();
                        outLable.setText(outD);
                        groupString.setText("Group D");
                    }
    public void E(){
                        try{io=new Scanner(new File("resultsTexts/groupE.txt"));
                        }
                        catch(Exception e){System.out.println("Couldn't find file");
                        }
                        outE = io.nextLine();                  
                        io.close();
                        outLable.setText(outE);
                        groupString.setText("Group E");
                    }
    public void F(){
                        try{io=new Scanner(new File("resultsTexts/groupF.txt"));
                        }
                        catch(Exception e){System.out.println("Couldn't find file");
                        }
                        outF = io.nextLine();                  
                        io.close();
                        outLable.setText(outF);
                        groupString.setText("Group F");
                    }
    public void G(){
                        try{io=new Scanner(new File("resultsTexts/groupG.txt"));
                        }
                        catch(Exception e){System.out.println("Couldn't find file");
                        }
                        outG = io.nextLine();                  
                        io.close();
                        outLable.setText(outG);
                        groupString.setText("Group G");
                    }
    public void H(){
                        try{io=new Scanner(new File("resultsTexts/groupH.txt"));
                        }
                        catch(Exception e){System.out.println("Couldn't find file");
                        }
                        outH = io.nextLine();                  
                        io.close();
                        outLable.setText(outH);
                        groupString.setText("Group H");
                    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        aPanel = new javax.swing.JPanel();
        groupString = new javax.swing.JLabel();
        outLable = new javax.swing.JLabel();

        setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Lucida Grande", 1, 32)); // NOI18N
        jLabel1.setText("Results");

        jLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 16)); // NOI18N
        jLabel2.setText("Chose Group");

        jComboBox1.setFont(new java.awt.Font("Lucida Grande", 1, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "A", "B", "C", "D", "E", "F", "G" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        aPanel.setBackground(new java.awt.Color(255, 255, 255));

        groupString.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N

        org.jdesktop.layout.GroupLayout aPanelLayout = new org.jdesktop.layout.GroupLayout(aPanel);
        aPanel.setLayout(aPanelLayout);
        aPanelLayout.setHorizontalGroup(
            aPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(aPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(groupString, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 59, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(aPanelLayout.createSequentialGroup()
                .add(71, 71, 71)
                .add(outLable, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addContainerGap())
        );
        aPanelLayout.setVerticalGroup(
            aPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(aPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(groupString)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(outLable, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 180, Short.MAX_VALUE)
                .addContainerGap())
        );

        org.jdesktop.layout.GroupLayout layout = new org.jdesktop.layout.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(layout.createSequentialGroup()
                        .add(249, 249, 249)
                        .add(jLabel1))
                    .add(layout.createSequentialGroup()
                        .add(201, 201, 201)
                        .add(jLabel2)
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                        .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                    .add(layout.createSequentialGroup()
                        .add(65, 65, 65)
                        .add(aPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(40, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(layout.createSequentialGroup()
                .addContainerGap(43, Short.MAX_VALUE)
                .add(jLabel1)
                .add(18, 18, 18)
                .add(layout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(jLabel2)
                    .add(jComboBox1, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                .add(29, 29, 29)
                .add(aPanel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .add(44, 44, 44))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        //Line 217 (commeneted out) is just for testing (breakpoint 1)
        // jTextField1.setText("Results for Group " + jComboBox1.getSelectedItem().toString());
       String select = (String) jComboBox1.getSelectedItem();
       
            
                
       //NOTE! This will be changed to a 'switch' statement once I am happy everything else in the module is working as intended
       // This selection will toggle the visability of the respective JTextArea to visable = true and toggle the other 5 text areas to visable = false    
       if (select == "A") {System.out.println("Test A successful");
                           A();}
       else if (select == "B") {System.out.println("Test B successful");
                               B();}
       else if (select == "C") {System.out.println("Test C successful");
                               C();}
       else if (select == "D") {System.out.println("Test D successful");
                               D();}
       else if (select == "E") {System.out.println("Test E successful");
                               E();}
       else if (select == "F") {System.out.println("Test F successful");
                               F();}
       else if (select == "G") {System.out.println("Test G successful");
                               G();}
       else if (select == "H") {System.out.println("Test H successful");
                               H();}
       else {System.out.println("Oops! Something went wrong in ResultsModule (breakpoint 2)");}
    }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aPanel;
    private javax.swing.JLabel groupString;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel outLable;
    // End of variables declaration//GEN-END:variables
}
