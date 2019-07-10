package it.corsojava.dstech.soluzioneFrancesco.operazioni;

public class OperatoreMatematico {

	private double primoNumero;
	private double secondoNumero;
	
	public double somma() {
		return this.getPrimoNumero() + this.getSecondoNumero();
	}
	
	public double sottrazione() {
		return this.getPrimoNumero() - this.getSecondoNumero();
	}
	
	public double moltiplicazione() {
		return this.getPrimoNumero() * this.getSecondoNumero();
	}
	
	public double divisione() throws DivisioneByZeroException {
		if (this.getSecondoNumero() == 0) {
			throw new DivisioneByZeroException();
		}
		return this.getPrimoNumero() / this.getSecondoNumero();
	}

	public OperatoreMatematico(double primoNumero, double secondoNumero) {
		this.primoNumero = primoNumero;
		this.secondoNumero = secondoNumero;
	}

	public double getSecondoNumero() {
		return secondoNumero;
	}

	public void setSecondoNumero(double secondoNumero) {
		this.secondoNumero = secondoNumero;
	}

	public double getPrimoNumero() {
		return primoNumero;
	}

	public void setPrimoNumero(double primoNumero) {
		this.primoNumero = primoNumero;
	}

	@Override
	public String toString() {
		return "OperatoreMatematico [primoNumero=" + primoNumero + ", secondoNumero=" + secondoNumero + "]";
	}
}
