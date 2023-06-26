package ar.edu.unlam.vehiculos;

import java.util.Objects;

public abstract class Vehiculo {
	
	protected String codigo;
	protected String nombre;
	
	public Vehiculo(String codigo, String nombre) {
	
		this.nombre = nombre;
		this.codigo = codigo;
	}
	public Vehiculo() {
		
	}
	
	public abstract TipoDeVehiculo getTipoVehiculo();
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	@Override
	public String toString() {
		return "Vehiculo [nombre=" + nombre + ", codigo=" + codigo + "]";
	}
	@Override
	public int hashCode() {
		return Objects.hash(codigo, nombre);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Vehiculo other = (Vehiculo) obj;
		return Objects.equals(codigo, other.codigo) && Objects.equals(nombre, other.nombre);
	}
	
	
	
}
