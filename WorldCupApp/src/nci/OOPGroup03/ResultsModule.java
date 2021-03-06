/*
 * WorldCupApp
 * resultsModule.java
 * 
 * This module will display the results of played matches for the FIFA world cup 2014
 * It will be controlled by a varible called select which the user sets using the jComboBox.
 * This will control which of the 8 .txt files to be read in from Nialls webserver.
 * Each .txt file will have a string of HTML that will construct a table on the outout jPannel.
 * 
 * Created by @johnoshea x13104977
 * 
 * PROGRESS LOG:
 * NOTE: I changed my methods a lot during the project, and I mean A LOT.
 *       So part of the progress log may not make sense until you read the full thing. (ie. it references bits of code that I've replaced).
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
 * Commit 7: The files were uploaded to the webserver.
 *           The url to each file will be created as a URL type object.
 *           The Buffered Reader will then read the stream from the URL.
 *           This will be stored in the respective string.
 *           The string will be plugged into the jLabel similarly to how it was when we were using local files. (see the previous commit).          
 * 
 * Commit 8: TODO: 1. Bug testing and troubleshooting.
 *                 2. Any last font or design changes (agree w/ group).
 *                 3. Bug test entire project (do this as a group).
 * 
 * Commit 9: TODO:  Chances are I won't get around to doing this, but I'd like to add a loading bar to the module.
 *                  This bar would be based on the size of the .txt file as it's loaded in from the webserver.
 *                  It's really not necissary as the files we're loading in are text strings (couple of bytes each).
 *                  It might just look nice though, and would provide some minorly useful information (eg. if a .txt file has been corupted from a certian point onwards etc...)
 *                  
 */
package nci.OOPGroup03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;

/**
 * @author johnoshea
 */
public class ResultsModule extends javax.swing.JPanel {

    //Creates new form ResultsModule
     
    public ResultsModule() {
        initComponents();
        
    }
    
    //This buffer will be used to read the txt files stored on the webserver
    private BufferedReader in;
    //It will put results into these variables of type String
    String outA, outB, outC, outD, outE, outF, outG, outH;
    
    //There is one of these methods for each group in the World Cup
    //The methood reads the .txt file and populates the respective string.
    //Each string is only populated when it is requested by the user.
    //This prevents unnecissary use of local memory and data retrieval accross the network                
    public void A(){try
                    //Create URL object
                    {URL urla = new URL("http://nci.niallquinn.me/worldcupapp/results/groupA.txt");
                    //Point the BufferedReader to the URL object
                    in = new BufferedReader(new InputStreamReader(urla.openStream()));
                    //Read the URL object and plug the contents into a local string
                    outA = in.readLine();
                    //Plug that string into the main display lable
                    outLable.setText(outA);
                     }
                    //In case of errors with the server
                    catch(Exception e){System.out.println("Sorry, but the server seems to be down, try again later");
                    }
                    //Set the lable string
                    groupString.setText("Group A");
                    }
    public void B(){try
                    //Create URL object
                    {URL urlb = new URL("http://nci.niallquinn.me/worldcupapp/results/groupB.txt");
                    //Point the BufferedReader to the URL object
                    in = new BufferedReader(new InputStreamReader(urlb.openStream()));
                    //Read the URL object and plug the contents into a local string
                    outB = in.readLine();
                    //Plug that string into the main display lable
                    outLable.setText(outB);
                     }
                    //In case of errors with the server
                    catch(Exception e){System.out.println("Sorry, but the server seems to be down, try again later");
                    }
                    //Set the lable string
                    groupString.setText("Group B");
                    }
    public void C(){try
                    //Create URL object
                    {URL urlc = new URL("http://nci.niallquinn.me/worldcupapp/results/groupC.txt");
                    //Point the BufferedReader to the URL object
                    in = new BufferedReader(new InputStreamReader(urlc.openStream()));
                    //Read the URL object and plug the contents into a local string
                    outC = in.readLine();
                    //Plug that string into the main display lable
                    outLable.setText(outC);
                     }
                    //In case of errors with the server
                    catch(Exception e){System.out.println("Sorry, but the server seems to be down, try again later");
                    }
                    //Set the lable string
                    groupString.setText("Group C");
                    }
    public void D(){try
                    //Create URL object
                    {URL urld = new URL("http://nci.niallquinn.me/worldcupapp/results/groupD.txt");
                    //Point the BufferedReader to the URL object
                    in = new BufferedReader(new InputStreamReader(urld.openStream()));
                    //Read the URL object and plug the contents into a local string
                    outD = in.readLine();
                    //Plug that string into the main display lable
                    outLable.setText(outD);
                     }
                    //In case of errors with the server
                    catch(Exception e){System.out.println("Sorry, but the server seems to be down, try again later");
                    }
                    //Set the lable string
                    groupString.setText("Group D");
                    }
    public void E(){try
                    //Create URL object
                    {URL urle = new URL("http://nci.niallquinn.me/worldcupapp/results/groupE.txt");
                    //Point the BufferedReader to the URL object
                    in = new BufferedReader(new InputStreamReader(urle.openStream()));
                    //Read the URL object and plug the contents into a local string
                    outE = in.readLine();
                    //Plug that string into the main display lable
                    outLable.setText(outE);
                     }
                    //In case of errors with the server
                    catch(Exception e){System.out.println("Sorry, but the server seems to be down, try again later");
                    }
                    //Set the lable string
                    groupString.setText("Group E");
                    }
    public void F(){try
                    //Create URL object
                    {URL urlf = new URL("http://nci.niallquinn.me/worldcupapp/results/groupF.txt");
                    //Point the BufferedReader to the URL object
                    in = new BufferedReader(new InputStreamReader(urlf.openStream()));
                    //Read the URL object and plug the contents into a local string
                    outF = in.readLine();
                    //Plug that string into the main display lable
                    outLable.setText(outF);
                     }
                    //In case of errors with the server
                    catch(Exception e){System.out.println("Sorry, but the server seems to be down, try again later");
                    }
                    //Set the lable string
                    groupString.setText("Group F");
                    }
    public void G(){try
                    //Create URL object
                    {URL urlg = new URL("http://nci.niallquinn.me/worldcupapp/results/groupG.txt");
                    //Point the BufferedReader to the URL object
                    in = new BufferedReader(new InputStreamReader(urlg.openStream()));
                    //Read the URL object and plug the contents into a local string
                    outG = in.readLine();
                    //Plug that string into the main display lable
                    outLable.setText(outG);
                     }
                    //In case of errors with the server
                    catch(Exception e){System.out.println("Sorry, but the server seems to be down, try again later");
                    }
                    //Set the lable string
                    groupString.setText("Group G");
                    }
    public void H(){try
                    //Create URL object
                    {URL urlh = new URL("http://nci.niallquinn.me/worldcupapp/results/groupH.txt");
                    //Point the BufferedReader to the URL object
                    in = new BufferedReader(new InputStreamReader(urlh.openStream()));
                    //Read the URL object and plug the contents into a local string
                    outH = in.readLine();
                    //Plug that string into the main display lable
                    outLable.setText(outH);
                     }
                    //In case of errors with the server
                    catch(Exception e){System.out.println("Sorry, but the server seems to be down, try again later");
                    }
                    //Set the lable string
                    groupString.setText("Group H");
                    }
    
