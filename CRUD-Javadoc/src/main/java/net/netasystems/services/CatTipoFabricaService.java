package net.netasystems.services;

import java.sql.SQLException;
import java.util.List;

import net.netasystems.dao.CatTipoFabricaDAO;
import net.netasystems.domain.CatTipoFabrica;

/**
 *Clase para los servicios de la Base de datos.
 *
 * @author Netasystems / Miguel Angel Meraz Rodríguez
 * @version 1.0.0  / 06/09/2018
 *
 */
public class CatTipoFabricaService {

	/**
	 * Tipo CatTipoFabricaDAO para el servicio.
	 */
	private CatTipoFabricaDAO dao;
	
	/** 
	 * Constructor el cual inicializa el servicio.
	 * @throws ClassNotFoundException No se pudo encontrar ninguna definición para la clase con el nombre especificado.
	 * @throws SQLException Hubo un error al conectarse con la Base de datos(Verifique datos de conexión).
	 */
	public CatTipoFabricaService() throws ClassNotFoundException, SQLException {
		dao = new CatTipoFabricaDAO();
	}
	
	/**
	 * Método para cerrar la conexión con la base de datos
	 * <p>Cierra la conexión del servicio con la base de datos</p>
	 *
	 * 
	 * @throws SQLException Hubo un error al conectarse con la Base de datos(Verifique datos de conexi�n).
	 */
	public void close() throws SQLException {
		dao.destroy();
	}
	/**
	 * Método para obtener los datos de la base
	 * <p>Implementando el m�todo getAllRecords para obtener los datos mediante una lista de tipo 
	 * CatTipoFabrica</p>
	 *
	 * @return tipo CatTipoFabrica
	 * @throws SQLException Hubo un error al conectarse con la Base de datos(Verifique datos de conexión).
	 */
	public List<CatTipoFabrica> getAllRecords() throws SQLException{
		return dao.getAllRecords();
	}
	
}
