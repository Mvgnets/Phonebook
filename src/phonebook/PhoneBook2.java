/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phonebook;

import java.util.HashMap;
import javax.swing.JOptionPane;

/**
 *
 * @author n3023685
 */
public class PhoneBook2 extends javax.swing.JFrame {

    /**
     * Creates new form PhoneBook
     */
    public PhoneBook2() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        searchButton1 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea2 = new javax.swing.JTextArea();
        jPanel2 = new javax.swing.JPanel();
        nameBox = new javax.swing.JTextField();
        searchButton = new javax.swing.JButton();
        lNumberBox = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        createButton = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        removeButton = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        mNumberBox = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        emailBox = new javax.swing.JTextField();

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 100, Short.MAX_VALUE)
        );

        searchButton1.setText("Search");
        searchButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButton1ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        jTextArea2.setColumns(20);
        jTextArea2.setRows(5);
        jScrollPane2.setViewportView(jTextArea2);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        nameBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameBoxActionPerformed(evt);
            }
        });

        searchButton.setText("Search");
        searchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchButtonActionPerformed(evt);
            }
        });

        lNumberBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lNumberBoxActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Search for an existing record or create a new one");
        jLabel1.setToolTipText("");

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        jLabel3.setText("Name");

        jLabel4.setText("Landline");

        removeButton.setText("Remove");
        removeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                removeButtonActionPerformed(evt);
            }
        });

        jLabel5.setText("Mobile");

        mNumberBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                mNumberBoxActionPerformed(evt);
            }
        });

        jLabel6.setText("Email Address");

        emailBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailBoxActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5))
                        .addGap(33, 33, 33)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(mNumberBox)
                            .addComponent(lNumberBox, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(nameBox)
                            .addComponent(emailBox, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(searchButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(createButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(removeButton))))
                .addContainerGap(27, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(searchButton)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(nameBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(createButton)
                        .addGap(18, 18, 18)
                        .addComponent(removeButton))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(lNumberBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel4)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(mNumberBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(emailBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void searchButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButton1ActionPerformed

    }//GEN-LAST:event_searchButton1ActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        String newName = nameBox.getText();
        String newLNumber = lNumberBox.getText();
        String newMNumber = mNumberBox.getText();
        String newEmail = emailBox.getText();
        //if the name already exists, return a pop up dialog
        if (hMap.containsKey(newName)) {
            JOptionPane.showMessageDialog(rootPane, "That name entry already exists");
        } else {
            //if it does not exist, create a new instance of the ContactInfo class and add it to the HashMap
            hMap.put(newName, new ContactInfo(newName, newLNumber, newMNumber, newEmail));
            //return a pop up dialog to inform the user of the new entry
            JOptionPane.showMessageDialog(rootPane, "You have created a new entry for " + newName);
        }
        //clear the form
        nameBox.setText("");
        lNumberBox.setText("");
        mNumberBox.setText("");
        emailBox.setText("");
    }//GEN-LAST:event_createButtonActionPerformed

    private void lNumberBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lNumberBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lNumberBoxActionPerformed

    private void searchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchButtonActionPerformed
        String searchName = nameBox.getText();
        String searchLNumber = lNumberBox.getText();
        String searchMNumber = mNumberBox.getText();
        String searchEmail = emailBox.getText();
        int nameTest = 0;
        int lNumTest = 0;
        int mNumTest = 0;
        int emailTest = 0;
        //if a value is present in the name field
        if (!searchName.isEmpty()) {
            //search through each entry in the hashmap and check for a matching name
            for (HashMap.Entry<String, ContactInfo> x : hMap.entrySet()) {
                //if you find one, fill the text fields with the corresponding information
                if (x.toString().contains(searchName)) {
                    nameBox.setText(x.getKey());
                    lNumberBox.setText(hMap.get(x.getKey()).getLandlineNumber());
                    mNumberBox.setText(hMap.get(x.getKey()).getMobileNumber());
                    emailBox.setText(hMap.get(x.getKey()).getEmailAddress());
                    nameTest++;
                }
            }
            if (nameTest == 0) {
                //if a match is found, this value has been incremented. If not the following pop up dialog is displayed
                JOptionPane.showMessageDialog(rootPane, "That name does not exist");
                nameBox.setText("");
            }
        //this process is utilised for the other fields to find matches
        } else if (!searchLNumber.isEmpty()) {
            for (HashMap.Entry<String, ContactInfo> x : hMap.entrySet()) {
                if (hMap.get(x.getKey()).getLandlineNumber().contains(searchLNumber)) {
                    nameBox.setText(x.getKey());
                    lNumberBox.setText(hMap.get(x.getKey()).getLandlineNumber());
                    mNumberBox.setText(hMap.get(x.getKey()).getMobileNumber());
                    emailBox.setText(hMap.get(x.getKey()).getEmailAddress());
                    lNumTest++;
                }
            }

            if (lNumTest == 0) {
                JOptionPane.showMessageDialog(rootPane, "That number does not exist");
                lNumberBox.setText("");
            }

        } else if (!searchMNumber.isEmpty()) {
            for (HashMap.Entry<String, ContactInfo> x : hMap.entrySet()) {
                if (hMap.get(x.getKey()).getMobileNumber().contains(searchMNumber)) {
                    nameBox.setText(x.getKey());
                    lNumberBox.setText(hMap.get(x.getKey()).getLandlineNumber());
                    mNumberBox.setText(hMap.get(x.getKey()).getMobileNumber());
                    emailBox.setText(hMap.get(x.getKey()).getEmailAddress());
                    mNumTest++;
                }
            }
            if (mNumTest == 0) {
                JOptionPane.showMessageDialog(rootPane, "That number does not exist");
                mNumberBox.setText("");
            }
        } else if (!searchEmail.isEmpty()) {
            for (HashMap.Entry<String, ContactInfo> x : hMap.entrySet()) {
                if (hMap.get(x.getKey()).getEmailAddress().contains(searchEmail)) {
                    nameBox.setText(x.getKey());
                    lNumberBox.setText(hMap.get(x.getKey()).getLandlineNumber());
                    mNumberBox.setText(hMap.get(x.getKey()).getMobileNumber());
                    emailBox.setText(hMap.get(x.getKey()).getEmailAddress());
                    emailTest++;
                }
            }

            if (emailTest == 0) {
                JOptionPane.showMessageDialog(rootPane, "That email does not exist");
                emailBox.setText("");
            }

        } else {
            JOptionPane.showMessageDialog(rootPane, "Please enter a field to search");
        }

    }//GEN-LAST:event_searchButtonActionPerformed

    private void nameBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameBoxActionPerformed

    }//GEN-LAST:event_nameBoxActionPerformed

    private void removeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_removeButtonActionPerformed
        String name = nameBox.getText();
        //check that the hashmap contains the key in question
        if (hMap.containsKey(name)) {
            //if it does, remove it and return a pop up dialog
            hMap.remove(name);
            JOptionPane.showMessageDialog(rootPane, "You have removed the entry for " + name);
            nameBox.setText("");
            lNumberBox.setText("");
            mNumberBox.setText("");
            emailBox.setText("");
        } else {
            JOptionPane.showMessageDialog(rootPane, "That record does not exist");
        }
    }//GEN-LAST:event_removeButtonActionPerformed

    private void mNumberBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_mNumberBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_mNumberBoxActionPerformed

    private void emailBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailBoxActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailBoxActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;

                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(PhoneBook2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PhoneBook2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PhoneBook2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PhoneBook2.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PhoneBook2().setVisible(true);
            }
        });
        //initialise the hashmap and load some test data
        hMap = new HashMap<String, ContactInfo>();
        hMap.put("John Smith", new ContactInfo("John Smith", "01642 192846", "07714123456", "john.smith@gmail.com"));
        hMap.put("Jill Hash", new ContactInfo("Jill Hash", "01642 738564", "07836173456", "jill.hash@gmail.com"));
        hMap.put("Terry Vickers", new ContactInfo("Terry Vickers", "01642 769376", "07537143358", "terry.vickers@gmail.com"));

    }

    static HashMap<String, ContactInfo> hMap;

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton createButton;
    private javax.swing.JTextField emailBox;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextArea jTextArea2;
    private javax.swing.JTextField lNumberBox;
    private javax.swing.JTextField mNumberBox;
    private javax.swing.JTextField nameBox;
    private javax.swing.JButton removeButton;
    private javax.swing.JButton searchButton;
    private javax.swing.JButton searchButton1;
    // End of variables declaration//GEN-END:variables
}
