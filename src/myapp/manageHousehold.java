/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myapp;

import internalPages.dashBoardPagee;
import java.awt.print.PrinterException;
import java.text.MessageFormat;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;


public class manageHousehold extends javax.swing.JFrame {

    /**
     * Creates new form manageHousehold
     */
    public manageHousehold() {
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
        exit = new javax.swing.JLabel();
        minimize = new javax.swing.JLabel();
        back = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_priority = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        gender = new javax.swing.JTextField();
        name = new javax.swing.JTextField();
        bday = new javax.swing.JTextField();
        position = new javax.swing.JTextField();
        addRow = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        update = new javax.swing.JButton();
        delete = new javax.swing.JButton();
        printreport = new javax.swing.JButton();
        search = new javax.swing.JButton();
        search1 = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

        jPanel1.setBackground(new java.awt.Color(255, 204, 204));
        jPanel1.setLayout(null);

        exit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        exit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        exit.setText("X");
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
        });
        jPanel1.add(exit);
        exit.setBounds(890, 10, 12, 22);

        minimize.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        minimize.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        minimize.setText("—");
        minimize.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                minimizeMouseClicked(evt);
            }
        });
        jPanel1.add(minimize);
        minimize.setBounds(870, 12, 16, 30);

        back.setBackground(new java.awt.Color(255, 102, 102));
        back.setFont(new java.awt.Font("Berlin Sans FB", 0, 18)); // NOI18N
        back.setText("BACK");
        back.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                backActionPerformed(evt);
            }
        });
        jPanel1.add(back);
        back.setBounds(30, 20, 90, 30);

        jLabel1.setBackground(new java.awt.Color(255, 102, 102));
        jLabel1.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 51, 51));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("(HEAD OF THE FAMILY)");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(0, 30, 930, 30);

        tbl_priority.setBackground(new java.awt.Color(255, 153, 153));
        tbl_priority.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        tbl_priority.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"Requinto, Milinda", "08/01/89", "Vendor", "Female"},
                {"Teremocha, Ronald", "04/18/01", "Salesman", "Male"},
                {"Garan, Marcel", "01/20/94", "Housewife", "Female"},
                {"Traya, Milodia", "03/30/89", "Farmer", "Female"},
                {"Genabe, Binibinida", "06/12/78", "Vendor", "Female"},
                {"Iglesia, Victorio", "07/11/88", "Farmer", "Male"},
                {"Aligado, Maribeth", "08/01/89", "Vendor", "Female"},
                {"Villacencio, Cecilia", "05/05/79", "Vendor", "Female"},
                {"Calliñada, Estrella", "03/01/87", "Brgy. Councilor", "Female"},
                {"Geraldez, Lucia", "10/03/84", "Housewife", "Female"}
            },
            new String [] {
                "Names", "Birthdate", "Position", "Gender"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, true, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tbl_priority.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_priorityMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_priority);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(360, 100, 550, 310);

        jLabel2.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel2.setText("Gender:");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(30, 220, 90, 30);

        jLabel3.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel3.setText("Name:");
        jPanel1.add(jLabel3);
        jLabel3.setBounds(30, 100, 90, 30);

        jLabel4.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel4.setText("Birthdate:");
        jPanel1.add(jLabel4);
        jLabel4.setBounds(30, 140, 90, 30);

        jLabel5.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        jLabel5.setText("Position:");
        jPanel1.add(jLabel5);
        jLabel5.setBounds(30, 180, 90, 30);

        gender.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        gender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                genderActionPerformed(evt);
            }
        });
        jPanel1.add(gender);
        gender.setBounds(120, 220, 220, 30);

        name.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        name.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nameActionPerformed(evt);
            }
        });
        jPanel1.add(name);
        name.setBounds(120, 100, 220, 30);

        bday.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        bday.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bdayActionPerformed(evt);
            }
        });
        jPanel1.add(bday);
        bday.setBounds(120, 140, 220, 30);

        position.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        position.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                positionActionPerformed(evt);
            }
        });
        jPanel1.add(position);
        position.setBounds(120, 180, 220, 30);

        addRow.setBackground(new java.awt.Color(255, 204, 204));
        addRow.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        addRow.setText("ADD");
        addRow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addRowActionPerformed(evt);
            }
        });
        jPanel1.add(addRow);
        addRow.setBounds(190, 270, 150, 40);

        clear.setBackground(new java.awt.Color(255, 204, 204));
        clear.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        clear.setText("CLEAR");
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        jPanel1.add(clear);
        clear.setBounds(30, 270, 150, 40);

        jLabel6.setBackground(new java.awt.Color(255, 102, 102));
        jLabel6.setFont(new java.awt.Font("Serif", 1, 24)); // NOI18N
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("LIST OF RECORDS");
        jPanel1.add(jLabel6);
        jLabel6.setBounds(0, 0, 930, 40);

        update.setBackground(new java.awt.Color(255, 204, 204));
        update.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        update.setText("UPDATE");
        update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updateActionPerformed(evt);
            }
        });
        jPanel1.add(update);
        update.setBounds(30, 320, 150, 40);

        delete.setBackground(new java.awt.Color(255, 204, 204));
        delete.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        delete.setText("DELETE");
        delete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteActionPerformed(evt);
            }
        });
        jPanel1.add(delete);
        delete.setBounds(190, 320, 150, 40);

        printreport.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        printreport.setText("PRINT REPORT");
        printreport.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                printreportActionPerformed(evt);
            }
        });
        jPanel1.add(printreport);
        printreport.setBounds(760, 420, 160, 30);

        search.setBackground(new java.awt.Color(255, 102, 102));
        search.setFont(new java.awt.Font("Rockwell", 0, 18)); // NOI18N
        search.setText("SEARCH");
        search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                searchActionPerformed(evt);
            }
        });
        jPanel1.add(search);
        search.setBounds(790, 60, 110, 30);

        search1.setFont(new java.awt.Font("Berlin Sans FB", 0, 14)); // NOI18N
        jPanel1.add(search1);
        search1.setBounds(630, 60, 150, 30);

        jPanel2.setBackground(new java.awt.Color(255, 102, 102));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        jPanel1.add(jPanel2);
        jPanel2.setBounds(10, 80, 340, 330);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 925, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 463, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void backActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_backActionPerformed
        dashBoardPagee db = new dashBoardPagee();
        db.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_backActionPerformed

    private void minimizeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_minimizeMouseClicked
        setState(ICONIFIED);
    }//GEN-LAST:event_minimizeMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
        int a=JOptionPane.showConfirmDialog(null, "Confirm Exit?");
        if(a==JOptionPane.YES_OPTION){
            System.exit(0);
        }
    }//GEN-LAST:event_exitMouseClicked

    private void genderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_genderActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_genderActionPerformed

    private void nameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_nameActionPerformed

    private void bdayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bdayActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_bdayActionPerformed

    private void positionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_positionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_positionActionPerformed

    private void addRowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addRowActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbl_priority.getModel();
        model.addRow(new Object[]{name.getText(), bday.getText(),
                               position.getText(), gender.getText()});
    }//GEN-LAST:event_addRowActionPerformed

    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
        name.setText(null);
        bday.setText(null);
        position.setText(null);
        gender.setText(null);
        
        
    }//GEN-LAST:event_clearActionPerformed

    private void updateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updateActionPerformed
        int i = tbl_priority.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)tbl_priority.getModel();
        if(i >= 0 )
        {
            model.setValueAt(name.getText(), i, 0);
            model.setValueAt(bday.getText(), i, 1);
            model.setValueAt(position.getText(), i, 2);
            model.setValueAt(gender.getText(), i, 3);
        }else{
            JOptionPane.showMessageDialog(null, "ERROR!");
        }
    }//GEN-LAST:event_updateActionPerformed

    private void tbl_priorityMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_priorityMouseClicked
        int selectedRow = tbl_priority.getSelectedRow();
        DefaultTableModel model = (DefaultTableModel)tbl_priority.getModel();
        name.setText(model.getValueAt(selectedRow, 0).toString());
        bday.setText(model.getValueAt(selectedRow, 1).toString());
        position.setText(model.getValueAt(selectedRow, 2).toString());
        gender.setText(model.getValueAt(selectedRow, 3).toString());
    }//GEN-LAST:event_tbl_priorityMouseClicked

    private void deleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbl_priority.getModel();
        try{
            int SelectedRowIndex = tbl_priority.getSelectedRow();
            model.removeRow(SelectedRowIndex);           
        }catch(Exception ex)
        {
            JOptionPane.showMessageDialog(null, ex);
        }
    }//GEN-LAST:event_deleteActionPerformed

    private void searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_searchActionPerformed
        DefaultTableModel model = (DefaultTableModel) tbl_priority.getModel();
        TableRowSorter<DefaultTableModel> obj  = new TableRowSorter<>(model);
        tbl_priority.setRowSorter(obj);
        obj.setRowFilter(RowFilter.regexFilter(search1.getText()));       
    }//GEN-LAST:event_searchActionPerformed

    private void printreportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_printreportActionPerformed
        MessageFormat header = new MessageFormat("PUROK INFORMATION SYSTEM");
        MessageFormat footer = new MessageFormat("Tagbuag-tubig, Tagjaguimit City of Naga, Cebu");
        try{
           tbl_priority.print(JTable.PrintMode.FIT_WIDTH, header, footer);
        }catch(PrinterException e){
            JOptionPane.showMessageDialog(null, "Cannot be print!"+e.getMessage());
        }
        
        
    }//GEN-LAST:event_printreportActionPerformed

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
            java.util.logging.Logger.getLogger(manageHousehold.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(manageHousehold.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(manageHousehold.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(manageHousehold.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new manageHousehold().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton addRow;
    private javax.swing.JButton back;
    private javax.swing.JTextField bday;
    private javax.swing.JButton clear;
    private javax.swing.JButton delete;
    private javax.swing.JLabel exit;
    private javax.swing.JTextField gender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel minimize;
    private javax.swing.JTextField name;
    private javax.swing.JTextField position;
    private javax.swing.JButton printreport;
    private javax.swing.JButton search;
    private javax.swing.JTextField search1;
    private javax.swing.JTable tbl_priority;
    private javax.swing.JButton update;
    // End of variables declaration//GEN-END:variables
}
