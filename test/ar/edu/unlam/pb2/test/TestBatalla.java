package ar.edu.unlam.pb2.test;
import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

import ar.edu.unlam.dominio.Batalla;
import ar.edu.unlam.dominio.FuerzaArmada;
import ar.edu.unlam.dominio.TipoDeBatalla;
import ar.edu.unlam.interfaces.Acuatico;
import ar.edu.unlam.interfaces.Terrestre;
import ar.edu.unlam.interfaces.Volador;
import ar.edu.unlam.vehiculos.Anfibio;
import ar.edu.unlam.vehiculos.Avion;
import ar.edu.unlam.vehiculos.Camion;
import ar.edu.unlam.vehiculos.Destructor;
import ar.edu.unlam.vehiculos.HidroAvion;
import ar.edu.unlam.vehiculos.Portaviones;
import ar.edu.unlam.vehiculos.Submarino;
import ar.edu.unlam.vehiculos.Tanque;
import ar.edu.unlam.vehiculos.Vehiculo;
import ar.edu.unlam.exceptiones;
import ar.edu.unlam.exceptiones.VehiculoInexistente;

public class TestBatalla {

	@Test
	public void queSePuedaCrearUnObjetoVolador() {
		Volador avion = new Avion("1", "A-10");
		Vehiculo avion1 = new Avion("2", "A-11");
		Avion avion2 = new Avion("3", "A-13");
		
		assertNotNull(avion);
		assertNotNull(avion1);
		assertEquals(0.0, ((Avion) avion).getAltura(), 0.01);
		assertEquals(0.0, (double)avion2.getAltura(), 0.01);
	}

	@Test
	public void queSePuedaCrearUnObjetoTerrestre() {
		Terrestre tanque = new Tanque("5", "Renault FT");
		Vehiculo tanque1 = new Tanque("4", "Renault tc");
		Tanque tanque2 = new Tanque("6", "Renault fz");

		assertEquals(0.0, ((Tanque) tanque).getVelocidad(),0.1);
		assertEquals(0.0, tanque2.getVelocidad(), 0.1);
		assertNotNull(tanque1);
	}

	@Test
	public void queSePuedaCrearUnObjetoAcuatico() {
		Acuatico submarino = new Submarino("8", "ARA - San Juan");
		Vehiculo submarino1 = new Submarino("9", "ft - San Juan");
		
		assertEquals(0.0, ((Submarino) submarino).getProfundidad(), 0.01);
		assertEquals(0.0, ((Submarino) submarino1).getProfundidad(), 0.01);
	}

	@Test
	public void queSePuedaCrearUnObjetoAnfibio() {
		Anfibio var = new Anfibio("12", "LARC-5");

		assertEquals(0.0, var.getVelocidad(), 0.01);
		assertEquals(0.0, var.getProfundidad(), 0.01);
	}

	@Test
	public void queSePuedaCrearUnHidroavion() {
		HidroAvion ag600 = new HidroAvion("12", "AG600");

		assertEquals(0.0, ag600.getAltura(), 0.01);
		assertEquals(0.0, ag600.getProfundidad(), 0.01);
	}

