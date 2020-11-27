package Vista;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontFormatException;
import java.awt.Image;
import java.awt.Toolkit;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.border.LineBorder;
import Controlador.Eventos;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Secundaria2 extends JDialog {

	private JPasswordField passwordField;
	private JLabel lblNewLabel;
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private Eventos controlador;

	// Lo he hecho con el plugin window Builder pero Luego he adaptado las cosas a
	// mi gusto para no liarme
	public Secundaria2(Eventos controlador) {
		this.controlador = controlador;
		setTitle("Contraseña");// Este es el titulo de la ventana
		setBounds(100, 100, 300, 300);
		setIconImage(Toolkit.getDefaultToolkit().getImage("icono3.png"));
		setLocationRelativeTo(null);
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
		getContentPane().setLayout(null);
		InicializarComponentes();
	}

	private void InicializarComponentes() {
		try {
			Font letra = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("Letra.ttf"));// Ponemos la
																											// letra
			lblNewLabel = new JLabel("Introduzca la contrasena");
			lblNewLabel.setBounds(36, 44, 227, 54);
			lblNewLabel.setFont(letra.deriveFont(Font.TRUETYPE_FONT, 13));// Cambiamos el tamaño de dicha letra
			lblNewLabel.setForeground(new Color(243, 240, 230));
			getContentPane().add(lblNewLabel);
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		{
			passwordField = new JPasswordField();// Creamos contraseña
			passwordField.setBounds(65, 109, 147, 35);
			getContentPane().add(passwordField);
		}

		try {
			Font letra = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("Letra2.ttf"));// Ponemos
																											// la
																											// letra
			btnNewButton = new JButton("Aceptar");
			btnNewButton.addActionListener(controlador);
			btnNewButton.setBounds(10, 215, 100, 35);
			btnNewButton.setBorder(null);
			btnNewButton.setBackground(new Color(29, 37, 41));
			btnNewButton.setBorder(new LineBorder(new Color(19, 85, 112), 2));
			btnNewButton.setFont(letra.deriveFont(Font.TRUETYPE_FONT, 12));// Cambiamos el tamaño de dicha letra
			btnNewButton.setForeground(new Color(243, 240, 230));
			getContentPane().add(btnNewButton);
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
			btnNewButton_1 = new JButton("Volver");
			btnNewButton_1.addActionListener(controlador);
			btnNewButton_1.setBounds(174, 215, 100, 35);
			btnNewButton_1.setBorder(null);
			btnNewButton_1.setBackground(new Color(29, 37, 41));
			btnNewButton_1.setBorder(new LineBorder(new Color(19, 85, 112), 2));
			btnNewButton_1.setFont(letra.deriveFont(Font.TRUETYPE_FONT, 12));// Cambiamos el tamaño de dicha letra
			btnNewButton_1.setForeground(new Color(243, 240, 230));
			getContentPane().add(btnNewButton_1);
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

//Hacemos los getters para acceder a los elementos
	public JPasswordField getPasswordField() {
		return passwordField;
	}

	public JLabel getLblNewLabel() {
		return lblNewLabel;
	}

	public JButton getBtnNewButton() {
		return btnNewButton;
	}

	public JButton getBtnNewButton_1() {
		return btnNewButton_1;
	}

}
