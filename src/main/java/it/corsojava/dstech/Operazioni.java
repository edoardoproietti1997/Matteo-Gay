package it.corsojava.dstech;

public class Operazioni {
	private double numero1;
	private double numero2;

	public double getNumero1() {
		return numero1;
	}

	public void setNumero1(double numero1) {
		this.numero1 = numero1;
	}

	public double getNumero2() {
		return numero2;
	}

	public void setNumero2(double numero2) {
		this.numero2 = numero2;
	}

	public Operazioni(double numero1, double numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}

	public double somma() {
		return this.numero1 + this.numero2;

	}

	public double differenza() {
		return this.numero1 - this.numero2;
	}

	public double prodotto() {
		return this.numero1 * this.numero2;
	}

	public double divisione() {

		if (this.numero2 == 0) {
			return Double.MAX_VALUE;
		} else {
			return this.numero1 / this.numero2;
		}

	}

}