	@Test
	public void queSePuedaArmarElConvoy() {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculoAFuerzasArmadas(new Avion("0001", "A-10"));
		argentina.agregarVehiculoAFuerzasArmadas(new Avion("0002", "A-10"));
		argentina.agregarVehiculoAFuerzasArmadas(new Avion("0003", "F-102"));
		argentina.agregarVehiculoAFuerzasArmadas(new Avion("0004", "F-15"));
		argentina.agregarVehiculoAFuerzasArmadas(new Tanque("0005", "Renault FT"));
		argentina.agregarVehiculoAFuerzasArmadas(new Camion("0006", "T-72"));
		argentina.agregarVehiculoAFuerzasArmadas(new Camion("0007", "T-72"));
		argentina.agregarVehiculoAFuerzasArmadas(new Submarino("0008", "A-10"));
		argentina.agregarVehiculoAFuerzasArmadas(new Portaviones("0009", "A-10"));
		argentina.agregarVehiculoAFuerzasArmadas(new Destructor("0010", "A-10"));
		argentina.agregarVehiculoAFuerzasArmadas(new Destructor("0011", "A-10"));
		argentina.agregarVehiculoAFuerzasArmadas(new HidroAvion("0012", "A-10"));
		argentina.agregarVehiculoAFuerzasArmadas(new Anfibio("0012", "A-10"));
		argentina.agregarVehiculoAFuerzasArmadas(new Avion("1", "A-10"));
		argentina.agregarVehiculoAFuerzasArmadas(new Avion("2", "A-10"));
		argentina.agregarVehiculoAFuerzasArmadas(new Avion("3", "F-102"));
		argentina.agregarVehiculoAFuerzasArmadas(new Avion("4", "F-15"));
		argentina.agregarVehiculoAFuerzasArmadas(new Tanque("5", "Renault FT"));
		argentina.agregarVehiculoAFuerzasArmadas(new Camion("6", "T-72"));
		argentina.agregarVehiculoAFuerzasArmadas(new Camion("7", "T-72"));
		argentina.agregarVehiculoAFuerzasArmadas(new Submarino("8", "ARA - San Juan"));
		argentina.agregarVehiculoAFuerzasArmadas(new Portaviones("9", "A-10"));
		argentina.agregarVehiculoAFuerzasArmadas(new Destructor("10", "A-10"));
		argentina.agregarVehiculoAFuerzasArmadas(new Destructor("11", "A-10"));
		argentina.agregarVehiculoAFuerzasArmadas(new HidroAvion("12", "Mitsubishi F1M"));
		argentina.agregarVehiculoAFuerzasArmadas(new Anfibio("12", "LARC-5"));

		int capacidad =argentina.getCapacidadDeDefensa();
		assertEquals(26,argentina.getConvoy().size());
		assertEquals(26, capacidad);
		assertEquals((Integer)26, argentina.getCapacidadDeDefensa());
	}

	@Test
	public void queSePuedaCrearUnaBatalla() throws Exception {
		FuerzaArmada argentina = new FuerzaArmada();

		Batalla batallaEsperada = new Batalla(100.5, 20.3,TipoDeBatalla.TERRESTRE );
		argentina.crearBatalla("San Lorenzo", batallaEsperada);

		assertEquals(100.5, argentina.getBatallas().get("San Lorenzo").getLatitud(),0.1);
		assertEquals(20.3, argentina.getBatallas().get("San Lorenzo").getLongitud(),0.1);
		
	}	

