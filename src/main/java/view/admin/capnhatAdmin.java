package view.admin;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import model.Admin;
import model.nhanVienModel;
import repository.NhanVienReposity;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.nio.file.Files;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.awt.event.ActionEvent;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JSeparator;
import javax.swing.JProgressBar;
import javax.swing.JTree;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JSpinner;
import javax.swing.JEditorPane;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.border.MatteBorder;

public class capnhatAdmin extends JFrame {

//	private JPanel contentPane;
	private JPanel panel;
	private JPanel panel_1;
	public JTextField hoten_jtfiel;
	private JTextField taikhoan_jtfiel;
	public JTextField sdt_jtfiel;
	private JPasswordField matkhau_jpassfiel;
	public JTextField ngayvaolam_jtfiel;
	private JTable table;
	public JTextField luong_jtfiel;
	private JLabel hoten_jlabel;
	private JLabel matkhau_jlabel;
	private JLabel sdt_jlabel;
	private JLabel ngayvaolam_jlabel;
	private JLabel taikhoan_jlabel;
	private JLabel chucvu_jlabel;
	private JLabel luong_jlabel;
	private JButton capnhat_jbutton;
	private JButton hienthi_jbutton;
	private JButton quaylai_jbutton;
	private JTable nhanVien_jtbale;
	private JComboBox nhanvien_comboBox ;
	

	public capnhatAdmin() {
//		contentPane = new JPanel();

		panel = new JPanel();
		panel_1 = new JPanel();
		hoten_jtfiel = new JTextField();
		taikhoan_jtfiel = new JTextField();
		sdt_jtfiel = new JTextField();
		matkhau_jpassfiel = new JPasswordField();
		ngayvaolam_jtfiel = new JTextField();
		table = new JTable();
		luong_jtfiel = new JTextField();
		hoten_jlabel = new JLabel();
		matkhau_jlabel = new JLabel();
		sdt_jlabel = new JLabel();
		ngayvaolam_jlabel = new JLabel();
		taikhoan_jlabel = new JLabel();
		chucvu_jlabel = new JLabel();
		luong_jlabel = new JLabel();
		capnhat_jbutton = new JButton();
		quaylai_jbutton = new JButton();
		this.init();
		this.setVisible(true);
	}

