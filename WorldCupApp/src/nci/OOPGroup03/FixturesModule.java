/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package nci.OOPGroup03;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


/**
 *
 * @author jonathanturner
 */
public class FixturesModule extends javax.swing.JPanel {

    /**
     * Creates new form FixturesModule
     */
    public FixturesModule() {
        initComponents();
        
    jComboBox1.setVisible(false);
        textArea1.setVisible(false);
       // setEditable(false);
    }
    public void Hide() {
        jComboBox1.setVisible(false);
        
       
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel1 = new javax.swing.JLabel();
        textArea1 = new java.awt.TextArea();
        jLabel3 = new javax.swing.JLabel();
        groupSelector = new javax.swing.JComboBox();

        setBackground(new java.awt.Color(102, 255, 0));
        setPreferredSize(new java.awt.Dimension(633, 419));
        setRequestFocusEnabled(false);

        jLabel2.setText("Locations");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] {  }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Choose Group");

        jLabel3.setText("Choose Team");

        groupSelector.setModel(new javax.swing.DefaultComboBoxModel(new String[] {"Group A", "Group B", "Group C", "Group D", "Group E", "Group F", "Group G", "Group H"  }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel2)
                        .addGap(164, 164, 164))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(82, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(55, 55, 55)
                        .addComponent(groupSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 82, Short.MAX_VALUE)
                        .addComponent(jLabel3)
                        .addGap(53, 53, 53)))
                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(138, 138, 138))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(groupSelector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(textArea1, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(164, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
        
        String text = textArea1.getSelectedText();
             String box = (String)text;
             //GROUP A
             
             if ("Brazil v Croatia".equals(box)){
        
                 textArea1.append("12 June 2014, Arena de Sao Paulo, Sao Paulo, 21:00 (ITV)");
        
                 }
             if ("Mexico v Cameroon".equals(box)){
        
                 textArea1.append("13 June 2014, Arena das Dunas, Natal, 17:00 (ITV)");
        
                 }
              if ("Brazil v Mexico".equals(box)){
        
                 textArea1.append("17 June 2014, Estadio Castelao, Fortaleza, 20:00 (BBC)");
        
                 }
               if ("Cameroon v Croatia".equals(box)){
        
                 textArea1.append("18 June 2014, Arena Amazonia, Manaus, 23:00 (ITV)");
        
                 }
              if ("Cameroon v Brazil".equals(box)){
        
                 textArea1.append("23 June 2014, Estadio Nacional, Brasilia, 21:00 (ITV)");
        
                 }
               if ("Croatia v Mexico".equals(box)){
        
                 textArea1.append("23 June 2014, Arena Pernambuco, Recife, 21:00 (ITV)");
        
                 }
             //GROUP B
               
               
             if ("Spain v Netherlands".equals(box)){
        
                 textArea1.append("13 June 2014, Arena Fonte Nova, Salvador, 20:00 (BBC)");
        
                 }
             if ("Chile v Australia".equals(box)){
        
                 textArea1.append("13 June 2014, Arena Pantanal, Cuiaba, 23:00 (ITV)");
        
                 }
             if ("Spain v Chile".equals(box)){
        
                 textArea1.append("18 June 2014, Estadio do Maracana, Rio de Janeiro, 20:00 (BBC)");
        
                 }
             if ("Australia v Netherlands".equals(box)){
        
                 textArea1.append("18 June 2014, Arena da Baixada, Curitiba, 17:00 (ITV)");
        
                 }
              if ("Australia v Spain".equals(box)){
        
                 textArea1.append("23 June 2014, Estadio do Maracana, Rio de Janeiro, 20:00 (BBC)");
        
                 }
              if ("Netherlands v Chile".equals(box)){
        
                 textArea1.append("23 June 2014, Arena de Sao Paulo, Sao Paulo, 17:00 (ITV)");
        
                 }
              //GROUP C
              
              
             if ("Colombia v Greece".equals(box)){
        
                 textArea1.append("14 June 2014, Estadio Mineirao, Belo Horizonte, 17:00 (BBC)");
        
                 }
             if ("Ivory Coast v Japan".equals(box)){
        
                 textArea1.append("15 June 2014, Arena Pernambuco, Recife, 02:00 (ITV)");
        
                 }
             if ("Colombia v Ivory Coast".equals(box)){
        
                 textArea1.append("19 June 2014, Estadio Nacional, Brasilia, 17:00 (BBC)");
        
                 }
             if ("Japan v Greece".equals(box)){
        
                 textArea1.append("19 June 2014, Arena das Dunas, Natal, 23:00 (BBC)");
        
                 }
             if ("Japan v Colombia".equals(box)){
        
                 textArea1.append("24 June 2014, Arena Pantanal, Cuiaba, 21:00 (BBC)");
        
                 }
             if ("Greece v Ivory Coast".equals(box)){
        
                 textArea1.append("24 June 2014, Estadio Castelao, Fortaleza, 21:00 (BBC)");
        
                 }
             //GROUP D
             if ("Uruguay v Costa Rica".equals(box)){
        
                 textArea1.append("14 June 2014, Estadio Castelao, Fortaleza, 20:00 (ITV");
        
                 }
             if ("England v Italy".equals(box)){
        
                 textArea1.append("14 June 2014, Arena Amazonia, Manaus, 23:00 (BBC)");
        
                 }
             if ("Uruguay v England".equals(box)){
        
                 textArea1.append("19 June 2014, Arena de Sao Paulo, Sao Paulo, 20:00 (ITV)");
        
                 }
             if ("Italy v Costa Rica".equals(box)){
        
                 textArea1.append("20 June 2014, Arena Pernambuco, Recife, 17:00 (BBC)");
        
                 }
             if ("Italy v Uruguay".equals(box)){
        
                 textArea1.append("24 June 2014, Arena das Dunas, Natal, 17:00 (ITV)");
        
                 }
             if ("Costa Rica v England".equals(box)){
        
                 textArea1.append("24 June 2014, Estadio Mineirao, Belo Horizonte, 17:00 (ITV)");
        
                 }
             
             //GrOUP E
             
             if ("Switzerland v Ecuador".equals(box)){
        
                 textArea1.append("15 June 2014, Estadio Nacional, Brasilia, 17:00 (ITV)");
        
                 }
             if ("France v Honduras".equals(box)){
        
                 textArea1.append("15 June 2014, Estadio Beira-Rio, Porto Alegre, 20:00 (BBC)");
        
                 }
             if ("Switzerland v France".equals(box)){
        
                 textArea1.append("20 June 2014, Arena Fonte Nova, Salvador, 20:00 (ITV)");
        
                 }
             if ("Honduras v Ecuador".equals(box)){
        
                 textArea1.append("20 June 2014, Arena da Baixada, Curitiba, 23:00 (ITV)");
        
                 }
             if ("Honduras v Switzerland".equals(box)){
        
                 textArea1.append("25 June 2014, Arena Amazonia, Manaus, 21:00 (BBC)");
        
                 }
             if ("Ecuador v France".equals(box)){
        
                 textArea1.append("25 June 2014, Estadio do Maracana, Rio de Janeiro, 21:00 (BBC)");
        
                 }
             
             //GROUP F
              if ("Argentina v Bosnia-Hercegovina".equals(box)){
        
                 textArea1.append("15 June 2014, Estadio do Maracana, Rio de Janeiro, 23:00 (BBC)");
        
                 }
               if ("Iran v Nigeria".equals(box)){
        
                 textArea1.append("16 June 2014, Arena da Baixada, Curitiba, 20:00 (BBC)");
        
                 }
                if ("Argentina v Iran".equals(box)){
        
                 textArea1.append("21 June 2014, Estadio Mineirao, Belo Horizonte, 17:00 (ITV)");
        
                 }
                 if ("Nigeria v Bosnia-Hercegovina".equals(box)){
        
                 textArea1.append("21 June 2014, Arena Pantanal, Cuiaba, 23:00 (BBC)");
        
                 }
                  if ("Nigeria v Argentina".equals(box)){
        
                 textArea1.append("25 June 2014, Estadio Beira-Rio, Porto Alegre, 17:00 (ITV)");
        
                 }
                   if ("Bosnia-Hercegovina v Iran".equals(box)){
        
                 textArea1.append("25 June 2014, Arena Fonte Nova, Salvador, 17:00 (ITV)");
        
                 }
                   //GROUP G
                   if ("Germany v Portugal".equals(box)){
        
                 textArea1.append("16 June 2014, Arena Fonte Nova, Salvador, 17:00 (ITV)");
        
                 }
                   if ("Ghana v United States".equals(box)){
        
                 textArea1.append("16 June 2014, Arena das Dunas, Natal, 23:00 (BBC)");
        
                 }
                   if ("Germany v Ghana".equals(box)){
        
                 textArea1.append("21 June 2014, Estadio Castelao, Fortaleza, 20:00 (BBC)");
        
                 }
                   if ("United States v Portugal".equals(box)){
        
                 textArea1.append("22 June 2014, Arena Amazonia, Manaus, 23:00 (BBC)");
        
                 }
                   if ("United States v Germany".equals(box)){
        
                 textArea1.append("26 June 2014, Arena Pernambuco, Recife, 17:00 (BBC)");
        
                 }
                   if ("Portugal v Ghana".equals(box)){
        
                 textArea1.append("26 June 2014, Estadio Nacional, Brasilia, 17:00 (BBC)");
        
                 }
                   //GROUP H
                   
                   
                   if ("Belgium v Algeria".equals(box)){
        
                 textArea1.append("17 June 2014, Estadio Mineirao, Belo Horizonte, 17:00 (ITV)");
        
                 }
                   if ("Russia v South Korea".equals(box)){
        
                 textArea1.append("17 June 2014, Arena Pantanal, Cuiaba, 23:00 (BBC)");
        
                 }
                   if ("Belgium v Russia".equals(box)){
        
                 textArea1.append("22 June 2014, Estadio do Maracana, Rio de Janeiro, 17:00 (BBC)");
        
                 }
                   if ("South Korea v Algeria".equals(box)){
        
                 textArea1.append("22 June 2014, Estadio Beira-Rio, Porto Alegre, 20:00 (ITV)");
        
                 }
                   if ("South Korea v Belgium".equals(box)){
        
                 textArea1.append("26 June 2014, Arena de Sao Paulo, Sao Paulo, 21:00 (ITV)");
        
                 }
                   if ("Algeria v Russia".equals(box)){
        
                 textArea1.append("26 June 2014, Arena da Baixada, Curitiba, 21:00 (ITV)");
        
                 }
             
             
             
             
             
             textArea1.setVisible(true);
        
        //JOptionPane.showMessageDialog(null, "This will select list like Ireland vs. France ");
        // TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed
 private void jComboBox1ItemStateChanged(java.awt.event.ItemEvent evt) {                                            
        // TODO add your handling code here:
       
    }                                           

    private void groupSelectorActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
       
        Object item = groupSelector.getSelectedItem();
        String str = (String)item;
        
        jComboBox1.removeAllItems();
        if ("Group A".equals(str)) {
            jComboBox1.addItem("Brazil v Croatia");
            jComboBox1.addItem("Mexico v Cameroon");
            jComboBox1.addItem("Brazil v Mexico");
            jComboBox1.addItem("Cameroon v Croatia");
            jComboBox1.addItem("Cameroon v Brazil");
            jComboBox1.addItem("Croatia v Mexico");
            
        }
        if ("Group B".equals(str)){
            jComboBox1.addItem("Spain v Netherlands");
            jComboBox1.addItem("Chile v Australia");
            jComboBox1.addItem("Spain v Chile");
            jComboBox1.addItem("Australia v Netherlands");
            jComboBox1.addItem("Australia v Spain");
            jComboBox1.addItem("Netherlands v Chile");     
            
            
        }
       if ("Group C".equals(str)){
            jComboBox1.addItem("Colombia v Greece");
            jComboBox1.addItem("Ivory Coast v Japan");
            jComboBox1.addItem("Colombia v Ivory Coast");
            jComboBox1.addItem("Japan v Greece");
            jComboBox1.addItem("Japan v Colombia");
            jComboBox1.addItem("Greece v Ivory Coast");     
            
            
        }
        if ("Group D".equals(str)){
            jComboBox1.addItem("Uruguay v Costa Rica");
            jComboBox1.addItem("England v Italy");
            jComboBox1.addItem("Uraguay v England");
            jComboBox1.addItem("Italy v Costa Rica");
            jComboBox1.addItem("Italy v Uruguay");
            jComboBox1.addItem("Costa Rica v England");     
            
            
        }
        if ("Group E".equals(str)){
            jComboBox1.addItem("Switzerland v Ecuador");
            jComboBox1.addItem("France v Honduras");
            jComboBox1.addItem("Switzerland v France");
            jComboBox1.addItem("Honduras V Ecuador");
            jComboBox1.addItem("Honduras v Switzerland");
            jComboBox1.addItem("Ecuador v France");     
            
            
        }
        if ("Group F".equals(str)){
            jComboBox1.addItem("Argentina v Bosnia-Hercegovina");
            jComboBox1.addItem("Iran v Nigeria");
            jComboBox1.addItem("Argentina v Iran");
            jComboBox1.addItem("Nigeria v Bosnia-Hercegovina");
            jComboBox1.addItem("Nigeria v Argentina");
            jComboBox1.addItem("Bosnia-Hercegovina v Iran");     
            
            
        }
        if ("Group G".equals(str)){
            jComboBox1.addItem("Germany v Portugal");
            jComboBox1.addItem("Ghana v United States");
            jComboBox1.addItem("Germany v Ghana");
            jComboBox1.addItem("United States v Portugal");
            jComboBox1.addItem("United States v Germany");
            jComboBox1.addItem("Portugal v Ghana");     
            
            
        }
        if ("Group H".equals(str)){
            jComboBox1.addItem("Belgium v Algeria");
            jComboBox1.addItem("Russia v South Korea");
            jComboBox1.addItem("Belgium v Russia");
            jComboBox1.addItem("South Korea v Algeria");
            jComboBox1.addItem("South Korea v Belgium");
            jComboBox1.addItem("Algeria v Russia");     
            
            
        }
             jComboBox1.setVisible(true);
 
           
             
        
        System.out.println(str);
        /*JOptionPane.showMessageDialog(null, "12 June 2014\n" +
    "Brazil v Croatia, Arena de Sao Paulo, Sao Paulo, 21:00 (ITV)\n" +
    "13 June 2014\n" +
    "Mexico v Cameroon, Arena das Dunas, Natal, 17:00 (ITV)\n" +
    "17 June 2014\n" +
    "Brazil v Mexico, Estadio Castelao, Fortaleza, 20:00 (BBC)\n" +
    "18 June 2014\n" +
    "Cameroon v Croatia, Arena Amazonia, Manaus, 23:00 (ITV)\n" +
    "23 June 2014\n" +
    "Cameroon v Brazil, Estadio Nacional, Brasilia, 21:00 (ITV)\n" +
    "23 June 2014\n" +
    "Croatia v Mexico, Arena Pernambuco, Recife, 21:00 (ITV) ");*/
    }                                             
/*public class ComboBoxDemo ... implements ActionListener {
    . . .
        petList.addActionListener(this) {
    . . .
    public void actionPerformed(ActionEvent e) {
        JComboBox cb = (JComboBox)e.getSource();
        String petName = (String)cb.getSelectedItem();
        updateLabel(petName);*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox groupSelector;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private java.awt.TextArea textArea1;
    // End of variables declaration//GEN-END:variables
}
