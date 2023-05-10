package view.trangChu;

import java.awt.EventQueue;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;

import model.loaiHang;
import models.FoodCategory;
import utils.ErrorPopup;
import java.awt.GridBagConstraints;
import java.awt.Insets;

public class hangHoaView extends JFrame {

	DefaultComboBoxModel<loaiHang> foodCategoryComboBoxModel = new DefaultComboBoxModel<>();

    public hangHoaView() {
        initComponents();
        setLocationRelativeTo(null);
        cboCategory.setModel(foodCategoryComboBoxModel);
    }

    public void showError(String message) {
        ErrorPopup.show(new Exception(message));
    }

    public void showError(Exception e) {
        ErrorPopup.show(e);
    }

    public void showMessage(String message) {
        JOptionPane.showMessageDialog(null, message);
    }

    public JButton getBtnCancel() {
        return btnCancel;
    }

    public void setBtnCancel(JButton btnCancel) {
        this.btnCancel = btnCancel;
    }

    public JButton getBtnChooseImage() {
        return btnChooseImage;
    }

    public void setBtnChooseImage(JButton btnChooseImage) {
        this.btnChooseImage = btnChooseImage;
    }

    public JButton getBtnOK() {
        return btnOK;
    }

    public void setBtnOK(JButton btnOK) {
        this.btnOK = btnOK;
    }

    public JComboBox<loaiHang> getCboCategory() {
        return cboCategory;
    }

    public void setCboCategory(JComboBox<loaiHang> cboCategory) {
        this.cboCategory = cboCategory;
    }

    public JLabel getLbTitle() {
        return lbTitle;
    }

    public void setLbTitle(JLabel lbTitle) {
        this.lbTitle = lbTitle;
    }

  

    public JTextField getTxtName() {
        return txtName;
    }

    public void setTxtName(JTextField txtName) {
        this.txtName = txtName;
    }


    public JTextField getTxtUnitPrice() {
        return txtUnitPrice;
    }

    public void setTxtUnitPrice(JTextField txtUnitPrice) {
        this.txtUnitPrice = txtUnitPrice;
    }

    public JTextField getTxtUrlImage() {
        return txtUrlImage;
    }

    public void setTxtUrlImage(JTextField txtUrlImage) {
        this.txtUrlImage = txtUrlImage;
    }

    public DefaultComboBoxModel<loaiHang> getFoodCategoryComboBoxModel() {
        return foodCategoryComboBoxModel;
    }

    public void setFoodCategoryComboBoxModel(DefaultComboBoxModel<loaiHang> foodCategoryComboBoxModel) {
        this.foodCategoryComboBoxModel = foodCategoryComboBoxModel;
    }

    public JLabel getLbPreviewImage() {
        return lbPreviewImage;
    }
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jPanel1 = new javax.swing.JPanel();
        lbTitle = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        btnOK = new javax.swing.JButton();
        btnCancel = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        txtUrlImage = new javax.swing.JTextField();
        btnChooseImage = new javax.swing.JButton();
        txtUnitPrice = new javax.swing.JTextField();
        cboCategory = new javax.swing.JComboBox<>();
        lbPreviewImage = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setPreferredSize(new java.awt.Dimension(500, 50));
        jPanel1.setLayout(new java.awt.GridBagLayout());

        lbTitle.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lbTitle.setText("Thêm món ăn");
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

        jPanel3.setBorder(javax.swing.BorderFactory.createEmptyBorder(0, 5, 0, 5));
        jPanel3.setLayout(new java.awt.GridBagLayout());

        jLabel2.setText("Tên món:");
        gridBagConstraints_1 = new java.awt.GridBagConstraints();
        gridBagConstraints_1.gridx = 0;
        gridBagConstraints_1.gridy = 0;
        gridBagConstraints_1.fill = java.awt.GridBagConstraints.VERTICAL;
        gridBagConstraints_1.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints_1.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(jLabel2, gridBagConstraints_1);
        jLabel4 = new javax.swing.JLabel();
        
                jLabel4.setText("Hình ảnh:");
                gridBagConstraints = new java.awt.GridBagConstraints();
                gridBagConstraints.gridx = 0;
                gridBagConstraints.gridy = 2;
                gridBagConstraints.fill = java.awt.GridBagConstraints.VERTICAL;
                gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
                gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
                jPanel3.add(jLabel4, gridBagConstraints);

        jLabel6.setText("Giá:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(jLabel6, gridBagConstraints);

        jLabel7.setText("Loại món:");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.EAST;
        gridBagConstraints.insets = new Insets(5, 5, 0, 5);
        jPanel3.add(jLabel7, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new Insets(5, 5, 5, 0);
        jPanel3.add(txtName, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.2;
        gridBagConstraints.insets = new Insets(5, 5, 5, 5);
        jPanel3.add(txtUrlImage, gridBagConstraints);

        btnChooseImage.setText("Chọn Ảnh");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 4;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.01;
        gridBagConstraints.insets = new Insets(5, 0, 5, 0);
        jPanel3.add(btnChooseImage, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 10;
        gridBagConstraints.gridwidth = 4;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new Insets(5, 5, 5, 0);
        jPanel3.add(txtUnitPrice, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 11;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.insets = new Insets(5, 5, 0, 5);
        jPanel3.add(cboCategory, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 1;
        gridBagConstraints.gridy = 3;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.gridheight = 6;
        gridBagConstraints.fill = java.awt.GridBagConstraints.BOTH;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.BASELINE;
        gridBagConstraints.weightx = 0.1;
        gridBagConstraints.weighty = 0.1;
        gridBagConstraints.insets = new java.awt.Insets(5, 5, 5, 5);
        jPanel3.add(lbPreviewImage, gridBagConstraints);

        getContentPane().add(jPanel3, java.awt.BorderLayout.CENTER);

        pack();
    }
    private javax.swing.JButton btnCancel;
    private javax.swing.JButton btnChooseImage;
    private javax.swing.JButton btnOK;
    private javax.swing.JComboBox<loaiHang> cboCategory;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JLabel lbPreviewImage;
    private javax.swing.JLabel lbTitle;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtUnitPrice;
    private javax.swing.JTextField txtUrlImage;
    private GridBagConstraints gridBagConstraints_1;
}