/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package form;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admin
 */
public class formQLBH extends javax.swing.JFrame {

    /**
     * Creates new form formQLBH
     */
    public formQLBH() {
        initComponents();
        setLocationRelativeTo(null);
    }
    private int index = 0;
    DefaultTableModel tblModelSanPham;
    BanHangController bhc = new BanHangController();
    ArrayList<SanPhamModel> listSanPham = bhc.getList();
    ArrayList<SanPhamModel> listGioHang = bhc.spGioHang;
    ArrayList<HoaDon> listHoaDon = bhc.listHD;
    ArrayList<HoaDon> choThanhToan = bhc.choThanhToan;
    ArrayList<SanPhamModel> spGioHang = bhc.spGioHang;
    ArrayList<HoaDon> daThanhtoan = new ArrayList<>();
//    HoaDon hd;

    private void resetTable(JTable tbl) {
        tblModelSanPham = (DefaultTableModel) tbl.getModel();
        tblModelSanPham.setRowCount(0);
    }

    private void fillTableHoadon(ArrayList<HoaDon> list) {
        tblModelSanPham = (DefaultTableModel) tblhoadon.getModel();
        tblModelSanPham.setRowCount(0);

        for (HoaDon hoaDon : list) {
            tblModelSanPham.addRow(new Object[]{hoaDon.getIndex(), hoaDon.getMaHD(), hoaDon.getNgayTao(), hoaDon.getTenNV(), hoaDon.getTinhTrang()});
        }
    }

