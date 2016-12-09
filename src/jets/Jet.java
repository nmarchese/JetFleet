package jets;

public class Jet {
	private String make, model;
	private double maxRange, maxCruiseSpeedMach, serviceCieling, avgTkoffDist, avgLndgDist, price;
	int passangerCapacity;
	
	//constructors
	public Jet(){	
	}
	public Jet(String make, String model, double maxRange, double maxCruiseSpeedMPH, double serviceCieling, int passangerCapacity, double price) {
		this.make = make;
		this.model = model;
		this.maxRange = maxRange;
		this.maxCruiseSpeedMach = maxCruiseSpeedMPH * 0.00130332;
		this.serviceCieling = serviceCieling;
		this.passangerCapacity = passangerCapacity;
		this.price = price;
	}
	
	public Jet(String make, String model, double maxRange, double maxCruiseSpeedMPH, double serviceCieling,
			double avgTkoffDist, double avgLndgDist, int passangerCapacity, double price) {
		this(make, model, maxRange, maxCruiseSpeedMPH, serviceCieling, passangerCapacity, price);
		this.avgTkoffDist = avgTkoffDist;
		this.avgLndgDist = avgLndgDist;
	}
	
	//getters
	public String getMake() {
		return make;
	}
	public String getModel() {
		return model;
	}
	public double getMaxRange() {
		return maxRange;
	}
	public double getMaxCruiseSpeedMach() {
		return maxCruiseSpeedMach;
	}
	public double getServiceCieling() {
		return serviceCieling;
	}
	public double getAvgTkoffDist() {
		return avgTkoffDist;
	}
	public double getAvgLndgDist() {
		return avgLndgDist;
	}
	public double getPrice() {
		return price;
	}
	public int getPassangerCapacity() {
		return passangerCapacity;
	}
	
	//setters
	public void setMake(String make) {
		this.make = make;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setMaxRange(double maxRange) {
		this.maxRange = maxRange;
	}
	public void setMaxCruiseSpeedMach(double maxCruiseSpeedMach) {
		this.maxCruiseSpeedMach = maxCruiseSpeedMach;
	}
	public void setServiceCieling(double serviceCieling) {
		this.serviceCieling = serviceCieling;
	}
	public void setAvgTkoffDist(double avgTkoffDist) {
		this.avgTkoffDist = avgTkoffDist;
	}
	public void setAvgLndgDist(double avgLndgDist) {
		this.avgLndgDist = avgLndgDist;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public void setPassangerCapacity(int passangerCapacity) {
		this.passangerCapacity = passangerCapacity;
	}
}
