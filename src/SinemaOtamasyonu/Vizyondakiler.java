package SinemaOtamasyonu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Vizyondakiler extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private AnaSayfa l=new AnaSayfa();

	public Vizyondakiler() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1086, 694);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(86, 86, 86));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel vizyondakiler_panel = new JPanel();
		vizyondakiler_panel.setLayout(null);
		vizyondakiler_panel.setBackground(new Color(221, 188, 0));
		vizyondakiler_panel.setBounds(0, 42, 1072, 41);
		contentPane.add(vizyondakiler_panel);
		
		JLabel vizyondakiler_label = new JLabel("VİZYONDAKİLER");
		vizyondakiler_label.setVerticalAlignment(SwingConstants.CENTER);
		vizyondakiler_label.setHorizontalAlignment(SwingConstants.CENTER);
		vizyondakiler_label.setForeground(new Color(86, 86, 86));
		vizyondakiler_label.setFont(new Font("Times New Roman", Font.BOLD, 34));
		vizyondakiler_label.setBounds(0, 0, 344, 39);
		vizyondakiler_panel.add(vizyondakiler_label);
		
		JButton geri_buton = new JButton("←");
		geri_buton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				l.setVisible(true);
				l.setLocationRelativeTo(null);
			}
		});
		
		geri_buton.setForeground(Color.WHITE);
		geri_buton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		geri_buton.setBorderPainted(false);
		geri_buton.setBackground(new Color(255, 47, 47));
		geri_buton.setBounds(1019, 0, 53, 32);
		contentPane.add(geri_buton);
		
		JPanel film1_panel = new JPanel();
		
		
		film1_panel.setBackground(new Color(221, 188, 0));
		film1_panel.setBounds(0, 110, 511, 134);
		contentPane.add(film1_panel);
		film1_panel.setLayout(null);
		
		JLabel film1_foto_label = new JLabel();
		film1_foto_label.setBounds(10, 0, 122, 134);
		film1_panel.add(film1_foto_label);
		Image image=new ImageIcon(this.getClass().getResource("/matrix.jpg")).getImage();
		film1_foto_label.setIcon(new ImageIcon(image));
		
		JLabel film1name_label = new JLabel();
		film1name_label.setForeground(new Color(86, 86, 86));
		film1name_label.setFont(new Font("Tahoma", Font.BOLD, 17));
		film1name_label.setBounds(160, 10, 166, 26);
		film1_panel.add(film1name_label);
		
		JLabel film1kategori_label = new JLabel();
		film1kategori_label.setForeground(new Color(86, 86, 86));
		film1kategori_label.setFont(new Font("Tahoma", Font.BOLD, 17));
		film1kategori_label.setBounds(160, 46, 216, 26);
		film1_panel.add(film1kategori_label);
		
		JLabel film1sure_label = new JLabel();
		film1sure_label.setForeground(new Color(86, 86, 86));
		film1sure_label.setFont(new Font("Tahoma", Font.BOLD, 17));
		film1sure_label.setBounds(160, 82, 216, 26);
		film1_panel.add(film1sure_label);
		
		JPanel film2_panel = new JPanel();
		film2_panel.setLayout(null);
		film2_panel.setBackground(new Color(221, 188, 0));
		film2_panel.setBounds(0, 288, 511, 134);
		contentPane.add(film2_panel);
		
		JLabel film2_foto_label = new JLabel("");
		film2_foto_label.setBounds(10, 0, 122, 134);
		film2_panel.add(film2_foto_label);
		Image image2=new ImageIcon(this.getClass().getResource("/IssızAdam.jpg")).getImage();
		film2_foto_label.setIcon(new ImageIcon(image2));
		
		JLabel film2name_label = new JLabel();
		film2name_label.setForeground(new Color(86, 86, 86));
		film2name_label.setFont(new Font("Tahoma", Font.BOLD, 17));
		film2name_label.setBounds(159, 10, 166, 26);
		film2_panel.add(film2name_label);
		
		JLabel film2kategori_label = new JLabel();
		film2kategori_label.setForeground(new Color(86, 86, 86));
		film2kategori_label.setFont(new Font("Tahoma", Font.BOLD, 17));
		film2kategori_label.setBounds(159, 46, 216, 26);
		film2_panel.add(film2kategori_label);
		
		JLabel film2sure_label = new JLabel();
		film2sure_label.setForeground(new Color(86, 86, 86));
		film2sure_label.setFont(new Font("Tahoma", Font.BOLD, 17));
		film2sure_label.setBounds(159, 82, 216, 26);
		film2_panel.add(film2sure_label);
		
		JPanel film3_panel = new JPanel();
		film3_panel.setLayout(null);
		film3_panel.setBackground(new Color(221, 188, 0));
		film3_panel.setBounds(0, 472, 511, 134);
		contentPane.add(film3_panel);
		
		JLabel film3_foto_label = new JLabel("");
		film3_foto_label.setBounds(10, 0, 122, 134);
		film3_panel.add(film3_foto_label);
		Image image3=new ImageIcon(this.getClass().getResource("/truman.jpg")).getImage();
		film3_foto_label.setIcon(new ImageIcon(image3));
		
		JLabel film3name_label = new JLabel();
		film3name_label.setForeground(new Color(86, 86, 86));
		film3name_label.setFont(new Font("Tahoma", Font.BOLD, 17));
		film3name_label.setBounds(159, 10, 166, 26);
		film3_panel.add(film3name_label);
		
		JLabel film3kategori_label = new JLabel();
		film3kategori_label.setForeground(new Color(86, 86, 86));
		film3kategori_label.setFont(new Font("Tahoma", Font.BOLD, 17));
		film3kategori_label.setBounds(159, 46, 216, 26);
		film3_panel.add(film3kategori_label);
		
		JLabel film3sure_label = new JLabel();
		film3sure_label.setForeground(new Color(86, 86, 86));
		film3sure_label.setFont(new Font("Tahoma", Font.BOLD, 17));
		film3sure_label.setBounds(159, 82, 216, 26);
		film3_panel.add(film3sure_label);
		
		JPanel film4_panel = new JPanel();
		film4_panel.setLayout(null);
		film4_panel.setBackground(new Color(221, 188, 0));
		film4_panel.setBounds(561, 110, 511, 134);
		contentPane.add(film4_panel);
		
		JLabel film4_foto_label = new JLabel();
		film4_foto_label.setBounds(10, 0, 122, 134);
		film4_panel.add(film4_foto_label);
		Image image4=new ImageIcon(this.getClass().getResource("/günes.jpg")).getImage();
		film4_foto_label.setIcon(new ImageIcon(image4));
		
		JLabel film4name_label = new JLabel();
		film4name_label.setForeground(new Color(86, 86, 86));
		film4name_label.setFont(new Font("Tahoma", Font.BOLD, 17));
		film4name_label.setBounds(159, 10, 166, 26);
		film4_panel.add(film4name_label);
		
		JLabel film4kategori_label = new JLabel();
		film4kategori_label.setForeground(new Color(86, 86, 86));
		film4kategori_label.setFont(new Font("Tahoma", Font.BOLD, 17));
		film4kategori_label.setBounds(159, 46, 216, 26);
		film4_panel.add(film4kategori_label);
		
		JLabel film4sure_label = new JLabel();
		film4sure_label.setForeground(new Color(86, 86, 86));
		film4sure_label.setFont(new Font("Tahoma", Font.BOLD, 17));
		film4sure_label.setBounds(159, 82, 216, 26);
		film4_panel.add(film4sure_label);
		
		JPanel film5_panel = new JPanel();
		film5_panel.setLayout(null);
		film5_panel.setBackground(new Color(221, 188, 0));
		film5_panel.setBounds(561, 288, 511, 134);
		contentPane.add(film5_panel);
		
		JLabel film5_foto_label = new JLabel();
		film5_foto_label.setBounds(10, 0, 122, 134);
		film5_panel.add(film5_foto_label);
		Image image5=new ImageIcon(this.getClass().getResource("/terminal.jpg")).getImage();
		film5_foto_label.setIcon(new ImageIcon(image5));
		
		JLabel film5name_label = new JLabel();
		film5name_label.setForeground(new Color(86, 86, 86));
		film5name_label.setFont(new Font("Tahoma", Font.BOLD, 17));
		film5name_label.setBounds(152, 10, 166, 26);
		film5_panel.add(film5name_label);
		
		JLabel film5kategori_label = new JLabel();
		film5kategori_label.setForeground(new Color(86, 86, 86));
		film5kategori_label.setFont(new Font("Tahoma", Font.BOLD, 17));
		film5kategori_label.setBounds(152, 46, 216, 26);
		film5_panel.add(film5kategori_label);
		
		JLabel film5sure_label = new JLabel();
		film5sure_label.setForeground(new Color(86, 86, 86));
		film5sure_label.setFont(new Font("Tahoma", Font.BOLD, 17));
		film5sure_label.setBounds(152, 83, 216, 26);
		film5_panel.add(film5sure_label);
		
		JPanel film6_panel = new JPanel();
		film6_panel.setLayout(null);
		film6_panel.setBackground(new Color(221, 188, 0));
		film6_panel.setBounds(561, 472, 511, 134);
		contentPane.add(film6_panel);
		
		JLabel film6_foto_label = new JLabel();
		film6_foto_label.setBounds(10, 0, 122, 134);
		film6_panel.add(film6_foto_label);
		Image image6=new ImageIcon(this.getClass().getResource("/zoo.jpg")).getImage();
		film6_foto_label.setIcon(new ImageIcon(image6));
		
		JLabel film6name_label = new JLabel();
		film6name_label.setForeground(new Color(86, 86, 86));
		film6name_label.setFont(new Font("Tahoma", Font.BOLD, 17));
		film6name_label.setBounds(159, 10, 166, 26);
		film6_panel.add(film6name_label);
		
		JLabel film6kategori_label = new JLabel();
		film6kategori_label.setForeground(new Color(86, 86, 86));
		film6kategori_label.setFont(new Font("Tahoma", Font.BOLD, 17));
		film6kategori_label.setBounds(159, 46, 216, 26);
		film6_panel.add(film6kategori_label);
		
		JLabel film6sure_label = new JLabel();
		film6sure_label.setForeground(new Color(86, 86, 86));
		film6sure_label.setFont(new Font("Tahoma", Font.BOLD, 17));
		film6sure_label.setBounds(159, 82, 216, 26);
		film6_panel.add(film6sure_label);
		
	
		ArrayList<Film> filmarr=l.getFilmarr();
		film1name_label.setText("Matrix Reloaded");
		film1kategori_label.setText(filmarr.get(0).getKategori());
		film1sure_label.setText(filmarr.get(0).getSure());
		film2name_label.setText(filmarr.get(1).getName());
		film2kategori_label.setText(filmarr.get(1).getKategori());
		film2sure_label.setText(filmarr.get(1).getSure());
		film3name_label.setText(filmarr.get(2).getName());
		film3kategori_label.setText(filmarr.get(2).getKategori());
		film3sure_label.setText(filmarr.get(2).getSure());
		film4name_label.setText(filmarr.get(3).getName());
		film4kategori_label.setText(filmarr.get(3).getKategori());
		film4sure_label.setText(filmarr.get(3).getSure());
		film5name_label.setText(filmarr.get(4).getName());
		film5kategori_label.setText(filmarr.get(4).getKategori());
		film5sure_label.setText(filmarr.get(4).getSure());
		film6name_label.setText(filmarr.get(5).getName());
		film6kategori_label.setText(filmarr.get(5).getKategori());
		film6sure_label.setText(filmarr.get(5).getSure());
		
	}
}
