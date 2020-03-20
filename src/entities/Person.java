package entities;

public abstract class Person {

	private String name;
	private double anualRentability;

	
	public Person() {
	}

	public Person(String name, double anualRentability) {

		this.name = name;
		this.anualRentability = anualRentability;
	}

	public String getName() {
		return name;
	}

	public double getAnualRentability() {
		return anualRentability;
	}

	public void setAnualRentability(double anualRentability) {
		this.anualRentability = anualRentability;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract double calcTax();

	public String dataPrint(){
		
		return this.name + ": $ " + String.format("%.2f", this.calcTax());  
	};

}
