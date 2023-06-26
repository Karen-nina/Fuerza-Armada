package ar.edu.unlam.vehiculos;

import ar.edu.unlam.interfaces.Terrestre;

public class Tanque extends Vehiculo implements Terrestre{

	private double velocidad;
	
	public Tanque() {
	
	}
	

	public Tanque(String codigo, String nombre) {
		super(codigo, nombre);
		this.velocidad = 0.0;
	}


	@Override
	public void avanzarSobreTierra() {
	
		
	}

	@Override
	public void detenerseSobreTierra() {
	
		
	}

	@Override
	public void moverseSobreTierra() {
	
		
	}


	public double getVelocidad() {
		return velocidad;
	}


	public void setVelocidad(double velocidad) {
		this.velocidad = velocidad;
	}


	@Override
	public TipoDeVehiculo getTipoVehiculo() {
		
		return TipoDeVehiculo.TANQUE;
	}

	

	
}
