package ar.edu.unlam.dominio;

import java.util.HashMap;
import java.util.HashSet;

import ar.edu.unlam.exceptiones.BatallaInexistenteException;
import ar.edu.unlam.exceptiones.VehiculoInexistente;
import ar.edu.unlam.vehiculos.Avion;
import ar.edu.unlam.vehiculos.Vehiculo;

public class FuerzaArmada {

	private Integer capacidadDeDefensa;
	private HashSet<Vehiculo> convoy;
	private HashMap<String, Batalla> batallas;
	
	public FuerzaArmada() {
		this.convoy = new HashSet<Vehiculo>();;
		this.batallas = new HashMap<String, Batalla>();
		this.capacidadDeDefensa = 0;
	}

	

	public void crearBatalla(String nombreBatalla, Batalla batalla) {
		this.batallas.put(nombreBatalla, batalla);
		
	}

	public String presentarBatalla(String nombre) throws BatallaInexistenteException {
		Batalla batallaBuscada = buscarBatalla(nombre);
		if(batallaBuscada != null) {
			return batallaBuscada.toString();
		}
		throw new BatallaInexistenteException("batalla inexistente");
		
	}
	public Vehiculo buscarVehiculo(String codigo) throws VehiculoInexistente {
		for (Vehiculo vehiculo : convoy) {
			if (vehiculo.getCodigo() == codigo) {
				return vehiculo;
			}
		}throw new VehiculoInexistente("vehiculo no existe");
		
	}
	public Batalla buscarBatalla(String nombre) throws BatallaInexistenteException {
		if (this.batallas.containsKey(nombre)) {
			return this.batallas.get(nombre);
		}
		throw new BatallaInexistenteException("Batalla no existe");
	}
	
	public void agregarVehiculoAFuerzasArmadas(Vehiculo vehiculo) {
		this.convoy.add(vehiculo);
		
	}

	public boolean enviarALaBatalla(String nombreBatalla, String codigoVehiculo) throws Exception {
		Batalla batallaBuscada = buscarBatalla(nombreBatalla);
		Vehiculo vehiculoBuscado = buscarVehiculo(codigoVehiculo);
		batallaBuscada.agregarVehiculoABatalla(vehiculoBuscado);
		
		return true;
	}
	
	
	

	public Integer getCapacidadDeDefensa() {
		return this.convoy.size();
	}



	public void setCapacidadDeDefensa(Integer capacidadDeDefensa) {
		this.capacidadDeDefensa = capacidadDeDefensa;
	}



	public HashSet<Vehiculo> getConvoy() {
		return convoy;
	}

	public void setConvoy(HashSet<Vehiculo> convoy) {
		this.convoy = convoy;
	}

	public HashMap<String, Batalla> getBatallas() {
		return batallas;
	}

	public void setBatallas(HashMap<String, Batalla> batallas) {
		this.batallas = batallas;
	}



	



	

	
	
	
}
