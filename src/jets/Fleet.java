package jets;

public class Fleet {
	// construct initial fleet
	Jet[] fleet = new Jet[100];

	public Fleet() {
		fleet[0] = new Jet("Cessna", "Citation X", 3216, 604, 51000, 5140, 3400, 12, 23.365);
		fleet[1] = new Jet("Embraer", "Phenom 300", 1971, 518, 45000, 6, 8.995);
		fleet[2] = new Jet("Bombardier", "Global 6000", 6000, 562, 51000, 6476, 2670, 13, 61.31);
		fleet[3] = new Jet("Cessna", "Citation Mustang", 1167, 390, 41000, 3110, 2380, 5, 3.35);
		fleet[4] = new Jet("Bombardier", "Learjet 75", 2040, 535, 51000, 9, 13.8);

	}

	public Jet[] getFleet() {
		return fleet;
	}

	public void setFleet(Jet newJet) {
		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] == null) {
				fleet[i] = newJet;
				break;
			}
		}
	}

	public void printFleet() {
		System.out.println();
		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] != null) {
				System.out.println("Aircraft " + (i + 1) + ":");
				System.out.println(fleet[i].toString());
				System.out.println();
			} else {
				break;
			}
		}
	}

	public void printMaxCruise(Jet[] fleet) {
		Jet highest = fleet[0];
		for (int i = 0; i < fleet.length; i++) {
			if (fleet[i] != null) {
				if (fleet[i].getMaxCruiseSpeedMach() > highest.getMaxCruiseSpeedMach()) {
					highest = fleet[i];
				}
			}
		}
		System.out.println("Current Max Cruise Aircraft:\n" + highest.toString());
	}

	public void printMaxRange(Jet[] fleet) {
		Jet highest = fleet[0];
		for (Jet i : fleet) {
			if (i != null) {
				if (i.getMaxRange() > highest.getMaxRange()) {
					highest = i;
				}
			}
		}
		System.out.println("Current Max Range Aircraft:\n" + highest.toString());
	}
}
