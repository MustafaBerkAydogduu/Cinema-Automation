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
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class ParolaDegistir extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JPasswordField gecerli_parola;
	private JPasswordField yeni_parola;
	private JPasswordField parola_tekrar;

	public ParolaDegistir() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 547, 438);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel parola_degistir_label = new JLabel("PAROLA DEGİSTİR");
		parola_degistir_label.setVerticalAlignment(SwingConstants.CENTER);
		parola_degistir_label.setHorizontalAlignment(SwingConstants.CENTER);
		parola_degistir_label.setForeground(new Color(86, 86, 86));
		parola_degistir_label.setFont(new Font("Times New Roman", Font.BOLD, 30));
		parola_degistir_label.setBounds(0, 10, 532, 39);
		contentPane.add(parola_degistir_label);

		JLabel gecerli_parola_label = new JLabel("Geçerli Parola");
		gecerli_parola_label.setForeground(new Color(86, 86, 86));
		gecerli_parola_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		gecerli_parola_label.setBounds(125, 81, 170, 25);
		contentPane.add(gecerli_parola_label);

		gecerli_parola = new JPasswordField();
		gecerli_parola.setBackground(Color.WHITE);
		gecerli_parola.setBounds(125, 116, 306, 37);
		contentPane.add(gecerli_parola);

		JLabel yeni_parola_label = new JLabel("Yeni Parola\r\n");
		yeni_parola_label.setForeground(new Color(86, 86, 86));
		yeni_parola_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		yeni_parola_label.setBounds(125, 163, 170, 25);
		contentPane.add(yeni_parola_label);

		yeni_parola = new JPasswordField();
		yeni_parola.setBackground(Color.WHITE);
		yeni_parola.setBounds(125, 198, 306, 37);
		contentPane.add(yeni_parola);

		JLabel parola_tekrar_label = new JLabel("Parola Tekrar");
		parola_tekrar_label.setForeground(new Color(86, 86, 86));
		parola_tekrar_label.setFont(new Font("Times New Roman", Font.BOLD, 15));
		parola_tekrar_label.setBounds(125, 245, 170, 25);
		contentPane.add(parola_tekrar_label);

		parola_tekrar = new JPasswordField();
		parola_tekrar.setBackground(Color.WHITE);
		parola_tekrar.setBounds(125, 280, 306, 37);
		contentPane.add(parola_tekrar);

		JButton onayla_buton = new JButton("ONAYLA\r\n");
		onayla_buton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String gecerliParola = new String(gecerli_parola.getPassword());
				String message = "";
				if (gecerliParola.trim().equals("")) {
					message = "Geçerli Parola Kısmı Boş Bırakılamaz";
				} else {
					String yeni_parolaa = new String(yeni_parola.getPassword());
					if (yeni_parolaa.trim().equals("")) {
						message = "Yeni Parola Kısmı Boş Bırakılamaz";
					} else {
						String parola_tekrarr = new String(parola_tekrar.getPassword());
						if (parola_tekrarr.trim().equals("")) {
							message = "Parola Tekrar Kısmı Boş Bırakılamaz";
						} else {
							if (gecerliParola.equals(Login.getKullanici().getSifre())) {

								if (yeni_parolaa.equals(parola_tekrarr)) {
									for (int i = 0; i < Login.getKullanici_list().size(); i++) {
										if (Login.getKullanici_list().get(i) == Login.getKullanici()) {
											Login.getKullanici().setSifre(yeni_parolaa);
											Login.getKullanici_list().set(i, Login.getKullanici());
											message = "Tebrikler! Parolanız başarıyla değiştirildi.";
											JOptionPane.showMessageDialog(ParolaDegistir.this, message);
											setVisible(false);
											return;
										}
									}
								} else {
									message = "Yeni Parola ile Parola Tekrar Uyuşmuyor";
								}

							} else {
								message = "Parolanız ile Geçerli Parola Uyuşmuyor";
							}
						}
					}
				}
				JOptionPane.showMessageDialog(ParolaDegistir.this, message);
			}
		});
		onayla_buton.setForeground(Color.WHITE);
		onayla_buton.setFont(new Font("Times New Roman", Font.BOLD, 18));
		onayla_buton.setBorderPainted(false);
		onayla_buton.setBackground(new Color(0, 128, 64));
		onayla_buton.setBounds(125, 338, 147, 25);
		contentPane.add(onayla_buton);

		JButton odeme_buton_1 = new JButton("IPTAL ET");
		odeme_buton_1.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				JOptionPane.showMessageDialog(ParolaDegistir.this, "İşlem İptal Edildi");
				setVisible(false);
			}
		});
		odeme_buton_1.setForeground(Color.WHITE);
		odeme_buton_1.setFont(new Font("Times New Roman", Font.BOLD, 18));
		odeme_buton_1.setBorderPainted(false);
		odeme_buton_1.setBackground(new Color(255, 47, 47));
		odeme_buton_1.setBounds(284, 338, 147, 25);
		contentPane.add(odeme_buton_1);
	}
}
