package jets;

public class Pilot {
	String gender, firstName, lastName;
	int yearsExperience;

	String[] maleFirstNames = new String[]{ "Bob", "Neil", "Buzz", "John", "Zach", "Carlos", "Jess", "Rob", "Nick", "Steve"};
	String[] femaleFirstNames = new String[]{ "Claire", "Stephanie", "Charlette", "Audrey", "Zoey", "Michelle", "Becky", "Katie", "Trisha", "Sarah"};
	String[] lastNames = new String[]{ "Thompson", "Aldrin", "Armstong", "Sullenberger", "Richardson", "Gregory", "Taylor", "Fuller", "Freeman", "Cruise"};
	
	Pilot(){
		if (getRandom(1,2) == 1){
			gender = "Male";
		} else {
			gender = "Female";
		}
		if (gender == "Male"){
			firstName = maleFirstNames[getRandom(0, 9)];
		} else {
			firstName = femaleFirstNames[getRandom(0, 9)];
		}
		lastName = lastNames[getRandom(0, 9)];
		yearsExperience = getRandom(10, 30);
		
	}
	
	private int getRandom(int low, int high){
		int random = ((int)(Math.random() * high + low));
		return random;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Pilot: \n");
		builder.append(gender);
		builder.append("Name: " + firstName + " " + lastName);
		builder.append("\tYears Experience: " + yearsExperience);
		return builder.toString();
	}
	
	
}