/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.awt.Color;
import java.sql.*;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author lenovo
 */
public class Contractor extends javax.swing.JFrame {

    String Name,Work,Mobile;
    int Cid;
      int temp = 0;
    JComboBox comboname;
    /**
      Creates new form Labour
     **/
    public Contractor() {
        initComponents();
        setTitle("Labour");
        setSize(660,350);
        setLocation(284,45);
        setVisible(true);
        getContentPane().setBackground(new Color(129,134,138));
        
        Functions.FillCombo(workCombo, "WORK", "Names");
        AutoCompleteDecorator.decorate(workCombo);
        
    }
 public Contractor(int i,JComboBox combo) {
        initComponents();
        setTitle("Labour");
        setSize(660,350);
        setLocation(238,0);
        setVisible(true);
        getContentPane().setBackground(new Color(129,134,138));
        
        Functions.FillCombo(workCombo, "WORK", "Names");
        comboname = combo;
        temp = i;
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        nameTextField = new javax.swing.JTextField();
        mobileTextField = new javax.swing.JTextField();
        nameLabel = new javax.swing.JLabel();
        labour_detailsLabel = new javax.swing.JLabel();
        mobileLabel = new javax.swing.JLabel();
        workLabel = new javax.swing.JLabel();
        workCombo = new javax.swing.JComboBox();
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        nameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                nameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                nameTextFieldFocusLost(evt);
            }
        });

        mobileTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                mobileTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                mobileTextFieldFocusLost(evt);
            }
        });
        mobileTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mobileTextFieldKeyReleased(evt);
            }
        });

        nameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        nameLabel.setText("Name");

        labour_detailsLabel.setBackground(new java.awt.Color(255, 255, 255));
        labour_detailsLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        labour_detailsLabel.setForeground(new java.awt.Color(0, 102, 102));
        labour_detailsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labour_detailsLabel.setText("Contractor");

        mobileLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        mobileLabel.setText("Mobile");

        workLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        workLabel.setText("Work");

        workCombo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        workCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));
        workCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                workComboItemStateChanged(evt);
            }
        });
        workCombo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                workComboFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                workComboFocusLost(evt);
            }
        });

        addButton.setText("Add");
        addButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addButtonActionPerformed(evt);
            }
        });

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(175, 175, 175)
                        .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(90, 90, 90))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nameLabel)
                            .addComponent(workLabel)
                            .addComponent(mobileLabel))
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(mobileTextField)
                            .addComponent(workCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(nameTextField)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(23, 23, 23)
                                .addComponent(labour_detailsLabel)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addGap(158, 158, 158))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labour_detailsLabel)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(nameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(nameLabel))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(workCombo)
                    .addComponent(workLabel))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(mobileTextField)
                    .addComponent(mobileLabel))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(61, 61, 61))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void nameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTextFieldFocusGained

        nameLabel.setForeground(Color.black);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldFocusGained

    private void nameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_nameTextFieldFocusLost

        if(nameTextField.getText().equals(""))
        {
            nameLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_nameTextFieldFocusLost

    private void workComboFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_workComboFocusGained
        
        workLabel.setForeground(Color.black);
        
        if(nameTextField.getText().equals(""))
        {
            nameLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_workComboFocusGained

    private void workComboFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_workComboFocusLost

        if(workCombo.getSelectedItem().equals("Select"))
        {
            workLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_workComboFocusLost

    private void workComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_workComboItemStateChanged

        if(workCombo.getSelectedItem().equals("Select"))
        {
            workLabel.setForeground(Color.red);
        }
        else workLabel.setForeground(Color.black);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_workComboItemStateChanged

    private void mobileTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobileTextFieldFocusGained
        
        mobileLabel.setForeground(Color.black);
        
        if(nameTextField.getText().equals(""))
        {
            nameLabel.setForeground(Color.red);
        }
        if(workCombo.getSelectedItem().equals("Select"))
        {
            workLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileTextFieldFocusGained

    private void mobileTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_mobileTextFieldFocusLost

        if(mobileTextField.getText().equals(""))
        {
            mobileLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileTextFieldFocusLost

    private void mobileTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobileTextFieldKeyReleased

        Functions.NumericValidation(mobileTextField);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_mobileTextFieldKeyReleased

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed

        dispose();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed

        int flag = 0;
        String mobile,labour,work;
        if(nameTextField.getText().equals(""))
        {
            nameLabel.setForeground(Color.red);
            flag++;
        }
        if(workCombo.getSelectedItem().equals("Select"))
        {
            workLabel.setForeground(Color.red);
            flag++;
        }
        
        
        if(flag==0)
        { labour = nameTextField.getText();
            mobile = mobileTextField.getText();
            work = (String) workCombo.getSelectedItem();
        
           try {
                  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                  Connection con = DriverManager.getConnection("jdbc:odbc:indlands","","");
                  Statement  st = con.createStatement();
                  java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
                  PreparedStatement prp=con.prepareStatement("insert into contractor (contractor,mobile,work,joindate) values(?,?,?,?)");    
                                               
                        prp.setString(1,labour);
                        prp.setString(2,mobile);
                        prp.setString(3,work);
                        prp.setDate(4,sqlDate);
                        prp.executeUpdate(); 
                         //JOptionPane.showMessageDialog(null,"Contractor Added");
                        
                         if(temp == 1)
                         {
                             comboname.addItem(labour);
                             comboname.setSelectedItem(labour);
                         }
                         
                         con.commit();
                         con.close();
                         dispose();
        }
            catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,"Err is"+e);
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"The Err is :"+e);
                System.out.println(e.getMessage());
            }
           //   Functions.DisposeFunc(this);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_addButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Contractor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Contractor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Contractor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Contractor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Contractor().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel labour_detailsLabel;
    private javax.swing.JLabel mobileLabel;
    private javax.swing.JTextField mobileTextField;
    private javax.swing.JLabel nameLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JComboBox workCombo;
    private javax.swing.JLabel workLabel;
    // End of variables declaration//GEN-END:variables
}
