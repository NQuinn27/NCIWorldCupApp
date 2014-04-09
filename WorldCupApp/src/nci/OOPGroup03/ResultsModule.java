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
 * Commit 6: TODO: 1. Design the panels to display the results. 
 *                 2. Finish coding the switch statement to controll the visability of the panels.
 *                 3. Set the background image (agree on this with group).
 *                 4. Set the fonts (agree on this with group).
 * 
 * Commit 7: TODO: 1. Bug testing and troubleshooting.
 *                 2. Any last font or design changes (agree w/ group).
 *                 3. Bug test entire project (do this as a group).
 */
package nci.OOPGroup03;

import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author johnoshea
 */
public class ResultsModule extends javax.swing.JPanel {

    //Creates new form ResultsModule
     
    public ResultsModule() {
        initComponents();
    }
    
    public void A() {oneLabel.setText("Brazil");
                    twoLabel.setText("Croatia");
                    threeLabel.setText("Mexico");
                    fourLabel.setText("Cameroon");
                    
                    oneScore.setText("    1           1            0           0             1");
                    twoScore.setText("    1           1            0           0             1");
                    threeScore.setText("    1           1            0           0             1");
                    fourScore.setText("    1           1            0           0             1");
    
                    groupString.setText("Group A");
    }               
    
    public void B() {oneLabel.setText("Spain");
                    twoLabel.setText("Netherlands");
                    threeLabel.setText("Chile");
                    fourLabel.setText("Australia");
                    
                    oneScore.setText("    1           1            0           0             1");
                    twoScore.setText("    1           1            0           0             1");
                    threeScore.setText("    1           1            0           0             1");
                    fourScore.setText("    1           1            0           0             1");

                    groupString.setText("Group B");
    }
    
    public void C() {oneLabel.setText("Columbia");
                    twoLabel.setText("Greece");
                    threeLabel.setText("Ivory Coast");
                    fourLabel.setText("Japan");
                    
                    oneScore.setText("    1           1            0           0             1");
                    twoScore.setText("    1           1            0           0             1");
                    threeScore.setText("    1           1            0           0             1");
                    fourScore.setText("    1           1            0           0             1");

                    groupString.setText("Group C");
    }
     
    public void D() {oneLabel.setText("Uruguay");
                    twoLabel.setText("Costa Rica");
                    threeLabel.setText("England");
                    fourLabel.setText("Italy");
                    
                    oneScore.setText("    1           1            0           0             1");
                    twoScore.setText("    1           1            0           0             1");
                    threeScore.setText("    1           1            0           0             1");
                    fourScore.setText("    1           1            0           0             1");

                    groupString.setText("Group D");
    }
    
    public void E() {oneLabel.setText("Switzerland");
                    twoLabel.setText("Ecuador");
                    threeLabel.setText("France");
                    fourLabel.setText("Honduras");
                    
                    oneScore.setText("    1           1            0           0             1");
                    twoScore.setText("    1           1            0           0             1");
                    threeScore.setText("    1           1            0           0             1");
                    fourScore.setText("    1           1            0           0             1");

                    groupString.setText("Group E");
    }
    
    public void F() {oneLabel.setText("Argentina");
                    twoLabel.setText("Bosnia");
                    threeLabel.setText("Iran");
                    fourLabel.setText("Nigeria");
                    
                    oneScore.setText("    1           1            0           0             1");
                    twoScore.setText("    1           1            0           0             1");
                    threeScore.setText("    1           1            0           0             1");
                    fourScore.setText("    1           1            0           0             1");

                    groupString.setText("Group F");
    }
    
    public void G() {oneLabel.setText("Germany");
                    twoLabel.setText("Portugal");
                    threeLabel.setText("Ghana");
                    fourLabel.setText("USA");
                    
                    oneScore.setText("    1           1            0           0             1");
                    twoScore.setText("    1           1            0           0             1");
                    threeScore.setText("    1           1            0           0             1");
                    fourScore.setText("    1           1            0           0             1");

                    groupString.setText("Group G");
    }
    