    private void checkPay(ArrayList<HoaDon> list) {
        System.out.println(tblhoadon.getSelectedRow());
        HoaDon hd = list.get(tblhoadon.getSelectedRow());
        if (hd.getTinhTrang().equals("Đã Thanh Toán")) {
            JOptionPane.showMessageDialog(this, "Hóa đơn đã được thanh toán");
        } else {
            txtBillId.setText(hd.getMaHD());
            txtDateCreate.setText(hd.getNgayTao());
            txtStaffName.setText(hd.getTenNV());
            txtTotal.setText(String.valueOf(hd.getTongTien()));
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        btnMakeBill = new javax.swing.JButton();
        rdoNeedPay = new javax.swing.JRadioButton();
        rdoAll = new javax.swing.JRadioButton();
        rdoCancelled = new javax.swing.JRadioButton();
        rdoPaid = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblhoadon = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblCart = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtBillId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtStaffName = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtTotal = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtMoneyPay = new javax.swing.JTextField();
        txtChange = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnPay = new javax.swing.JButton();
        txtDateCreate = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblProducts = new javax.swing.JTable();
        txtInput = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnMakeBill.setText("Tạo Hóa Đơn");
        btnMakeBill.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMakeBillActionPerformed(evt);
            }
        });

        buttonGroup1.add(rdoNeedPay);
        rdoNeedPay.setText("Chờ Thanh Toán");
        rdoNeedPay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdoNeedPayMouseClicked(evt);
            }
        });

        buttonGroup1.add(rdoAll);
        rdoAll.setSelected(true);
        rdoAll.setText("Tất Cả");
        rdoAll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdoAllMouseClicked(evt);
            }
        });

        buttonGroup1.add(rdoCancelled);
        rdoCancelled.setText("Đã Hủy");

        buttonGroup1.add(rdoPaid);
        rdoPaid.setText("Đã Thanh Toán");
        rdoPaid.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                rdoPaidMouseClicked(evt);
            }
        });

        tblhoadon.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã HĐ", "Ngày Tạo", "Tên Nhân Viên", "Tình Trạng"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Object.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblhoadon.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblhoadonMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblhoadon);

        jPanel1.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true)));

        tblCart.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Sản Phẩm", "Tên Sản Phẩm", "Số Lượng", "Đơn Giá", "Thành Tiền"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(tblCart);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true)));

        jLabel2.setText("Mã Hd");

        txtBillId.setEnabled(false);

        jLabel3.setText("Ngày Tạo");

        jLabel4.setText("Tên Nv");

        txtStaffName.setEnabled(false);

        jLabel5.setText("Tổng Tiền");

        txtTotal.setEnabled(false);

        jLabel6.setText("Tiền Khách Đưa");

        txtMoneyPay.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtMoneyPayFocusLost(evt);
            }
        });

        jLabel7.setText("Tiền Thừa");

        btnPay.setText("Thanh Toán");
        btnPay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPayActionPerformed(evt);
            }
        });

        txtDateCreate.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtBillId)
                            .addComponent(txtDateCreate)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel7)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(txtMoneyPay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 213, Short.MAX_VALUE)
                            .addComponent(btnPay, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtChange, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTotal)
                            .addComponent(txtStaffName))))
                .addGap(6, 6, 6))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtBillId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtDateCreate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtStaffName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtMoneyPay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtChange, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(btnPay, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(24, Short.MAX_VALUE))
        );

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Hóa Đơn");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Giỏ Hàng");

        jPanel3.setBorder(javax.swing.BorderFactory.createCompoundBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED), new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 3, true)));

        tblProducts.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Sản Phẩm", "Tên Sản Phẩm", "Năm Bán", "Trọng Lượng", "Mô Tả", "SL SP", "Giá Nhập", "Giá Bán"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblProducts.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblProductsMouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tblProducts);
        if (tblProducts.getColumnModel().getColumnCount() > 0) {
            tblProducts.getColumnModel().getColumn(0).setResizable(false);
            tblProducts.getColumnModel().getColumn(1).setResizable(false);
            tblProducts.getColumnModel().getColumn(2).setResizable(false);
            tblProducts.getColumnModel().getColumn(3).setResizable(false);
            tblProducts.getColumnModel().getColumn(4).setResizable(false);
            tblProducts.getColumnModel().getColumn(5).setResizable(false);
            tblProducts.getColumnModel().getColumn(6).setResizable(false);
            tblProducts.getColumnModel().getColumn(7).setResizable(false);
            tblProducts.getColumnModel().getColumn(8).setResizable(false);
        }

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 241, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(txtInput, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21))
        );

        jLabel10.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel10.setText("Sản Phẩm");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(btnMakeBill, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(22, 22, 22)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(rdoNeedPay)
                                    .addGap(18, 18, 18)
                                    .addComponent(rdoAll)
                                    .addGap(18, 18, 18)
                                    .addComponent(rdoCancelled)
                                    .addGap(18, 18, 18)
                                    .addComponent(rdoPaid))
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)))
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel9))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10)
                            .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25)))
                .addGap(57, 57, 57)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdoNeedPay)
                    .addComponent(rdoAll)
                    .addComponent(rdoCancelled)
                    .addComponent(rdoPaid)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnMakeBill, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 206, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(25, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tblProductsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblProductsMouseClicked
        tblModelSanPham = (DefaultTableModel) tblCart.getModel();
        SanPhamModel spm = listSanPham.get(tblProducts.getSelectedRow());
        bhc.addCart(spm);
        LoadDataSanPham(listSanPham);
        LoadDataCart(bhc.spGioHang);
    }//GEN-LAST:event_tblProductsMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        LoadDataSanPham(listSanPham);
        resetTable(tblCart);
        resetTable(tblhoadon);
    }//GEN-LAST:event_formWindowOpened

    private void btnMakeBillActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMakeBillActionPerformed
        // TODO add your handling code here:
        index++;
        if (tblCart.getRowCount() <= 0) {
            JOptionPane.showMessageDialog(this, "Ban chua chon mat hang de mua");
        } else {
            bhc.getHoaDon(index);
            tblModelSanPham = (DefaultTableModel) tblhoadon.getModel();
            tblModelSanPham.setRowCount(0);
            for (HoaDon hoaDon : listHoaDon) {
                tblModelSanPham.addRow(new Object[]{hoaDon.getIndex(), hoaDon.getMaHD(), hoaDon.getNgayTao(), hoaDon.getTenNV(), hoaDon.getTinhTrang()});
            }
            rdoAll.setSelected(true);
            listGioHang.clear();
            resetTable(tblCart);
        }
    }//GEN-LAST:event_btnMakeBillActionPerformed

    private void tblhoadonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblhoadonMouseClicked
        if (rdoNeedPay.isSelected()) {
            HoaDon hd = choThanhToan.get(tblhoadon.getSelectedRow());
            if (hd.getTinhTrang().equalsIgnoreCase("Đã Thanh Toán")) {
                JOptionPane.showMessageDialog(this, "Hóa đơn đã được thanh toán");
            } else {
                txtBillId.setText(hd.getMaHD());
                txtDateCreate.setText(hd.getNgayTao());
                txtStaffName.setText(hd.getTenNV());
                txtTotal.setText(String.valueOf(hd.getTongTien()));
            }
        }else{
            HoaDon hd = listHoaDon.get(tblhoadon.getSelectedRow());
            if (hd.getTinhTrang().equalsIgnoreCase("Đã Thanh Toán")) {
                JOptionPane.showMessageDialog(this, "Hóa đơn đã được thanh toán");
            } else {
                txtBillId.setText(hd.getMaHD());
                txtDateCreate.setText(hd.getNgayTao());
                txtStaffName.setText(hd.getTenNV());
                txtTotal.setText(String.valueOf(hd.getTongTien()));
            }
        }


    }//GEN-LAST:event_tblhoadonMouseClicked

    private void txtMoneyPayFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtMoneyPayFocusLost

