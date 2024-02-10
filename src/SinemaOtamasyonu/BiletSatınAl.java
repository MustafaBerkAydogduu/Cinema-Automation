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
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class BiletSatınAl extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private static SecilenFilm secilenFilm;
	private static ArrayList<SalonDuzen> seans =new ArrayList<>();
	private static boolean giris=true;
	static Salon b;
	public void satinAl(int sayı) {
		b=new Salon(sayı);
		this.setVisible(false);
		b.setVisible(true);
		b.setLocationRelativeTo(null);
	}
	
	public void SeansOluştur() {
		SalonDuzen fillm1=new SalonDuzen("Güneşi Gördüm","09.00","Salon 1",new ImageIcon(getClass().getResource("/günes.jpg")).getImage(),110);
		SalonDuzen fillm2=new SalonDuzen("Truman Show","10.00","Salon 2",new ImageIcon(getClass().getResource("/truman.jpg")).getImage(),115);
		SalonDuzen fillm3=new SalonDuzen("Terminal","11.30","Salon 1",new ImageIcon(getClass().getResource("/terminal.jpg")).getImage(),135);
		SalonDuzen fillm4=new SalonDuzen("Zootropolis","12.15","Salon 2",new ImageIcon(getClass().getResource("/zoo.jpg")).getImage(),120);
		SalonDuzen fillm5=new SalonDuzen("Issız Adam","13.45","Salon 1",new ImageIcon(getClass().getResource("/IssızAdam.jpg")).getImage(),140);
		SalonDuzen fillm6=new SalonDuzen("Matrix Reloaded","15.30","Salon 2",new ImageIcon(getClass().getResource("/matrix.jpg")).getImage(),145);
		SalonDuzen fillm7=new SalonDuzen("Truman Show","16.00","Salon 1",new ImageIcon(getClass().getResource("/truman.jpg")).getImage(),160);
		SalonDuzen fillm8=new SalonDuzen("Terminal","18.00","Salon 2",new ImageIcon(getClass().getResource("/terminal.jpg")).getImage(),165);
		SalonDuzen fillm9=new SalonDuzen("Zootropolis","18.00","Salon 1",new ImageIcon(getClass().getResource("/zoo.jpg")).getImage(),140);
		SalonDuzen fillm10=new SalonDuzen("Güneşi Gördüm","20.45","Salon 2",new ImageIcon(getClass().getResource("/günes.jpg")).getImage(),130);
		SalonDuzen fillm11=new SalonDuzen("Matrix Reloaded","21.00","Salon 1",new ImageIcon(getClass().getResource("/matrix.jpg")).getImage(),145);
		SalonDuzen fillm12=new SalonDuzen("Issız Adam","23.00","Salon 2",new ImageIcon(getClass().getResource("/IssızAdam.jpg")).getImage(),125);
		seans.add(fillm1);
		seans.add(fillm2);
		seans.add(fillm3);
		seans.add(fillm4);
		seans.add(fillm5);
		seans.add(fillm6);
		seans.add(fillm7);
		seans.add(fillm8);
		seans.add(fillm9);
		seans.add(fillm10);
		seans.add(fillm11);
		seans.add(fillm12);
	}
	

	public BiletSatınAl() {
		
		if(giris) {
			SeansOluştur();
			giris=false;
		}
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1325, 767);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(86, 86, 86));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel film1_panel = new JPanel();
		
		
		film1_panel.setBackground(new Color(221, 188, 8));
		film1_panel.setBounds(10, 106, 283, 153);
		contentPane.add(film1_panel);
		film1_panel.setLayout(null);
		
		JLabel film1_foto_label = new JLabel();
		film1_foto_label.setBounds(10, 10, 122, 134);
		film1_panel.add(film1_foto_label);
		film1_foto_label.setIcon(new ImageIcon(seans.get(0).getIcon()));
		
		JLabel film1name_label = new JLabel();
		film1name_label.setText(seans.get(0).getFilmAdi());
		film1name_label.setForeground(new Color(86, 86, 86));
		film1name_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film1name_label.setBounds(142, 10, 141, 26);
		film1_panel.add(film1name_label);
		
		JLabel film1salon_label = new JLabel();
		film1salon_label.setText(seans.get(0).getSalon());
		film1salon_label.setForeground(new Color(86, 86, 86));
		film1salon_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film1salon_label.setBounds(142, 46, 141, 26);
		film1_panel.add(film1salon_label);
		
		JLabel film1saat_label = new JLabel();
		film1saat_label.setText(seans.get(0).getSaat());
		film1saat_label.setForeground(new Color(86, 86, 86));
		film1saat_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film1saat_label.setBounds(142, 82, 141, 26);
		film1_panel.add(film1saat_label);
		String tl=" TL";
		JLabel film1fiyat_label = new JLabel();
		film1fiyat_label.setText((String) null);
		film1fiyat_label.setForeground(new Color(86, 86, 86));
		film1fiyat_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film1fiyat_label.setBounds(142, 118, 141, 26);
		film1_panel.add(film1fiyat_label);
		film1fiyat_label.setText(String.valueOf(seans.get(0).getBiletFiyati())+tl);
		
		JPanel bilet_satın_al_panel = new JPanel();
		bilet_satın_al_panel.setLayout(null);
		bilet_satın_al_panel.setBackground(new Color(221, 188, 0));
		bilet_satın_al_panel.setBounds(0, 33, 1305, 41);
		contentPane.add(bilet_satın_al_panel);
		
		JLabel vizyondakiler_label = new JLabel("Bilet Satın Al\r\n");
		vizyondakiler_label.setVerticalAlignment(SwingConstants.CENTER);
		vizyondakiler_label.setHorizontalAlignment(SwingConstants.CENTER);
		vizyondakiler_label.setForeground(new Color(86, 86, 86));
		vizyondakiler_label.setFont(new Font("Times New Roman", Font.BOLD, 34));
		vizyondakiler_label.setBounds(0, 0, 344, 39);
		bilet_satın_al_panel.add(vizyondakiler_label);
		
		JPanel film2_panel = new JPanel();
	
		film2_panel.setLayout(null);
		film2_panel.setBackground(new Color(221, 188, 8));
		film2_panel.setBounds(10, 306, 283, 153);
		contentPane.add(film2_panel);
		
		JLabel film2_foto_label = new JLabel();
		film2_foto_label.setBounds(10, 10, 122, 134);
		film2_panel.add(film2_foto_label);
		film2_foto_label.setIcon(new ImageIcon(seans.get(1).getIcon()));
		
		
		JLabel film2name_label = new JLabel();
		film2name_label.setText(seans.get(1).getFilmAdi());
		film2name_label.setForeground(new Color(86, 86, 86));
		film2name_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film2name_label.setBounds(142, 10, 141, 26);
		film2_panel.add(film2name_label);
		
		JLabel film2salon_label = new JLabel();
		film2salon_label.setText(seans.get(1).getSalon());
		film2salon_label.setForeground(new Color(86, 86, 86));
		film2salon_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film2salon_label.setBounds(142, 46, 141, 26);
		film2_panel.add(film2salon_label);
		
		JLabel film2saat_label = new JLabel();
		film2saat_label.setText(seans.get(1).getSaat());
		film2saat_label.setForeground(new Color(86, 86, 86));
		film2saat_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film2saat_label.setBounds(142, 82, 141, 26);
		film2_panel.add(film2saat_label);
		
		JLabel film2fiyat_label = new JLabel();
		film2fiyat_label.setText((String) null);
		film2fiyat_label.setForeground(new Color(86, 86, 86));
		film2fiyat_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film2fiyat_label.setBounds(142, 118, 141, 26);
		film2_panel.add(film2fiyat_label);
		film2fiyat_label.setText(String.valueOf(seans.get(1).getBiletFiyati())+tl);
		
		JPanel film3_panel = new JPanel();
		film3_panel.setLayout(null);
		film3_panel.setBackground(new Color(221, 188, 8));
		film3_panel.setBounds(10, 511, 283, 153);
		contentPane.add(film3_panel);
		
		JLabel film3_foto_label = new JLabel();
		film3_foto_label.setBounds(10, 10, 122, 134);
		film3_panel.add(film3_foto_label);
		
		film3_foto_label.setIcon(new ImageIcon(seans.get(2).getIcon()));
		JLabel film3name_label = new JLabel();
		
		film3name_label.setText(seans.get(2).getFilmAdi());
		film3name_label.setForeground(new Color(86, 86, 86));
		film3name_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film3name_label.setBounds(142, 10, 141, 26);
		film3_panel.add(film3name_label);
		
		JLabel film3salon_label = new JLabel();
		film3salon_label.setText(seans.get(2).getSalon());
		film3salon_label.setForeground(new Color(86, 86, 86));
		film3salon_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film3salon_label.setBounds(142, 46, 141, 26);
		film3_panel.add(film3salon_label);
		
		JLabel film3saat_label = new JLabel();
		film3saat_label.setText(seans.get(2).getSaat());
		film3saat_label.setForeground(new Color(86, 86, 86));
		film3saat_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film3saat_label.setBounds(142, 82, 141, 26);
		film3_panel.add(film3saat_label);
		
		JLabel film3fiyat_labe = new JLabel();
		film3fiyat_labe.setText((String) null);
		film3fiyat_labe.setForeground(new Color(86, 86, 86));
		film3fiyat_labe.setFont(new Font("Tahoma", Font.BOLD, 16));
		film3fiyat_labe.setBounds(142, 118, 141, 26);
		film3_panel.add(film3fiyat_labe);
		film3fiyat_labe.setText(String.valueOf(seans.get(2).getBiletFiyati())+tl);
		
		JPanel film4_panel = new JPanel();
		
		film4_panel.setLayout(null);
		film4_panel.setBackground(new Color(221, 188, 8));
		film4_panel.setBounds(344, 106, 283, 153);
		contentPane.add(film4_panel);
		
		JLabel film4_foto_label = new JLabel();
		film4_foto_label.setBounds(10, 10, 122, 134);
		film4_panel.add(film4_foto_label);
		
		film4_foto_label.setIcon(new ImageIcon(seans.get(3).getIcon()));
		
		
		
		JLabel film4name_label = new JLabel();
		film4name_label.setText(seans.get(3).getFilmAdi());
		film4name_label.setForeground(new Color(86, 86, 86));
		film4name_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film4name_label.setBounds(142, 10, 141, 26);
		film4_panel.add(film4name_label);
		
		JLabel film4salon_label = new JLabel();
		film4salon_label.setText(seans.get(3).getSalon());
		film4salon_label.setForeground(new Color(86, 86, 86));
		film4salon_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film4salon_label.setBounds(142, 46, 141, 26);
		film4_panel.add(film4salon_label);
		
		JLabel film4saat_label = new JLabel();
		film4saat_label.setText(seans.get(3).getSaat());
		film4saat_label.setForeground(new Color(86, 86, 86));
		film4saat_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film4saat_label.setBounds(142, 82, 141, 26);
		film4_panel.add(film4saat_label);
		
		JLabel film4fiyat_label = new JLabel();
		film4fiyat_label.setText((String) null);
		film4fiyat_label.setForeground(new Color(86, 86, 86));
		film4fiyat_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film4fiyat_label.setBounds(142, 118, 141, 26);
		film4_panel.add(film4fiyat_label);
		film4fiyat_label.setText(String.valueOf(seans.get(3).getBiletFiyati())+tl);
		
		JPanel film5_panel = new JPanel();
	
		film5_panel.setLayout(null);
		film5_panel.setBackground(new Color(221, 188, 8));
		film5_panel.setBounds(344, 306, 283, 153);
		contentPane.add(film5_panel);
		
		JLabel film5_foto_label = new JLabel();
		film5_foto_label.setBounds(10, 10, 122, 134);
		film5_panel.add(film5_foto_label);
	
		film5_foto_label.setIcon(new ImageIcon(seans.get(4).getIcon()));
		
		
		
		
		JLabel film5name_label = new JLabel();
		film5name_label.setText(seans.get(4).getFilmAdi());
		film5name_label.setForeground(new Color(86, 86, 86));
		film5name_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film5name_label.setBounds(142, 10, 141, 26);
		film5_panel.add(film5name_label);
		
		JLabel film5salon_label = new JLabel();
		film5salon_label.setText(seans.get(4).getSalon());
		film5salon_label.setForeground(new Color(86, 86, 86));
		film5salon_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film5salon_label.setBounds(142, 46, 141, 26);
		film5_panel.add(film5salon_label);
		
		JLabel film5saat_label = new JLabel();
		film5saat_label.setText(seans.get(4).getSaat());
		film5saat_label.setForeground(new Color(86, 86, 86));
		film5saat_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film5saat_label.setBounds(142, 82, 141, 26);
		film5_panel.add(film5saat_label);
		
		JLabel film5fiyat_label = new JLabel();
		film5fiyat_label.setText((String) null);
		film5fiyat_label.setForeground(new Color(86, 86, 86));
		film5fiyat_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film5fiyat_label.setBounds(142, 118, 141, 26);
		film5_panel.add(film5fiyat_label);
		film5fiyat_label.setText(String.valueOf(seans.get(4).getBiletFiyati())+tl);
		
		JPanel film6_panel = new JPanel();
		
		film6_panel.setLayout(null);
		film6_panel.setBackground(new Color(221, 188, 8));
		film6_panel.setBounds(344, 511, 283, 153);
		contentPane.add(film6_panel);
		
		JLabel film6_foto_label = new JLabel();
		film6_foto_label.setBounds(10, 10, 122, 134);
		film6_panel.add(film6_foto_label);
		film6_foto_label.setIcon(new ImageIcon(seans.get(5).getIcon()));
		
		JLabel film6name_label = new JLabel();
		film6name_label.setText(seans.get(5).getFilmAdi());
		film6name_label.setForeground(new Color(86, 86, 86));
		film6name_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film6name_label.setBounds(142, 10, 141, 26);
		film6_panel.add(film6name_label);
		
		JLabel film6salon_label = new JLabel();
		film6salon_label.setText(seans.get(5).getSalon());
		film6salon_label.setForeground(new Color(86, 86, 86));
		film6salon_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film6salon_label.setBounds(142, 46, 141, 26);
		film6_panel.add(film6salon_label);
		
		JLabel film6saat_label = new JLabel();
		film6saat_label.setText(seans.get(5).getSaat());
		film6saat_label.setForeground(new Color(86, 86, 86));
		film6saat_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film6saat_label.setBounds(142, 82, 141, 26);
		film6_panel.add(film6saat_label);
		
		JLabel film6fiyat_label = new JLabel();
		film6fiyat_label.setText((String) null);
		film6fiyat_label.setForeground(new Color(86, 86, 86));
		film6fiyat_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film6fiyat_label.setBounds(142, 118, 141, 26);
		film6_panel.add(film6fiyat_label);
		film6fiyat_label.setText(String.valueOf(seans.get(5).getBiletFiyati())+tl);
		
		JPanel film7_panel = new JPanel();
		
		
		film7_panel.setLayout(null);
		film7_panel.setBackground(new Color(221, 188, 8));
		film7_panel.setBounds(680, 106, 283, 153);
		contentPane.add(film7_panel);
		
		JLabel film7_foto_label = new JLabel();
		film7_foto_label.setBounds(10, 10, 122, 134);
		film7_panel.add(film7_foto_label);
		film7_foto_label.setIcon(new ImageIcon(seans.get(6).getIcon()));
		
		
		
		JLabel film7name_label = new JLabel();
		film7name_label.setText(seans.get(6).getFilmAdi());
		film7name_label.setForeground(new Color(86, 86, 86));
		film7name_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film7name_label.setBounds(142, 10, 141, 26);
		film7_panel.add(film7name_label);
		
		JLabel film7salon_label = new JLabel();
		film7salon_label.setText(seans.get(6).getSalon());
		film7salon_label.setForeground(new Color(86, 86, 86));
		film7salon_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film7salon_label.setBounds(142, 46, 141, 26);
		film7_panel.add(film7salon_label);
		
		JLabel film7saat_label = new JLabel();
		film7saat_label.setText(seans.get(6).getSaat());
		film7saat_label.setForeground(new Color(86, 86, 86));
		film7saat_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film7saat_label.setBounds(142, 82, 141, 26);
		film7_panel.add(film7saat_label);
		
		JLabel film7fiyat_label = new JLabel();
		film7fiyat_label.setText((String) null);
		film7fiyat_label.setForeground(new Color(86, 86, 86));
		film7fiyat_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film7fiyat_label.setBounds(142, 118, 141, 26);
		film7_panel.add(film7fiyat_label);
		film7fiyat_label.setText(String.valueOf(seans.get(6).getBiletFiyati())+tl);
		JPanel film8_panel = new JPanel();
		
		film8_panel.setLayout(null);
		film8_panel.setBackground(new Color(221, 188, 8));
		film8_panel.setBounds(680, 306, 283, 153);
		contentPane.add(film8_panel);
		
		JLabel film8_foto_label = new JLabel();
		film8_foto_label.setBounds(10, 10, 122, 134);
		film8_panel.add(film8_foto_label);
		film8_foto_label.setIcon(new ImageIcon(seans.get(7).getIcon()));
		
		JLabel film8name_label = new JLabel();
		film8name_label.setText(seans.get(7).getFilmAdi());
		film8name_label.setForeground(new Color(86, 86, 86));
		film8name_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film8name_label.setBounds(142, 10, 141, 26);
		film8_panel.add(film8name_label);
		
		JLabel film8salon_label = new JLabel();
		film8salon_label.setText(seans.get(7).getSalon());
		film8salon_label.setForeground(new Color(86, 86, 86));
		film8salon_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film8salon_label.setBounds(142, 46, 141, 26);
		film8_panel.add(film8salon_label);
		
		JLabel film8saat_label = new JLabel();
		film8saat_label.setText(seans.get(7).getSaat());
		film8saat_label.setForeground(new Color(86, 86, 86));
		film8saat_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film8saat_label.setBounds(142, 82, 141, 26);
		film8_panel.add(film8saat_label);
		
		JLabel film8fiyat_label = new JLabel();
		film8fiyat_label.setText((String) null);
		film8fiyat_label.setForeground(new Color(86, 86, 86));
		film8fiyat_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film8fiyat_label.setBounds(142, 118, 141, 26);
		film8_panel.add(film8fiyat_label);
		film8fiyat_label.setText(String.valueOf(seans.get(7).getBiletFiyati())+tl);
		JPanel film9_panel = new JPanel();
		
		film9_panel.setLayout(null);
		film9_panel.setBackground(new Color(221, 188, 8));
		film9_panel.setBounds(680, 511, 283, 153);
		contentPane.add(film9_panel);
		
		JLabel film9_foto_label = new JLabel();
		film9_foto_label.setBounds(10, 10, 122, 134);
		film9_panel.add(film9_foto_label);
		film9_foto_label.setIcon(new ImageIcon(seans.get(8).getIcon()));
		
		JLabel film9name_label = new JLabel();
		film9name_label.setText(seans.get(8).getFilmAdi());
		film9name_label.setForeground(new Color(86, 86, 86));
		film9name_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film9name_label.setBounds(142, 10, 141, 26);
		film9_panel.add(film9name_label);
		
		JLabel film9salon_label = new JLabel();
		film9salon_label.setText(seans.get(8).getSalon());
		film9salon_label.setForeground(new Color(86, 86, 86));
		film9salon_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film9salon_label.setBounds(142, 46, 141, 26);
		film9_panel.add(film9salon_label);
		
		JLabel film9saat_label = new JLabel();
		film9saat_label.setText(seans.get(8).getSaat());
		film9saat_label.setForeground(new Color(86, 86, 86));
		film9saat_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film9saat_label.setBounds(142, 82, 141, 26);
		film9_panel.add(film9saat_label);
		
		JLabel film9fiyat_label = new JLabel();
		film9fiyat_label.setText((String) null);
		film9fiyat_label.setForeground(new Color(86, 86, 86));
		film9fiyat_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film9fiyat_label.setBounds(142, 118, 141, 26);
		film9_panel.add(film9fiyat_label);
		film9fiyat_label.setText(String.valueOf(seans.get(8).getBiletFiyati())+tl);
		JPanel film10_panel = new JPanel();
		
		film10_panel.setLayout(null);
		film10_panel.setBackground(new Color(221, 188, 8));
		film10_panel.setBounds(1012, 106, 283, 153);
		contentPane.add(film10_panel);
		
		JLabel film10_foto_label = new JLabel();
		film10_foto_label.setBounds(10, 10, 122, 134);
		film10_panel.add(film10_foto_label);
		film10_foto_label.setIcon(new ImageIcon(seans.get(9).getIcon()));
		
		JLabel film10name_label = new JLabel();
		film10name_label.setText(seans.get(9).getFilmAdi());
		film10name_label.setForeground(new Color(86, 86, 86));
		film10name_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film10name_label.setBounds(142, 10, 141, 26);
		film10_panel.add(film10name_label);
		
		JLabel film10salon_label = new JLabel();
		film10salon_label.setText(seans.get(9).getSalon());
		film10salon_label.setForeground(new Color(86, 86, 86));
		film10salon_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film10salon_label.setBounds(142, 46, 141, 26);
		film10_panel.add(film10salon_label);
		
		JLabel film10saat_label = new JLabel();
		film10saat_label.setText(seans.get(9).getSaat());
		film10saat_label.setForeground(new Color(86, 86, 86));
		film10saat_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film10saat_label.setBounds(142, 82, 141, 26);
		film10_panel.add(film10saat_label);
		
		JLabel film10fiyat_label = new JLabel();
		film10fiyat_label.setText((String) null);
		film10fiyat_label.setForeground(new Color(86, 86, 86));
		film10fiyat_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film10fiyat_label.setBounds(142, 118, 141, 26);
		film10_panel.add(film10fiyat_label);
		film10fiyat_label.setText(String.valueOf(seans.get(9).getBiletFiyati())+tl);
		JPanel film11_panel = new JPanel();
		
		film11_panel.setLayout(null);
		film11_panel.setBackground(new Color(221, 188, 8));
		film11_panel.setBounds(1012, 306, 283, 153);
		contentPane.add(film11_panel);
		
		JLabel film11_foto_label = new JLabel();
		film11_foto_label.setBounds(10, 10, 122, 134);
		film11_panel.add(film11_foto_label);
		film11_foto_label.setIcon(new ImageIcon(seans.get(10).getIcon()));
		
		JLabel film11name_label = new JLabel();
		film11name_label.setText(seans.get(10).getFilmAdi());
		film11name_label.setForeground(new Color(86, 86, 86));
		film11name_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film11name_label.setBounds(142, 10, 141, 26);
		film11_panel.add(film11name_label);
		
		JLabel film11salon_label = new JLabel();
		film11salon_label.setText(seans.get(10).getSalon());
		film11salon_label.setForeground(new Color(86, 86, 86));
		film11salon_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film11salon_label.setBounds(142, 46, 141, 26);
		film11_panel.add(film11salon_label);
		
		JLabel film11saat_label = new JLabel();
		film11saat_label.setText(seans.get(10).getSaat());
		film11saat_label.setForeground(new Color(86, 86, 86));
		film11saat_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film11saat_label.setBounds(142, 82, 141, 26);
		film11_panel.add(film11saat_label);
		
		JLabel film11fiyat_label = new JLabel();
		film11fiyat_label.setText((String) null);
		film11fiyat_label.setForeground(new Color(86, 86, 86));
		film11fiyat_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film11fiyat_label.setBounds(142, 118, 141, 26);
		film11_panel.add(film11fiyat_label);
		film11fiyat_label.setText(String.valueOf(seans.get(10).getBiletFiyati())+tl);
		
		JPanel film12_panel = new JPanel();
		
		film12_panel.setLayout(null);
		film12_panel.setBackground(new Color(221, 188, 8));
		film12_panel.setBounds(1012, 511, 283, 153);
		contentPane.add(film12_panel);
		
		JLabel film12_foto_label = new JLabel();
		film12_foto_label.setBounds(10, 10, 122, 134);
		film12_panel.add(film12_foto_label);
		film12_foto_label.setIcon(new ImageIcon(seans.get(11).getIcon()));
		JLabel film12name_label = new JLabel();
		film12name_label.setText(seans.get(11).getFilmAdi());
		film12name_label.setForeground(new Color(86, 86, 86));
		film12name_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film12name_label.setBounds(142, 10, 141, 26);
		film12_panel.add(film12name_label);
		
		JLabel film12salon_label = new JLabel();
		film12salon_label.setText(seans.get(11).getSalon());
		film12salon_label.setForeground(new Color(86, 86, 86));
		film12salon_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film12salon_label.setBounds(142, 46, 141, 26);
		film12_panel.add(film12salon_label);
		
		JLabel film12saat_label = new JLabel();
		film12saat_label.setText(seans.get(11).getSaat());
		film12saat_label.setForeground(new Color(86, 86, 86));
		film12saat_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film12saat_label.setBounds(142, 82, 141, 26);
		film12_panel.add(film12saat_label);
		
		JLabel film12fiyat_label = new JLabel();
		film12fiyat_label.setText((String) null);
		film12fiyat_label.setForeground(new Color(86, 86, 86));
		film12fiyat_label.setFont(new Font("Tahoma", Font.BOLD, 16));
		film12fiyat_label.setBounds(142, 118, 141, 26);
		film12_panel.add(film12fiyat_label);
		film12fiyat_label.setText(String.valueOf(seans.get(11).getBiletFiyati())+tl);
		JButton geri_buton = new JButton("←");
		geri_buton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
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
		geri_buton.setBounds(1242, 0, 53, 32);
		contentPane.add(geri_buton);
		film1_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				satinAl(0);
			}
		});
		
		film2_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				satinAl(1);
			}
		});
		film3_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				satinAl(2);
			}
		});
		film4_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				satinAl(3);
			}
		});
		
		film5_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				satinAl(4);
			}
		});
		
		film6_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				satinAl(5);
			}
		});
		film7_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				satinAl(6);
			}
		});
		film8_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
			
				satinAl(7);
			}
		});
		film9_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				satinAl(8);
			}
		});
		film10_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				satinAl(9);
			}
		});
		film11_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				satinAl(10);
			}
		});
		film12_panel.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				
				satinAl(11);
			}
		});
		
		
		

	}
	
	
	public static SecilenFilm getSecilenFilm() {
		return secilenFilm;
	}

	public static ArrayList<SalonDuzen> getSeans() {
		return seans;
	}

	public static void setSeans(ArrayList<SalonDuzen> a) {
		BiletSatınAl.seans = a;
	}
}
