package net.netasystems.business;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MasterProgrammer implements Programmer {
	
	@Autowired
	@Qualifier(value="languageJava")
	private Language language;
	
	
	
	
	/**
	 * @return the language
	 */
	public Language getLanguage() {
		return language;
	}




	/**
	 * @param language the language to set
	 */
	public void setLanguage(Language language) {
		this.language = language;
	}




	public String hackTheWorld() {
	
		return "Program in: " +  language.description();
	}

}
