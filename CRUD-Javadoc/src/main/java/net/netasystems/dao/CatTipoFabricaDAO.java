package net.netasystems.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import net.netasystems.domain.CatTipoFabrica;



/**
 * Clase para los Accesos de datos 
 *
 * @author Netasytems / Miguel Angel Meraz Rodríguez
 * @version 1.0.0 / 07/09/2018 
 */
public class CatTipoFabricaDAO {
	


	/**
	 * Tipo Connection para la conexión con la base de datos.
	 */
	private Connection con;
	

	/**
	 *Constructor inicializa la conexión
	 *
	 * @throws ClassNotFoundException No se pudo encontrar ninguna definición para la clase con el nombre especificado.
	 * @throws SQLException Hubo un error al conectarse con la Base de datos(Verifique datos de conexión).
	 */
	public CatTipoFabricaDAO() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		con = DriverManager.getConnection(  
				"jdbc:oracle:thin:@198.23.75.98:1521:neta","EGLOBAL","egl0b4l");  
	}
	

	/**
	 * Método para la conexión
	 *<p>Permite cerrar la conexión por medio del metodo close()</p>
	 *
	 * @throws SQLException Hubo un error al conectarse con la Base de datos(Verifique datos de conexión).
	 */
	public void destroy() throws SQLException {
		con.close();
	}
	
	/**
	 * Método para obtener todos los datos de un registro
	 * <p>Mediante una lista de tipo CatTipoFabrica, hacemos uso de un Statement
	 * para poder ejecutar el query</p> 
	 *
	 * @return tipo List con los datos del registro solicitado
	 * @throws SQLException Hubo un error al conectarse con la Base de datos(Verifique datos de conexión).
	 */
	public List<CatTipoFabrica> getAllRecords() throws SQLException{
		List<CatTipoFabrica> lista = new ArrayList<CatTipoFabrica>();
		String sql = "select IDCATTIPOFABRICA, NOMBRE, ESTATUS, FECHAMODIFICACION, IDUSUARIO from CAT_TIPO_FABRICA";
		Statement stmt = con.createStatement();
		ResultSet rs = stmt.executeQuery(sql);
		while(rs.next()) {
			long idCatTipoFabrica = rs.getLong("IDCATTIPOFABRICA");
			String nombre = rs.getString("NOMBRE");
			String estatusString = rs.getString("ESTATUS");
			Date fechaModificacion = rs.getDate("FECHAMODIFICACION");
			Long idUsuario = rs.getLong("IDUSUARIO");
			//Arreglando el char de estatus
			Character status = null;
			if(estatusString != null && !estatusString.isEmpty()) {
				char est = estatusString.charAt(0);
				status = est;
			}
			CatTipoFabrica registro = new CatTipoFabrica(idCatTipoFabrica, nombre, status, fechaModificacion, idUsuario);
			lista.add(registro);
		}
		rs.close();
		stmt.close();
		return lista;
	}
	
	/**
	 * Método para actualizar un registro en la Base de datos.
	 * <p>Actualiza los datos por medio de un query, creando un PreparedStatement para asignar nuevos datos
	 * al registro</p>
	 *
	 * @param record tipo CatTipoFabrica para los registros. 
	 * @throws SQLException Hubo un error al conectarse con la Base de datos(Verifique datos de conexión).
	 */
	public void updateRecord(CatTipoFabrica record) throws SQLException {
		
		String sqlupd = "UPDATE CAT_TIPO_FABRICA SET NOMBRE = ?, ESTATUS = ?, FECHAMODIFICACION = ?, IDUSUARIO = ? WHERE IDCATTIPOFABRICA = ?";
		PreparedStatement stmt;
		
		stmt = con.prepareStatement(sqlupd);
		stmt.setString(1, record.getNombre());
		stmt.setString(2, record.getStatus()+"");
		stmt.setDate(3, (java.sql.Date) record.getFechaModificacion());
		stmt.setLong(4, record.getIdUsuario());
		stmt.setLong(5,record.getIdCatTipoFabrica());
		
		stmt.executeUpdate();
		
		stmt.close();
		
	}
	
	/**
	 * Método para insertar registros en la base de datos
	 * <p>Ejecuta un query mediante un PreparedStatement con los datos a asignar del registro</p>
	 *
	 * @param record tipo CatTipoFabrica para los registros. 
	 * @throws SQLException Hubo un error al conectarse con la Base de datos(Verifique datos de conexión).
	 */
	public void addRecord(CatTipoFabrica record) throws SQLException {
		
		String sqladd = "INSERT INTO CAT_TIPO_FABRICA (IDCATTIPOFABRICA, NOMBRE, ESTATUS, FECHAMODIFICACION, IDUSUARIO) VALUES (?,?,?,?,?)";
		PreparedStatement stmt;
		
		stmt = con.prepareStatement(sqladd);
		stmt.setLong(1,record.getIdCatTipoFabrica());
		stmt.setString(2, record.getNombre());
		stmt.setString(3, record.getStatus()+"");
		stmt.setDate(4, (java.sql.Date) record.getFechaModificacion());
		stmt.setLong(5, record.getIdUsuario());
		stmt.executeUpdate();
	
		stmt.close();
		
	}
	
	/**
	 * Método para eliminar registros de la Base de datos.
	 * <p>Ejecuta un query, haciendo uso de una PreparedStatement para poder eliminar el registro a elegir</p>
	 *
	 * @param record tipo CatTipoFabrica para seleccionar y eliminar el registro 
	 * @throws SQLException Hubo un error al conectarse con la Base de datos(Verifique datos de conexión).
	 */
	public void deleteRecord(CatTipoFabrica record) throws SQLException {
		
		String sqldel = "DELETE FROM CAT_TIPO_FABRICA WHERE IDCATTIPOFABRICA = ?";
		PreparedStatement stmt;
		
		stmt = con.prepareStatement(sqldel);
		stmt.setLong(1,record.getIdCatTipoFabrica());
		
		stmt.executeUpdate();
		
		stmt.close();
	}

}

