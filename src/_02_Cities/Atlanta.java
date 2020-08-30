package _02_Cities;

public class Atlanta extends City{

	public Atlanta(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double totalTaxes = population*0.01 + (population*.15);
		return totalTaxes;
	}

}
