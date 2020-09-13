/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lib_project;

import Controller.DAO_Login;

/**
 *
 * @author Phuong Thang
 */
public class fHeThong extends javax.swing.JFrame {

    /**
     * Creates new form fHeThong
     */
    public fHeThong() {
        initComponents();
        if("admin".equals(new DAO_Login().QuyenTruyCap(fLogin.usernamee)))
        {
            MenuDangKyTaiKhoan.setVisible(true);
            MenuQuanLiTaiKhoan.setVisible(true);
        }
        else
        {
            MenuDangKyTaiKhoan.setVisible(false);
            MenuQuanLiTaiKhoan.setVisible(false);
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

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuTaiKhoan = new javax.swing.JMenu();
        MenuDangKyTaiKhoan = new javax.swing.JMenu();
        MenuDoiMatKhau = new javax.swing.JMenu();
        MenuQuanLiTaiKhoan = new javax.swing.JMenu();
        MenuDocGia = new javax.swing.JMenu();
        MenuSach = new javax.swing.JMenu();
        MenuCapNhatSach = new javax.swing.JMenu();
        MenuQuanLiSach = new javax.swing.JMenu();
        MenuThongKeSach = new javax.swing.JMenu();
        MenuDichVu = new javax.swing.JMenu();
        MenuMuonSach = new javax.swing.JMenu();
        MenuTraSach = new javax.swing.JMenu();
        MenuThongKe = new javax.swing.JMenu();
        MenuLienHe = new javax.swing.JMenu();
        MenuThoat = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Hệ Thống");

        jPanel1.setBackground(new java.awt.Color(52, 73, 94));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/applications-2-icon (2).png"))); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(375, 375, 375)
                .addComponent(jLabel1)
                .addContainerGap(412, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(jLabel1)
                .addContainerGap(130, Short.MAX_VALUE))
        );

        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        MenuTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/lock.png"))); // NOI18N
        MenuTaiKhoan.setText("Tài Khoản");
        MenuTaiKhoan.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        MenuDangKyTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/add.png"))); // NOI18N
        MenuDangKyTaiKhoan.setText("Đăng ký tài khoản");
        MenuDangKyTaiKhoan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuDangKyTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuDangKyTaiKhoanMouseClicked(evt);
            }
        });
        MenuTaiKhoan.add(MenuDangKyTaiKhoan);

        MenuDoiMatKhau.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/update.png"))); // NOI18N
        MenuDoiMatKhau.setText("Đổi mật khẩu");
        MenuDoiMatKhau.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuDoiMatKhau.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuDoiMatKhauMouseClicked(evt);
            }
        });
        MenuTaiKhoan.add(MenuDoiMatKhau);

        MenuQuanLiTaiKhoan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/system-file-manager-icon.png"))); // NOI18N
        MenuQuanLiTaiKhoan.setText("Quản lí tài khoản");
        MenuQuanLiTaiKhoan.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuQuanLiTaiKhoan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuQuanLiTaiKhoanMouseClicked(evt);
            }
        });
        MenuTaiKhoan.add(MenuQuanLiTaiKhoan);

        jMenuBar1.add(MenuTaiKhoan);

        MenuDocGia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/priest.png"))); // NOI18N
        MenuDocGia.setText("Độc Giả");
        MenuDocGia.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        MenuDocGia.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuDocGiaMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuDocGia);

        MenuSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/book.png"))); // NOI18N
        MenuSach.setText("Sách");
        MenuSach.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        MenuCapNhatSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/book_add.png"))); // NOI18N
        MenuCapNhatSach.setText("Cập nhật sách");
        MenuCapNhatSach.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuCapNhatSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuCapNhatSachMouseClicked(evt);
            }
        });
        MenuSach.add(MenuCapNhatSach);

        MenuQuanLiSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Folder-Library-icon.png"))); // NOI18N
        MenuQuanLiSach.setText("Quản lí sách");
        MenuQuanLiSach.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuQuanLiSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuQuanLiSachMouseClicked(evt);
            }
        });
        MenuSach.add(MenuQuanLiSach);

        MenuThongKeSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Folder-Book-icon.png"))); // NOI18N
        MenuThongKeSach.setText("Thống kê sách");
        MenuThongKeSach.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuThongKeSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuThongKeSachMouseClicked(evt);
            }
        });
        MenuSach.add(MenuThongKeSach);

        jMenuBar1.add(MenuSach);

        MenuDichVu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/library.png"))); // NOI18N
        MenuDichVu.setText("Dịch Vụ");
        MenuDichVu.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        MenuMuonSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/books.png"))); // NOI18N
        MenuMuonSach.setText("Mượn sách");
        MenuMuonSach.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuMuonSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuMuonSachMouseClicked(evt);
            }
        });
        MenuDichVu.add(MenuMuonSach);

        MenuTraSach.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/book (1).png"))); // NOI18N
        MenuTraSach.setText("Trả sách");
        MenuTraSach.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        MenuTraSach.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuTraSachMouseClicked(evt);
            }
        });
        MenuDichVu.add(MenuTraSach);

        jMenuBar1.add(MenuDichVu);

        MenuThongKe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/chart.png"))); // NOI18N
        MenuThongKe.setText("Thống Kê");
        MenuThongKe.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        MenuThongKe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuThongKeMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuThongKe);

        MenuLienHe.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/phone.png"))); // NOI18N
        MenuLienHe.setText("Liên Hệ");
        MenuLienHe.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        MenuLienHe.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuLienHeMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuLienHe);

        MenuThoat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icon/Places-mail-folder-outbox-icon.png"))); // NOI18N
        MenuThoat.setText("Thoát");
        MenuThoat.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        MenuThoat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MenuThoatMouseClicked(evt);
            }
        });
        jMenuBar1.add(MenuThoat);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void MenuDangKyTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuDangKyTaiKhoanMouseClicked
            this.setVisible(false);
            fDangKy dangky = new fDangKy();
            dangky.setLocationRelativeTo(null);
            dangky.setVisible(true);
    }//GEN-LAST:event_MenuDangKyTaiKhoanMouseClicked

    private void MenuThoatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuThoatMouseClicked
            this.setVisible(false);
            fLogin login = new fLogin();
            login.setLocationRelativeTo(null);
            login.setVisible(true);
    }//GEN-LAST:event_MenuThoatMouseClicked

    private void MenuDoiMatKhauMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuDoiMatKhauMouseClicked
            this.setVisible(false);
            fDoiMatKhau doimatkhau = new fDoiMatKhau();
            doimatkhau.setLocationRelativeTo(null);
            doimatkhau.setVisible(true);
    }//GEN-LAST:event_MenuDoiMatKhauMouseClicked

    private void MenuQuanLiTaiKhoanMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuQuanLiTaiKhoanMouseClicked
            this.setVisible(false);
            fQuanLiTaiKhoan quanlitaikhoan = new fQuanLiTaiKhoan();
            quanlitaikhoan.setLocationRelativeTo(null);
            quanlitaikhoan.setVisible(true);
    }//GEN-LAST:event_MenuQuanLiTaiKhoanMouseClicked

    private void MenuDocGiaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuDocGiaMouseClicked
            this.setVisible(false);
            fDocGia docgia = new fDocGia();
            docgia.setLocationRelativeTo(null);
            docgia.setVisible(true);
    }//GEN-LAST:event_MenuDocGiaMouseClicked

    private void MenuCapNhatSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuCapNhatSachMouseClicked
            this.setVisible(false);
            fSach sach = new fSach();
            sach.setLocationRelativeTo(null);
            sach.setVisible(true);
    }//GEN-LAST:event_MenuCapNhatSachMouseClicked

    private void MenuMuonSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuMuonSachMouseClicked
            this.setVisible(false);
            fMuonSach muonsach = new fMuonSach();
            muonsach.setLocationRelativeTo(null);
            muonsach.setVisible(true);
    }//GEN-LAST:event_MenuMuonSachMouseClicked

    private void MenuQuanLiSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuQuanLiSachMouseClicked
            this.setVisible(false);
            fQuanLiSach quanlisach = new fQuanLiSach();
            quanlisach.setLocationRelativeTo(null);
            quanlisach.setVisible(true);
    }//GEN-LAST:event_MenuQuanLiSachMouseClicked

    private void MenuTraSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuTraSachMouseClicked
            this.setVisible(false);
            fTraSach trasach = new fTraSach();
            trasach.setLocationRelativeTo(null);
            trasach.setVisible(true);
    }//GEN-LAST:event_MenuTraSachMouseClicked

    private void MenuThongKeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuThongKeMouseClicked
            this.setVisible(false);
            fThongKe tk = new fThongKe();
            tk.setLocationRelativeTo(null);
            tk.setVisible(true);
    }//GEN-LAST:event_MenuThongKeMouseClicked

    private void MenuThongKeSachMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuThongKeSachMouseClicked
            this.setVisible(false);
            fThongKeSach tks = new fThongKeSach();
            tks.setLocationRelativeTo(null);
            tks.setVisible(true);
    }//GEN-LAST:event_MenuThongKeSachMouseClicked

    private void MenuLienHeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MenuLienHeMouseClicked
            this.setVisible(false);
            fLienHe contact = new fLienHe();
            contact.setLocationRelativeTo(null);
            contact.setVisible(true);
    }//GEN-LAST:event_MenuLienHeMouseClicked

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
            java.util.logging.Logger.getLogger(fHeThong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(fHeThong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(fHeThong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(fHeThong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new fHeThong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu MenuCapNhatSach;
    private javax.swing.JMenu MenuDangKyTaiKhoan;
    private javax.swing.JMenu MenuDichVu;
    private javax.swing.JMenu MenuDocGia;
    private javax.swing.JMenu MenuDoiMatKhau;
    private javax.swing.JMenu MenuLienHe;
    private javax.swing.JMenu MenuMuonSach;
    private javax.swing.JMenu MenuQuanLiSach;
    private javax.swing.JMenu MenuQuanLiTaiKhoan;
    private javax.swing.JMenu MenuSach;
    private javax.swing.JMenu MenuTaiKhoan;
    private javax.swing.JMenu MenuThoat;
    private javax.swing.JMenu MenuThongKe;
    private javax.swing.JMenu MenuThongKeSach;
    private javax.swing.JMenu MenuTraSach;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}