/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subForm;

import connector.MySqlCon;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Afif Bahtiar
 */
public class kelolaPengembalian extends javax.swing.JPanel {

    /**
     * Creates new form kelolaPeminjaman
     */
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat tgl = new SimpleDateFormat("dd-MM-yyyy");
    String Tanggal = tgl.format(cal.getTime());
    public kelolaPengembalian() {
        initComponents();
        showTbPengembalian("select * from transaksi_pengembalian");
    }
    
    private void showTbPengembalian(String query) {
        try {
            Statement st = MySqlCon.getConnection().createStatement();
            try {
                Object[] rows = {"Id pengembalian", "Id peminjaman", "Nip", "Tanggal pengembalian", "Denda"};
                DefaultTableModel dtm = new DefaultTableModel(null, rows);
                tbPengembalian.setModel(dtm);
                tbPengembalian.setBorder(null);
                jScrollPane1.setVisible(true);
                jScrollPane1.setViewportView(tbPengembalian);
                String id, idPinjam, nip, tanggal, denda;
                try {

                    ResultSet rs = st.executeQuery(query);
                    while (rs.next()) {
                        id = rs.getString("id_pengembalian");
                        idPinjam = rs.getString("id_peminjaman");
                        nip = rs.getString("nip");
                        tanggal = rs.getString("tanggal");
                        denda = rs.getString("jumlah_denda");

                        String[] row = {"" + id, idPinjam, nip, tanggal, denda};
                        dtm.addRow(row);
                    }

                } catch (SQLException en) {
                    JOptionPane.showMessageDialog(null, "Data yang anda masukkan tidak valid " + en);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Query Salah " + e);
            }
        } catch (Exception ex) {
            Logger.getLogger(kelolaPeminjam.class.getName()).log(Level.SEVERE, null, ex);
        }
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
        tbPengembalian = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        cariTf = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        showAllBtn = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(1311, 559));

        tbPengembalian.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tbPengembalian);

        jButton1.setText("Cari");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel1.setText("Cari data pencarian berdasarkan ID nya!!");

        showAllBtn.setText("Show All");
        showAllBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showAllBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1299, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cariTf, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton1))
                            .addComponent(showAllBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(3, 3, 3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(cariTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 233, Short.MAX_VALUE)
                .addComponent(showAllBtn)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        showTbPengembalian("select * from transaksi_pengembalian where id_pengembalian = '"+cariTf.getText()+"'");
    }//GEN-LAST:event_jButton1ActionPerformed

    private void showAllBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showAllBtnActionPerformed
        // TODO add your handling code here:
        showTbPengembalian("select * from transaksi_pengembalian");
    }//GEN-LAST:event_showAllBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField cariTf;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton showAllBtn;
    private javax.swing.JTable tbPengembalian;
    // End of variables declaration//GEN-END:variables
}
