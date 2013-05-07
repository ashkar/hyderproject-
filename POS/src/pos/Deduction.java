
package pos;

import java.awt.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.jdesktop.swingx.autocomplete.AutoCompleteDecorator;

/**
 *
 * @author Home
 */
public class Deduction extends javax.swing.JFrame {

    /** Creates new form ExtraExpense */
    public Deduction() {
        initComponents();
        setVisible(true);
        setSize(660,670);
        setTitle("Extra Expense");
        setLocation(238,0);
        getContentPane().setBackground(new Color(129,134,138));
        Functions.FillCombo(projectCombo, "PRONAME", "Project");
        AutoCompleteDecorator.decorate(projectCombo);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        extra_expenseLabel = new javax.swing.JLabel();
        materialCheckBox = new javax.swing.JCheckBox();
        workCheckBox = new javax.swing.JCheckBox();
        m_nameLabel = new javax.swing.JLabel();
        workLabel = new javax.swing.JLabel();
        m_nameTextField = new javax.swing.JTextField();
        workTextField = new javax.swing.JTextField();
        quantityLabel = new javax.swing.JLabel();
        quantityTextField = new javax.swing.JTextField();
        l_nameLabel = new javax.swing.JLabel();
        l_nameTextField = new javax.swing.JTextField();
        m_costLabel = new javax.swing.JLabel();
        m_costTextField = new javax.swing.JTextField();
        w_costLabel = new javax.swing.JLabel();
        w_costTextField = new javax.swing.JTextField();
        m_detailsLabel = new javax.swing.JLabel();
        w_detailsLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        m_detailsTextArea = new javax.swing.JTextArea();
        jScrollPane2 = new javax.swing.JScrollPane();
        w_detailsTextArea = new javax.swing.JTextArea();
        addButton = new javax.swing.JButton();
        cancelButton = new javax.swing.JButton();
        projectCombo = new javax.swing.JComboBox();
        projectLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);

        extra_expenseLabel.setBackground(new java.awt.Color(255, 255, 255));
        extra_expenseLabel.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        extra_expenseLabel.setForeground(new java.awt.Color(0, 102, 102));
        extra_expenseLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        extra_expenseLabel.setText("Extra Expense");

