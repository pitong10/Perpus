/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subForm;

import connector.MySqlCon;
import data.Data;
import java.awt.Image;
import java.awt.Toolkit;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Afif Bahtiar
 */
public class profilPetugas extends javax.swing.JPanel {

    /**
     * Creates new form inputPeminjaman
     */
    Calendar cal = Calendar.getInstance();
    SimpleDateFormat tgl = new SimpleDateFormat("dd-MM-yyyy");
    String Tanggal = tgl.format(cal.getTime());
    
    String idPetugas = Data.getUserId();

    public profilPetugas() {
        initComponents();
        todayDate.setText(Tanggal);
        
        String sql = "select * from petugas where id_petugas = '" + idPetugas + "'";
        try {
            Statement st = MySqlCon.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                idLbl.setText(rs.getString("id_petugas"));
                namaLbl.setText(rs.getString("nama_petugas"));
                jekelLbl.setText(rs.getString("jekel"));
                alamatLbl.setText(rs.getString("alamat"));
                telpLbl.setText(rs.getString("telp"));

            } else {
                JOptionPane.showMessageDialog(this, "Terdapat kesalahan!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Query salah " + e);
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

        jLabel1 = new javax.swing.JLabel();
        todayDate = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        namaTf = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        telpTf = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        idTf = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        insertBtn = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        clearBtn = new javax.swing.JButton();
        jekelCb = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        alamatTa = new javax.swing.JTextArea();
        jLabel10 = new javax.swing.JLabel();
        usernameTf = new javax.swing.JTextField();
        passwdTf = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        ubahBtn = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel14 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        idLbl = new javax.swing.JLabel();
        namaLbl = new javax.swing.JLabel();
        jekelLbl = new javax.swing.JLabel();
        alamatLbl = new javax.swing.JLabel();
        telpLbl = new javax.swing.JLabel();

        setName("Input Peminjaman"); // NOI18N
        setPreferredSize(new java.awt.Dimension(1311, 559));

        jLabel1.setText("Server Date :");

        todayDate.setText("Today_date");

        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel4.setText("+62");

        jLabel3.setText("Id Petugas                          :");

        jLabel5.setText("Nama Petugas                  :");

        jLabel7.setText("Jenis Kelamin                   :");

        insertBtn.setText("Update");
        insertBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                insertBtnActionPerformed(evt);
            }
        });

        jLabel2.setText("Alamat                                :");

        jLabel6.setText("Telp                                     :");

        clearBtn.setText("Clear");
        clearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearBtnActionPerformed(evt);
            }
        });

        jekelCb.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Laki - Laki", "Perempuan" }));

        jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel8.setText("Ubah Profil Anda");

        alamatTa.setColumns(20);
        alamatTa.setRows(5);
        jScrollPane3.setViewportView(alamatTa);
        alamatTa.setEditable(false);

        jLabel10.setText("Username                         :");

        jLabel11.setText("Password                         :");

        ubahBtn.setText("Ubah Profil Saya");
        ubahBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ubahBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(jLabel8))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel2))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(namaTf, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jekelCb, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(idTf, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(153, 153, 153)
                                        .addComponent(jLabel4))
                                    .addComponent(jLabel6))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(telpTf, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGap(153, 153, 153)
                                .addComponent(insertBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(31, 31, 31)
                                .addComponent(clearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel11))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(passwdTf, javax.swing.GroupLayout.DEFAULT_SIZE, 363, Short.MAX_VALUE)
                                    .addComponent(usernameTf)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(227, 227, 227)
                        .addComponent(ubahBtn)))
                .addContainerGap(54, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ubahBtn)
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(idTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(namaTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jekelCb, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(telpTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(usernameTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(passwdTf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(insertBtn)
                    .addComponent(clearBtn))
                .addGap(15, 15, 15))
        );

        namaTf.setEditable(false);
        telpTf.setEditable(false);
        idTf.setEditable(false);
        insertBtn.setEnabled(false);
        clearBtn.setEnabled(false);
        jekelCb.setEditable(false);
        usernameTf.setEditable(false);
        passwdTf.setEditable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel9.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setText("Profil Anda");

        jPanel4.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel14.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel14.setText("Telp                                     :");

        jLabel18.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel18.setText("Id Petugas                          :");

        jLabel15.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel15.setText("Alamat                                :");

        jLabel16.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel16.setText("Jenis Kelamin                   :");

        jLabel17.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jLabel17.setText("Nama Petugas                  :");

        idLbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        idLbl.setText("-");

        namaLbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        namaLbl.setText("-");

        jekelLbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        jekelLbl.setText("-");

        alamatLbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        alamatLbl.setText("-");
        alamatLbl.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        telpLbl.setFont(new java.awt.Font("Dialog", 0, 12)); // NOI18N
        telpLbl.setText("-");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(122, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel17)
                            .addGap(18, 18, 18)
                            .addComponent(namaLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel18)
                            .addGap(18, 18, 18)
                            .addComponent(idLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel16)
                            .addGap(18, 18, 18)
                            .addComponent(jekelLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel15)
                            .addGap(18, 18, 18)
                            .addComponent(alamatLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addComponent(jLabel14)
                            .addGap(18, 18, 18)
                            .addComponent(telpLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(126, 126, 126))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel18)
                    .addComponent(idLbl))
                .addGap(68, 68, 68)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel17)
                    .addComponent(namaLbl))
                .addGap(70, 70, 70)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16)
                    .addComponent(jekelLbl))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15)
                    .addComponent(alamatLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14)
                    .addComponent(telpLbl))
                .addGap(32, 32, 32))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addGap(256, 256, 256))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(jLabel9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(todayDate))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(todayDate))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void insertBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_insertBtnActionPerformed
        // TODO add your handling code here:
        String query = "update petugas set nama_petugas = '" + namaTf.getText() + "', jekel='" + jekelCb.getSelectedItem() + "', alamat = '" + alamatTa.getText() + "', telp = '" + telpTf.getText() + "',username = '" + usernameTf.getText() + "', passwd = '" + passwdTf.getText() + "' where id_petugas = '" + idTf.getText() + "'";
        try {
            MySqlCon.ExecuteQuery(query, "Data anda berhasil diubah");
            idTf.setText("");
            alamatTa.setText("");
            namaTf.setText("");
            telpTf.setText("");
            usernameTf.setText("");
            passwdTf.setText("");

            namaTf.setEditable(false);
            jekelCb.setEditable(false);
            alamatTa.setEditable(false);
            telpTf.setEditable(false);
            usernameTf.setEditable(false);
            passwdTf.setEditable(false);
            insertBtn.setEnabled(false);
            clearBtn.setEnabled(false);
            ubahBtn.setEnabled(true);
        } catch (Exception ex) {
            Logger.getLogger(profilPetugas.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        String sql = "select * from petugas where id_petugas = '" + Data.getUserId() + "'";

        try {
            Statement st = MySqlCon.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                idLbl.setText(rs.getString("id_petugas"));
                namaLbl.setText(rs.getString("nama_petugas"));
                jekelLbl.setText(rs.getString("jekel"));
                alamatLbl.setText(rs.getString("alamat"));
                telpLbl.setText(rs.getString("telp"));

            } else {
                JOptionPane.showMessageDialog(this, "Terdapat kesalahan!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Query salah " + e);
        }
        
        idTf.setText("");
        alamatTa.setText("");
        namaTf.setText("");
        telpTf.setText("");
        usernameTf.setText("");
        passwdTf.setText("");

        namaTf.setEditable(false);
        jekelCb.setEnabled(false);
        alamatTa.setEditable(false);
        telpTf.setEditable(false);
        usernameTf.setEditable(false);
        passwdTf.setEditable(false);
        insertBtn.setEnabled(false);
        clearBtn.setEnabled(false);
        ubahBtn.setEnabled(true);

    }//GEN-LAST:event_insertBtnActionPerformed

    private void clearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearBtnActionPerformed
        // TODO add your handling code here:
        idTf.setText("");
        alamatTa.setText("");
        namaTf.setText("");
        telpTf.setText("");
        usernameTf.setText("");
        passwdTf.setText("");

        namaTf.setEditable(false);
        jekelCb.setEnabled(false);
        alamatTa.setEditable(false);
        telpTf.setEditable(false);
        usernameTf.setEditable(false);
        passwdTf.setEditable(false);
        insertBtn.setEnabled(false);
        clearBtn.setEnabled(false);
        ubahBtn.setEnabled(true);
    }//GEN-LAST:event_clearBtnActionPerformed

    private void ubahBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ubahBtnActionPerformed
        // TODO add your handling code here:
        String sql = "select * from petugas where id_petugas = '" + Data.getUserId() + "'";

        try {
            Statement st = MySqlCon.getConnection().createStatement();
            ResultSet rs = st.executeQuery(sql);

            if (rs.next()) {
                idTf.setText(rs.getString("id_petugas"));
                namaTf.setText(rs.getString("nama_petugas"));
                jekelCb.setSelectedItem(rs.getString("jekel"));
                alamatTa.setText(rs.getString("alamat"));
                telpTf.setText(rs.getString("telp"));
                usernameTf.setText(rs.getString("username"));
                passwdTf.setText(rs.getString("passwd"));

                namaTf.setEditable(true);
                alamatTa.setEditable(true);
                jekelCb.setEnabled(true);
                telpTf.setEditable(true);
                usernameTf.setEditable(true);
                passwdTf.setEditable(true);
                insertBtn.setEnabled(true);
                clearBtn.setEnabled(true);
                ubahBtn.setEnabled(false);
            } else {
                JOptionPane.showMessageDialog(this, "Terdapat kesalahan!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Query salah " + e);
        }
    }//GEN-LAST:event_ubahBtnActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel alamatLbl;
    private javax.swing.JTextArea alamatTa;
    private javax.swing.JButton clearBtn;
    private javax.swing.JLabel idLbl;
    private javax.swing.JTextField idTf;
    private javax.swing.JButton insertBtn;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JComboBox<String> jekelCb;
    private javax.swing.JLabel jekelLbl;
    private javax.swing.JLabel namaLbl;
    private javax.swing.JTextField namaTf;
    private javax.swing.JTextField passwdTf;
    private javax.swing.JLabel telpLbl;
    private javax.swing.JTextField telpTf;
    private javax.swing.JLabel todayDate;
    private javax.swing.JButton ubahBtn;
    private javax.swing.JTextField usernameTf;
    // End of variables declaration//GEN-END:variables
}
