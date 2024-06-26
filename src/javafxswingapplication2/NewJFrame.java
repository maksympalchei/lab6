/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package javafxswingapplication2;

import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.sql.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author korjk
 */
public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
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

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ПІБ", "Номер телефону", "Місто", "Вулиця"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Long.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jTable1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jTable1MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setText("Завантажити таблицю");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Додати ");
        jButton2.setEnabled(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Видалити");
        jButton3.setEnabled(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Зберегти таблицю");
        jButton4.setEnabled(false);
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("<");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setText(">");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jButton2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton3)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 214, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton5)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton3)
                    .addComponent(jButton4))
                .addContainerGap(10, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
private int currentPage = 0;
    private final int itemsPerPage = 10;
    private int totalItems = 0;
    private List<String> deletedRows = new ArrayList<>();
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String url = "jdbc:mysql://localhost:3306/lab6";
        String username = "root";
        String password = "1234";
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String countSql = "SELECT COUNT(*) FROM lab6";
            try (Statement countStatement = connection.createStatement(); ResultSet countResultSet = countStatement.executeQuery(countSql)) {
                countResultSet.next();
                totalItems = countResultSet.getInt(1);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        updateTable();
        jButton2.setEnabled(true);
        jButton4.setEnabled(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.addRow(new Object[]{"", "", "", ""});
        updateButtons();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        int selectedRowIndex = jTable1.getSelectedRow();
    if (selectedRowIndex >= 0) {
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        String pib = (String) model.getValueAt(selectedRowIndex, 0);
        deletedRows.add(pib);
        model.removeRow(selectedRowIndex);
        updateButtons();
    }
    jButton3.setEnabled(false);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        saveDataToDatabase(jTable1);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jTable1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jTable1MouseClicked
       int selectedRowIndex = jTable1.getSelectedRow();
        jButton3.setEnabled(selectedRowIndex >= 0);
        // TODO add your handling code here:
    }//GEN-LAST:event_jTable1MouseClicked

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
int totalPage = (int) Math.ceil((double) totalItems / itemsPerPage);
        if (currentPage < totalPage - 1) {
            currentPage++;
            updateTable();
        }
        updateButtons();
// TODO add your handling code here:
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        if (currentPage > 0) {
            currentPage--;
            updateTable();
        }
        updateButtons();
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed
//Пагінація + UPDATE

    private void updateButtons() {
    if(currentPage > 0) jButton5.setEnabled(true);
    else jButton5.setEnabled(false);
    int totalPage = (int) Math.ceil((double) totalItems / itemsPerPage);
    if(totalItems >= (currentPage + 1) * itemsPerPage) jButton6.setEnabled(true);
    else jButton6.setEnabled(false);
}


    private void updateTable() {
        String url = "jdbc:mysql://localhost:3306/lab6";
        String username = "root";
        String password = "1234";
        DefaultTableModel model = (DefaultTableModel) jTable1.getModel();
        model.setRowCount(0);
        try (Connection connection = DriverManager.getConnection(url, username, password)) {
            String sql = "SELECT * FROM lab6 LIMIT ?, ?";
            try (PreparedStatement statement = connection.prepareStatement(sql)) {
                statement.setInt(1, currentPage * itemsPerPage);
                statement.setInt(2, itemsPerPage);
                try (ResultSet resultSet = statement.executeQuery()) {
                    ResultSetMetaData metaData = resultSet.getMetaData();
                    int columnCount = metaData.getColumnCount();
                    while (resultSet.next()) {
                        Object[] rowData = new Object[columnCount];
                        for (int i = 1; i <= columnCount; i++) {
                            rowData[i - 1] = resultSet.getObject(i);
                        }
                        model.addRow(rowData);
                    }
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void saveDataToDatabase(JTable table) {
    for (String deletedRow : deletedRows) {
        deleteRowFromDatabase(deletedRow);
    }
    
    DefaultTableModel model = (DefaultTableModel) table.getModel();
    int rowCount = model.getRowCount();
    for (int i = 0; i < rowCount; i++) {
        List<String> rowData = new ArrayList<>();
        boolean allFieldsFilled = true;
        for (int j = 0; j < model.getColumnCount(); j++) {
            String value = model.getValueAt(i, j).toString();
            rowData.add(value);
            if (value.isEmpty()) {
                allFieldsFilled = false;
                break;
            }
        }
        if (allFieldsFilled) {
            if (rowData.get(0) != null && !rowData.get(0).isEmpty()) {
                if (isRecordExistsInDatabase(rowData)) {
                    updateRowInDatabase(rowData);
                } else {
                    insertRowIntoDatabase(rowData);
                }
            }
        } else {
            JOptionPane.showMessageDialog(this, "Не всі поля рядка " + (i + 1) + " заповнені. Рядок не буде збережений.", "Помилка", JOptionPane.ERROR_MESSAGE);
        }
    }
}

    private List<String> getDataFromDatabase() {
        List<String> dataFromDatabase = new ArrayList<>();

        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab6", "root", "1234");
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT PIB, NUM, TOWN, STREET FROM lab6");

            while (resultSet.next()) {
                String rowData = resultSet.getString("PIB") + ", " + resultSet.getString("NUMBER") + ", " + resultSet.getString("TOWN") + ", " + resultSet.getString("STREET");
                dataFromDatabase.add(rowData);
            }

            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return dataFromDatabase;
    }

    private boolean isRecordExistsInDatabase(List<String> rowData) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab6", "root", "1234");
            PreparedStatement statement = connection.prepareStatement("SELECT COUNT(*) FROM lab6 WHERE PIB = ?");
            statement.setString(1, rowData.get(0));
            ResultSet resultSet = statement.executeQuery();
            resultSet.next();
            int count = resultSet.getInt(1);
            connection.close();
            return count > 0;
        } catch (SQLException e) {
            e.printStackTrace();
            return false;
        }
    }

    private void updateRowInDatabase(List<String> rowData) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab6", "root", "1234");
            PreparedStatement statement = connection.prepareStatement("UPDATE lab6 SET NUM = ?, TOWN = ?, STREET = ? WHERE PIB = ?");
            statement.setString(1, rowData.get(1));
            statement.setString(2, rowData.get(2));
            statement.setString(3, rowData.get(3));
            statement.setString(4, rowData.get(0));
            statement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private void insertRowIntoDatabase(List<String> rowData) {
        try {
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab6", "root", "1234");
            PreparedStatement statement = connection.prepareStatement("INSERT INTO lab6 (PIB, NUM, TOWN, STREET) VALUES (?, ?, ?, ?)");
            statement.setString(1, rowData.get(0));
            statement.setString(2, rowData.get(1));
            statement.setString(3, rowData.get(2));
            statement.setString(4, rowData.get(3));
            statement.executeUpdate();
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    private void deleteRowFromDatabase(String pib) {
    try {
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/lab6", "root", "1234");
        PreparedStatement statement = connection.prepareStatement("DELETE FROM lab6 WHERE PIB = ?");
        statement.setString(1, pib);
        statement.executeUpdate();
        connection.close();
    } catch (SQLException e) {
        e.printStackTrace();
    }
}

/*
    private void deleteDataFromTable() {
        String url = "jdbc:mysql://localhost:3306/lab6";
        String user = "root";
        String password = "1234";

        try (Connection connection = DriverManager.getConnection(url, user, password)) {
            Statement statement = connection.createStatement();
            String sql = "DELETE FROM lab6";
            statement.executeUpdate(sql);
        } catch (SQLException e) {
        }
    }
*/
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
