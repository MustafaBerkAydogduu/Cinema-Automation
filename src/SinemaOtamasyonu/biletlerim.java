package SinemaOtamasyonu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class biletlerim extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel biletlerim_checkbox;

	public biletlerim() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1085, 694);
		biletlerim_checkbox = new JPanel();
		biletlerim_checkbox.setBackground(new Color(86, 86, 86));
		biletlerim_checkbox.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(biletlerim_checkbox);
		biletlerim_checkbox.setLayout(null);
		
		
		JLabel isim_soyisim_label = new JLabel("");
		isim_soyisim_label.setForeground(new Color(123, 140, 144));
		isim_soyisim_label.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		isim_soyisim_label.setBounds(497, 367, 416, 41);
		biletlerim_checkbox.add(isim_soyisim_label);
		
		JLabel saat_label = new JLabel("");
		saat_label.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		saat_label.setForeground(new Color(123, 140, 144));
		saat_label.setBounds(116, 436, 177, 41);
		biletlerim_checkbox.add(saat_label);
		saat_label.setVerticalAlignment(SwingConstants.CENTER);
		saat_label.setHorizontalAlignment(SwingConstants.CENTER);
		
		JLabel film_ad_label = new JLabel("");
		film_ad_label.setForeground(new Color(123, 140, 144));
		film_ad_label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 35));
		film_ad_label.setBounds(326, 430, 524, 47);
		biletlerim_checkbox.add(film_ad_label);
		
		JLabel koltuk_no_label = new JLabel("");
		koltuk_no_label.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		koltuk_no_label.setForeground(new Color(123, 140, 144));
		koltuk_no_label.setBounds(310, 367, 177, 41);
		biletlerim_checkbox.add(koltuk_no_label);
		
		JLabel salon_no_label = new JLabel("");
		salon_no_label.setForeground(new Color(123, 140, 144));
		salon_no_label.setFont(new Font("Times New Roman", Font.PLAIN, 35));
		salon_no_label.setBounds(116, 367, 177, 41);
		biletlerim_checkbox.add(salon_no_label);
		
		JLabel isim_soyisim_yazi_label = new JLabel("");
		isim_soyisim_yazi_label.setForeground(new Color(123, 140, 144));
		isim_soyisim_yazi_label.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 14));
		isim_soyisim_yazi_label.setBounds(509, 336, 206, 30);
		biletlerim_checkbox.add(isim_soyisim_yazi_label);
		
		JLabel koltuk_yazi_label = new JLabel("");
		koltuk_yazi_label.setForeground(new Color(123, 140, 144));
		koltuk_yazi_label.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 14));
		koltuk_yazi_label.setBounds(311, 336, 130, 30);
		biletlerim_checkbox.add(koltuk_yazi_label);
		
		JLabel salon_yazi_label = new JLabel("");
		salon_yazi_label.setForeground(new Color(123, 140, 144));
		salon_yazi_label.setFont(new Font("Arial Rounded MT Bold", Font.ITALIC, 14));
		salon_yazi_label.setBounds(117, 336, 130, 30);
		biletlerim_checkbox.add(salon_yazi_label);
		
		JLabel sinema_bilet_text_label = new JLabel("");
		sinema_bilet_text_label.setForeground(new Color(123, 140, 144));
		sinema_bilet_text_label.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 28));
		sinema_bilet_text_label.setBounds(95, 279, 247, 32);
		biletlerim_checkbox.add(sinema_bilet_text_label);
		
		JPanel biletlerim_panel = new JPanel();
		biletlerim_panel.setLayout(null);
		biletlerim_panel.setBackground(new Color(221, 188, 0));
		biletlerim_panel.setBounds(0, 38, 1071, 41);
		biletlerim_checkbox.add(biletlerim_panel);
		
		JLabel biletlerim_label = new JLabel("BİLETLERİM\r\n");
		biletlerim_label.setVerticalAlignment(SwingConstants.CENTER);
		biletlerim_label.setHorizontalAlignment(SwingConstants.CENTER);
		biletlerim_label.setForeground(new Color(86, 86, 86));
		biletlerim_label.setFont(new Font("Times New Roman", Font.BOLD, 34));
		biletlerim_label.setBounds(-11, 0, 294, 39);
		biletlerim_panel.add(biletlerim_label);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"BİLETİ SEÇİNİZ..."}));
		comboBox.setBounds(46, 150, 247, 32);
		biletlerim_checkbox.add(comboBox);
		for(Bilet b: Login.getKullanici().getBiletler() ) {
			comboBox.addItem(b.getFilmName()+" - "+b.getSalon()+" -Koltuk "+b.getKoltukNo());
		}
		
		JButton bileti_goruntule_buton = new JButton("Bileti Görüntüle\r\n");
		
		bileti_goruntule_buton.setForeground(new Color(0, 0, 0));
		bileti_goruntule_buton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bileti_goruntule_buton.setBorderPainted(false);
		bileti_goruntule_buton.setBackground(new Color(255, 255, 255));
		bileti_goruntule_buton.setBounds(411, 150, 247, 32);
		biletlerim_checkbox.add(bileti_goruntule_buton);
		
		JLabel lblNewLabel = new JLabel("Görüntülemek istediğiniz bileti seçin ve 'Bileti Görüntüle' düğmesine basın.");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 17));
		lblNewLabel.setForeground(new Color(255, 255, 255));
		lblNewLabel.setBackground(new Color(255, 255, 255));
		lblNewLabel.setBounds(0, 89, 1061, 30);
		biletlerim_checkbox.add(lblNewLabel);
		
		JButton bilet_iptal_buton = new JButton("Seçilen Bileti İptal Et");
		
		bilet_iptal_buton.setForeground(Color.BLACK);
		bilet_iptal_buton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		bilet_iptal_buton.setBorderPainted(false);
		bilet_iptal_buton.setBackground(Color.WHITE);
		bilet_iptal_buton.setBounds(766, 150, 247, 32);
		biletlerim_checkbox.add(bilet_iptal_buton);
		
		JLabel bilet_arka_plan_label = new JLabel("LÜTFEN BİLET SEÇİNİZ ...");
		bilet_arka_plan_label.setForeground(new Color(255, 255, 255));
		bilet_arka_plan_label.setFont(new Font("Tahoma", Font.BOLD, 55));
		bilet_arka_plan_label.setBounds(46, 253, 968, 272);
		biletlerim_checkbox.add(bilet_arka_plan_label);
		bilet_arka_plan_label.setVerticalAlignment(SwingConstants.CENTER);
		bilet_arka_plan_label.setHorizontalAlignment(SwingConstants.CENTER);
		
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
		geri_buton.setBounds(1018, 0, 53, 32);
		biletlerim_checkbox.add(geri_buton);
		
		bileti_goruntule_buton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((comboBox.getSelectedItem().equals("BİLETİ SEÇİNİZ..."))) {
					bilet_arka_plan_label.setText("LÜTFEN BİLET SEÇİNİZ ...");
					bilet_arka_plan_label.setIcon(new ImageIcon());
					sinema_bilet_text_label.setText("");
					salon_yazi_label.setText("");
					koltuk_yazi_label.setText("");
					isim_soyisim_yazi_label.setText("");
					saat_label.setText("");
					film_ad_label.setText("");
					koltuk_no_label.setText("");
					isim_soyisim_label.setText("");
					salon_no_label.setText("");
				}else {
					bilet_arka_plan_label.setText("");
					Image image1=new ImageIcon(this.getClass().getResource("/biletArka.png")).getImage();
					bilet_arka_plan_label.setIcon(new ImageIcon(image1));	
					isim_soyisim_yazi_label.setText("ISIM SOYISIM");
					koltuk_yazi_label.setText("KOLTUK");
					salon_yazi_label.setText("SALON");
					sinema_bilet_text_label.setText("SİNEMA BİLETİ");
					for(Bilet b :Login.getKullanici().getBiletler()) {
						if(comboBox.getSelectedItem().equals(b.getFilmName()+" - "+b.getSalon()+" -Koltuk "+b.getKoltukNo())) {
							film_ad_label.setText("FİLM ADI : "+b.getFilmName());
							saat_label.setText(b.getSaat());
							koltuk_no_label.setText(""+b.getKoltukNo());
							isim_soyisim_label.setText(b.getIsim_soy_isim());
							salon_no_label.setText(b.getSalon());	
						}
					}	
				}
			}
		});
		
		bilet_iptal_buton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				if((comboBox.getSelectedItem().equals("BİLETİ SEÇİNİZ..."))) {
					bilet_arka_plan_label.setText("LÜTFEN BİLET SEÇİNİZ ...");
					bilet_arka_plan_label.setIcon(new ImageIcon());
					sinema_bilet_text_label.setText("");
					salon_yazi_label.setText("");
					koltuk_yazi_label.setText("");
					isim_soyisim_yazi_label.setText("");
					saat_label.setText("");
					film_ad_label.setText("");
					koltuk_no_label.setText("");
					isim_soyisim_label.setText("");
					salon_no_label.setText("");
				}else {
					for(int i=0;i<Login.getKullanici().getBiletler().size();i++) {
						if(comboBox.getSelectedItem().equals(Login.getKullanici().getBiletler().get(i).getFilmName()+" - "+Login.getKullanici().getBiletler().get(i).getSalon()+" -Koltuk "+Login.getKullanici().getBiletler().get(i).getKoltukNo())) {
							int tutar=Login.getKullanici().getBiletler().get(i).getOdenenUcret();
							Login.getKullanici().getBiletler().remove(i);
							for(Kullanici a :Login.getKullanici_list()) {
								if(Login.getKullanici_list().get(i) == Login.getKullanici() ) {
									OdemeIptal o =new OdemeIptal(tutar);
									o.setVisible(true);
									o.setLocationRelativeTo(null);
									return;
								}
						}
					}	
			   }
			}
			}});
	
		
	}
}
