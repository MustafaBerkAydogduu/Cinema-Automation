package SinemaOtamasyonu;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.Label;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OdemeBasariliEkran extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;


	public OdemeBasariliEkran() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 342);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton giris_yap_buton = new JButton("KAPAT\r\n");
		giris_yap_buton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
			}
		});
		giris_yap_buton.setForeground(Color.WHITE);
		giris_yap_buton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		giris_yap_buton.setBorderPainted(false);
		giris_yap_buton.setBackground(new Color(0, 128, 64));
		giris_yap_buton.setBounds(0, 246, 534, 38);
		contentPane.add(giris_yap_buton);
		
		JLabel kullanici_adi_label = new JLabel("Ödeme işlemi başarıyla gerçekleştirildi. Teşekkür ederiz!");
		kullanici_adi_label.setVerticalAlignment(SwingConstants.CENTER);
		kullanici_adi_label.setHorizontalAlignment(SwingConstants.CENTER);
		kullanici_adi_label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		kullanici_adi_label.setBounds(10, 132, 514, 32);
		contentPane.add(kullanici_adi_label);
		
		JLabel kullanici_adi_label_1 = new JLabel("Satın alınan bileti Ana Sayfadaki Biletlerim kısmından görüntüleyebilirsiniz. İyi etkinlikler dileriz!");
		kullanici_adi_label_1.setVerticalAlignment(SwingConstants.CENTER);
		kullanici_adi_label_1.setHorizontalAlignment(SwingConstants.CENTER);
		kullanici_adi_label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		kullanici_adi_label_1.setBounds(10, 174, 514, 32);
		contentPane.add(kullanici_adi_label_1);
		
		JLabel foto_label = new JLabel("");
		foto_label.setBounds(235, 26, 75, 74);
		contentPane.add(foto_label);
		Image image=new ImageIcon(this.getClass().getResource("/basarilii.png")).getImage();
		foto_label.setIcon(new ImageIcon(image));
	
		
	}
}
