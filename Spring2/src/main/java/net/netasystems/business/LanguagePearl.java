package net.netasystems.business;

import org.springframework.stereotype.Component;

/**
 * Clase implementa la interface Language para la descripcion del lenguaje a utilizar.
 *
 * @author Netasytems / Miguel Angel Meraz Rodríguez
 * @version 1.0.0 / 07/09/2018 
 */
@Component
public class LanguagePearl implements Language {

	public String description() {
		return "The best programming language perl ";
	}

	public String version() {
		// TODO Auto-generated method stub
		return " Version 1.9";
	}

}
