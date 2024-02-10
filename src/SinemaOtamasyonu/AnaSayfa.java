package SinemaOtamasyonu;

import java.awt.EventQueue;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JTextField;

public class AnaSayfa extends JFrame {
	
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JButton kullanici_degistir_button;
	private static ArrayList<Film > filmarr = new ArrayList<>();	
	Login l=new Login();
	static biletlerim b;
	static KullaniciBilgileri k;
	private Kullanici kullanici;
	public static ArrayList<Film> getFilmarr() {
		return filmarr;
	}
	
	
	
	

	public void FilmAta() {
		Film matrix=new Film("Matrix Reloaded","Aksiyon/Bilim Kurgu","2 saat 18 dakika");
		Film issiz_adam=new Film("Issız Adam","Romantik/Gerilim","1 saat 53 dakika");
		Film truman=new Film("Truman Show","Komedi/Bilim Kurgu","1 saat 47 dakika");
		Film gunes=new Film("Güneşi Gördüm","Dram","1 saat 54 dakika");
		Film terminal=new Film("Terminal","Komedi/Romantik","2 saat 8 dakika");
		Film zootroPolis=new Film("Zootropolis","Komedi/Macera","1 saat 48 dakika");
		filmarr.add(matrix);
		filmarr.add(issiz_adam);
		filmarr.add(truman);
		filmarr.add(gunes);
		filmarr.add(terminal);
		filmarr.add(zootroPolis);
	}
	public AnaSayfa() {
		this.kullanici=Login.getKullanici();
		FilmAta();
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1085, 694);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(86, 86, 86));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel vizyondakiler_panel = new JPanel();
		vizyondakiler_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Vizyondakiler vi =new Vizyondakiler();
				setVisible(false);
				vi.setVisible(true);
				vi.setLocationRelativeTo(null);
				}
		});
		vizyondakiler_panel.setBackground(new Color(221, 188, 0));
		vizyondakiler_panel.setBounds(45, 173, 194, 342);
		contentPane.add(vizyondakiler_panel);
		vizyondakiler_panel.setLayout(null);
		Image image3=new ImageIcon(this.getClass().getResource("/biletal.png")).getImage();
		
		JLabel vizyondakiler_label = new JLabel("Vizyondaki Filmler\r\n");
		vizyondakiler_label.setBounds(0, 237, 182, 37);
		vizyondakiler_panel.add(vizyondakiler_label);
		vizyondakiler_label.setVerticalAlignment(SwingConstants.CENTER);
		vizyondakiler_label.setHorizontalAlignment(SwingConstants.CENTER);
		vizyondakiler_label.setForeground(new Color(86, 86, 86));
		vizyondakiler_label.setFont(new Font("Times New Roman", Font.BOLD, 18));
		
		JLabel vizyondakiler_foto_label = new JLabel("");
		vizyondakiler_foto_label.setBounds(-8, 10, 192, 176);
		vizyondakiler_panel.add(vizyondakiler_foto_label);
		Image ımage7=new ImageIcon(this.getClass().getResource("/vizyonn.png")).getImage();
		vizyondakiler_foto_label.setIcon(new ImageIcon(ımage7));
		
		
		JPanel biletlerim_panel = new JPanel();
		biletlerim_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				b=new biletlerim();
				setVisible(false);
				b.setVisible(true);
				b.setLocationRelativeTo(null);
				
			}
		});
		biletlerim_panel.setBackground(new Color(221, 188, 0));
		biletlerim_panel.setBounds(576, 173, 194, 342);
		contentPane.add(biletlerim_panel);
		biletlerim_panel.setLayout(null);
		
		JLabel biletlerim_foto_label = new JLabel("Biletlerim");
		biletlerim_foto_label.setVerticalAlignment(SwingConstants.CENTER);
		biletlerim_foto_label.setHorizontalAlignment(SwingConstants.CENTER);
		biletlerim_foto_label.setForeground(new Color(86, 86, 86));
		biletlerim_foto_label.setFont(new Font("Times New Roman", Font.BOLD, 18));
		biletlerim_foto_label.setBounds(0, 239, 182, 37);
		biletlerim_panel.add(biletlerim_foto_label);
		
		JLabel biletlerim_label = new JLabel("");
		biletlerim_label.setBounds(10, 10, 192, 176);
		biletlerim_panel.add(biletlerim_label);
		Image image2=new ImageIcon(this.getClass().getResource("/Bilett.png")).getImage();
		biletlerim_label.setIcon(new ImageIcon(image2));
		
		JPanel anasayfa_panel = new JPanel();
		anasayfa_panel.setBackground(new Color(221, 188, 0));
		anasayfa_panel.setBounds(0, 40, 1071, 29);
		contentPane.add(anasayfa_panel);
		anasayfa_panel.setLayout(null);
		
		JLabel ana_sayfa_label = new JLabel("ANA SAYFA");
		ana_sayfa_label.setVerticalAlignment(SwingConstants.CENTER);
		ana_sayfa_label.setHorizontalAlignment(SwingConstants.CENTER);
		ana_sayfa_label.setForeground(new Color(86, 86, 86));
		ana_sayfa_label.setFont(new Font("Times New Roman", Font.BOLD, 34));
		ana_sayfa_label.setBounds(-12, 0, 294, 29);
		anasayfa_panel.add(ana_sayfa_label);
		
		JPanel kullanici_foto_panel = new JPanel();
		kullanici_foto_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 k=new KullaniciBilgileri();
				setVisible(false);
				k.setVisible(true);
				k.setLocationRelativeTo(null);
			}
		});
		kullanici_foto_panel.setLayout(null);
		kullanici_foto_panel.setBackground(new Color(221, 188, 0));
		kullanici_foto_panel.setBounds(828, 173, 194, 342);
		contentPane.add(kullanici_foto_panel);
		
		JLabel kullanici_label_yazi = new JLabel("Kullanıcı Bilgileri");
		kullanici_label_yazi.setVerticalAlignment(SwingConstants.CENTER);
		kullanici_label_yazi.setHorizontalAlignment(SwingConstants.CENTER);
		kullanici_label_yazi.setForeground(new Color(86, 86, 86));
		kullanici_label_yazi.setFont(new Font("Times New Roman", Font.BOLD, 18));
		kullanici_label_yazi.setBounds(0, 239, 182, 37);
		kullanici_foto_panel.add(kullanici_label_yazi);
		
		JLabel kullanici_label_foto = new JLabel("");
		kullanici_label_foto.setBounds(10, 10, 192, 176);
		kullanici_foto_panel.add(kullanici_label_foto);
		Image image4=new ImageIcon(this.getClass().getResource("/user.png")).getImage();
		kullanici_label_foto.setIcon(new ImageIcon(image4));
		
		JButton cikis_buton = new JButton("");
		cikis_buton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(AnaSayfa.this, "Çıkış yapıldı. İyi günler");
				System.exit(0);
			}
		});
		cikis_buton.setForeground(Color.WHITE);
		cikis_buton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cikis_buton.setBorderPainted(false);
		cikis_buton.setBackground(new Color(86, 86, 86));
		cikis_buton.setBounds(1022, 0, 60, 38);
		contentPane.add(cikis_buton);
		Image image5=new ImageIcon(this.getClass().getResource("/exit.png")).getImage();
		cikis_buton.setIcon(new ImageIcon(image5));
		
		kullanici_degistir_button = new JButton("Kullanıcı Değiştir");
		kullanici_degistir_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				l.setVisible(true);
				l.setLocationRelativeTo(null);
			}
		});
		kullanici_degistir_button.setForeground(Color.WHITE);
		kullanici_degistir_button.setFont(new Font("Tahoma", Font.BOLD, 12));
		kullanici_degistir_button.setBorderPainted(false);
		kullanici_degistir_button.setBackground(new Color(255, 47, 47));
		kullanici_degistir_button.setBounds(876, 0, 146, 38);
		contentPane.add(kullanici_degistir_button);
		
		JPanel bilet_al_panel = new JPanel();
		bilet_al_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BiletSatınAl b=new BiletSatınAl();
				setVisible(false);
				b.setVisible(true);
				b.setLocationRelativeTo(null);
			}
		});
		bilet_al_panel.setLayout(null);
		bilet_al_panel.setBackground(new Color(221, 188, 0));
		bilet_al_panel.setBounds(307, 173, 194, 342);
		contentPane.add(bilet_al_panel);
		
		JLabel biletlerim_foto_label_1 = new JLabel("Bilet Satın Al\r\n");
		biletlerim_foto_label_1.setVerticalAlignment(SwingConstants.CENTER);
		biletlerim_foto_label_1.setHorizontalAlignment(SwingConstants.CENTER);
		biletlerim_foto_label_1.setForeground(new Color(86, 86, 86));
		biletlerim_foto_label_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		biletlerim_foto_label_1.setBounds(0, 239, 182, 37);
		bilet_al_panel.add(biletlerim_foto_label_1);
		
		JLabel bilet_al_foto_label = new JLabel();
		bilet_al_foto_label.setBounds(0, 10, 192, 176);
		bilet_al_panel.add(bilet_al_foto_label);
		bilet_al_foto_label.setIcon(new ImageIcon(image3));
		
		JLabel lblLtfenGerekletirmekIstediiniz = new JLabel("Lütfen gerçekleştirmek istediğiniz işlemi seçiniz");
		lblLtfenGerekletirmekIstediiniz.setForeground(Color.WHITE);
		lblLtfenGerekletirmekIstediiniz.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblLtfenGerekletirmekIstediiniz.setBackground(Color.WHITE);
		lblLtfenGerekletirmekIstediiniz.setBounds(10, 79, 1061, 30);
		contentPane.add(lblLtfenGerekletirmekIstediiniz);
		
		
		
		
		
	}
}
