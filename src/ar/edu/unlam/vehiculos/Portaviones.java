package ar.edu.unlam.vehiculos;

import ar.edu.unlam.interfaces.Acuatico;

public class Portaviones extends Vehiculo implements Acuatico{

	
	public Portaviones() {
		super();
		
	}

	public Portaviones(String codigo, String nombre) {
		super(codigo, nombre);
		
	}

	@Override
	public void sumergir() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void salirDelAgua() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void estacionarEnElAgua() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void moverseSobreElAgua() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public TipoDeVehiculo getTipoVehiculo() {
		
		return TipoDeVehiculo.PORTAVIONES;
	}

	
}
