package ar.edu.unlam.pb2;

public class Cuenta {

	private Cliente cliente;
	private final Integer NRO_CUENTA;
	private TipoDeCuenta tipo;
	private Double saldo;
	private Double sobregiro;

	Cuenta(Cliente cliente,Integer NRO_CUENTA,TipoDeCuenta tipo, Double saldo) {
		this.cliente = cliente;
		this.tipo = tipo;
		this.saldo = 0.0;
		this.NRO_CUENTA = 01;
	}



	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public TipoDeCuenta getTipo() {
		return tipo;
	}

	public void setTipo(TipoDeCuenta tipo) {
		this.tipo = tipo;
	}

	public Double getSaldo() {
		return saldo;
	}

	public void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	public Integer getNRO_CUENTA() {
		return NRO_CUENTA;
	}



	public void depositar(Double iMPORTE_A_DEPOSITAR) {
		saldo += iMPORTE_A_DEPOSITAR; //guarda 10000.0
	}



	public boolean extraerDinero(Double importe) {
		if (saldo >= importe ) {
			saldo -= importe;
			return true;
		}
		return false;
	}
	
	

}