    //NOTE: I realise I could have only created one single URL object in a seperate method.
    //      Doing so would reduce the ammount of code, but...
    //      Remember how the entire application works, every module (teams, fixtures, results and live) are created when the application runs
    //      That means that the object would be created too, even if the usere was never going to use the results module.
    //      This would be (minorly) wasteful on computers resources
    //      In practice, it would make no difference, but I'm just being picky!
    
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

        outLable.setBackground(new java.awt.Color(255, 255, 255));

        org.jdesktop.layout.GroupLayout aPanelLayout = new org.jdesktop.layout.GroupLayout(aPanel);
        aPanel.setLayout(aPanelLayout);
        aPanelLayout.setHorizontalGroup(
            aPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(aPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(groupString, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 59, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                .add(outLable, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, 451, Short.MAX_VALUE)
                .addContainerGap())
        );
        aPanelLayout.setVerticalGroup(
            aPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(aPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(groupString)
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .add(org.jdesktop.layout.GroupLayout.TRAILING, aPanelLayout.createSequentialGroup()
                .addContainerGap(org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .add(outLable, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 207, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
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
                .addContainerGap(22, Short.MAX_VALUE)
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
       //Store the users selection into String select
        String select = (String) jComboBox1.getSelectedItem();         
        // This switch selection will toggle which .txt file is being read in by calling the respective methood. ie. if select == A we call method A();
        // We're also printing out messages to the consol as a lot can go wrong here. If there is a problem accessing the URL, the method will catch the error itself. 
        // If there is a problem finding the string (select == null), we will get the default case which prints a different messege to the console
        // This will make it easier to localise bugs in the code if something starts to go wrong
        switch (select) {
            case "A":
                System.out.println("Test A successful");
                A();
                break;
            case "B":
                System.out.println("Test B successful");
                B();
                break;
            case "C":
                System.out.println("Test C successful");
                C();
                break;
            case "D":
                System.out.println("Test D successful");
                D();
                break;
            case "E":
                System.out.println("Test E successful");
                E();
                break;
            case "F":
                System.out.println("Test F successful");
                F();
                break;
            case "G":
                System.out.println("Test G successful");
                G();
                break;
            case "H":
                System.out.println("Test H successful");
                H();
                break;
            default:
                System.out.println("Oops! Something went wrong in ResultsModule");
                break;
        }
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
