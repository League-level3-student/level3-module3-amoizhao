package _01_AnimalFarm;

import java.util.ArrayList;

public class Farm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList <Animal> farm = new ArrayList<Animal>();
		Blobfish blob1 = new Blobfish();
		Blobfish blob2 = new Blobfish();
		Bunny bun = new Bunny();
		Porcupine porc1 = new Porcupine();
		Porcupine porc2 = new Porcupine();
		Fox fox = new Fox();
		farm.add(blob1);
		farm.add(blob2);
		farm.add(bun);
		farm.add(porc1);
		farm.add(porc2);
		farm.add(fox);
		
		for(int i = 0; i<farm.size(); i++) {
			farm.get(i).makeNoise();
			farm.get(i).attack();
		}
		
	}

}
