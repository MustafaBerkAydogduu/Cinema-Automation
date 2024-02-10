package SinemaOtamasyonu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class KullaniciAdiDegistir extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField guncel_k_adi_tf;
	private JLabel yeni_kullanici_adi_label;
	private JTextField yeni_k_adi_tf;
	private JLabel sifre_label;
	private JPasswordField passwordField;

	public KullaniciAdiDegistir() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel kullanici_adi_degistir_label = new JLabel("KULLANICI ADI DEĞİŞTİR\r\n");
		kullanici_adi_degistir_label.setVerticalAlignment(SwingConstants.CENTER);
		kullanici_adi_degistir_label.setHorizontalAlignment(SwingConstants.CENTER);
		kullanici_adi_degistir_label.setForeground(new Color(86, 86, 86));
		kullanici_adi_degistir_label.setFont(new Font("Times New Roman", Font.BOLD, 30));
		kullanici_adi_degistir_label.setBounds(0, 10, 532, 39);
		contentPane.add(kullanici_adi_degistir_label);
		
		JLabel guncel_k_adi_label = new JLabel("Güncel Kullanıcı Adı");
		guncel_k_adi_label.setForeground(new Color(86, 86, 86));
		guncel_k_adi_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		guncel_k_adi_label.setBounds(104, 77, 170, 25);
		contentPane.add(guncel_k_adi_label);
		
		guncel_k_adi_tf = new JTextField();
		guncel_k_adi_tf.setEditable(false);
		guncel_k_adi_tf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		guncel_k_adi_tf.setColumns(10);
		guncel_k_adi_tf.setBounds(102, 112, 306, 39);
		contentPane.add(guncel_k_adi_tf);
		guncel_k_adi_tf.setText(Login.getKullanici().getKullaniciAdi());
		
		yeni_kullanici_adi_label = new JLabel("Yeni Kullanıcı Adı");
		yeni_kullanici_adi_label.setForeground(new Color(86, 86, 86));
		yeni_kullanici_adi_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		yeni_kullanici_adi_label.setBounds(104, 161, 170, 25);
		contentPane.add(yeni_kullanici_adi_label);
		
		yeni_k_adi_tf = new JTextField();
		yeni_k_adi_tf.setText((String) null);
		yeni_k_adi_tf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		yeni_k_adi_tf.setColumns(10);
		yeni_k_adi_tf.setBounds(102, 196, 306, 39);
		contentPane.add(yeni_k_adi_tf);
		
		sifre_label = new JLabel("Parola  (Sizin olduğunuzu doğrulamamız için)");
		sifre_label.setForeground(new Color(86, 86, 86));
		sifre_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		sifre_label.setBounds(102, 245, 306, 25);
		contentPane.add(sifre_label);
		
		passwordField = new JPasswordField();
		passwordField.setBackground(Color.WHITE);
		passwordField.setBounds(102, 280, 306, 37);
		contentPane.add(passwordField);
		
		JButton odeme_buton = new JButton("ONAYLA\r\n");
		odeme_buton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String message="";
				 if(yeni_k_adi_tf.getText().trim().equals("")){
			            message="Kullanıcı adı kısmı boş bırakılamaz. ";
			           
			        }else {
			        	 String parola=new String(passwordField.getPassword());
				            if(parola.trim().equals("") ){
				            message="Parola Kısmı Boş Bırakılamaz";
				            }else {
								if(parola.equals(Login.getKullanici().getSifre())) {
									for(int i=0;i<Login.getKullanici_list().size();i++) {
										if(Login.getKullanici_list().get(i)==Login.getKullanici()) {
											Login.getKullanici().setKullaniciAdi(yeni_k_adi_tf.getText());
											Login.getKullanici_list().set(i, Login.getKullanici());
											message="Tebrikler! Kullanıcı adınız başarıyla değiştirildi.";
											JOptionPane.showMessageDialog(KullaniciAdiDegistir.this, message);
											setVisible(false);
											AnaSayfa.k.setVisible(false);
											KullaniciBilgileri kb=new KullaniciBilgileri();
											kb.setVisible(true);
											kb.setLocationRelativeTo(null);
											return;
										}
									}
								}else {
									message="Girilen Parola Hatalı";
								}
				            }
			        }
				 JOptionPane.showMessageDialog(KullaniciAdiDegistir.this, message);
			}});
		odeme_buton.setForeground(Color.WHITE);
		odeme_buton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		odeme_buton.setBorderPainted(false);
		odeme_buton.setBackground(new Color(0, 128, 64));
		odeme_buton.setBounds(104, 339, 147, 25);
		contentPane.add(odeme_buton);
		
		JButton odeme_buton_1 = new JButton("IPTAL ET");
		odeme_buton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(KullaniciAdiDegistir.this, "İşlem İptal Edildi");
				setVisible(false);
			}
		});
		odeme_buton_1.setForeground(Color.WHITE);
		odeme_buton_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		odeme_buton_1.setBorderPainted(false);
		odeme_buton_1.setBackground(new Color(255, 47, 47));
		odeme_buton_1.setBounds(261, 339, 147, 25);
		contentPane.add(odeme_buton_1);
	}
}
