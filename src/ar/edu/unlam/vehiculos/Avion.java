package ar.edu.unlam.vehiculos;

import ar.edu.unlam.interfaces.Volador;

public class Avion extends Vehiculo implements Volador {
	private Double altura;
	
	public Avion() {
		
	}
	public Avion(String codigo, String nombre) {
		super(codigo, nombre);
		this.altura = 0.0;
	}

	public Double getAltura() {
		return altura;
	}
	public void setAltura(Double altura) {
		this.altura = altura;
	}
	@Override
	public void despegar() {
		
		
	}

	@Override
	public void aterrizar() {
		
		
	}

	@Override
	public void moverseEnElAire() {
		
		
	}
	@Override
	public TipoDeVehiculo getTipoVehiculo() {
		
		return TipoDeVehiculo.AVION;
	}


	
}
