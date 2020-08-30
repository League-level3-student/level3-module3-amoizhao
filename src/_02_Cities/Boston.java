package _02_Cities;

public class Boston extends City {

	public Boston(int population, double growthRate) {
		super(population, growthRate);
	}

	@Override
	double getAnnualTaxes() {
		double totalTaxes = population*0.01 + (population*.5);
		return totalTaxes;
	}

}
