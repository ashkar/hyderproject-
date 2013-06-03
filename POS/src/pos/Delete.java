/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pos;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

/**
 *
 * @author lenovo
 */
public class Delete extends javax.swing.JFrame {

    /**
     * Creates new form Delete
     */
    public Delete() {
        initComponents();
        setTitle("Delete");
        setLocation(284,45);
        setSize(625,400);
        getContentPane().setBackground(new Color(129,134,138));
        setVisible(true);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        extra_expenseLabel = new javax.swing.JLabel();
        moduleLabel = new javax.swing.JLabel();
        moduleCombo = new javax.swing.JComboBox();
        idLabel = new javax.swing.JLabel();
        idTextField = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        extra_expenseLabel.setBackground(new java.awt.Color(255, 255, 255));
        extra_expenseLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        extra_expenseLabel.setForeground(new java.awt.Color(0, 102, 102));
        extra_expenseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        extra_expenseLabel.setText("Delete data");

        moduleLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        moduleLabel.setText("From Module");

        moduleCombo.setFont(new java.awt.Font("Comic Sans MS", 0, 12)); // NOI18N
        moduleCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select", "Project    ", "Inventory", "Labour", "Payment", "Vendor", "Office", "Plan      ", "Transport", "Labourdailymain", "Labourdailysub", "Wood", "LabourdailyOther", "workquote", "Deduction", "contractor", "      " }));
        moduleCombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                moduleComboItemStateChanged(evt);
            }
        });

        idLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        idLabel.setText("Id ");

        jButton1.setText("Delete");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(168, 168, 168)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(43, 43, 43)
                        .addComponent(extra_expenseLabel))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(moduleLabel)
                            .addComponent(idLabel))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(idTextField)
                            .addComponent(moduleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(181, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(72, 72, 72)
                .addComponent(extra_expenseLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(moduleLabel)
                    .addComponent(moduleCombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(idLabel)
                    .addComponent(idTextField))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(105, 105, 105))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void moduleComboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_moduleComboItemStateChanged

        if (moduleCombo.getSelectedItem().equals("Select")) {
            moduleLabel.setForeground(Color.red);
        } else {
            moduleLabel.setForeground(Color.black);
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_moduleComboItemStateChanged

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
           String tablename="",col2="";
           int col1=0;
           col1 =Integer.parseInt(idTextField.getText());
           tablename = (String) moduleCombo.getSelectedItem();
           
        int flag=0;
        if(moduleCombo.getSelectedItem().equals("Select"))
        {
            moduleLabel.setForeground(Color.red);
            flag++;
        }
        if(idTextField.getText().equals(""))
        {
            idLabel.setForeground(Color.red);
            flag++;
        }
        
        if(moduleCombo.getSelectedItem().equals("Project"))
        {
            col2 ="PRONO";
        }
        if(moduleCombo.getSelectedItem().equals("Inventory"))
        {
            col2 ="INVID";
        }
        if(moduleCombo.getSelectedItem().equals("Labour"))
        {
            col2 ="LABID";
        }
        if(moduleCombo.getSelectedItem().equals("Payment"))
        {
            col2 ="id";
        }
        if(moduleCombo.getSelectedItem().equals("Vendor"))
        {
            col2 ="VENID";
        }
        if(moduleCombo.getSelectedItem().equals("Office"))
        {
            col2 ="id";
        }
        if(moduleCombo.getSelectedItem().equals("Plan"))
        {
            col2 ="ID";
        }
        if(moduleCombo.getSelectedItem().equals("Transport"))
        {
            col2 ="";
        }
        if(moduleCombo.getSelectedItem().equals("Labourdailymain"))
        {
            col2 ="WORK_ID";
        }
        if(moduleCombo.getSelectedItem().equals("Labourdailysub"))
        {
            col2 ="SNO";
        }
        if(moduleCombo.getSelectedItem().equals("Wood"))
        {
            col2 ="INVNO";
        }
        if(moduleCombo.getSelectedItem().equals("LabourdailyOther"))
        {
            col2 ="Work_Id";
        }
        if(moduleCombo.getSelectedItem().equals("workquote"))
        {
            col2 ="ID";
        }
        if(moduleCombo.getSelectedItem().equals("contractor"))
        {
            col2 ="id";
        }
        if(moduleCombo.getSelectedItem().equals("Deduction"))
        {
            col2 ="id";
        }
        
        if(flag==0)
        {
//            String sql1="";      
//         sql1  = "delete from" +"" +tablename+ ""+ "where" + col2+ "="
//            
//            JOptionPane.showMessageDialog(null, ""+a);
        try {
                Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                Connection con = DriverManager.getConnection("jdbc:odbc:indlands","","");
                PreparedStatement prp = con.prepareStatement("delete from "+tablename+" where "+col2+" = "+col1);
                         prp.executeUpdate();
                          con.commit();
                         con.close();
                         Functions.DisposeFunc(this);
        }                               
             catch(SQLException e)
             {JOptionPane.showMessageDialog(null,""+e); }
            catch(Exception e)
            { JOptionPane.showMessageDialog(null,""+e);
              }
        
        }
      
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
            dispose();
            
      
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Delete.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Delete().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel extra_expenseLabel;
    private javax.swing.JLabel idLabel;
    private javax.swing.JTextField idTextField;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox moduleCombo;
    private javax.swing.JLabel moduleLabel;
    // End of variables declaration//GEN-END:variables
}
