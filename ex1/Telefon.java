package ex1;

public class Telefon {
	protected String marca;
	protected String model;

	public Telefon(String marca, String model) {
		super();
		this.marca = marca;
		this.model = model;
	}

	void trucar(String num) {
		System.out.println("S�est� trucant al n�mero " + num);
	}
}
