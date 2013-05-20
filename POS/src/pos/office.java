/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.awt.Color;
import javax.swing.JOptionPane;
import java.sql.*;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;
/**
 *
 * @author lenovo
 */
public class office extends javax.swing.JFrame {

    
     int amount=0,extra=0,total=0;
     
    public office() {
        initComponents();
        setTitle("Office");
           setLocation(284,45);
        setSize(660,570);
        getContentPane().setBackground(new Color(129,134,138));
        setVisible(true);
        Functions.FillCombo(expenseCombo,"office","Names");
        AutoCompleteDecorator.decorate(expenseCombo);
       }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        office_expenseLabel = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        cancelButton = new javax.swing.JButton();
        detailsLabel = new javax.swing.JLabel();
        saveButton = new javax.swing.JButton();
        expenseLabel = new javax.swing.JLabel();
        extra_expenseLabel = new javax.swing.JLabel();
        extra_expenseTextField = new javax.swing.JTextField();
        totalLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        expense_detailsTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        detailsTextArea = new javax.swing.JTextArea();
        expense_detailsLabel = new javax.swing.JLabel();
        cashLabel = new javax.swing.JLabel();
        expenseCombo = new javax.swing.JComboBox();
        amountLabel = new javax.swing.JLabel();
        amountTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        office_expenseLabel.setBackground(new java.awt.Color(255, 255, 255));
        office_expenseLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        office_expenseLabel.setForeground(new java.awt.Color(0, 102, 102));
        office_expenseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        office_expenseLabel.setText("Office Expense");

        jPanel1.setBackground(new java.awt.Color(129, 134, 138));

