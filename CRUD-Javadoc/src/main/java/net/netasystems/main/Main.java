package net.netasystems.main;

import java.sql.SQLException;
import java.util.List;

import net.netasystems.domain.CatTipoFabrica;
import net.netasystems.services.CatTipoFabricaService;

/**
 *Clase Principal
 *
 * @author Netasystems / Miguel Angel Meraz Rodríguez
 * @version 1.0.0  / 06/09/2018
 *
 */
public class Main {

	public static void main(String[] args) {
		System.out.println("Iniciando programa de conexión a base de datos!");
		CatTipoFabricaService service = null;
		try {
			 service = new CatTipoFabricaService();
			 List<CatTipoFabrica> lista = service.getAllRecords();
			 for(CatTipoFabrica c : lista) {
				 System.out.println(c);
			 }
		} catch (Exception e) {
			System.out.println("Ha caido en excepción con mensaje: "+e.getMessage());
		} finally {
			try {
				service.close();
			} catch (SQLException e) {
				System.out.println("No se pueden cerrar los recursos: "+e.getMessage());
			}
		}
		
		
	}
	
}


