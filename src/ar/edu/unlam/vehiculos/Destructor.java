package ar.edu.unlam.vehiculos;

import ar.edu.unlam.interfaces.Terrestre;

public class Destructor extends Vehiculo implements Terrestre{

	public Destructor() {
		super();
		
	}

	public Destructor(String codigo, String nombre) {
		super(codigo, nombre);
		
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

	@Override
	public TipoDeVehiculo getTipoVehiculo() {
		
		return TipoDeVehiculo.DESTRUCTOR;
	}

	
}