//        if (txtMoneyPay.getText().isBlank()) {
//            JOptionPane.showMessageDialog(this, "So tien khach tra khong duoc de trong");
//        }
        try {
            Double.valueOf(txtMoneyPay.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tien nhap vao khong dung dinh dang");
            return;
        }
        if (Double.parseDouble(txtMoneyPay.getText()) < Double.parseDouble(txtTotal.getText())) {
            JOptionPane.showMessageDialog(this, "So tien khach tra khong duoc nho hon tong tien");
        } else {
            HoaDon hd = listHoaDon.get(tblhoadon.getSelectedRow());
            txtChange.setText(String.valueOf(Double.parseDouble(txtMoneyPay.getText()) - hd.getTongTien()));
        }
    }//GEN-LAST:event_txtMoneyPayFocusLost

    private void btnPayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPayActionPerformed

        try {
            if (tblhoadon.getSelectedRow() < 0) {
                JOptionPane.showMessageDialog(this, "Ban chua chon hoa don de thanh toan");
                return;
            }
            Double.valueOf(txtMoneyPay.getText());
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Tien nhap vao khong dung dinh dang");
            return;
        }
        if (Double.parseDouble(txtMoneyPay.getText()) < Double.parseDouble(txtTotal.getText())) {
            JOptionPane.showMessageDialog(this, "So tien khach tra khong duoc nho hon tong tien");
            return;
        } else {
            HoaDon vitri = choThanhToan.get(tblhoadon.getSelectedRow());
            HoaDon hd = listHoaDon.get(tblhoadon.getSelectedRow());
            hd.setTinhTrang("Đã Thanh Toán");
            vitri.setTinhTrang("Đã Thanh Toán");
            daThanhtoan.add(new HoaDon(vitri.getIndex(), vitri.getMaHD(), vitri.getNgayTao(), vitri.getTenNV(), "Đã Thanh toán", 0));
            choThanhToan.remove(tblhoadon.getSelectedRow());
            txtBillId.setText("");
            txtChange.setText("");
            txtDateCreate.setText("");
            txtTotal.setText("");
            txtMoneyPay.setText("");
            txtStaffName.setText("");
        }

        if (rdoAll.isSelected()) {
            fillTableHoadon(listHoaDon);
        } else {
            fillTableHoadon(choThanhToan);
        }
    }//GEN-LAST:event_btnPayActionPerformed

    private void rdoNeedPayMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoNeedPayMouseClicked
        fillTableHoadon(choThanhToan);
    }//GEN-LAST:event_rdoNeedPayMouseClicked

    private void rdoAllMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoAllMouseClicked
        fillTableHoadon(listHoaDon);
    }//GEN-LAST:event_rdoAllMouseClicked

    private void rdoPaidMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_rdoPaidMouseClicked
        fillTableHoadon(daThanhtoan);
    }//GEN-LAST:event_rdoPaidMouseClicked

    public void LoadDataSanPham(ArrayList<SanPhamModel> listSp) {
        tblModelSanPham = (DefaultTableModel) tblProducts.getModel();

        tblModelSanPham.setRowCount(0);
        for (SanPhamModel spm : listSp) {
            tblModelSanPham.addRow(new Object[]{
                spm.getIndex(), spm.getMaSp(), spm.getTenSp(), spm.getNamBan(), spm.getTrongLuong(), spm.getMota(),
                spm.getSoLuong(), spm.getGiaNhap(), spm.getGiaBan()
            });
        }
    }

    public void LoadDataCart(ArrayList<SanPhamModel> listSp) {
        tblModelSanPham = (DefaultTableModel) tblCart.getModel();
        tblModelSanPham.setRowCount(0);
        for (SanPhamModel spCart : listSp) {
            tblModelSanPham.addRow(new Object[]{
                spCart.getIndex(), spCart.getMaSp(), spCart.getTenSp(), spCart.getSoLuong(), spCart.getGiaBan(), spCart.getThanhTien()
            });
        }
    }

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
            java.util.logging.Logger.getLogger(formQLBH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(formQLBH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(formQLBH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(formQLBH.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new formQLBH().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMakeBill;
    private javax.swing.JButton btnPay;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel10;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JRadioButton rdoAll;
    private javax.swing.JRadioButton rdoCancelled;
    private javax.swing.JRadioButton rdoNeedPay;
    private javax.swing.JRadioButton rdoPaid;
    private javax.swing.JTable tblCart;
    private javax.swing.JTable tblProducts;
    private javax.swing.JTable tblhoadon;
    private javax.swing.JTextField txtBillId;
    private javax.swing.JTextField txtChange;
    private javax.swing.JTextField txtDateCreate;
    private javax.swing.JTextField txtInput;
    private javax.swing.JTextField txtMoneyPay;
    private javax.swing.JTextField txtStaffName;
    private javax.swing.JTextField txtTotal;
    // End of variables declaration//GEN-END:variables
}
