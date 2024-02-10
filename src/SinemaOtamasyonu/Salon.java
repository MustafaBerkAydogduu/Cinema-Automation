package SinemaOtamasyonu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Label;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.Random;

public class Salon extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField isim_soyisim_tf;
	private JTextField koltuk_no_tf;
	private ArrayList<JLabel> kol = new ArrayList<>();

	private static Random r = new Random();

	public Salon(int sayı) {

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1377, 765);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(86, 86, 86));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		JPanel satınAlma = new JPanel();
		satınAlma.setBackground(new Color(221, 188, 0));
		satınAlma.setBounds(22, 0, 294, 728);
		contentPane.add(satınAlma);
		satınAlma.setLayout(null);

		JLabel film_foto_label = new JLabel();
		film_foto_label.setBounds(10, 45, 122, 134);
		satınAlma.add(film_foto_label);
		film_foto_label.setIcon(new ImageIcon(BiletSatınAl.getSeans().get(sayı).getIcon()));

		JLabel film_name_label = new JLabel();
		film_name_label.setForeground(new Color(86, 86, 86));
		film_name_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film_name_label.setBounds(142, 45, 141, 26);
		satınAlma.add(film_name_label);
		film_name_label.setText(BiletSatınAl.getSeans().get(sayı).getFilmAdi());

		JLabel film_salon_label = new JLabel();

		film_salon_label.setForeground(new Color(86, 86, 86));
		film_salon_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film_salon_label.setBounds(142, 81, 141, 26);
		satınAlma.add(film_salon_label);
		film_salon_label.setText(BiletSatınAl.getSeans().get(sayı).getSalon());

		JLabel film_saat_label = new JLabel();
		film_saat_label.setForeground(new Color(86, 86, 86));
		film_saat_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film_saat_label.setBounds(142, 117, 141, 26);
		satınAlma.add(film_saat_label);
		film_saat_label.setText(BiletSatınAl.getSeans().get(sayı).getSaat());

		JLabel film1name_label_4_1_2 = new JLabel();
		film1name_label_4_1_2.setText("---- Seans Bilgileri ----\r\n");
		film1name_label_4_1_2.setForeground(new Color(86, 86, 86));
		film1name_label_4_1_2.setFont(new Font("Tahoma", Font.BOLD, 16));
		film1name_label_4_1_2.setBounds(10, 0, 274, 26);
		satınAlma.add(film1name_label_4_1_2);
		film1name_label_4_1_2.setVerticalAlignment(SwingConstants.CENTER);
		film1name_label_4_1_2.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel bilet_bilgileri_label = new JLabel();
		bilet_bilgileri_label.setVerticalAlignment(SwingConstants.CENTER);
		bilet_bilgileri_label.setText("---- Bilet Bilgileri ----\r\n");
		bilet_bilgileri_label.setHorizontalAlignment(SwingConstants.CENTER);
		bilet_bilgileri_label.setForeground(new Color(86, 86, 86));
		bilet_bilgileri_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		bilet_bilgileri_label.setBounds(10, 231, 274, 26);
		satınAlma.add(bilet_bilgileri_label);

		JLabel isim_soyisim_label = new JLabel("İSİM SOYİSİM");
		isim_soyisim_label.setForeground(new Color(86, 86, 86));
		isim_soyisim_label.setFont(new Font("Tahoma", Font.BOLD, 15));
		isim_soyisim_label.setBounds(10, 280, 149, 32);
		satınAlma.add(isim_soyisim_label);

		isim_soyisim_tf = new JTextField();
		isim_soyisim_tf.setFont(new Font("Tahoma", Font.BOLD, 12));
		isim_soyisim_tf.setColumns(10);
		isim_soyisim_tf.setBounds(10, 322, 273, 38);
		satınAlma.add(isim_soyisim_tf);

		JLabel koltuk_no_label = new JLabel("KOLTUK NO");
		koltuk_no_label.setForeground(new Color(86, 86, 86));
		koltuk_no_label.setFont(new Font("Tahoma", Font.BOLD, 15));
		koltuk_no_label.setBounds(10, 386, 149, 32);
		satınAlma.add(koltuk_no_label);

		koltuk_no_tf = new JTextField();
		koltuk_no_tf.setFont(new Font("Tahoma", Font.BOLD, 12));
		koltuk_no_tf.setColumns(10);
		koltuk_no_tf.setBounds(10, 428, 273, 38);
		satınAlma.add(koltuk_no_tf);

		JButton bilet_al_buton = new JButton("Satın Al");

		bilet_al_buton.setFont(new Font("Tahoma", Font.BOLD, 12));
		bilet_al_buton.setBounds(95, 545, 85, 44);
		satınAlma.add(bilet_al_buton);
		
		JLabel fiyat_label = new JLabel();
		fiyat_label.setText(String.valueOf(BiletSatınAl.getSeans().get(sayı).getBiletFiyati())+" TL");
		fiyat_label.setForeground(new Color(86, 86, 86));
		fiyat_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		fiyat_label.setBounds(142, 153, 141, 26);
		satınAlma.add(fiyat_label);
		

		JLabel salon_adi_label = new JLabel();

		salon_adi_label.setVerticalAlignment(SwingConstants.CENTER);
		salon_adi_label.setHorizontalAlignment(SwingConstants.CENTER);
		salon_adi_label.setForeground(new Color(255, 255, 255));
		salon_adi_label.setFont(new Font("Tahoma", Font.BOLD, 40));
		salon_adi_label.setBounds(326, 10, 1027, 53);
		contentPane.add(salon_adi_label);
		salon_adi_label.setText(BiletSatınAl.getSeans().get(sayı).getSalon());

		JLabel koltuk1 = new JLabel("1");
		koltuk1.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk1.setBackground(new Color(255, 255, 255));
		koltuk1.setBounds(440, 518, 54, 53);
		contentPane.add(koltuk1);
		koltuk1.setOpaque(true);
		koltuk1.setVerticalAlignment(SwingConstants.CENTER);
		koltuk1.setHorizontalAlignment(SwingConstants.CENTER);

		JLabel koltuk2 = new JLabel("2");
		koltuk2.setVerticalAlignment(SwingConstants.CENTER);
		koltuk2.setOpaque(true);
		koltuk2.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk2.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk2.setBackground(Color.WHITE);
		koltuk2.setBounds(537, 518, 54, 53);
		contentPane.add(koltuk2);

		JLabel koltuk3 = new JLabel("3");
		koltuk3.setVerticalAlignment(SwingConstants.CENTER);
		koltuk3.setOpaque(true);
		koltuk3.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk3.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk3.setBackground(Color.WHITE);
		koltuk3.setBounds(630, 518, 54, 53);
		contentPane.add(koltuk3);

		JLabel koltuk4 = new JLabel("4");
		koltuk4.setVerticalAlignment(SwingConstants.CENTER);
		koltuk4.setOpaque(true);
		koltuk4.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk4.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk4.setBackground(Color.WHITE);
		koltuk4.setBounds(725, 518, 54, 53);
		contentPane.add(koltuk4);

		JLabel koltuk5 = new JLabel("5");
		koltuk5.setVerticalAlignment(SwingConstants.CENTER);
		koltuk5.setOpaque(true);
		koltuk5.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk5.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk5.setBackground(Color.WHITE);
		koltuk5.setBounds(818, 518, 54, 53);
		contentPane.add(koltuk5);

		JLabel koltuk6 = new JLabel("6");
		koltuk6.setVerticalAlignment(SwingConstants.CENTER);
		koltuk6.setOpaque(true);
		koltuk6.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk6.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk6.setBackground(Color.WHITE);
		koltuk6.setBounds(911, 518, 54, 53);
		contentPane.add(koltuk6);

		JLabel koltuk7 = new JLabel("7");
		koltuk7.setVerticalAlignment(SwingConstants.CENTER);
		koltuk7.setOpaque(true);
		koltuk7.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk7.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk7.setBackground(Color.WHITE);
		koltuk7.setBounds(1007, 518, 54, 53);
		contentPane.add(koltuk7);

		JLabel koltuk8 = new JLabel("8");
		koltuk8.setVerticalAlignment(SwingConstants.CENTER);
		koltuk8.setOpaque(true);
		koltuk8.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk8.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk8.setBackground(Color.WHITE);
		koltuk8.setBounds(1100, 518, 54, 53);
		contentPane.add(koltuk8);

		JLabel koltuk9 = new JLabel("9");
		koltuk9.setVerticalAlignment(SwingConstants.CENTER);
		koltuk9.setOpaque(true);
		koltuk9.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk9.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk9.setBackground(Color.WHITE);
		koltuk9.setBounds(1191, 518, 54, 53);
		contentPane.add(koltuk9);

		JLabel koltuk10 = new JLabel("10");
		koltuk10.setVerticalAlignment(SwingConstants.CENTER);
		koltuk10.setOpaque(true);
		koltuk10.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk10.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk10.setBackground(Color.WHITE);
		koltuk10.setBounds(440, 439, 54, 53);
		contentPane.add(koltuk10);

		JLabel koltuk19 = new JLabel("19");
		koltuk19.setVerticalAlignment(SwingConstants.CENTER);
		koltuk19.setOpaque(true);
		koltuk19.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk19.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk19.setBackground(Color.WHITE);
		koltuk19.setBounds(440, 364, 54, 53);
		contentPane.add(koltuk19);

		JLabel koltuk28 = new JLabel("28");
		koltuk28.setVerticalAlignment(SwingConstants.CENTER);
		koltuk28.setOpaque(true);
		koltuk28.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk28.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk28.setBackground(Color.WHITE);
		koltuk28.setBounds(440, 287, 54, 53);
		contentPane.add(koltuk28);

		JLabel koltuk37 = new JLabel("37");
		koltuk37.setVerticalAlignment(SwingConstants.CENTER);
		koltuk37.setOpaque(true);
		koltuk37.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk37.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk37.setBackground(Color.WHITE);
		koltuk37.setBounds(440, 211, 54, 53);
		contentPane.add(koltuk37);

		JLabel koltuk46 = new JLabel("46");
		koltuk46.setVerticalAlignment(SwingConstants.CENTER);
		koltuk46.setOpaque(true);
		koltuk46.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk46.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk46.setBackground(Color.WHITE);
		koltuk46.setBounds(440, 135, 54, 53);
		contentPane.add(koltuk46);

		JLabel koltuk47 = new JLabel("47");
		koltuk47.setVerticalAlignment(SwingConstants.CENTER);
		koltuk47.setOpaque(true);
		koltuk47.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk47.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk47.setBackground(Color.WHITE);
		koltuk47.setBounds(537, 135, 54, 53);
		contentPane.add(koltuk47);

		JLabel koltuk38 = new JLabel("38");
		koltuk38.setVerticalAlignment(SwingConstants.CENTER);
		koltuk38.setOpaque(true);
		koltuk38.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk38.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk38.setBackground(Color.WHITE);
		koltuk38.setBounds(537, 211, 54, 53);
		contentPane.add(koltuk38);

		JLabel koltuk29 = new JLabel("29");
		koltuk29.setVerticalAlignment(SwingConstants.CENTER);
		koltuk29.setOpaque(true);
		koltuk29.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk29.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk29.setBackground(Color.WHITE);
		koltuk29.setBounds(537, 287, 54, 53);
		contentPane.add(koltuk29);

		JLabel koltuk20 = new JLabel("20");
		koltuk20.setVerticalAlignment(SwingConstants.CENTER);
		koltuk20.setOpaque(true);
		koltuk20.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk20.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk20.setBackground(Color.WHITE);
		koltuk20.setBounds(537, 364, 54, 53);
		contentPane.add(koltuk20);

		JLabel koltuk11 = new JLabel("11");
		koltuk11.setVerticalAlignment(SwingConstants.CENTER);
		koltuk11.setOpaque(true);
		koltuk11.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk11.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk11.setBackground(Color.WHITE);
		koltuk11.setBounds(537, 439, 54, 53);
		contentPane.add(koltuk11);

		JLabel koltuk12 = new JLabel("12");
		koltuk12.setVerticalAlignment(SwingConstants.CENTER);
		koltuk12.setOpaque(true);
		koltuk12.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk12.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk12.setBackground(Color.WHITE);
		koltuk12.setBounds(630, 439, 54, 53);
		contentPane.add(koltuk12);

		JLabel koltuk21 = new JLabel("21");
		koltuk21.setVerticalAlignment(SwingConstants.CENTER);
		koltuk21.setOpaque(true);
		koltuk21.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk21.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk21.setBackground(Color.WHITE);
		koltuk21.setBounds(630, 364, 54, 53);
		contentPane.add(koltuk21);

		JLabel koltuk30 = new JLabel("30");
		koltuk30.setVerticalAlignment(SwingConstants.CENTER);
		koltuk30.setOpaque(true);
		koltuk30.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk30.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk30.setBackground(Color.WHITE);
		koltuk30.setBounds(630, 287, 54, 53);
		contentPane.add(koltuk30);

		JLabel koltuk39 = new JLabel("39");
		koltuk39.setVerticalAlignment(SwingConstants.CENTER);
		koltuk39.setOpaque(true);
		koltuk39.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk39.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk39.setBackground(Color.WHITE);
		koltuk39.setBounds(630, 211, 54, 53);
		contentPane.add(koltuk39);

		JLabel koltuk48 = new JLabel("48");
		koltuk48.setVerticalAlignment(SwingConstants.CENTER);
		koltuk48.setOpaque(true);
		koltuk48.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk48.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk48.setBackground(Color.WHITE);
		koltuk48.setBounds(630, 135, 54, 53);
		contentPane.add(koltuk48);

		JLabel koltuk49 = new JLabel("49");
		koltuk49.setVerticalAlignment(SwingConstants.CENTER);
		koltuk49.setOpaque(true);
		koltuk49.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk49.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk49.setBackground(Color.WHITE);
		koltuk49.setBounds(725, 135, 54, 53);
		contentPane.add(koltuk49);

		JLabel koltuk40 = new JLabel("40");
		koltuk40.setVerticalAlignment(SwingConstants.CENTER);
		koltuk40.setOpaque(true);
		koltuk40.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk40.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk40.setBackground(Color.WHITE);
		koltuk40.setBounds(725, 211, 54, 53);
		contentPane.add(koltuk40);

		JLabel koltuk31 = new JLabel("31");
		koltuk31.setVerticalAlignment(SwingConstants.CENTER);
		koltuk31.setOpaque(true);
		koltuk31.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk31.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk31.setBackground(Color.WHITE);
		koltuk31.setBounds(725, 287, 54, 53);
		contentPane.add(koltuk31);

		JLabel koltuk22 = new JLabel("22");
		koltuk22.setVerticalAlignment(SwingConstants.CENTER);
		koltuk22.setOpaque(true);
		koltuk22.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk22.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk22.setBackground(Color.WHITE);
		koltuk22.setBounds(725, 364, 54, 53);
		contentPane.add(koltuk22);

		JLabel koltuk13 = new JLabel("13");
		koltuk13.setVerticalAlignment(SwingConstants.CENTER);
		koltuk13.setOpaque(true);
		koltuk13.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk13.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk13.setBackground(Color.WHITE);
		koltuk13.setBounds(725, 439, 54, 53);
		contentPane.add(koltuk13);

		JLabel koltuk50 = new JLabel("50");
		koltuk50.setVerticalAlignment(SwingConstants.CENTER);
		koltuk50.setOpaque(true);
		koltuk50.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk50.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk50.setBackground(Color.WHITE);
		koltuk50.setBounds(818, 135, 54, 53);
		contentPane.add(koltuk50);

		JLabel koltuk41 = new JLabel("41");
		koltuk41.setVerticalAlignment(SwingConstants.CENTER);
		koltuk41.setOpaque(true);
		koltuk41.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk41.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk41.setBackground(Color.WHITE);
		koltuk41.setBounds(818, 211, 54, 53);
		contentPane.add(koltuk41);

		JLabel koltuk32 = new JLabel("32");
		koltuk32.setVerticalAlignment(SwingConstants.CENTER);
		koltuk32.setOpaque(true);
		koltuk32.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk32.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk32.setBackground(Color.WHITE);
		koltuk32.setBounds(818, 287, 54, 53);
		contentPane.add(koltuk32);

		JLabel koltuk23 = new JLabel("23");
		koltuk23.setVerticalAlignment(SwingConstants.CENTER);
		koltuk23.setOpaque(true);
		koltuk23.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk23.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk23.setBackground(Color.WHITE);
		koltuk23.setBounds(818, 364, 54, 53);
		contentPane.add(koltuk23);

		JLabel koltuk14 = new JLabel("14");
		koltuk14.setVerticalAlignment(SwingConstants.CENTER);
		koltuk14.setOpaque(true);
		koltuk14.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk14.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk14.setBackground(Color.WHITE);
		koltuk14.setBounds(818, 439, 54, 53);
		contentPane.add(koltuk14);

		JLabel koltuk51 = new JLabel("51");
		koltuk51.setVerticalAlignment(SwingConstants.CENTER);
		koltuk51.setOpaque(true);
		koltuk51.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk51.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk51.setBackground(Color.WHITE);
		koltuk51.setBounds(911, 135, 54, 53);
		contentPane.add(koltuk51);

		JLabel koltuk42 = new JLabel("42");
		koltuk42.setVerticalAlignment(SwingConstants.CENTER);
		koltuk42.setOpaque(true);
		koltuk42.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk42.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk42.setBackground(Color.WHITE);
		koltuk42.setBounds(911, 211, 54, 53);
		contentPane.add(koltuk42);

		JLabel koltuk33 = new JLabel("33");
		koltuk33.setVerticalAlignment(SwingConstants.CENTER);
		koltuk33.setOpaque(true);
		koltuk33.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk33.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk33.setBackground(Color.WHITE);
		koltuk33.setBounds(911, 287, 54, 53);
		contentPane.add(koltuk33);

		JLabel koltuk24 = new JLabel("24");
		koltuk24.setVerticalAlignment(SwingConstants.CENTER);
		koltuk24.setOpaque(true);
		koltuk24.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk24.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk24.setBackground(Color.WHITE);
		koltuk24.setBounds(911, 364, 54, 53);
		contentPane.add(koltuk24);

		JLabel koltuk15 = new JLabel("15");
		koltuk15.setVerticalAlignment(SwingConstants.CENTER);
		koltuk15.setOpaque(true);
		koltuk15.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk15.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk15.setBackground(Color.WHITE);
		koltuk15.setBounds(911, 439, 54, 53);
		contentPane.add(koltuk15);

		JLabel koltuk52 = new JLabel("52");
		koltuk52.setVerticalAlignment(SwingConstants.CENTER);
		koltuk52.setOpaque(true);
		koltuk52.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk52.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk52.setBackground(Color.WHITE);
		koltuk52.setBounds(1007, 135, 54, 53);
		contentPane.add(koltuk52);

		JLabel koltuk43 = new JLabel("43");
		koltuk43.setVerticalAlignment(SwingConstants.CENTER);
		koltuk43.setOpaque(true);
		koltuk43.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk43.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk43.setBackground(Color.WHITE);
		koltuk43.setBounds(1007, 211, 54, 53);
		contentPane.add(koltuk43);

		JLabel koltuk34 = new JLabel("34");
		koltuk34.setVerticalAlignment(SwingConstants.CENTER);
		koltuk34.setOpaque(true);
		koltuk34.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk34.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk34.setBackground(Color.WHITE);
		koltuk34.setBounds(1007, 287, 54, 53);
		contentPane.add(koltuk34);

		JLabel koltuk25 = new JLabel("25");
		koltuk25.setVerticalAlignment(SwingConstants.CENTER);
		koltuk25.setOpaque(true);
		koltuk25.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk25.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk25.setBackground(Color.WHITE);
		koltuk25.setBounds(1007, 364, 54, 53);
		contentPane.add(koltuk25);

		JLabel koltuk16 = new JLabel("16");
		koltuk16.setVerticalAlignment(SwingConstants.CENTER);
		koltuk16.setOpaque(true);
		koltuk16.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk16.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk16.setBackground(Color.WHITE);
		koltuk16.setBounds(1007, 439, 54, 53);
		contentPane.add(koltuk16);

		JLabel koltuk17 = new JLabel("17");
		koltuk17.setVerticalAlignment(SwingConstants.CENTER);
		koltuk17.setOpaque(true);
		koltuk17.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk17.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk17.setBackground(Color.WHITE);
		koltuk17.setBounds(1100, 439, 54, 53);
		contentPane.add(koltuk17);

		JLabel koltuk26 = new JLabel("26");
		koltuk26.setVerticalAlignment(SwingConstants.CENTER);
		koltuk26.setOpaque(true);
		koltuk26.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk26.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk26.setBackground(Color.WHITE);
		koltuk26.setBounds(1100, 364, 54, 53);
		contentPane.add(koltuk26);

		JLabel koltuk35 = new JLabel("35");
		koltuk35.setVerticalAlignment(SwingConstants.CENTER);
		koltuk35.setOpaque(true);
		koltuk35.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk35.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk35.setBackground(Color.WHITE);
		koltuk35.setBounds(1100, 287, 54, 53);
		contentPane.add(koltuk35);

		JLabel koltuk44 = new JLabel("44");
		koltuk44.setVerticalAlignment(SwingConstants.CENTER);
		koltuk44.setOpaque(true);
		koltuk44.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk44.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk44.setBackground(Color.WHITE);
		koltuk44.setBounds(1100, 211, 54, 53);
		contentPane.add(koltuk44);

		JLabel koltuk53 = new JLabel("53");
		koltuk53.setVerticalAlignment(SwingConstants.CENTER);
		koltuk53.setOpaque(true);
		koltuk53.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk53.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk53.setBackground(Color.WHITE);
		koltuk53.setBounds(1100, 135, 54, 53);
		contentPane.add(koltuk53);

		JLabel koltuk54 = new JLabel("54");
		koltuk54.setVerticalAlignment(SwingConstants.CENTER);
		koltuk54.setOpaque(true);
		koltuk54.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk54.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk54.setBackground(Color.WHITE);
		koltuk54.setBounds(1191, 135, 54, 53);
		contentPane.add(koltuk54);

		JLabel koltuk45 = new JLabel("45");
		koltuk45.setVerticalAlignment(SwingConstants.CENTER);
		koltuk45.setOpaque(true);
		koltuk45.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk45.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk45.setBackground(Color.WHITE);
		koltuk45.setBounds(1191, 211, 54, 53);
		contentPane.add(koltuk45);

		JLabel koltuk36 = new JLabel("36");
		koltuk36.setVerticalAlignment(SwingConstants.CENTER);
		koltuk36.setOpaque(true);
		koltuk36.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk36.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk36.setBackground(Color.WHITE);
		koltuk36.setBounds(1191, 287, 54, 53);
		contentPane.add(koltuk36);

		JLabel koltuk27 = new JLabel("27");
		koltuk27.setVerticalAlignment(SwingConstants.CENTER);
		koltuk27.setOpaque(true);
		koltuk27.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk27.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk27.setBackground(Color.WHITE);
		koltuk27.setBounds(1191, 364, 54, 53);
		contentPane.add(koltuk27);

		JLabel koltuk18 = new JLabel("18");
		koltuk18.setVerticalAlignment(SwingConstants.CENTER);
		koltuk18.setOpaque(true);
		koltuk18.setHorizontalAlignment(SwingConstants.CENTER);
		koltuk18.setFont(new Font("Tahoma", Font.BOLD, 28));
		koltuk18.setBackground(Color.WHITE);
		koltuk18.setBounds(1191, 439, 54, 53);
		contentPane.add(koltuk18);

		JLabel Perde_label = new JLabel();
		Perde_label.setVerticalAlignment(SwingConstants.CENTER);
		Perde_label.setText("Perde\r\n");
		Perde_label.setHorizontalAlignment(SwingConstants.CENTER);
		Perde_label.setForeground(new Color(0, 0, 0));
		Perde_label.setFont(new Font("Tahoma", Font.BOLD, 40));
		Perde_label.setBounds(326, 648, 1027, 53);
		contentPane.add(Perde_label);
		Perde_label.setOpaque(true);

		JButton geri_buton = new JButton("←");
		geri_buton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				BiletSatınAl b = new BiletSatınAl();
				setVisible(false);
				b.setVisible(true);
				b.setLocationRelativeTo(null);
			}
		});
		geri_buton.setForeground(Color.WHITE);
		geri_buton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		geri_buton.setBorderPainted(false);
		geri_buton.setBackground(new Color(255, 47, 47));
		geri_buton.setBounds(1310, 0, 53, 32);
		contentPane.add(geri_buton);

		JLabel bos_koltuk_label = new JLabel("");
		bos_koltuk_label.setVerticalAlignment(SwingConstants.CENTER);
		bos_koltuk_label.setOpaque(true);
		bos_koltuk_label.setHorizontalAlignment(SwingConstants.CENTER);
		bos_koltuk_label.setFont(new Font("Tahoma", Font.BOLD, 28));
		bos_koltuk_label.setBackground(new Color(0, 255, 0));
		bos_koltuk_label.setBounds(1073, 606, 54, 32);
		contentPane.add(bos_koltuk_label);

		JLabel lblBos = new JLabel(" : Boş");
		lblBos.setForeground(new Color(255, 255, 255));
		lblBos.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblBos.setBounds(1137, 606, 71, 32);
		contentPane.add(lblBos);

		JLabel dolu_koltuk_label = new JLabel("");
		dolu_koltuk_label.setVerticalAlignment(SwingConstants.CENTER);
		dolu_koltuk_label.setOpaque(true);
		dolu_koltuk_label.setHorizontalAlignment(SwingConstants.CENTER);
		dolu_koltuk_label.setFont(new Font("Tahoma", Font.BOLD, 28));
		dolu_koltuk_label.setBackground(new Color(255, 0, 0));
		dolu_koltuk_label.setBounds(1218, 606, 54, 32);
		contentPane.add(dolu_koltuk_label);

		JLabel lblDolu = new JLabel(" : Dolu");
		lblDolu.setForeground(Color.WHITE);
		lblDolu.setFont(new Font("Tahoma", Font.BOLD, 18));
		lblDolu.setBounds(1282, 606, 71, 32);
		contentPane.add(lblDolu);
		kol.add(koltuk1);
		kol.add(koltuk2);
		kol.add(koltuk3);
		kol.add(koltuk4);
		kol.add(koltuk5);
		kol.add(koltuk6);
		kol.add(koltuk7);
		kol.add(koltuk8);
		kol.add(koltuk9);
		kol.add(koltuk10);
		kol.add(koltuk11);
		kol.add(koltuk12);
		kol.add(koltuk13);
		kol.add(koltuk14);
		kol.add(koltuk15);
		kol.add(koltuk16);
		kol.add(koltuk17);
		kol.add(koltuk18);
		kol.add(koltuk19);
		kol.add(koltuk20);
		kol.add(koltuk21);
		kol.add(koltuk22);
		kol.add(koltuk23);
		kol.add(koltuk24);
		kol.add(koltuk25);
		kol.add(koltuk26);
		kol.add(koltuk27);
		kol.add(koltuk28);
		kol.add(koltuk29);
		kol.add(koltuk30);
		kol.add(koltuk31);
		kol.add(koltuk32);
		kol.add(koltuk33);
		kol.add(koltuk34);
		kol.add(koltuk35);
		kol.add(koltuk36);
		kol.add(koltuk37);
		kol.add(koltuk38);
		kol.add(koltuk39);
		kol.add(koltuk40);
		kol.add(koltuk41);
		kol.add(koltuk42);
		kol.add(koltuk43);
		kol.add(koltuk44);
		kol.add(koltuk45);
		kol.add(koltuk46);
		kol.add(koltuk47);
		kol.add(koltuk48);
		kol.add(koltuk49);
		kol.add(koltuk50);
		kol.add(koltuk51);
		kol.add(koltuk52);
		kol.add(koltuk53);
		kol.add(koltuk54);

		for (int i = 0; i < kol.size(); i++) {
			if (BiletSatınAl.getSeans().get(sayı).getSalonDuzen().get(i) == 1) {
				kol.get(i).setBackground(new Color(255, 0, 0));
			} else {
				kol.get(i).setBackground(new Color(0, 255, 0));
			}
		}

		bilet_al_buton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				String message = "";
				if (isim_soyisim_tf.getText().trim().equals("")) {
					message = "İsim Soyisim kısmı boş bırakılamaz.";
				} else {
					if (koltuk_no_tf.getText().trim().equals("")) {
						message = "Koltuk numarası kısmı boş bırakılamaz.";
					} else {
						for (JLabel l : kol) {
							if (koltuk_no_tf.getText().equals(l.getText())) {
								int secilenKoltuk = (Integer.parseInt(koltuk_no_tf.getText())) - 1;
								if (BiletSatınAl.getSeans().get(sayı).getSalonDuzen().get(secilenKoltuk) == 1) {
									JOptionPane.showMessageDialog(Salon.this,"Seçilen Koltuk Dolu, lütfen başka bir koltuk numarası giriniz.");
								}else {
									Odeme odemeEkrani=new Odeme(sayı,secilenKoltuk,isim_soyisim_tf.getText());
									odemeEkrani.setVisible(true);
									odemeEkrani.setLocationRelativeTo(null);
								}	
								return;
							}
						}
						message="Geçersiz koltuk numarası girdiniz.";
					}
				}
				JOptionPane.showMessageDialog(Salon.this, message);
			}
		});
	}
	public ArrayList<JLabel> getSalonDuzen() {
		return kol;
	}

	public void setSalonDuzen(ArrayList<JLabel> salonDuzen) {
		this.kol = salonDuzen;
	}
}