        cancelButton.setText("Cancel");
        cancelButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cancelButtonActionPerformed(evt);
            }
        });

        detailsLabel.setBackground(new java.awt.Color(255, 255, 255));
        detailsLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        detailsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        detailsLabel.setText(" Details");

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        expenseLabel.setBackground(new java.awt.Color(255, 255, 255));
        expenseLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        expenseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        expenseLabel.setText("Expense");

        extra_expenseLabel.setBackground(new java.awt.Color(255, 255, 255));
        extra_expenseLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        extra_expenseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        extra_expenseLabel.setText("Extra Expense");

        extra_expenseTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                extra_expenseTextFieldKeyReleased(evt);
            }
        });

        totalLabel.setBackground(new java.awt.Color(255, 255, 255));
        totalLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        totalLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        totalLabel.setText("Total");

        expense_detailsTextArea.setColumns(15);
        expense_detailsTextArea.setRows(5);
        jScrollPane1.setViewportView(expense_detailsTextArea);

        detailsTextArea.setColumns(15);
        detailsTextArea.setRows(5);
        jScrollPane2.setViewportView(detailsTextArea);

        expense_detailsLabel.setBackground(new java.awt.Color(255, 255, 255));
        expense_detailsLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        expense_detailsLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        expense_detailsLabel.setText("Expense details");

        cashLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        cashLabel.setForeground(new java.awt.Color(255, 0, 0));
        cashLabel.setText("Cash");

        expenseCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        amountLabel.setBackground(new java.awt.Color(255, 255, 255));
        amountLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        amountLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        amountLabel.setText("Amount");

        amountTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                amountTextFieldActionPerformed(evt);
            }
        });
        amountTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                amountTextFieldKeyReleased(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/images/add.png"))); // NOI18N
        jButton1.setContentAreaFilled(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 142, Short.MAX_VALUE)
                        .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(54, 54, 54)
                        .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(122, 122, 122))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(detailsLabel)
                            .addComponent(expenseLabel)
                            .addComponent(extra_expenseLabel)
                            .addComponent(expense_detailsLabel)
                            .addComponent(totalLabel)
                            .addComponent(amountLabel))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cashLabel)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(extra_expenseTextField)
                            .addComponent(jScrollPane1)
                            .addComponent(expenseCombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(amountTextField)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE))
                        .addGap(29, 29, 29)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(expenseLabel)
                        .addGap(12, 12, 12))
                    .addComponent(expenseCombo, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(amountLabel)
                    .addComponent(amountTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(detailsLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(extra_expenseTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(extra_expenseLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(expense_detailsLabel))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cashLabel)
                    .addComponent(totalLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(saveButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(204, 204, 204)
                        .addComponent(office_expenseLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(87, 87, 87)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(122, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(office_expenseLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(180, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed
        dispose();        
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed

          int flag=0;
          String expense,details,extdetails ;
        
        
           if(expenseCombo.getSelectedItem().equals("Select"))
                {
                    expenseLabel.setForeground(Color.red);
                    flag++;
                 }    
           if(amountTextField.getText().equals(""))
           {
                    amountLabel.setForeground(Color.red);
                    flag++;
           }
                
           if(extra_expenseTextField.getText().equals(""))
           {
               extra=0;
           }
           else
           {
                extra   = Integer.parseInt(extra_expenseTextField.getText());
           }    
           if(flag==0)
          { 
              expense = (String) expenseCombo.getSelectedItem();
              amount =  Integer.parseInt(amountTextField.getText());
             details = detailsTextArea.getText();
              extdetails = expense_detailsTextArea.getText();
              total         =amount+extra; 
           
             try {
                  Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                  Connection con = DriverManager.getConnection("jdbc:odbc:indlands","","");
                  java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
                  PreparedStatement prp=con.prepareStatement("insert into Office(odate,expense,amount,details,extra,extdetails,total) values(?,?,?,?,?,?,?)");    
                                               
                        prp.setDate(1,sqlDate);
                        prp.setString(2,expense);
                        prp.setInt(3,amount);  
                        prp.setString(4,details);
                        prp.setInt(5,extra);
                        prp.setString (6, extdetails);
                        prp.setInt (7, total);
                        prp.executeUpdate(); 
                      //  JOptionPane.showMessageDialog(null,"Added succesfully");
                         Functions.DisposeFunc(this);
                         cashLabel.setText("Cash");
                         amountTextField.setText("");
                         detailsTextArea.setText("");
                         extra_expenseTextField.setText("");
                         expense_detailsTextArea.setText("");
                         expenseCombo.setSelectedItem("Select");
                         con.commit();
                         con.close();
             }                               
             
             catch(SQLException e)
            {
                JOptionPane.showMessageDialog(null,"Err is"+e);
                
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(null,"The error is1:"+e);
                System.out.println(e.getMessage());
            }
             }
    }//GEN-LAST:event_saveButtonActionPerformed

    private void extra_expenseTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_extra_expenseTextFieldKeyReleased

        
         if(Functions.NumericValidate(extra_expenseTextField))
        {
            if(amountTextField.getText().equals(""))
            {
                amount = 0;
            } else 
            {
                amount= Integer.parseInt(amountTextField.getText());
            }
            if(extra_expenseTextField.getText().equals(""))
            {
               extra= 0;
            } else
            {
                extra= Integer.parseInt(extra_expenseTextField.getText());
            }
            
            total = amount+extra;
            
        }
            cashLabel.setText(Integer.toString(total));
        
    }//GEN-LAST:event_extra_expenseTextFieldKeyReleased

    private void amountTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_amountTextFieldKeyReleased
        if(Functions.NumericValidate(amountTextField))
        {
            if(amountTextField.getText().equals(""))
            {
                amount = 0;
            } else 
            {
                amount= Integer.parseInt(amountTextField.getText());
            }
            if(extra_expenseTextField.getText().equals(""))
            {
               extra= 0;
            } else
            {
                extra= Integer.parseInt(extra_expenseTextField.getText());
            }
            
            total = amount+extra;
            
        }
            cashLabel.setText(Integer.toString(total));
        
    }//GEN-LAST:event_amountTextFieldKeyReleased

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                Functions.NewItem(expenseCombo,"office"); // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void amountTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_amountTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_amountTextFieldActionPerformed

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
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Add.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new office().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel amountLabel;
    private javax.swing.JTextField amountTextField;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel cashLabel;
    private javax.swing.JLabel detailsLabel;
    private javax.swing.JTextArea detailsTextArea;
    private javax.swing.JComboBox expenseCombo;
    private javax.swing.JLabel expenseLabel;
    private javax.swing.JLabel expense_detailsLabel;
    private javax.swing.JTextArea expense_detailsTextArea;
    private javax.swing.JLabel extra_expenseLabel;
    private javax.swing.JTextField extra_expenseTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel office_expenseLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JLabel totalLabel;
    // End of variables declaration//GEN-END:variables
}
