package ar.edu.unlam.pb2;

import java.util.HashSet;

public class Banco {
	
	private final String NOMBRE = "BNA";
	HashSet<Cuenta> cuentas = new HashSet<>();

	public void agregarCuentas(Cuenta cuenta) {
		this.cuentas.add(cuenta);
	}

	public Integer cantDeCuentas() {
		return cuentas.size();
		
	}

}
