package Controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;

import Vista.Secundaria1;
import Vista.Secundaria2;
import Vista.Ventana;

public class Eventos implements ActionListener {// Implementamos actionlistener
	private Ventana ventana;
	private Secundaria2 ventana2;

	public Eventos(Ventana ventana) {// Creamos un constructor de la clase
		this.ventana = ventana;

	}

	// Le he introducido a todos los botones un sonido para cuando se ejecute su
	// accion
	@Override
	public void actionPerformed(ActionEvent e) {
		int resultado;
		int resultado1, resultado2;

		try {
			int numero1 = Integer.parseInt(ventana.getNumero1().getText());
			int numero2 = Integer.parseInt(ventana.getNumero2().getText());
			resultado1 = (int) Math.cbrt(numero1);
			resultado2 = (int) Math.cbrt(numero2);
			if (e.getSource() == ventana.getBoton1()) {// Si pulsamos el boton de sumar , nos hace la suma

				resultado = numero1 + numero2;
				try {

					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(new File("Teemo.wav")));
					clip.start();
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
					System.out.println("Error al reproducir el sonido.");
				}
				ventana.getResultado().setText("Resultado: " + resultado);
			}
			if (e.getSource() == ventana.getBoton2()) {// Si pulsamos el boton de restar , nos hace la resta
				try {

					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(new File("Jinx.wav")));
					clip.start();
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
					System.out.println("Error al reproducir el sonido.");
				}
				resultado = numero1 - numero2;
				ventana.getResultado().setText("Resultado: " + resultado);
			}
			if (e.getSource() == ventana.getBoton3()) {// Si pulsamos el boton de multiplicar , nos hace la
														// multiplicacion
				try {

					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(new File("Jhin.wav")));
					clip.start();
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
					System.out.println("Error al reproducir el sonido.");
				}
				resultado = numero1 * numero2;
				ventana.getResultado().setText("Resultado: " + resultado);
			}
			if (e.getSource() == ventana.getBoton4()) {// Si pulsamos el boton de dividir , nos hace la division
				if (numero2 == 0) {// Creamos un if , en caso de que se intente dividir un numero entre 0, nos
									// saldra un mensaje
					try {

						Clip clip = AudioSystem.getClip();
						clip.open(AudioSystem.getAudioInputStream(new File("Fizz.wav")));
						clip.start();
					} catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
						System.out.println("Error al reproducir el sonido.");
					}
					ventana.getResultado().setText("No se puede dividir entre 0");
				} else {
					try {

						Clip clip = AudioSystem.getClip();
						clip.open(AudioSystem.getAudioInputStream(new File("Heimer.wav")));
						clip.start();
					} catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
						System.out.println("Error al reproducir el sonido.");
					}
					resultado = numero1 / numero2;
					ventana.getResultado().setText("Resultado: " + resultado);
				}
			}
			if (e.getSource() == ventana.getBoton5()) {// Si pulsamos el boton raiz cuadrada,nos aparecera una ventana
														// diciendo que la funcionalidad no esta disponible
				try {

					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(new File("Caitlyn.wav")));
					clip.start();
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
					System.out.println("Error al reproducir el sonido.");
				}

				Secundaria1 s = new Secundaria1();// Creamos el objeto de secundaria1 para poder acceder a la ventana
				s.setVisible(true);

			}
			try {
				if (e.getSource() == ventana.getBoton6()) {// Si pulsamos el boton raiz cubica, nos aparecera una
															// ventana que nos pedira una contraseña, si la acertamos ,
															// nos hara la operacion
					try {

						Clip clip = AudioSystem.getClip();
						clip.open(AudioSystem.getAudioInputStream(new File("Lux.wav")));
						clip.start();
					} catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
						System.out.println("Error al reproducir el sonido.");
					}
					ventana2 = new Secundaria2(this);// Cramos objeto
					ventana2.setVisible(true);

				}
				if (e.getSource() == ventana2.getBtnNewButton_1()) {// Si le damos a volver , volveremos a la ventana
																	// principal
					try {

						Clip clip = AudioSystem.getClip();
						clip.open(AudioSystem.getAudioInputStream(new File("Katarina.wav")));
						clip.start();
					} catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
						System.out.println("Error al reproducir el sonido.");
					}
					ventana2.dispose();
				}
				if (e.getSource() == ventana2.getBtnNewButton()) {// Si la contraseña es 1234, nos hara la operacion, si
																	// no, Nos pondra que la contraseña es incorrecta
					String contraseña = String.valueOf(ventana2.getPasswordField().getPassword());
					if (contraseña.equalsIgnoreCase("1234")) {
						try {

							Clip clip = AudioSystem.getClip();
							clip.open(AudioSystem.getAudioInputStream(new File("Jayce.wav")));
							clip.start();
						} catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
							System.out.println("Error al reproducir el sonido.");
						}
						ventana.getResultado().setText("Resultado: " + resultado1 + " y " + resultado2);
						ventana2.dispose();
					} else {
						ventana.getResultado().setText("CONTRASENA INCORRECTA");
						try {

							Clip clip = AudioSystem.getClip();
							clip.open(AudioSystem.getAudioInputStream(new File("Leona.wav")));
							clip.start();
						} catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
							System.out.println("Error al reproducir el sonido.");
						}
					}
				}
			} catch (NullPointerException ew) {
				System.out.println("");
			}

		} catch (NumberFormatException e1) {// En caso de no introducir datos o introducirlos mas , nos saldra este
											// mensaje
			try {

				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(new File("Jhin2.wav")));
				clip.start();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
				System.out.println("Error al reproducir el sonido.");
			}
			System.out.println("Datos incorrectos");
			System.out.println(e1.getMessage());
		}
		if (e.getSource() == ventana.getReset()) {// Si pulsamos el boton reset, se nos vuelve todo al estado inicial
			try {

				Clip clip = AudioSystem.getClip();
				clip.open(AudioSystem.getAudioInputStream(new File("Derrota.wav")));
				clip.start();
			} catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
				System.out.println("Error al reproducir el sonido.");
			}
			ventana.getNumero1().setText("");
			ventana.getNumero2().setText("");
			ventana.getResultado().setText("Resultado: ");

		}

	}
}
