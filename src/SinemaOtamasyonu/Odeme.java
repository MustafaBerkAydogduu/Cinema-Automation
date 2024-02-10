package SinemaOtamasyonu;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class Odeme extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField ay_yil_tf;
	private JTextField kart_numarasi_tf;
	private JTextField kart_isim_tf;
	private JTextField cvc_tf;
	private JLabel kart_ismi_label;
	private JLabel kart_numarasi_label;
	private JLabel ay_yil_label;
	private JLabel cvc_label;
	private JLabel kart_ismi_photo_label;
	private JLabel film_adi_label;
	private JLabel saat_label;
	private JLabel salon_label;
	private JLabel tutar_label;
	private JLabel siparisozet_label;
	private boolean odeme =false;
	
	
	public Odeme(int sayi,int secilenKoltuk,String isim_soyisim) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 389, 693);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(255, 255, 255));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		ay_yil_tf = new JTextField();
		ay_yil_tf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		ay_yil_tf.setColumns(10);
		ay_yil_tf.setBounds(37, 316, 138, 45);
		contentPane.add(ay_yil_tf);
		
		kart_numarasi_tf = new JTextField();
		kart_numarasi_tf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		kart_numarasi_tf.setColumns(10);
		kart_numarasi_tf.setBounds(37, 226, 306, 45);
		contentPane.add(kart_numarasi_tf);
		
		kart_isim_tf = new JTextField();
		kart_isim_tf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		kart_isim_tf.setColumns(10);
		kart_isim_tf.setBounds(37, 136, 306, 45);
		contentPane.add(kart_isim_tf);
		
		cvc_tf = new JTextField();
		cvc_tf.setFont(new Font("Tahoma", Font.PLAIN, 14));
		cvc_tf.setColumns(10);
		cvc_tf.setBounds(234, 315, 109, 48);
		contentPane.add(cvc_tf);
		
		kart_ismi_label = new JLabel("Kart Üzerindeki İsim");
		kart_ismi_label.setForeground(new Color(86, 86, 86));
		kart_ismi_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		kart_ismi_label.setBounds(81, 101, 170, 25);
		contentPane.add(kart_ismi_label);
		
		kart_numarasi_label = new JLabel("Kart Numarası\r\n\r\n");
		kart_numarasi_label.setForeground(new Color(86, 86, 86));
		kart_numarasi_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		kart_numarasi_label.setBounds(81, 191, 170, 25);
		contentPane.add(kart_numarasi_label);
		
		ay_yil_label = new JLabel("AY/YIL");
		ay_yil_label.setForeground(new Color(86, 86, 86));
		ay_yil_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		ay_yil_label.setBounds(37, 281, 130, 25);
		contentPane.add(ay_yil_label);
		
		cvc_label = new JLabel("CVC\r\n");
		cvc_label.setForeground(new Color(86, 86, 86));
		cvc_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		cvc_label.setBounds(234, 281, 109, 25);
		contentPane.add(cvc_label);
		
		JButton odeme_buton = new JButton("");
		odeme_buton.addMouseListener(new MouseAdapter() {
			String message="";
			@Override
			public void mouseClicked(MouseEvent e) {
			if(!kart_isim_tf.getText().trim().equals("")) {
				if(!kart_numarasi_tf.getText().trim().equals("")) {
					if(!ay_yil_tf.getText().trim().equals("")) {
						if(!cvc_tf.getText().trim().equals("")) {
							String filmAdi=BiletSatınAl.getSeans().get(sayi).getFilmAdi();
							String saat=BiletSatınAl.getSeans().get(sayi).getSaat();
							int fiyat=BiletSatınAl.getSeans().get(sayi).getBiletFiyati();
							String salonn=BiletSatınAl.getSeans().get(sayi).getSalon();
							Image img=BiletSatınAl.getSeans().get(sayi).getIcon();
							int secilenKoltuk2=secilenKoltuk+1;
							Bilet bilet=new Bilet(filmAdi,saat,fiyat,salonn,secilenKoltuk2,isim_soyisim,img);
							Login.getKullanici().getBiletler().add(bilet);
							int i=0;
							for(Kullanici a :Login.getKullanici_list()) {
								if(Login.getKullanici_list().get(i) == Login.getKullanici() ) {
									Login.getKullanici_list().set(i, Login.getKullanici());
									break;}}
							BiletSatınAl.getSeans().get(sayi).getSalonDuzen().set(secilenKoltuk, 1); 
							Salon salon=new Salon(sayi);
							setVisible(false);
							BiletSatınAl.b.setVisible(false);
							salon.setVisible(true);
							salon.setLocationRelativeTo(null);
							OdemeBasariliEkran o =new OdemeBasariliEkran();
							o.setVisible(true);
							o.setLocationRelativeTo(null);return;
						}else {
							message="CVC kısmı boş bırakılamaz.";
						}
					}else {
						message="AY/YIL kısmı boş bırakılamaz.";
					}
				}else {
					message="Kart numarası kısmı boş bırakılamaz. ";
				}
			}else {
				message="Kart üzerindeki isim kısmı boş bırakılamaz. ";
			}
			JOptionPane.showMessageDialog(Odeme.this, message);	
			}});
		odeme_buton.setForeground(Color.WHITE);
		odeme_buton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		odeme_buton.setBorderPainted(false);
		odeme_buton.setBackground(new Color(0, 128, 128));
		odeme_buton.setBounds(37, 588, 306, 25);
		contentPane.add(odeme_buton);
		odeme_buton.setText(BiletSatınAl.getSeans().get(sayi).getBiletFiyati()+" TL Öde");
		
		JLabel kartbilgileri_label = new JLabel("KART BİLGİLERİ");
		kartbilgileri_label.setForeground(new Color(0, 128, 128));
		kartbilgileri_label.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		kartbilgileri_label.setBounds(37, 66, 170, 25);
		contentPane.add(kartbilgileri_label);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(0, 128, 128));
		panel.setBounds(0, 10, 375, 31);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel odeme_ekranı_label = new JLabel("ÖDEME EKRANI");
		odeme_ekranı_label.setFont(new Font("Times New Roman", Font.BOLD, 17));
		odeme_ekranı_label.setBounds(0, 0, 375, 35);
		panel.add(odeme_ekranı_label);
		odeme_ekranı_label.setVerticalAlignment(SwingConstants.CENTER);
		odeme_ekranı_label.setHorizontalAlignment(SwingConstants.CENTER);
		
		kart_ismi_photo_label = new JLabel();
		kart_ismi_photo_label.setBounds(37, 101, 38, 25);
		contentPane.add(kart_ismi_photo_label);
		Image image1=new ImageIcon(this.getClass().getResource("/odemekullanici.png")).getImage();
		kart_ismi_photo_label.setIcon(new ImageIcon(image1));
		
		JLabel kartno_foto_label = new JLabel();
		kartno_foto_label.setBounds(37, 191, 38, 25);
		contentPane.add(kartno_foto_label);
		Image image2=new ImageIcon(this.getClass().getResource("/odemekkarti.png")).getImage();
		kartno_foto_label.setIcon(new ImageIcon(image2));
		
		film_adi_label = new JLabel("");
		film_adi_label.setForeground(new Color(86, 86, 86));
		film_adi_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		film_adi_label.setBounds(37, 426, 195, 25);
		contentPane.add(film_adi_label);
		
		saat_label = new JLabel("");
		saat_label.setForeground(new Color(86, 86, 86));
		saat_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		saat_label.setBounds(37, 496, 195, 25);
		contentPane.add(saat_label);
		
		salon_label = new JLabel("");
		salon_label.setForeground(new Color(86, 86, 86));
		salon_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		salon_label.setBounds(37, 461, 195, 25);
		contentPane.add(salon_label);
		
		tutar_label = new JLabel("");
		tutar_label.setForeground(new Color(86, 86, 86));
		tutar_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		tutar_label.setBounds(37, 531, 170, 25);
		contentPane.add(tutar_label);
		
		film_adi_label.setText("Film Adı : "+BiletSatınAl.getSeans().get(sayi).getFilmAdi());
		salon_label.setText("Salon : "+BiletSatınAl.getSeans().get(sayi).getSalon());
		saat_label.setText("Saat : "+BiletSatınAl.getSeans().get(sayi).getSaat());
		tutar_label.setText("Fiyat : "+BiletSatınAl.getSeans().get(sayi).getBiletFiyati()+" TL");
		
		siparisozet_label = new JLabel("Sipariş Özeti");
		siparisozet_label.setForeground(new Color(128, 0, 0));
		siparisozet_label.setFont(new Font("Segoe UI Semibold", Font.BOLD, 17));
		siparisozet_label.setBounds(37, 382, 170, 25);
		contentPane.add(siparisozet_label);
		
		JButton iptal_button = new JButton("İŞLEMİ İPTAL ET");
		iptal_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);

				OdemeIptalEkrani o =new OdemeIptalEkrani();
				o.setVisible(true);
				o.setLocationRelativeTo(null);
				
			}
		});
		
		iptal_button.setForeground(Color.WHITE);
		iptal_button.setFont(new Font("Times New Roman", Font.BOLD, 18));
		iptal_button.setBorderPainted(false);
		iptal_button.setBackground(new Color(0, 128, 128));
		iptal_button.setBounds(37, 623, 306, 23);
		contentPane.add(iptal_button);
	}
}