	@Test
	public void queSePuedaPlanearLaBatallaSobreElOceano() {
		FuerzaArmada argentina = new FuerzaArmada();
		Batalla batallaEsperada = new Batalla( 100.5, 20.3,TipoDeBatalla.ACUATICA);
		argentina.crearBatalla("Malvinas", batallaEsperada);
		
		
		assertTrue(argentina.getBatallas().get("Malvinas").getLatitud() == 100.5);
		assertTrue(argentina.getBatallas().get("Malvinas").getLongitud() == 20.3);
		
	}
	/*
	public void queSePuedaPresentarBatallaTerrestre() throws Exception {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculoAFuerzasArmadas(new Avion("0001", "A-10"));
		argentina.agregarVehiculoAFuerzasArmadas(new Avion("0002", "A-10"));
		argentina.agregarVehiculoAFuerzasArmadas(new Avion("0003", "F-102"));
		argentina.agregarVehiculoAFuerzasArmadas(new Avion("0004", "F-15"));
		argentina.agregarVehiculoAFuerzasArmadas(new Tanque("0005", "Renault FT"));
		argentina.agregarVehiculoAFuerzasArmadas(new Camion("0006", "T-72"));
		argentina.agregarVehiculoAFuerzasArmadas(new Camion("0007", "T-72"));
		argentina.agregarVehiculoAFuerzasArmadas(new Submarino("0008", "A-10"));
		argentina.agregarVehiculoAFuerzasArmadas(new Portaviones("0009", "A-10"));
		argentina.agregarVehiculoAFuerzasArmadas(new Destructor("0010", "A-10"));
		argentina.agregarVehiculoAFuerzasArmadas(new Destructor("0011", "A-10"));
		argentina.agregarVehiculoAFuerzasArmadas(new HidroAvion("0012", "A-10"));
		argentina.agregarVehiculoAFuerzasArmadas(new Anfibio("0012", "A-10"));

		
		Batalla batallaEsperada = new Batalla(100.5, 20.3, TipoDeBatalla.TERRESTRE);
		argentina.crearBatalla("San Lorenzo", batallaEsperada);

		batallaEsperada.agregarVehiculoABatalla(argentina.buscarVehiculo("0005"));
		batallaEsperada.agregarVehiculoABatalla(argentina.buscarVehiculo("0006"));
		batallaEsperada.agregarVehiculoABatalla(argentina.buscarVehiculo("0007"));
		batallaEsperada.agregarVehiculoABatalla(argentina.buscarVehiculo("0010"));
		batallaEsperada.agregarVehiculoABatalla(argentina.buscarVehiculo("0012"));
		
		argentina.presentarBatalla("San Lorenzo");
		
		Batalla batallaBuscada = argentina.buscarBatalla("San Lorenzo");
		
		
		assertEquals(batallaBuscada.toString(), batallaBuscada.toString());	
	}

	@Test
	public void queSePuedaPresentarBatallaNaval() throws VehiculoInexistente, VehiculoIncompatible {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculo(new Submarino(8, "A-10"));
		argentina.agregarVehiculo(new Portaviones(9, "A-10"));
		argentina.agregarVehiculo(new Destructor(10, "A-10"));
		argentina.agregarVehiculo(new Destructor(11, "A-10"));
		argentina.agregarVehiculo(new HidroAvion(12, "A-10"));
		argentina.agregarVehiculo(new Anfibio(13, "A-10"));

		assertEquals(12, argentina.getCapacidadDeDefensa());
		argentina.crearBatalla("Pacifico", TipoDeBatalla.NAVAL, 200.5, 45.8);

		assertTrue(argentina.enviarALaBatalla("Pacifico", 8));
		assertTrue(argentina.enviarALaBatalla("Pacifico", 9));
		assertTrue(argentina.enviarALaBatalla("Pacifico", 10));		
		assertTrue(argentina.enviarALaBatalla("Pacifico", 11));		
		assertTrue(argentina.enviarALaBatalla("Pacifico", 12));		
		assertTrue(argentina.enviarALaBatalla("Pacifico", 13));		
	}
*/
	@Test (expected = VehiculoIncompatible.class)
	public void queSeNoSePuedaEnviarAUnaBatallaEnTierraUnBarco() throws Exception {
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculoAFuerzasArmadas(new Tanque("5", "Renault FT"));
		argentina.agregarVehiculoAFuerzasArmadas(new Camion("6", "T-72"));
		argentina.agregarVehiculoAFuerzasArmadas(new Camion("7", "T-72"));
		argentina.agregarVehiculoAFuerzasArmadas(new Destructor("11", "A-10"));
		
		Batalla batallaEsperada = new Batalla( 100.5, 20.3,TipoDeBatalla.TERRESTRE);
		argentina.crearBatalla("San Lorenzo", batallaEsperada);

		assertFalse(argentina.enviarALaBatalla("San Lorenzo", "11"));

	}

	@Test (expected = VehiculoInexistente.class)
	public void queSeNoSePuedaEnviarAUnaBatallaUnVehiculoQueNoExista() throws Exception{
		FuerzaArmada argentina = new FuerzaArmada();

		argentina.agregarVehiculoAFuerzasArmadas(new Tanque("5", "Renault FT"));
		argentina.agregarVehiculoAFuerzasArmadas(new Camion("6", "T-72"));
		argentina.agregarVehiculoAFuerzasArmadas(new Camion("7", "T-72"));
		argentina.agregarVehiculoAFuerzasArmadas(new Destructor("11", "A-10"));
		
		Batalla batallaEsperada = new Batalla( 100.5, 20.3,TipoDeBatalla.TERRESTRE);
		argentina.crearBatalla("San Lorenzo", batallaEsperada);


		assertFalse(argentina.enviarALaBatalla("San Lorenzo", "4"));
	}
	
}
