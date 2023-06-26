package ar.edu.unlam.vehiculos;

import ar.edu.unlam.interfaces.Acuatico;

public class Submarino  extends Vehiculo implements Acuatico{

	private Double profundidad;
	
	public Submarino() {
	
	}
	

	public Submarino(String codigo, String nombre) {
		super(codigo, nombre);
		this.profundidad = 0.0;
	}


	public Double getProfundidad() {
		return profundidad;
	}


	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
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
	public TipoDeVehiculo getTipoVehiculo() {
		
		return TipoDeVehiculo.SUBMARINO;
	}



	
}
