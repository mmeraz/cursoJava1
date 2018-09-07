package net.netasystems.main;

import net.netasystems.business.Programmer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Clase principal
 *
 * @author Netasytems / Miguel Angel Meraz Rodríguez
 * @version 1.0.0 / 07/09/2018 
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Ejercicio #2 de Spring");
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Programmer prgm1 = context.getBean("michael", Programmer.class);
        Programmer prgm2 = context.getBean("masterProgrammer", Programmer.class);
        System.out.println("El programador #1 lo hace en: "+prgm1.hackTheWorld());
        System.out.println("El programador #2 lo hace en: "+prgm2.hackTheWorld());
    }
}