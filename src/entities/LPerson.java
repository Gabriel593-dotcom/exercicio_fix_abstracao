package entities;

public class LPerson extends Person {

	private int employeesQuantity;

	public LPerson() {
	}

	public LPerson(String name, double anualRentability, int employeesQuantity) {
		super(name, anualRentability);
		this.employeesQuantity = employeesQuantity;
	}

	public int getEmployeesQuantity() {
		return employeesQuantity;
	}

	public void setEmployeesQuantity(int employeesQuantity) {
		this.employeesQuantity = employeesQuantity;
	}

	@Override
	public double calcTax() {

		double totalTax = 0.0;

		if (this.employeesQuantity > 10) {
			
			totalTax = super.getAnualRentability() * 0.14;
		}
		
		else {
			
			totalTax = super.getAnualRentability() * 0.16;
		}
		return totalTax;
	}

}
