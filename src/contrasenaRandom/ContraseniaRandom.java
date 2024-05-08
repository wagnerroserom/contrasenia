package contrasenaRandom;

import java.security.SecureRandom;
import java.util.random.*;

public class ContraseniaRandom {
	private static final String CARACTERES_PERMITIDOS = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!#$%&@*";
	
	public static String generarContrasena(int longitud) {
		SecureRandom random = new SecureRandom();
		StringBuilder contrasena = new StringBuilder();
		
		for (int i = 0; i < longitud; i++) {
			int indice = random.nextInt(CARACTERES_PERMITIDOS.length());
			
			contrasena.append(CARACTERES_PERMITIDOS.charAt(indice));
		}
		return contrasena.toString();
	}

	public static void main(String[] args) {
		int longitudContrasena = 16;
		String contrasenaGenerada = generarContrasena(longitudContrasena);
		System.out.println("Se generó tu nueva contraseña con éxito: " + contrasenaGenerada);

	}

}
