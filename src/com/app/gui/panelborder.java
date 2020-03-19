package com.app.gui;

import java.awt.event.KeyEvent;
import javax.swing.JOptionPane;

public class panelborder extends javax.swing.JPanel {
    public panelborder() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        textAngkaPertama = new javax.swing.JTextField();
        textAngkaKedua = new javax.swing.JTextField();
        textHasil = new javax.swing.JTextField();
        jButtonTambah = new javax.swing.JButton();
        jButtonKurang = new javax.swing.JButton();
        jButtonBagi = new javax.swing.JButton();
        jButtonKali = new javax.swing.JButton();
        jButtonExit = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButtonExitHapus = new javax.swing.JButton();

        setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Operasi Dua Angka", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 11))); // NOI18N

        textAngkaPertama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAngkaPertamaActionPerformed(evt);
            }
        });
        textAngkaPertama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textAngkaPertamaKeyTyped(evt);
            }
        });

        textAngkaKedua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textAngkaKeduaActionPerformed(evt);
            }
        });
        textAngkaKedua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                textAngkaKeduaKeyTyped(evt);
            }
        });

        textHasil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                textHasilActionPerformed(evt);
            }
        });

        jButtonTambah.setBackground(new java.awt.Color(0, 0, 204));
        jButtonTambah.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonTambah.setText("Tambah");
        jButtonTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonTambahActionPerformed(evt);
            }
        });

        jButtonKurang.setBackground(new java.awt.Color(0, 51, 204));
        jButtonKurang.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonKurang.setText("Kurang");
        jButtonKurang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKurangActionPerformed(evt);
            }
        });

        jButtonBagi.setBackground(new java.awt.Color(0, 0, 204));
        jButtonBagi.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonBagi.setText("Bagi");
        jButtonBagi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonBagiActionPerformed(evt);
            }
        });

        jButtonKali.setBackground(new java.awt.Color(0, 0, 204));
        jButtonKali.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonKali.setText("Kali");
        jButtonKali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonKaliActionPerformed(evt);
            }
        });

        jButtonExit.setBackground(new java.awt.Color(0, 0, 204));
        jButtonExit.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonExit.setText("Exit");
        jButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Angka Pertama");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Angka Kedua");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Hasil");

        jButtonExitHapus.setBackground(new java.awt.Color(0, 0, 204));
        jButtonExitHapus.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jButtonExitHapus.setText("Hapus");
        jButtonExitHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButtonExitHapusActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(textHasil, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(textAngkaPertama, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(textAngkaKedua, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jButtonExitHapus, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonTambah, javax.swing.GroupLayout.DEFAULT_SIZE, 83, Short.MAX_VALUE)
                            .addComponent(jButtonKurang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButtonKali, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButtonBagi, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                            .addComponent(jButtonExit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(25, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAngkaPertama))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textAngkaKedua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(textHasil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonTambah)
                    .addComponent(jButtonKali))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonKurang)
                    .addComponent(jButtonBagi))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButtonExitHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButtonExit, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void textAngkaPertamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAngkaPertamaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAngkaPertamaActionPerformed

    private void textAngkaKeduaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textAngkaKeduaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textAngkaKeduaActionPerformed

    private void textHasilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_textHasilActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_textHasilActionPerformed

    private void jButtonTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonTambahActionPerformed
prosesTambah();
      
    }//GEN-LAST:event_jButtonTambahActionPerformed

    private void jButtonKaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKaliActionPerformed
prosesKali();
    }//GEN-LAST:event_jButtonKaliActionPerformed

    private void jButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitActionPerformed
prosesExit();
    }//GEN-LAST:event_jButtonExitActionPerformed

    private void jButtonBagiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonBagiActionPerformed
  prosesBagi();      // TODO add your handling code here:
    }//GEN-LAST:event_jButtonBagiActionPerformed

    private void textAngkaKeduaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAngkaKeduaKeyTyped
        // TODO add your handling code here:
    }//GEN-LAST:event_textAngkaKeduaKeyTyped

    private void jButtonKurangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonKurangActionPerformed
prosesKurang();    }//GEN-LAST:event_jButtonKurangActionPerformed

    private void jButtonExitHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButtonExitHapusActionPerformed
prosesHapus();
    }//GEN-LAST:event_jButtonExitHapusActionPerformed

    private void textAngkaPertamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_textAngkaPertamaKeyTyped
  char c = evt.getKeyChar();
        if (!(Character.isDigit(c)
                || (c == KeyEvent.VK_BACK_SPACE)
                || (c == KeyEvent.VK_DELETE))){
            getToolkit().beep();
            JOptionPane.showMessageDialog(null, "Harus Numerik !!");
            evt.consume();
            
    }//GEN-LAST:event_textAngkaPertamaKeyTyped
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButtonBagi;
    private javax.swing.JButton jButtonExit;
    private javax.swing.JButton jButtonExitHapus;
    private javax.swing.JButton jButtonKali;
    private javax.swing.JButton jButtonKurang;
    private javax.swing.JButton jButtonTambah;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JTextField textAngkaKedua;
    private javax.swing.JTextField textAngkaPertama;
    private javax.swing.JTextField textHasil;
    // End of variables declaration//GEN-END:variables

   private void prosesTambah() {
    String strAngkaPertama = textAngkaPertama.getText();
    String strAngkaKedua = textAngkaKedua.getText();
    int AngkaPertama = Integer.valueOf(strAngkaPertama);
    int AngkaKedua = Integer.valueOf(strAngkaKedua);
    int Hasil = AngkaPertama + AngkaKedua;
    textHasil.setText(Hasil + "");

    }

    private void prosesKurang() {
    String strAngkaPertama = textAngkaPertama.getText();
    String strAngkaKedua = textAngkaKedua.getText();
    int AngkaPertama = Integer.valueOf(strAngkaPertama);
    int AngkaKedua = Integer.valueOf(strAngkaKedua);
    int Hasil = AngkaPertama - AngkaKedua;
    textHasil.setText(Hasil + "");

    }

    private void prosesKali() {
    String strAngkaPertama = textAngkaPertama.getText();
    String strAngkaKedua = textAngkaKedua.getText();
    int AngkaPertama = Integer.valueOf(strAngkaPertama);
    int AngkaKedua = Integer.valueOf(strAngkaKedua);
    int Hasil = AngkaPertama * AngkaKedua;
    textHasil.setText(Hasil + "");

    }

    private void prosesBagi() {
    String strAngkaPertama = textAngkaPertama.getText();
    String strAngkaKedua = textAngkaKedua.getText();
    int AngkaPertama = Integer.valueOf(strAngkaPertama);
    int AngkaKedua = Integer.valueOf(strAngkaKedua);
    int Hasil = AngkaPertama / AngkaKedua;
    textHasil.setText(Hasil + "");
    }

    private void prosesHapus() {
    textAngkaPertama.setText("");
    textAngkaKedua.setText("");
    textHasil.setText("");
    textAngkaPertama.requestFocus();

    }

    private void prosesExit() {
    boolean yakin = JOptionPane.showConfirmDialog(this, "Yakin akan keluar?", 
                "Konfirmasi", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION;
        if(yakin){
            System.exit(0);
          
    }
}
}