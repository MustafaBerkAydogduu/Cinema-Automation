package SinemaOtamasyonu;

import java.awt.EventQueue;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class KullaniciBilgileri extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public KullaniciBilgileri() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1088, 691);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(86, 86, 86));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(221, 188, 0));
		panel.setBounds(205, 10, 651, 634);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel kullanici_bilgileri_label = new JLabel("KULLANICI BİLGİLERİ");
		kullanici_bilgileri_label.setBounds(0, 10, 651, 39);
		panel.add(kullanici_bilgileri_label);
		kullanici_bilgileri_label.setVerticalAlignment(SwingConstants.CENTER);
		kullanici_bilgileri_label.setHorizontalAlignment(SwingConstants.CENTER);
		kullanici_bilgileri_label.setForeground(new Color(86, 86, 86));
		kullanici_bilgileri_label.setFont(new Font("Times New Roman", Font.BOLD, 34));
		
		JLabel kullanici_label_foto = new JLabel("");
		kullanici_label_foto.setBounds(234, 79, 192, 176);
		panel.add(kullanici_label_foto);
		Image image=new ImageIcon(this.getClass().getResource("/user.png")).getImage();
		kullanici_label_foto.setIcon(new ImageIcon(image));
		
		JLabel kullanici_adi_label = new JLabel("");
		kullanici_adi_label.setVerticalAlignment(SwingConstants.CENTER);
		kullanici_adi_label.setHorizontalAlignment(SwingConstants.CENTER);
		kullanici_adi_label.setForeground(new Color(86, 86, 86));
		kullanici_adi_label.setFont(new Font("Times New Roman", Font.BOLD, 30));
		kullanici_adi_label.setBounds(0, 265, 651, 39);
		panel.add(kullanici_adi_label);
		kullanici_adi_label.setText(Login.getKullanici().getKullaniciAdi())	;
		
		JButton kullanici_adi_degistir_button = new JButton("Kullanıcı Adı Değiştir");
		kullanici_adi_degistir_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				KullaniciAdiDegistir k=new KullaniciAdiDegistir();
				k.setVisible(true);
				k.setLocationRelativeTo(null);
			}
		});
		kullanici_adi_degistir_button.setForeground(new Color(86, 86, 86));
		kullanici_adi_degistir_button.setFont(new Font("Tahoma", Font.BOLD, 12));
		kullanici_adi_degistir_button.setBorderPainted(false);
		kullanici_adi_degistir_button.setBackground(new Color(255, 255, 255));
		kullanici_adi_degistir_button.setBounds(234, 386, 177, 38);
		panel.add(kullanici_adi_degistir_button);
		
		JButton parola_degistir_button = new JButton("Parola değiştir");
		parola_degistir_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ParolaDegistir p=new ParolaDegistir();
				p.setVisible(true);
				p.setLocationRelativeTo(null);
			}
		});
		parola_degistir_button.setForeground(new Color(86, 86, 86));
		parola_degistir_button.setFont(new Font("Tahoma", Font.BOLD, 12));
		parola_degistir_button.setBorderPainted(false);
		parola_degistir_button.setBackground(new Color(255, 255, 255));
		parola_degistir_button.setBounds(234, 454, 177, 38);
		panel.add(parola_degistir_button);
		
		JButton geri_buton = new JButton("←");
		geri_buton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AnaSayfa a =new AnaSayfa();
				setVisible(false);
				a.setVisible(true);
				a.setLocationRelativeTo(null);
			}
		});
		geri_buton.setForeground(Color.WHITE);
		geri_buton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		geri_buton.setBorderPainted(false);
		geri_buton.setBackground(new Color(255, 47, 47));
		geri_buton.setBounds(1021, 0, 53, 32);
		contentPane.add(geri_buton);
		
	}
}
