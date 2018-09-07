package net.netasystems.domain;

import java.io.Serializable;
import java.util.Date;

/**
 *Clase con los conceptos de la tabla CAT_TIPO_FABRICA de la Base de datos
 *
 * @author Netasystems / Miguel Angel Meraz Rodríguez
 * @version 1.0.0  / 06/09/2018
 *
 */
public class CatTipoFabrica implements Serializable {
	
	/** 
	 * Constructor con todas las propiedades de la clase.
	 * 
	 * @param idCatTipoFabrica Asigna el id.
	 * @param nombre Asigna el nombre.
	 * @param status Asigna el estatus.
	 * @param fechaModificacion Asigna la fecha de registro
	 * @param idUsuario Asigna id al usuario
	 */
	public CatTipoFabrica(long idCatTipoFabrica, String nombre, char status, Date fechaModificacion, long idUsuario) {
		super();
		this.idCatTipoFabrica = idCatTipoFabrica;
		this.nombre = nombre;
		this.status = status;
		this.fechaModificacion = fechaModificacion;
		this.idUsuario = idUsuario;
	}
	
	/** 
	 * Constructor default
	 */
	public CatTipoFabrica() {
	}
	
	/**
	 * Tipo long para el id de tipo de fábrica.
	 */
	private long idCatTipoFabrica;
	/**
	 * Tipo String para el campo nombre.
	 */
	private String nombre;
	/**
	 * Tipo Character para el estatus.
	 */
	private Character status;
	/**
	 * Tipo Date para la fecha de registro.
	 */
	private Date fechaModificacion;
	/**
	 * Tipo Long para el id del usuario.
	 */
	private Long idUsuario;
	


	/**
	 * Para obtener el valor
	 * @return long Obtiene el valor de  idCatTipoFabrica
	 */
	public long getIdCatTipoFabrica() {
		return idCatTipoFabrica;
	}

	/**
	 * Para asignar el valor
	 * @param idCatTipoFabrica  Asigna el valor idCatTipoFabrica 
	 */
	public void setIdCatTipoFabrica(long idCatTipoFabrica) {
		this.idCatTipoFabrica = idCatTipoFabrica;
	}

	/**
	 * Para obtener el valor
	 * @return String Obtiene el valor de  nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Para asignar el valor
	 * @param nombre  Asigna el valor nombre 
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Para obtener el valor
	 * @return Character Obtiene el valor de  status
	 */
	public Character getStatus() {
		return status;
	}

	/**
	 * Para asignar el valor
	 * @param status  Asigna el valor status 
	 */
	public void setStatus(Character status) {
		this.status = status;
	}

	/**
	 * Para obtener el valor
	 * @return Date Obtiene el valor de  fechaModificacion
	 */
	public Date getFechaModificacion() {
		return fechaModificacion;
	}

	/**
	 * Para asignar el valor
	 * @param fechaModificacion  Asigna el valor fechaModificacion 
	 */
	public void setFechaModificacion(Date fechaModificacion) {
		this.fechaModificacion = fechaModificacion;
	}

	/**
	 * Para obtener el valor
	 * @return Long Obtiene el valor de  idUsuario
	 */
	public Long getIdUsuario() {
		return idUsuario;
	}

	/**
	 * Para asignar el valor
	 * @param idUsuario  Asigna el valor idUsuario 
	 */
	public void setIdUsuario(Long idUsuario) {
		this.idUsuario = idUsuario;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((fechaModificacion == null) ? 0 : fechaModificacion.hashCode());
		result = prime * result + (int) (idCatTipoFabrica ^ (idCatTipoFabrica >>> 32));
		result = prime * result + (int) (idUsuario ^ (idUsuario >>> 32));
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + status;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CatTipoFabrica other = (CatTipoFabrica) obj;
		if (fechaModificacion == null) {
			if (other.fechaModificacion != null)
				return false;
		} else if (!fechaModificacion.equals(other.fechaModificacion))
			return false;
		if (idCatTipoFabrica != other.idCatTipoFabrica)
			return false;
		if (idUsuario != other.idUsuario)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (status != other.status)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "CatTipoFabrica [idCatTipoFabrica=" + idCatTipoFabrica + ", nombre=" + nombre + ", status=" + status
				+ ", fechaModificacion=" + fechaModificacion + ", idUsuario=" + idUsuario + "]";
	}
	
	
	
}