    public void H() {oneLabel.setText("Belgum");
                    twoLabel.setText("Algeria");
                    threeLabel.setText("Russia");
                    fourLabel.setText("Korea");
                    
                    oneScore.setText("    1           1            0           0             1");
                    twoScore.setText("    1           1            0           0             1");
                    threeScore.setText("    1           1            0           0             1");
                    fourScore.setText("    1           1            0           0             1");

                    groupString.setText("Group H");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        aPanel = new javax.swing.JPanel();
        groupString = new javax.swing.JLabel();
        teamLabel = new javax.swing.JLabel();
        lostLabel = new javax.swing.JLabel();
        wonLabel = new javax.swing.JLabel();
        playedLabel = new javax.swing.JLabel();
        tiedLabel = new javax.swing.JLabel();
        pointsLabel = new javax.swing.JLabel();
        twoLabel = new javax.swing.JLabel();
        oneLabel = new javax.swing.JLabel();
        fourLabel = new javax.swing.JLabel();
        threeLabel = new javax.swing.JLabel();
        oneScore = new javax.swing.JLabel();
        twoScore = new javax.swing.JLabel();
        threeScore = new javax.swing.JLabel();
        fourScore = new javax.swing.JLabel();

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
        groupString.setText("Group A");

        teamLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        teamLabel.setText("Team");

        lostLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        lostLabel.setText("Lost");

        wonLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        wonLabel.setText("Won");

        playedLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        playedLabel.setText("Played");

        tiedLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        tiedLabel.setText("Tied");

        pointsLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        pointsLabel.setText("Points");

        twoLabel.setText("Croatia");

        oneLabel.setText("Brazil");

        fourLabel.setText("Cameroon");

        threeLabel.setText("Mexico");

        oneScore.setText("    1           1            0           0             1");

        twoScore.setText("    1           1            0           0             1");

        threeScore.setText("    1           1            0           0             1");

        fourScore.setText("    1           1            0           0             1");

        org.jdesktop.layout.GroupLayout aPanelLayout = new org.jdesktop.layout.GroupLayout(aPanel);
        aPanel.setLayout(aPanelLayout);
        aPanelLayout.setHorizontalGroup(
            aPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(aPanelLayout.createSequentialGroup()
                .add(aPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                    .add(aPanelLayout.createSequentialGroup()
                        .add(53, 53, 53)
                        .add(aPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
                            .add(teamLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(twoLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(threeLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                            .add(fourLabel)
                            .add(oneLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 121, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                        .add(aPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING, false)
                            .add(aPanelLayout.createSequentialGroup()
                                .add(playedLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(wonLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(lostLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.RELATED)
                                .add(tiedLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                                .add(pointsLabel, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 45, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE))
                            .add(oneScore, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(twoScore, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(threeScore, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .add(fourScore, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, org.jdesktop.layout.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .add(aPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .add(groupString, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE, 59, org.jdesktop.layout.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        aPanelLayout.setVerticalGroup(
            aPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.LEADING)
            .add(aPanelLayout.createSequentialGroup()
                .addContainerGap()
                .add(groupString)
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(aPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(teamLabel)
                    .add(lostLabel)
                    .add(playedLabel)
                    .add(wonLabel)
                    .add(tiedLabel)
                    .add(pointsLabel))
                .add(40, 40, 40)
                .add(aPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(oneLabel)
                    .add(oneScore))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(aPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(twoLabel)
                    .add(twoScore))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(aPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(threeLabel)
                    .add(threeScore))
                .addPreferredGap(org.jdesktop.layout.LayoutStyle.UNRELATED)
                .add(aPanelLayout.createParallelGroup(org.jdesktop.layout.GroupLayout.BASELINE)
                    .add(fourLabel)
                    .add(fourScore))
                .addContainerGap(24, Short.MAX_VALUE))
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
                .addContainerGap(27, Short.MAX_VALUE)
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
                               G(); }
       else {System.out.println("Oops! Something went wrong in ResultsModule (breakpoint 2)");}
    }//GEN-LAST:event_jComboBox1ActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel aPanel;
    private javax.swing.JLabel fourLabel;
    private javax.swing.JLabel fourScore;
    private javax.swing.JLabel groupString;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lostLabel;
    private javax.swing.JLabel oneLabel;
    private javax.swing.JLabel oneScore;
    private javax.swing.JLabel playedLabel;
    private javax.swing.JLabel pointsLabel;
    private javax.swing.JLabel teamLabel;
    private javax.swing.JLabel threeLabel;
    private javax.swing.JLabel threeScore;
    private javax.swing.JLabel tiedLabel;
    private javax.swing.JLabel twoLabel;
    private javax.swing.JLabel twoScore;
    private javax.swing.JLabel wonLabel;
    // End of variables declaration//GEN-END:variables
}
