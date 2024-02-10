package SinemaOtamasyonu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class OdemeIptal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public OdemeIptal(int tutar) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 548, 349);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel foto_label = new JLabel("");
		foto_label.setBounds(223, 28, 75, 74);
		contentPane.add(foto_label);
		Image image=new ImageIcon(this.getClass().getResource("/basarilii.png")).getImage();
		foto_label.setIcon(new ImageIcon(image));
		
		JLabel kullanici_adi_label = new JLabel("Seçilen bilet başarıyla iptal edildi.");
		kullanici_adi_label.setVerticalAlignment(SwingConstants.CENTER);
		kullanici_adi_label.setHorizontalAlignment(SwingConstants.CENTER);
		kullanici_adi_label.setFont(new Font("Tahoma", Font.PLAIN, 15));
		kullanici_adi_label.setBounds(0, 150, 534, 32);
		contentPane.add(kullanici_adi_label);
		
		JButton kapat_button = new JButton("KAPAT\r\n");
		kapat_button.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				AnaSayfa.b.setVisible(false);
				setVisible(false);
				biletlerim bilet=new biletlerim();
				bilet.setVisible(true);
				bilet.setLocationRelativeTo(null);
			}
		});
		kapat_button.setForeground(Color.WHITE);
		kapat_button.setFont(new Font("Tahoma", Font.PLAIN, 14));
		kapat_button.setBorderPainted(false);
		kapat_button.setBackground(new Color(0, 128, 64));
		kapat_button.setBounds(0, 242, 534, 38);
		contentPane.add(kapat_button);
		
		JLabel kullanici_adi_label_1 = new JLabel("Ödemiş olduğunuz "+tutar+"TL  1 - 7 iş günü içersinde iadesi gerçekleştirilecektir");
		kullanici_adi_label_1.setVerticalAlignment(SwingConstants.CENTER);
		kullanici_adi_label_1.setHorizontalAlignment(SwingConstants.CENTER);
		kullanici_adi_label_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		kullanici_adi_label_1.setBounds(0, 200, 534, 32);
		contentPane.add(kullanici_adi_label_1);
	}
}
