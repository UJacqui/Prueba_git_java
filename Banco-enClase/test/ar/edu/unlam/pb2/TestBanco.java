package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestBanco {

	@Test
	public void queSePuedaInstanciarUnaCuenta() {
		
		//preparacion
		
			Banco banco;	
			Integer NRO_CUENTA = 01;
			String nombre= "jacqui";
			Integer cuil= 13653987;
			Double saldo=0.0;
		//ejecucion
				
			Cliente cliente = new Cliente(nombre, cuil);
			Cuenta cuenta = new Cuenta(cliente,NRO_CUENTA, TipoDeCuenta.CAJA_DE_AHORRO, saldo);
				
		//validacion
		assertNotNull(cuenta);		
		assertEquals(saldo, cuenta.getSaldo());
				

	}
	

	@Test
	public void queSePuedaDepositarDinero() {
		//preparacion 
		
			Integer NRO_CUENTA=01;
			Double saldo=0.0;
			String nombre= "jacqui";
			Integer cuil=12354321;
			Double IMPORTE_A_DEPOSITAR = 10000.0;
			
			Cliente cliente = new Cliente(nombre, cuil);
			Cuenta cuenta = new Cuenta(cliente,NRO_CUENTA, TipoDeCuenta.CAJA_DE_AHORRO, saldo);
		
		
		//ejecucion 
			
			cuenta.depositar(IMPORTE_A_DEPOSITAR);
			
		//validacion
			
			assertEquals(IMPORTE_A_DEPOSITAR, cuenta.getSaldo());
		
	}
	
	@Test
	public void queSePuedaExtraerDinero() {
		
		//preparacion 
		Integer NRO_CUENTA=01;
		Double saldo=0.0;
		String nombre= "jacqui";
		Integer cuil=12354321;
		final Double IMPORTE_A_DEPOSITAR = 10000.0;
		final Double IMPORTE_A_EXTRAER = 500.0;

		Cliente cliente = new Cliente(nombre, cuil);
		Cuenta cuenta = new Cuenta(cliente,NRO_CUENTA, TipoDeCuenta.CAJA_DE_AHORRO, saldo);
		
		
		//ejecucion 
		cuenta.depositar(IMPORTE_A_DEPOSITAR);
		cuenta.extraerDinero(IMPORTE_A_EXTRAER);
		
		//validacion
		assertTrue(cuenta.extraerDinero(IMPORTE_A_EXTRAER));
	}
	
	
	@Test
	public void queSePuedaConsultarSaldo() {

		//preparacion 
		Integer NRO_CUENTA=01;
		Double saldo=0.0;
		String nombre= "jacqui";
		Integer cuil=12354321;
		final Double IMPORTE_A_DEPOSITAR = 10000.0;
		final Double IMPORTE_A_EXTRAER = 500.0;

		Cliente cliente = new Cliente(nombre, cuil);
		Cuenta cuenta = new Cuenta(cliente,NRO_CUENTA, TipoDeCuenta.CAJA_DE_AHORRO, saldo);
		
		
		//ejecucion 
		cuenta.depositar(IMPORTE_A_DEPOSITAR);
		cuenta.extraerDinero(IMPORTE_A_EXTRAER);
		
		Double saldoEsperado = 9500.0;
		
		//validacion

		assertEquals(saldoEsperado, cuenta.getSaldo());
	}
	
	@Test
	public void queSePuedaAgregarMasDeUnaCuentaAlBanco() {

		//preparacion 
		Integer NRO_CUENTA=01;
		Double saldo=0.0; // saldo inicial
		String nombre= "jacqui";
		Integer cuil=12354321;
		final Double IMPORTE_A_DEPOSITAR = 10000.0;
		final Double IMPORTE_A_EXTRAER = 500.0;

		Banco bna = new Banco();
		Cliente cliente = new Cliente(nombre, cuil);
		Cuenta cuenta1 = new Cuenta(cliente,NRO_CUENTA, TipoDeCuenta.CAJA_DE_AHORRO, saldo);
		Cuenta cuenta2 = new Cuenta(cliente,02, TipoDeCuenta.CAJA_DE_AHORRO, saldo);

		
		//ejecucion 
		
		bna.agregarCuentas(cuenta1);
		bna.agregarCuentas(cuenta2);
		bna.cantDeCuentas();
		
		Integer cuentasAgregadasEsperado = 2;
		
		//validacion
		
		assertEquals(cuentasAgregadasEsperado, bna.cantDeCuentas());
	}
	
	@Test
	public void queSePuedaTransferirDeUnaCuentaAOtra() {
		

	}


}
