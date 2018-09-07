package net.netasystems.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * Clase del programador Michael
 *
 * @author Netasytems / Miguel Angel Meraz Rodríguez
 * @version 1.0.0 / 07/09/2018 
 */
@Component
public class Michael implements Programmer {
	
	/**
	 * Tipo Language para evaluar que lenguaje de programación utiliza.
	 */
	@Autowired
	@Qualifier(value="languagePearl")
	private Language language;


	/**
	 * Para obtener el valor
	 * @return Language Para obtener el valor de language
	 */
	public Language getLanguage() {
		return language;
	}

	/**
	 * Para asignar el valor
	 * @param language Asigna el valor a language 
	 */
	public void setLanguage(Language language) {
		this.language = language;
	}




	public String hackTheWorld() {
		// TODO Auto-generated method stub
		return "Program in: "+ language.description();
	}
	
	

}
