package SinemaOtamasyonu;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

public class Register extends JFrame {
	Login l=new Login();
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField kullanici_adi_tf;
	private JPasswordField parola_field;
	private JPasswordField parola_tekrar_field;

	public Register() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 702, 557);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel login_photo_panel = new JPanel();
		login_photo_panel.setBackground(new Color(86, 86, 86));
		login_photo_panel.setBounds(0, 0, 313, 521);
		contentPane.add(login_photo_panel);
		login_photo_panel.setLayout(null);
		
		JLabel photo_label = new JLabel("");
		Image image=new ImageIcon(this.getClass().getResource("/sinema_foto.png")).getImage();
		photo_label.setIcon(new ImageIcon(image));
		photo_label.setBounds(0, 0, 313, 306);
		login_photo_panel.add(photo_label);
		
		JLabel lblKaytOlmakIin = new JLabel(" Kayıt olmak için lütfen gerekli bilgileri doldurun. ");
		lblKaytOlmakIin.setForeground(Color.WHITE);
		lblKaytOlmakIin.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblKaytOlmakIin.setBounds(10, 334, 313, 42);
		login_photo_panel.add(lblKaytOlmakIin);
		
		JLabel lblHesabnzVarsaGiri = new JLabel("   Hesabınız varsa, giriş yapabilirsiniz.");
		lblHesabnzVarsaGiri.setForeground(Color.WHITE);
		lblHesabnzVarsaGiri.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblHesabnzVarsaGiri.setBounds(0, 364, 313, 42);
		login_photo_panel.add(lblHesabnzVarsaGiri);
		
		JPanel giris_panel = new JPanel();
		giris_panel.setBounds(312, 0, 388, 521);
		contentPane.add(giris_panel);
		giris_panel.setLayout(null);
		
		JLabel kullanici_adi_label = new JLabel("KULLANICI ADI");
		kullanici_adi_label.setFont(new Font("Tahoma", Font.BOLD, 15));
		kullanici_adi_label.setBounds(20, 57, 149, 32);
		giris_panel.add(kullanici_adi_label);
		
		kullanici_adi_tf = new JTextField();
		kullanici_adi_tf.setColumns(10);
		kullanici_adi_tf.setBounds(20, 99, 322, 38);
		giris_panel.add(kullanici_adi_tf);
		
		JLabel parola_label = new JLabel("PAROLA");
		parola_label.setFont(new Font("Tahoma", Font.BOLD, 15));
		parola_label.setBounds(20, 160, 149, 32);
		giris_panel.add(parola_label);
		
		parola_field = new JPasswordField();
		parola_field.setBackground(Color.WHITE);
		parola_field.setBounds(20, 202, 322, 38);
		giris_panel.add(parola_field);
		
		JLabel parola_tekrar_label_ = new JLabel("PAROLA TEKRAR");
		parola_tekrar_label_.setFont(new Font("Tahoma", Font.BOLD, 15));
		parola_tekrar_label_.setBounds(20, 262, 149, 32);
		giris_panel.add(parola_tekrar_label_);
		
		parola_tekrar_field = new JPasswordField();
		parola_tekrar_field.setBackground(Color.WHITE);
		parola_tekrar_field.setBounds(20, 304, 322, 38);
		giris_panel.add(parola_tekrar_field);
		
		JButton kayit_ol_buton = new JButton("Kayıt Ol");
		kayit_ol_buton.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				 String message="";
			        if(kullanici_adi_tf.getText().trim().equals("")){
			            message="Kullanıcı adı kısmı boş bırakılamaz. "; 
			            JOptionPane.showMessageDialog(Register.this ,message );
			            return;
			        }else{
			            String parola=new String(parola_field.getPassword());
			            String parolatekrar=new String(parola_tekrar_field.getPassword());
			            if(parola.trim().equals("") || parolatekrar.trim().equals("")){
			            message="Şifre kısmı boş bırakılamaz. ";
			            JOptionPane.showMessageDialog(Register.this ,message );
			            return;
			            }
			            if(!parola.equals(parolatekrar)){
			                message="Parolalarınız uyuşmuyor.";
			                JOptionPane.showMessageDialog(Register.this ,message );
			                return;
			            }
			            ArrayList<Kullanici> arr=Login.getKullanici_list();
			             String kullaniciAdi=kullanici_adi_tf.getText();
			            for(Kullanici k:arr){
			                if(k.getKullaniciAdi().equals(kullaniciAdi)){
			                    message="Bu kullanıcı adı daha önce alınmış.";
			                    JOptionPane.showMessageDialog(Register.this ,message );
			                    return;
			                }
			            }
			            arr.add(new Kullanici(kullaniciAdi,parola));
			            message="Tebrikler! Başarı ile kayıt oldunuz. ";
			            
			        }
			        JOptionPane.showMessageDialog(Register.this ,message );
			        setVisible(false);
			        l.setVisible(true);
			        l.setLocationRelativeTo(null);
			}
		});
		kayit_ol_buton.setForeground(Color.WHITE);
		kayit_ol_buton.setFont(new Font("Tahoma", Font.PLAIN, 14));
		kayit_ol_buton.setBorderPainted(false);
		kayit_ol_buton.setBackground(new Color(255, 47, 47));
		kayit_ol_buton.setBounds(20, 411, 322, 38);
		giris_panel.add(kayit_ol_buton);
		
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
		geri_buton.setBounds(325, 10, 53, 32);
		giris_panel.add(geri_buton);
	}

}