        materialCheckBox.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        materialCheckBox.setText("Material");
        materialCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                materialCheckBoxActionPerformed(evt);
            }
        });

        workCheckBox.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        workCheckBox.setText("Work");
        workCheckBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workCheckBoxActionPerformed(evt);
            }
        });

        m_nameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        m_nameLabel.setText("Material Name");
        m_nameLabel.setEnabled(false);

        workLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        workLabel.setText("Type of Work");
        workLabel.setEnabled(false);

        m_nameTextField.setEnabled(false);
        m_nameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                m_nameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                m_nameTextFieldFocusLost(evt);
            }
        });

        workTextField.setEnabled(false);
        workTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                workTextFieldActionPerformed(evt);
            }
        });
        workTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                workTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                workTextFieldFocusLost(evt);
            }
        });

        quantityLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        quantityLabel.setText("Quantity");
        quantityLabel.setEnabled(false);

        quantityTextField.setEnabled(false);
        quantityTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                quantityTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                quantityTextFieldFocusLost(evt);
            }
        });
        quantityTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                quantityTextFieldKeyReleased(evt);
            }
        });

        l_nameLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        l_nameLabel.setText("Labour No.s");
        l_nameLabel.setEnabled(false);

        l_nameTextField.setEnabled(false);
        l_nameTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                l_nameTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                l_nameTextFieldFocusLost(evt);
            }
        });
        l_nameTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                l_nameTextFieldKeyReleased(evt);
            }
        });

        m_costLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        m_costLabel.setText("Cost");
        m_costLabel.setEnabled(false);

        m_costTextField.setEnabled(false);
        m_costTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                m_costTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                m_costTextFieldFocusLost(evt);
            }
        });
        m_costTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                m_costTextFieldKeyReleased(evt);
            }
        });

        w_costLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        w_costLabel.setText("Cost");
        w_costLabel.setEnabled(false);

        w_costTextField.setEnabled(false);
        w_costTextField.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                w_costTextFieldFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                w_costTextFieldFocusLost(evt);
            }
        });
        w_costTextField.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                w_costTextFieldKeyReleased(evt);
            }
        });

        m_detailsLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        m_detailsLabel.setText("Details");
        m_detailsLabel.setEnabled(false);

        w_detailsLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        w_detailsLabel.setText("Details");
        w_detailsLabel.setEnabled(false);

        m_detailsTextArea.setColumns(20);
        m_detailsTextArea.setRows(5);
        m_detailsTextArea.setEnabled(false);
        m_detailsTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                m_detailsTextAreaFocusGained(evt);
            }
        });
        jScrollPane1.setViewportView(m_detailsTextArea);

        w_detailsTextArea.setColumns(20);
        w_detailsTextArea.setRows(5);
        w_detailsTextArea.setEnabled(false);
        w_detailsTextArea.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                w_detailsTextAreaFocusGained(evt);
            }
        });
        jScrollPane2.setViewportView(w_detailsTextArea);

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

        projectCombo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Select" }));

        projectLabel.setFont(new java.awt.Font("Comic Sans MS", 0, 18)); // NOI18N
        projectLabel.setText("Project");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(m_nameLabel)
                                .addGap(141, 141, 141)
                                .addComponent(workLabel))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane1)
                                        .addComponent(m_costTextField)
                                        .addComponent(m_nameTextField)
                                        .addComponent(quantityTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(materialCheckBox))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jScrollPane2)
                                        .addComponent(w_costTextField)
                                        .addComponent(l_nameTextField)
                                        .addComponent(workTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 225, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(projectCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(workCheckBox))))
                        .addContainerGap(92, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(73, 73, 73)
                        .addComponent(quantityLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(l_nameLabel)
                        .addGap(162, 162, 162))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(m_costLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(w_costLabel)
                        .addGap(201, 201, 201))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(m_detailsLabel)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(w_detailsLabel)
                        .addGap(183, 183, 183))))
            .addGroup(layout.createSequentialGroup()
                .addGap(213, 213, 213)
                .addComponent(extra_expenseLabel)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(projectLabel)
                .addGap(376, 376, 376))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(extra_expenseLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(materialCheckBox)
                    .addComponent(workCheckBox))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(projectCombo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(projectLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(workLabel)
                    .addComponent(m_nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(workTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(m_nameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityLabel)
                    .addComponent(l_nameLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(quantityTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(l_nameTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_costLabel)
                    .addComponent(w_costLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_costTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                    .addComponent(w_costTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(m_detailsLabel)
                    .addComponent(w_detailsLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cancelButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(addButton, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(178, 178, 178))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void materialCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_materialCheckBoxActionPerformed

        if(materialCheckBox.isSelected())
        {
            m_nameLabel.setEnabled(true);
            m_nameTextField.setEnabled(true);
            quantityLabel.setEnabled(true);
            quantityTextField.setEnabled(true);
            m_costLabel.setEnabled(true);
            m_costTextField.setEnabled(true);
            m_detailsLabel.setEnabled(true);
            m_detailsTextArea.setEnabled(true);
        }
        else
        {
            m_nameLabel.setEnabled(false);
            m_nameTextField.setEnabled(false);
            quantityLabel.setEnabled(false);
            quantityTextField.setEnabled(false);
            m_costLabel.setEnabled(false);
            m_costTextField.setEnabled(false);
            m_detailsLabel.setEnabled(false);
            m_detailsTextArea.setEnabled(false);
            
            m_nameLabel.setForeground(Color.black);
            quantityLabel.setForeground(Color.black);
            m_costLabel.setForeground(Color.black);
            m_detailsLabel.setForeground(Color.black);
            
            m_nameTextField.setText("");
            quantityTextField.setText("");
            m_costTextField.setText("");
            m_detailsTextArea.setText("");
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_materialCheckBoxActionPerformed

    private void workCheckBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workCheckBoxActionPerformed

        if(workCheckBox.isSelected())
        {
            workLabel.setEnabled(true);
            workTextField.setEnabled(true);
            l_nameLabel.setEnabled(true);
            l_nameTextField.setEnabled(true);
            w_costLabel.setEnabled(true);
            w_costTextField.setEnabled(true);
            w_detailsLabel.setEnabled(true);
            w_detailsTextArea.setEnabled(true);
        }
        else
        {
            workLabel.setEnabled(false);
            workTextField.setEnabled(false);
            l_nameLabel.setEnabled(false);
            l_nameTextField.setEnabled(false);
            w_costLabel.setEnabled(false);
            w_costTextField.setEnabled(false);
            w_detailsLabel.setEnabled(false);
            w_detailsTextArea.setEnabled(false);
            
            workLabel.setForeground(Color.black);
            l_nameLabel.setForeground(Color.black);
            w_costLabel.setForeground(Color.black);
            w_detailsLabel.setForeground(Color.black);
            
            workTextField.setText("");
            l_nameTextField.setText("");
            w_costTextField.setText("");
            w_detailsTextArea.setText("");
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_workCheckBoxActionPerformed

    private void m_nameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_m_nameTextFieldFocusGained

        m_nameLabel.setForeground(Color.black);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_m_nameTextFieldFocusGained

    private void m_nameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_m_nameTextFieldFocusLost

        if(m_nameTextField.getText().equals(""))
        {
            m_nameLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_m_nameTextFieldFocusLost

    private void quantityTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityTextFieldFocusGained

        quantityLabel.setForeground(Color.black);
        
        if(m_nameTextField.getText().equals(""))
        {
            m_nameLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextFieldFocusGained

    private void quantityTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_quantityTextFieldFocusLost

        if(quantityTextField.getText().equals(""))
        {
            quantityLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextFieldFocusLost

    private void quantityTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_quantityTextFieldKeyReleased

        Functions.NumericValidation(quantityTextField);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_quantityTextFieldKeyReleased

    private void m_costTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_m_costTextFieldFocusGained

        m_costLabel.setForeground(Color.black);
        
        if(m_nameTextField.getText().equals(""))
        {
            m_nameLabel.setForeground(Color.red);
        }
        if(quantityTextField.getText().equals(""))
        {
            quantityLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_m_costTextFieldFocusGained

    private void m_costTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_m_costTextFieldFocusLost

        if(m_costTextField.getText().equals(""))
        {
            m_costLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_m_costTextFieldFocusLost

    private void m_costTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_m_costTextFieldKeyReleased

        Functions.NumericValidation(m_costTextField);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_m_costTextFieldKeyReleased

    private void m_detailsTextAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_m_detailsTextAreaFocusGained

        if(m_nameTextField.getText().equals(""))
        {
            m_nameLabel.setForeground(Color.red);
        }
        if(quantityTextField.getText().equals(""))
        {
            quantityLabel.setForeground(Color.red);
        }
        if(m_costTextField.getText().equals(""))
        {
            m_costLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_m_detailsTextAreaFocusGained

    private void workTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_workTextFieldFocusGained

        workLabel.setForeground(Color.black);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_workTextFieldFocusGained

    private void workTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_workTextFieldFocusLost

        if(workTextField.getText().equals(""))
        {
            workLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_workTextFieldFocusLost

    private void l_nameTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_l_nameTextFieldFocusGained

        l_nameLabel.setForeground(Color.black);
        
        if(workTextField.getText().equals(""))
        {
            workLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_l_nameTextFieldFocusGained

    private void l_nameTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_l_nameTextFieldFocusLost

        if(l_nameTextField.getText().equals(""))
        {
            l_nameLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_l_nameTextFieldFocusLost

    private void w_costTextFieldFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_w_costTextFieldFocusGained

        w_costLabel.setForeground(Color.black);
        
        if(workTextField.getText().equals(""))
        {
            workLabel.setForeground(Color.red);
        }
        if(l_nameTextField.getText().equals(""))
        {
            l_nameLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_w_costTextFieldFocusGained

    private void w_costTextFieldFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_w_costTextFieldFocusLost

        if(w_costTextField.getText().equals(""))
        {
            w_costLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_w_costTextFieldFocusLost

    private void w_detailsTextAreaFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_w_detailsTextAreaFocusGained

        if(workTextField.getText().equals(""))
        {
            workLabel.setForeground(Color.red);
        }
        if(l_nameTextField.getText().equals(""))
        {
            l_nameLabel.setForeground(Color.red);
        }
        if(w_costTextField.getText().equals(""))
        {
            w_costLabel.setForeground(Color.red);
        }
        
        // TODO add your handling code here:
    }//GEN-LAST:event_w_detailsTextAreaFocusGained

    private void w_costTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_w_costTextFieldKeyReleased

        Functions.NumericValidation(w_costTextField);
        
        // TODO add your handling code here:
    }//GEN-LAST:event_w_costTextFieldKeyReleased

    private void cancelButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cancelButtonActionPerformed

        dispose();
        
        // TODO add your handling code here:
    }//GEN-LAST:event_cancelButtonActionPerformed

    private void addButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addButtonActionPerformed
 
        int flag = 0,quantity=0,cost=0;
        String type="",name="",details="";
        String pname = (String) projectCombo.getSelectedItem();
        if(projectCombo.getSelectedItem().equals("Select"))
        {
            projectLabel.setForeground(Color.red);
            flag++;
        }
        if(!materialCheckBox.isSelected() && !workCheckBox.isSelected())
        {
            JOptionPane.showMessageDialog(null,"Select one of the Check Box");
            flag++;
        }
        
        if(materialCheckBox.isSelected() && workCheckBox.isSelected())
        {
            JOptionPane.showMessageDialog(null,"Select only One Checkbox!!!");
            flag++;
        }
        if(materialCheckBox.isSelected())
        {
            if(m_nameTextField.getText().equals(""))
            {
                m_nameLabel.setForeground(Color.red);
                flag++;
            }
           
            if(m_costTextField.getText().equals(""))
            {
                m_costLabel.setForeground(Color.red);
                flag++;
            }
            type="material";
            name = m_nameTextField.getText();
            quantity= Integer.parseInt(quantityTextField.getText());
            cost    = Integer.parseInt(m_costTextField.getText());
            cost=  -cost;
            details = m_detailsTextArea.getText();
            
        }
        
        if(workCheckBox.isSelected())
        {
            if(workTextField.getText().equals(""))
            {
                workLabel.setForeground(Color.red);
                flag++;
            }
            if(w_costTextField.getText().equals(""))
            {
                w_costLabel.setForeground(Color.red);
                flag++;
            }
            type="work";
            name = workTextField.getText();
            quantity= Integer.parseInt(l_nameTextField.getText());
            cost    = Integer.parseInt(w_costTextField.getText());
            cost = -cost;
            details = w_detailsTextArea.getText();
            
        }
        
        if(flag==0)
        {   
            try {
                    Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
                    Connection con = DriverManager.getConnection("jdbc:odbc:indlands","","");
                    java.sql.Date sqlDate = new java.sql.Date(new java.util.Date().getTime());
                    PreparedStatement prp=con.prepareStatement("insert into Deduction(type,pname,wname,quantity,cost,details,odate) values(?,?,?,?,?,?,?)");    
                                               
                        prp.setString(1,type);
                        prp.setString(2,pname);
                        prp.setString(3,name);
                        prp.setInt(4,quantity);
                        prp.setInt(5,cost);
                        prp.setString(6,details);
                        prp.setDate(7,sqlDate);
                        prp.executeUpdate(); 
                        Functions.DisposeFunc(this);
                         m_nameTextField.setText("");
                         workTextField.setText("");
                         quantityTextField.setText("");
                         l_nameTextField.setText("");
                         m_detailsTextArea.setText("");
                         w_detailsTextArea.setText("");
                         w_costTextField.setText("");
                         m_costTextField.setText("");
                         projectCombo.setSelectedItem("Select");
                         con.commit();
                         con.close();
                   }
            
             catch(SQLException e2)
        {
            JOptionPane.showMessageDialog(null,"Deduction err is"  +e2);
            
        }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(null,"Deduction err is" +e);
             }
       
        
    }//GEN-LAST:event_addButtonActionPerformed
    }
    private void workTextFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_workTextFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_workTextFieldActionPerformed

    private void l_nameTextFieldKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_l_nameTextFieldKeyReleased
        Functions.NumericValidation(l_nameTextField);
    }//GEN-LAST:event_l_nameTextFieldKeyReleased

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
            java.util.logging.Logger.getLogger(Deduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Deduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Deduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Deduction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Deduction().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addButton;
    private javax.swing.JButton cancelButton;
    private javax.swing.JLabel extra_expenseLabel;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel l_nameLabel;
    private javax.swing.JTextField l_nameTextField;
    private javax.swing.JLabel m_costLabel;
    private javax.swing.JTextField m_costTextField;
    private javax.swing.JLabel m_detailsLabel;
    private javax.swing.JTextArea m_detailsTextArea;
    private javax.swing.JLabel m_nameLabel;
    private javax.swing.JTextField m_nameTextField;
    private javax.swing.JCheckBox materialCheckBox;
    private javax.swing.JComboBox projectCombo;
    private javax.swing.JLabel projectLabel;
    private javax.swing.JLabel quantityLabel;
    private javax.swing.JTextField quantityTextField;
    private javax.swing.JLabel w_costLabel;
    private javax.swing.JTextField w_costTextField;
    private javax.swing.JLabel w_detailsLabel;
    private javax.swing.JTextArea w_detailsTextArea;
    private javax.swing.JCheckBox workCheckBox;
    private javax.swing.JLabel workLabel;
    private javax.swing.JTextField workTextField;
    // End of variables declaration//GEN-END:variables
}
