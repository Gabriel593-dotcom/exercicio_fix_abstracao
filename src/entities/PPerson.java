package entities;

public class PPerson extends Person {

	private double healthCareCosts;

	public PPerson() {
	}

	public PPerson(String name, double anualRentability, double healthCareCosts) {

		super(name, anualRentability);
		this.healthCareCosts = healthCareCosts;
	}

	@Override
	public double calcTax() {

		double totalTax = 0;

		if (getAnualRentability() < 20000.0) {

			return getAnualRentability() * 0.15 - this.healthCareCosts * 0.50;

		}

		else{
			
			totalTax = super.getAnualRentability() * 0.25 - this.healthCareCosts * 0.50;

		}
		
		return totalTax;
	}

}
