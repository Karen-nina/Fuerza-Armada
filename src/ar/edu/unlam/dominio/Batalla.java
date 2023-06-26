package ar.edu.unlam.dominio;

import java.util.HashSet;
import java.util.Objects;

import ar.edu.unlam.exceptiones.VehiculoIncompatible;
import ar.edu.unlam.vehiculos.TipoDeVehiculo;
import ar.edu.unlam.vehiculos.Vehiculo;

public class Batalla {
	
	private Double latitud;
	private Double longitud;
	private TipoDeBatalla tipo;
	
	HashSet<Vehiculo> vehiculosEnLaBatalla;

	public Batalla(Double latitud, Double longitud, TipoDeBatalla tipo) {

		this.latitud = latitud;
		this.longitud = longitud;
		this.tipo = tipo;
		this.vehiculosEnLaBatalla = new HashSet<Vehiculo>();
	}
	
	public void agregarVehiculoABatalla(Vehiculo vehiculo) throws Exception {
		if(validarSiVehiculoEsAptoParaBatalla(vehiculo)==true) {
		
		this.vehiculosEnLaBatalla.add(vehiculo);
		}
	}

	private boolean validarSiVehiculoEsAptoParaBatalla(Vehiculo vehiculo) throws Exception {
		switch (this.tipo) {
		case TERRESTRE:
			if(vehiculo.getTipoVehiculo().equals(TipoDeVehiculo.CAMION) || 
		vehiculo.getTipoVehiculo().equals(TipoDeVehiculo.ANFIBIO) || 
		vehiculo.getTipoVehiculo().equals(TipoDeVehiculo.TANQUE) ||
		vehiculo.getTipoVehiculo().equals(TipoDeVehiculo.DESTRUCTOR))
			return true;
		case ACUATICA:
			if(vehiculo.getTipoVehiculo().equals(TipoDeVehiculo.ANFIBIO) || 
				vehiculo.getTipoVehiculo().equals(TipoDeVehiculo.HIDROAVION) ||
				vehiculo.getTipoVehiculo().equals(TipoDeVehiculo.PORTAVIONES) ||
				vehiculo.getTipoVehiculo().equals(TipoDeVehiculo.SUBMARINO))
			return true;
		case AEREA:
			if(vehiculo.getTipoVehiculo().equals(TipoDeVehiculo.AVION) || 
				vehiculo.getTipoVehiculo().equals(TipoDeVehiculo.HIDROAVION))
			return true;
		}
		throw new VehiculoIncompatible("el vehiculo no el adecuado para la batalla elegida");
	}

	public Double getLatitud() {
		return latitud;
	}

	public void setLatitud(Double latitud) {
		this.latitud = latitud;
	}

	public Double getLongitud() {
		return longitud;
	}

	public void setLongitud(Double longitud) {
		this.longitud = longitud;
	}

	public TipoDeBatalla getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeBatalla tipo) {
		this.tipo = tipo;
	}

	public HashSet<Vehiculo> getVehiculosEnLaBatalla() {
		return vehiculosEnLaBatalla;
	}

	public void setVehiculosEnLaBatalla(HashSet<Vehiculo> vehiculosEnLaBatalla) {
		this.vehiculosEnLaBatalla = vehiculosEnLaBatalla;
	}

	@Override
	public String toString() {
		return "Batalla [latitud=" + latitud + ", longitud=" + longitud + ", tipo=" + tipo + ", vehiculosEnLaBatalla="
				+ vehiculosEnLaBatalla + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(tipo);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Batalla other = (Batalla) obj;
		return tipo == other.tipo;
	}

	
}
