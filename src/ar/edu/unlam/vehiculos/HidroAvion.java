package ar.edu.unlam.vehiculos;

import ar.edu.unlam.interfaces.Acuatico;
import ar.edu.unlam.interfaces.Volador;

public class HidroAvion extends Vehiculo implements Acuatico, Volador{

	private Double altura ;
	private Double profundidad;
	
	public HidroAvion() {
		
	}

	public HidroAvion(String codigo, String nombre) {
		super(codigo, nombre);
		this.altura = 0.0;
		this.profundidad = 0.0;
	}

	public Double getAltura() {
		return altura;
	}

	public void setAltura(Double altura) {
		this.altura = altura;
	}

	public Double getProfundidad() {
		return profundidad;
	}

	public void setProfundidad(Double profundidad) {
		this.profundidad = profundidad;
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
	public void sumergir() {
		// TODO Auto-generated method stub
		
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
		
		return TipoDeVehiculo.HIDROAVION;
	}

}
