package SinemaOtamasyonu;

import java.awt.EventQueue;
import java.awt.Image;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import net.miginfocom.swing.MigLayout;
import java.awt.CardLayout;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.BoxLayout;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.UIManager;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Login extends JFrame {

	private static ArrayList<Kullanici> kullanici_list = new ArrayList<>();
	private static Kullanici kullanici;

	public static Kullanici getKullanici() {
		return kullanici;
	}

	public static ArrayList<Kullanici> getKullanici_list() {
		return kullanici_list;
	}

	private JPanel Login;
	private JTextField k_adi_textfield;
	private JPasswordField parola_field;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setLocationRelativeTo(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Login() {
		kullanici_list.add(new Kullanici("a", "a"));
		setAlwaysOnTop(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 557);
		Login = new JPanel();
		Login.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Login);
		Login.setLayout(null);

		JPanel login_photo_panel = new JPanel();
		login_photo_panel.setBackground(new Color(86, 86, 86));
		login_photo_panel.setBounds(0, 0, 312, 521);
		Login.add(login_photo_panel);
		login_photo_panel.setLayout(null);

		JLabel photo_label = new JLabel("");
		Image image = new ImageIcon(this.getClass().getResource("/sinema_foto.png")).getImage();
		photo_label.setIcon(new ImageIcon(image));
		photo_label.setBounds(0, 0, 312, 306);
		login_photo_panel.add(photo_label);

		JLabel giris_yazisi_label = new JLabel("     Sinemamıza hoş geldiniz");
		giris_yazisi_label.setFont(new Font("Tahoma", Font.BOLD, 17));
		giris_yazisi_label.setForeground(new Color(255, 255, 255));
		giris_yazisi_label.setBounds(10, 316, 276, 72);
		login_photo_panel.add(giris_yazisi_label);

		JLabel lblNewLabel = new JLabel("Bilet almak için giriş yapmanız gerekmektedir.");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBounds(10, 385, 290, 42);
		login_photo_panel.add(lblNewLabel);

		JLabel lblEerKaytlDeilseniz = new JLabel("Eğer kayıtlı değilseniz, lütfen kaydolunuz.");
		lblEerKaytlDeilseniz.setForeground(Color.WHITE);
		lblEerKaytlDeilseniz.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblEerKaytlDeilseniz.setBounds(10, 422, 290, 42);
		login_photo_panel.add(lblEerKaytlDeilseniz);

		JPanel giris_panel = new JPanel();
		giris_panel.setBounds(311, 0, 376, 521);
		Login.add(giris_panel);
		giris_panel.setLayout(null);

		JLabel kullanici_adi_label = new JLabel("KULLANICI ADI");
		kullanici_adi_label.setBounds(24, 86, 149, 32);
		kullanici_adi_label.setFont(new Font("Tahoma", Font.BOLD, 15));
		giris_panel.add(kullanici_adi_label);

		k_adi_textfield = new JTextField();
		k_adi_textfield.setBounds(24, 128, 322, 38);
		giris_panel.add(k_adi_textfield);
		k_adi_textfield.setColumns(10);

		JLabel parola_label = new JLabel("PAROLA");
		parola_label.setFont(new Font("Tahoma", Font.BOLD, 15));
		parola_label.setBounds(24, 196, 149, 32);
		giris_panel.add(parola_label);

		JButton giris_yap_buton = new JButton("Giriş Yap");
		giris_yap_buton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String message = "";
				if (k_adi_textfield.getText().trim().equals("")) {
					message = "Kullanıcı adı kısmı boş bırakılamaz. ";
				} else {
					String parola = new String(parola_field.getPassword());
					if (parola.trim().equals("")) {
						message = "Şifre kısmı boş bırakılamaz.";
						JOptionPane.showMessageDialog(Login.this, message);
						return;
					} else {
						String kullaniciAdi = k_adi_textfield.getText();
						for (Kullanici k : kullanici_list) {
							if (k.getKullaniciAdi().equals(kullaniciAdi) && k.getSifre().equals(parola)) {
								message = "Hoşgeldiniz " + kullaniciAdi;
								JOptionPane.showMessageDialog(Login.this, message);
								kullanici = k;
								AnaSayfa a = new AnaSayfa();
								setVisible(false);
								a.setVisible(true);
								a.setLocationRelativeTo(null);
								return;
							}
						}
					}
					message = "Kullanıcı adı veya şifre hatalı.";
				}
				JOptionPane.showMessageDialog(Login.this, message);
			}
		});
		
		
		
		
		
		giris_yap_buton.setBackground(new Color(255, 47, 47));
		giris_yap_buton.setForeground(new Color(255, 255, 255));
		giris_yap_buton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		giris_yap_buton.setBounds(24, 359, 322, 38);
		giris_panel.add(giris_yap_buton);
		giris_yap_buton.setBorderPainted(false);

		parola_field = new JPasswordField();
		parola_field.setBackground(Color.WHITE);
		parola_field.setBounds(24, 238, 322, 38);
		giris_panel.add(parola_field);

		JButton kayit_ol_buton = new JButton("Kayıt Ol");
		kayit_ol_buton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Register r = new Register();
				r.setLocationRelativeTo(null);
				setVisible(false);
				r.setVisible(true);

			}
		});
		kayit_ol_buton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		kayit_ol_buton.setForeground(new Color(255, 255, 255));
		kayit_ol_buton.setBackground(new Color(255, 47, 47));
		kayit_ol_buton.setBounds(24, 431, 322, 38);
		giris_panel.add(kayit_ol_buton);
		kayit_ol_buton.setBorderPainted(false);

		JButton cikis_buton = new JButton("");
		cikis_buton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(Login.this, "Çıkış yapıldı. İyi günler");
				System.exit(0);
			}
		});
		cikis_buton.setForeground(Color.WHITE);
		cikis_buton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cikis_buton.setBorderPainted(false);
		cikis_buton.setBackground(new Color(255, 255, 255));
		cikis_buton.setBounds(316, 0, 60, 38);
		giris_panel.add(cikis_buton);
		Image image5 = new ImageIcon(this.getClass().getResource("/exit.png")).getImage();
		cikis_buton.setIcon(new ImageIcon(image5));

	}
}
