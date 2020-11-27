package Controlador;

import Vista.Ventana;

public class Principal {

	public static void main(String[] args) {
		Ventana ventana = new Ventana();// Creamos objeto de tipo ventana
		Eventos evento = new Eventos(ventana);// Creamos objeto de tipo evento con las ventanas
		ventana.establecerEventos(evento);

		// Establecemos eventos a la ventana
		// GUIA PARA LOS SONIDOS
		// Cuando abrimos el programa escucharemos un sonido
		// Si no hay nada puesto y le damos a los botones , nos saldra el error con un
		// sonido
		// Cuando ya hemos puesto los datos, y pulsamos los botones, cada boton tendra
		// un sonido distinto
		// Si pulsamos reset, saldra otrto sonido
		// Y por ultimo, si el numero esta dividiendo entre 0 , nos saldra otro sonido
		// diferente
		// IMPORTANTE
		// Cada sonido es distinto, prueba varias veces
		// ACTUALIZACION 2.0
		// Nuevas funcionalidades añadidas y nuevos sonidos, todos distintos, PRUEBALOS
		// TODOS!
	}
}
