package ar.edu.unlam.vehiculos;

import ar.edu.unlam.interfaces.Acuatico;
import ar.edu.unlam.interfaces.Terrestre;

public class Anfibio  extends Vehiculo implements Terrestre, Acuatico{

	private Double profundidad;
	private Double velocidad;
	
	public Anfibio() {
	}

	
	public Anfibio(String codigo, String nombre) {
		super(codigo, nombre);
		this.profundidad = 0.0;
		this.velocidad = 0.0;
	}


	@Override
	public void sumergir() {
		
		
	}

	@Override
	public void salirDelAgua() {
		
		
	}

	@Override
	public void estacionarEnElAgua() {
		
		
	}

	@Override
	public void moverseSobreElAgua() {
		
		
	}

	@Override
	public void avanzarSobreTierra() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void detenerseSobreTierra() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moverseSobreTierra() {
		// TODO Auto-generated method stub
		
	}


	public Double getProfundidad() {
		return profundidad;
	}


	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
	}


	public Double getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(Double velocidad) {
		this.velocidad = velocidad;
	}


	@Override
	public TipoDeVehiculo getTipoVehiculo() {
		return TipoDeVehiculo.ANFIBIO;
	}


	
}
