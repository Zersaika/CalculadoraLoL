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
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.LineBorder;

import Controlador.Eventos;

public class Ventana extends JFrame {
	private static final long serialVersionUID = 1L;
	private JButton boton1;// Creamos las propiedades de nuestra interfaz
	private JButton boton2;
	private JButton boton3;
	private JButton boton4;
	private JButton boton5;
	private JButton boton6;
	private JButton reset;
	private JTextField numero1;
	private JTextField numero2;
	private JLabel nombre1;
	private JLabel nombre2;
	private JLabel resultado;

	public Ventana() {
		setTitle("League of Legends Calculadora");// Este es el titulo de la ventana
		setIconImage(Toolkit.getDefaultToolkit().getImage("icono3.png"));// Establecemos un icono para la aplicacion
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);// esto es para que cierre para cuando le demos a la x
		setSize(600, 600);// Ponemos el tamaño en pixeles de la ventana
		setLocationRelativeTo(null);
		setLayout(null);
		setResizable(false);// Le he puesto esto para que no se modifique el tamaño
		BufferedImage fondo = null;// Esto sirve para poner un fondo para el programa
		try {
			fondo = ImageIO.read(new File("SRArcadeBackground.png"));
		} catch (IOException e) {
			e.printStackTrace();
		}
		Image fondo1 = fondo.getScaledInstance(600, 600, Image.SCALE_SMOOTH);// Ponemos el tamaño de la foto igual que
																				// la ventana
		ImageIcon fondo2 = new ImageIcon(fondo1);
		setContentPane(new JLabel(fondo2));
		try {// Esto sirve para que cuando abramos el programa , nos salga un sonido
			Clip clip = AudioSystem.getClip();
			clip.open(AudioSystem.getAudioInputStream(new File("Bienvenido.wav")));
			clip.start();
		} catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
			System.out.println("Error al reproducir el sonido.");
		}
		InicializarComponentes();
		setVisible(true);

	}

	private void InicializarComponentes() {// Aqui inicializamos los componentes, le ponemos nombre, le damos tamaño y
											// lo colocamos dentro de nuestra ventana
		try {
			Font letra = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("Letra.ttf"));// Ponemos la
																											// letra
			nombre1 = new JLabel("Numero 1: ");
			nombre1.setBounds(190, 100, 120, 30);
			nombre1.setFont(letra.deriveFont(Font.TRUETYPE_FONT, 16));// Cambiamos el tamaño de dicha letra
			nombre1.setForeground(new Color(9, 11, 16));
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Font letra = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("Letra.ttf"));// Ponemos la
																											// letra
			numero1 = new JTextField();
			numero1.setBounds(300, 100, 100, 30);
			numero1.setBorder(null);
			numero1.setBackground(new Color(29, 37, 41));
			numero1.setBorder(new LineBorder(new Color(19, 85, 112), 2));
			numero1.setFont(letra.deriveFont(Font.TRUETYPE_FONT, 12));// Cambiamos el tamaño de dicha letra
			numero1.setForeground(new Color(243, 240, 230));
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Font letra = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("Letra.ttf"));// Ponemos la
																											// letra
			nombre2 = new JLabel("Numero 2: ");
			nombre2.setBounds(190, 150, 120, 30);
			nombre2.setFont(letra.deriveFont(Font.TRUETYPE_FONT, 16));// Cambiamos el tamaño de dicha letra
			nombre2.setForeground(new Color(9, 11, 16));
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Font letra = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("Letra.ttf"));// Ponemos la
																											// letra
			numero2 = new JTextField();
			numero2.setBounds(300, 150, 100, 30);
			numero2.setBorder(null);
			numero2.setBackground(new Color(29, 37, 41));
			numero2.setBorder(new LineBorder(new Color(19, 85, 112), 2));
			numero2.setFont(letra.deriveFont(Font.TRUETYPE_FONT, 12));// Cambiamos el tamaño de dicha letra
			numero2.setForeground(new Color(243, 240, 230));
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Font letra = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("Letra2.ttf"));// Ponemos la
																											// letra
			boton1 = new JButton("Sumar");
			boton1.setBounds(80, 200, 200, 60);
			boton1.setBorder(null);
			boton1.setBackground(new Color(29, 37, 41));
			boton1.setBorder(new LineBorder(new Color(19, 85, 112), 2));
			boton1.setFont(letra.deriveFont(Font.TRUETYPE_FONT, 12));// Cambiamos el tamaño de dicha letra
			boton1.setForeground(new Color(243, 240, 230));
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Font letra = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("Letra2.ttf"));// Ponemos la
																											// letra
			boton2 = new JButton("Restar");
			boton2.setBounds(300, 200, 200, 60);
			boton2.setBorder(null);
			boton2.setBackground(new Color(29, 37, 41));
			boton2.setBorder(new LineBorder(new Color(19, 85, 112), 2));
			boton2.setFont(letra.deriveFont(Font.TRUETYPE_FONT, 12));// Cambiamos el tamaño de dicha letra
			boton2.setForeground(new Color(243, 240, 230));
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Font letra = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("Letra2.ttf"));// Ponemos la
																											// letra
			boton3 = new JButton("Multiplicar");
			boton3.setBounds(80, 280, 200, 60);
			boton3.setBorder(null);
			boton3.setBackground(new Color(29, 37, 41));
			boton3.setBorder(new LineBorder(new Color(19, 85, 112), 2));
			boton3.setFont(letra.deriveFont(Font.TRUETYPE_FONT, 12));// Cambiamos el tamaño de dicha letra
			boton3.setForeground(new Color(243, 240, 230));
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Font letra = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("Letra2.ttf"));// Ponemos la
																											// letra
			boton4 = new JButton("Dividir");
			boton4.setBounds(300, 280, 200, 60);
			boton4.setBorder(null);
			boton4.setBackground(new Color(29, 37, 41));
			boton4.setBorder(new LineBorder(new Color(19, 85, 112), 2));
			boton4.setFont(letra.deriveFont(Font.TRUETYPE_FONT, 12));// Cambiamos el tamaño de dicha letra
			boton4.setForeground(new Color(243, 240, 230));
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Font letra = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("Letra2.ttf"));// Ponemos la
																											// letra
			boton5 = new JButton("Raiz Cuadrada");
			boton5.setBounds(300, 360, 200, 60);
			boton5.setBorder(null);
			boton5.setBackground(new Color(29, 37, 41));
			boton5.setBorder(new LineBorder(new Color(19, 85, 112), 2));
			boton5.setFont(letra.deriveFont(Font.TRUETYPE_FONT, 12));// Cambiamos el tamaño de dicha letra
			boton5.setForeground(new Color(243, 240, 230));
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Font letra = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("Letra2.ttf"));// Ponemos la
																											// letra
			boton6 = new JButton("Raiz cubica");
			boton6.setBounds(80, 360, 200, 60);
			boton6.setBorder(null);
			boton6.setBackground(new Color(29, 37, 41));
			boton6.setBorder(new LineBorder(new Color(19, 85, 112), 2));
			boton6.setFont(letra.deriveFont(Font.TRUETYPE_FONT, 12));// Cambiamos el tamaño de dicha letra
			boton6.setForeground(new Color(243, 240, 230));
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Font letra = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("Letra2.ttf"));// Ponemos la
																											// letra
			reset = new JButton("Reset");
			reset.setBounds(300, 440, 200, 45);
			reset.setBorder(null);
			reset.setBackground(new Color(29, 37, 41));
			reset.setBorder(new LineBorder(new Color(44, 163, 156), 2));
			reset.setFont(letra.deriveFont(Font.TRUETYPE_FONT, 12));// Cambiamos el tamaño de dicha letra
			reset.setForeground(new Color(243, 240, 230));
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		try {
			Font letra = Font.createFont(Font.TRUETYPE_FONT, getClass().getResourceAsStream("Letra.ttf"));// Ponemos la
																											// letra
			resultado = new JLabel("Resultado: ");
			resultado.setBounds(35, 470, 300, 45);
			resultado.setFont(letra.deriveFont(Font.TRUETYPE_FONT, 16));// Cambiamos el tamaño de dicha letra
			resultado.setForeground(new Color(243, 240, 230));
		} catch (FontFormatException e) {
			// TODO Auto-generated catch block
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		add(nombre1);// Aqui añadimos todos los objetos a la ventana
		add(nombre2);
		add(numero1);
		add(numero2);
		add(boton1);
		add(boton2);
		add(boton3);
		add(boton4);
		add(boton5);
		add(boton6);
		add(reset);
		add(resultado);

	}

//Creamos los getters para poder acceder a los elementos desde el manejador
	public JButton getBoton1() {
		return boton1;
	}

	public JButton getBoton2() {
		return boton2;
	}

	public JButton getBoton3() {
		return boton3;
	}

	public JButton getBoton4() {
		return boton4;
	}

	public JButton getBoton5() {
		return boton5;
	}

	public JButton getBoton6() {
		return boton6;
	}

	public JButton getReset() {
		return reset;
	}

	public JTextField getNumero1() {
		return numero1;
	}

	public JTextField getNumero2() {
		return numero2;
	}

	public JLabel getNombre1() {
		return nombre1;
	}

	public JLabel getNombre2() {
		return nombre2;
	}

	public JLabel getResultado() {
		return resultado;
	}

	public void establecerEventos(Eventos manejador) {// Aqui es donde añadimos los eventos a los botones,por ejemplo,
														// nos suma los numeros si pulsamos el boton sumar
		boton1.addActionListener(manejador);
		boton2.addActionListener(manejador);
		boton3.addActionListener(manejador);
		boton4.addActionListener(manejador);
		boton5.addActionListener(manejador);
		boton6.addActionListener(manejador);
		reset.addActionListener(manejador);
	}
}
