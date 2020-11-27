package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.border.LineBorder;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Secundaria1 extends JDialog {
//Lo he hecho con el plugin window Builder pero Luego he adaptado las cosas a mi gusto para no liarme
	public Secundaria1() {
		setTitle("Error");// Este es el titulo de la ventana
		setBounds(100, 100, 300, 300);
		setLocationRelativeTo(null);
		setIconImage(Toolkit.getDefaultToolkit().getImage("icono3.png"));
		BufferedImage fondo = null;// Esto sirve para poner un fondo para el programa
		try {
			fondo = ImageIO.read(new File("SRArcadeBackground.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image fondo1 = fondo.getScaledInstance(300, 300, Image.SCALE_SMOOTH);// Ponemos el tamaño de la foto igual que
																				// la ventana
		ImageIcon fondo2 = new ImageIcon(fondo1);
		setContentPane(new JLabel(fondo2));
		setLayout(null);
		InicializarComponentes();
	}

	private void InicializarComponentes() {
		try {
			Font letra = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("Letra.ttf"));// Ponemos la
																											// letra
			JLabel lblNewLabel = new JLabel("Funcionalidad no Disponible");
			lblNewLabel.setBounds(30, 60, 244, 35);
			lblNewLabel.setFont(letra.deriveFont(Font.TRUETYPE_FONT, 13));// Cambiamos el tamaño de dicha letra
			lblNewLabel.setForeground(new Color(243, 240, 230));
			add(lblNewLabel);
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Font letra = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("Letra2.ttf"));// Ponemos
																											// la
																											// letra
			JButton btnNewButton = new JButton("Volver");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {// Si pulsa el boton volveremos a la pestaña inicial
					try {

						Clip clip = AudioSystem.getClip();
						clip.open(AudioSystem.getAudioInputStream(new File("Katarina.wav")));
						clip.start();
					} catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
						System.out.println("Error al reproducir el sonido.");
					}
					dispose();
				}
			});
			btnNewButton.setBounds(100, 203, 89, 47);
			btnNewButton.setBorder(null);
			btnNewButton.setBackground(new Color(29, 37, 41));
			btnNewButton.setBorder(new LineBorder(new Color(19, 85, 112), 2));
			btnNewButton.setFont(letra.deriveFont(Font.TRUETYPE_FONT, 12));// Cambiamos el tamaño de dicha letra
			btnNewButton.setForeground(new Color(243, 240, 230));
			add(btnNewButton);
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
}
