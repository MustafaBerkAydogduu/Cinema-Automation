package SinemaOtamasyonu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OdemeIptalEkrani extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public OdemeIptalEkrani() {
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
		giris_yap_buton.setBackground(new Color(255, 43, 43));
		giris_yap_buton.setBounds(0, 247, 534, 38);
		contentPane.add(giris_yap_buton);
		
		JLabel kullanici_adi_label = new JLabel("Ödeme işlemi iptal edildi.");
		kullanici_adi_label.setVerticalAlignment(SwingConstants.CENTER);
		kullanici_adi_label.setHorizontalAlignment(SwingConstants.CENTER);
		kullanici_adi_label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		kullanici_adi_label.setBounds(10, 151, 514, 32);
		contentPane.add(kullanici_adi_label);
		
		JLabel foto_label = new JLabel("");
		foto_label.setBounds(227, 22, 75, 74);
		contentPane.add(foto_label);
		Image image=new ImageIcon(this.getClass().getResource("/iptal.png")).getImage();
		foto_label.setIcon(new ImageIcon(image));	
		
		JLabel kullanici_adi_label_1 = new JLabel(" İlgilendiğiniz konuyla ilgili herhangi bir sorunuz varsa, lütfen müşteri hizmetleriyle iletişime geçin.");
		kullanici_adi_label_1.setVerticalAlignment(SwingConstants.CENTER);
		kullanici_adi_label_1.setHorizontalAlignment(SwingConstants.CENTER);
		kullanici_adi_label_1.setFont(new Font("Tahoma", Font.PLAIN, 12));
		kullanici_adi_label_1.setBounds(0, 193, 534, 32);
		contentPane.add(kullanici_adi_label_1);
		
		
	}
}
