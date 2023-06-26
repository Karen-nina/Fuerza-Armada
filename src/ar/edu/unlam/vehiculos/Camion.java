package ar.edu.unlam.vehiculos;

import ar.edu.unlam.interfaces.Terrestre;

public class Camion extends Vehiculo implements Terrestre {

	public Camion() {
		super();
		
	}

	public Camion(String codigo, String nombre) {
		super(codigo, nombre);
		
	}

	@Override
	public TipoDeVehiculo getTipoVehiculo() {
		
		return TipoDeVehiculo.CAMION;
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

	
}