	private void init() {
		this.setTitle("Cập nhật ");
		this.setSize(700, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setLocationRelativeTo(null);

		panel = new JPanel();
		panel.setBackground(new Color(236, 255, 255));
		getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);

		panel_1 = new JPanel();
		panel_1.setBackground(new Color(236, 255, 255));
		panel_1.setBorder(new MatteBorder(1, 1, 1, 1, (Color) new Color(0, 0, 0)));
		panel_1.setBounds(31, 235, 623, 215);
		panel.add(panel_1);
		panel_1.setLayout(null);

		hoten_jlabel = new JLabel("Họ tên :");
		hoten_jlabel.setHorizontalAlignment(SwingConstants.LEFT);
		hoten_jlabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		hoten_jlabel.setBounds(10, 11, 100, 25);
		panel_1.add(hoten_jlabel);

		hoten_jtfiel = new JTextField();
		hoten_jtfiel.setBounds(106, 11, 165, 25);
		panel_1.add(hoten_jtfiel);
		hoten_jtfiel.setColumns(10);

		sdt_jlabel = new JLabel("Số điện thoại :");
		sdt_jlabel.setHorizontalAlignment(SwingConstants.LEFT);
		sdt_jlabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		sdt_jlabel.setBounds(10, 48, 100, 27);
		panel_1.add(sdt_jlabel);

		ngayvaolam_jlabel = new JLabel("Ngày vào làm :");
		ngayvaolam_jlabel.setHorizontalAlignment(SwingConstants.LEFT);
		ngayvaolam_jlabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		ngayvaolam_jlabel.setBounds(10, 86, 100, 27);
		panel_1.add(ngayvaolam_jlabel);

		sdt_jtfiel = new JTextField();
		sdt_jtfiel.setColumns(10);
		sdt_jtfiel.setBounds(106, 48, 165, 27);
		panel_1.add(sdt_jtfiel);

		ngayvaolam_jtfiel = new JTextField();
		ngayvaolam_jtfiel.setBounds(106, 86, 165, 27);
		panel_1.add(ngayvaolam_jtfiel);
		ngayvaolam_jtfiel.setColumns(10);
		hienthi_jbutton = new JButton("Hiển thị thông tin");
		hienthi_jbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				hienThiThongTinNhanVien();
			}
			private void xoaForm() {
				hoten_jtfiel.setText("");
				taikhoan_jtfiel.setText("");
				matkhau_jpassfiel.setText("");
				ngayvaolam_jtfiel.setText("");
				nhanvien_comboBox.setSelectedItem("");
				luong_jtfiel.setText("");
				sdt_jtfiel.setText("");

			}
		});
		hienthi_jbutton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		hienthi_jbutton.setBounds(394, 6, 148, 34);
		panel_1.add(hienthi_jbutton);

		quaylai_jbutton = new JButton("Quay lại");
		quaylai_jbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			quanLiNhanVien quanli = new quanLiNhanVien();
			quanli.setVisible(true);
				
			}
		});
		ImageIcon iconReturn = new ImageIcon("C:\\btl\\baitap_java\\src\\main\\resources\\icons\\return.png");
		quaylai_jbutton.setIcon(iconReturn);
		quaylai_jbutton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		quaylai_jbutton.setBounds(394, 153, 144, 34);
		panel_1.add(quaylai_jbutton);

		chucvu_jlabel = new JLabel("Chức vụ :");
		chucvu_jlabel.setHorizontalAlignment(SwingConstants.LEFT);
		chucvu_jlabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		chucvu_jlabel.setBounds(10, 124, 100, 27);
		panel_1.add(chucvu_jlabel);

		luong_jlabel = new JLabel("Lương :");
		luong_jlabel.setHorizontalAlignment(SwingConstants.LEFT);
		luong_jlabel.setFont(new Font("Tahoma", Font.PLAIN, 13));
		luong_jlabel.setBounds(10, 160, 100, 27);
		panel_1.add(luong_jlabel);

		luong_jtfiel = new JTextField();
		luong_jtfiel.setColumns(10);
		luong_jtfiel.setBounds(106, 160, 165, 27);
		panel_1.add(luong_jtfiel);
		
		JButton capnnhat_jbutton = new JButton("Cập nhật");
		capnnhat_jbutton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				nhanVienModel nhanVienModel= new nhanVienModel();
				NhanVienReposity nhanVienRepository = new NhanVienReposity();
				String hoten=hoten_jtfiel.getText();
				String sdt= sdt_jtfiel.getText();
				String ngay=ngayvaolam_jtfiel.getText();
				String chucvu=nhanvien_comboBox.getSelectedItem().toString();
				int luong =Integer.parseInt(luong_jtfiel.getText());
				nhanVienModel.setHoten(hoten);
				nhanVienModel.setSdt(sdt);
				SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
				Date ngayvaolam = null;
				try {
					ngayvaolam = sdf.parse(ngay);
				} catch (ParseException e1) {
					e1.printStackTrace();
				}
				nhanVienModel.setNgayvaolam(ngayvaolam);
				nhanVienModel.setChucvu(chucvu);
				nhanVienModel.setLuong(luong);
				nhanVienRepository.update(nhanVienModel);
				if(nhanVienModel!=null) {
					JOptionPane.showMessageDialog(null, "Cập nhật thành công");
				}
				else {
					JOptionPane.showMessageDialog(null, "Cập nhật thất bại");
					loadtabel();
				}
			}
		});
		ImageIcon iconDone = new ImageIcon("C:\\btl\\baitap_java\\src\\main\\resources\\icons\\done.png");
		capnnhat_jbutton.setIcon(iconDone);
		capnnhat_jbutton.setFont(new Font("Tahoma", Font.PLAIN, 12));
		capnnhat_jbutton.setBounds(394, 57, 148, 34);
		panel_1.add(capnnhat_jbutton);
		
		nhanvien_comboBox = new JComboBox();
		nhanvien_comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "Quản lí", "Nhân viên"}));
		nhanvien_comboBox.setBounds(106, 124, 115, 27);
		panel_1.add(nhanvien_comboBox);
		
		JPanel panel_2 = new JPanel();
		panel_2.setBounds(31, 10, 623, 176);
		panel.add(panel_2);
		panel_2.setLayout(null);

		nhanVien_jtbale = new JTable();
		nhanVien_jtbale.setBounds(0, 0, 623, 176);
		panel_2.add(nhanVien_jtbale);
		
	}

	private void loadtabel() {
		NhanVienReposity nhanVienRepository = new NhanVienReposity();
		DefaultTableModel defaultTableModel = new DefaultTableModel();
		defaultTableModel.addColumn("ID");
		defaultTableModel.addColumn("Họ tên");
		defaultTableModel.addColumn("SDT");
		defaultTableModel.addColumn("Ngày vào làm");
		defaultTableModel.addColumn("Chức vụ");
		defaultTableModel.addColumn("Lương");
		for (nhanVienModel nhanvien : nhanVienRepository.getAdmin()) {
			defaultTableModel.addRow(new Object[] { nhanvien.getManv(), nhanvien.getHoten(), nhanvien.getSdt(),
					nhanvien.getNgayvaolam().getDate() + "/" + (nhanvien.getNgayvaolam().getMonth() + 1) + "/"
							+ (nhanvien.getNgayvaolam().getYear() + 1900),
					nhanvien.getChucvu(), nhanvien.getLuong(), });
			nhanVien_jtbale.setModel(defaultTableModel);
			nhanVien_jtbale.getTableHeader().setReorderingAllowed(false);
		}
	}

	public void hienThiThongTinNhanVien() {
		DefaultTableModel model_table = (DefaultTableModel) nhanVien_jtbale.getModel();
		int i_row = nhanVien_jtbale.getSelectedRow();
		String hotennv = model_table.getValueAt(i_row, 1) + "";
		String sdt = model_table.getValueAt(i_row, 2) + "";
		String ngayvaolam = model_table.getValueAt(i_row, 3) + "";
		String chucvu = model_table.getValueAt(i_row, 4) + "";
		int luong = Integer.valueOf(model_table.getValueAt(i_row, 5) + "");
		hoten_jtfiel.setText(hotennv);
		sdt_jtfiel.setText(sdt);
		ngayvaolam_jtfiel.setText(ngayvaolam);
		nhanvien_comboBox.setSelectedItem(chucvu);
		luong_jtfiel.setText(luong + "");
	}
}
