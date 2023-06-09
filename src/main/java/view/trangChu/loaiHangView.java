package view.trangChu;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.loaiHang;
import repository.loaiHangHoaRepository;

import java.awt.Color;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.awt.event.ActionEvent;



public class loaiHangView extends javax.swing.JFrame implements cuaSoView{

    public loaiHangView() {
        initComponents();
        setLocationRelativeTo(null);
    }

    public void showError(String message) {
       
    }

    public void showError(Exception e) {
     
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        jPanel1.setBorder(null);
        jPanel1.setBackground(new Color(236, 255, 255));
        lbTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel2.setBackground(new Color(236, 255, 255));
        btnOK = new javax.swing.JButton();
        btnOK.addActionListener(new ActionListener() {
        	public void actionPerformed(ActionEvent e) {
        		loaiHang getlh= new loaiHang();
        		loaiHangHoaRepository savelh= new loaiHangHoaRepository();
        		String text= txtName.getText();
        		getlh.setTenLoaiHang(text);
        		try {
					savelh.save(getlh);
					JOptionPane.showMessageDialog(null, "Đã Thêm");
					dispose();
				} catch (SQLException e1) {
					// TODO Auto-generated catch block
					
					e1.printStackTrace();
				}
        		
        	}
        });
        btnCancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jPanel3.setBackground(new Color(236, 255, 255));
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitle.setText("Thêm loại món");
        jPanel1.add(lbTitle, new java.awt.GridBagConstraints());

        getContentPane().add(jPanel1, java.awt.BorderLayout.PAGE_START);

        jPanel2.setPreferredSize(new java.awt.Dimension(300, 50));
        jPanel2.setLayout(new java.awt.GridBagLayout());

        btnOK.setText("Thêm");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.1;
        jPanel2.add(btnOK, gridBagConstraints);

        btnCancel.setText("Hủy");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.weightx = 0.1;
        jPanel2.add(btnCancel, gridBagConstraints);

        getContentPane().add(jPanel2, java.awt.BorderLayout.PAGE_END);

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(5, 5, 5, 5));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("Tên loại:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_END;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(jLabel2, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.fill = java.awt.GridBagConstraints.HORIZONTAL;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.LINE_START;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(txtName, gridBagConstraints);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public JButton getBtnOK() {
        return btnOK;
    }

    public JLabel getLbTitle() {
        return lbTitle;
    }

    public JTextField getTxtName() {
        return txtName;
    }

    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnOK;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtName;
   

}

