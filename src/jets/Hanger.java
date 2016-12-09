package jets;

import java.util.Arrays;

public class Hanger {
	Jet[] fleet = new Jet[100];
	
	Jet jet0 = new Jet("Cessna", "Citation X", 3216, 604, 51000, 5140, 3400, 12, 23.365);
	Jet jet1 = new Jet("Embraer", "Phenom 300", 1971, 518, 45000, 6 , 8.995);
	Jet jet2 = new Jet("Bombardier", "Global 6000", 6000, 562, 51000, 6476, 2670, 13, 61.31);
	Jet jet3 = new Jet("Cessna", "Citation Mustang", 1167, 390, 41000, 3110, 2380, 5, 3.35);
	Jet jet4 = new Jet("Bombardier", "Learjet 75", 2040, 535, 51000, 9, 13.8);

	
	@Override
	public String toString() {
		return "Hanger [fleet=" + Arrays.toString(fleet) + "]";
	}

}
