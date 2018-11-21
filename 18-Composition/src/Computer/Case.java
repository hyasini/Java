package Computer;

public class Case {
	private String model;
	private String manfuacturer;
	private String powerSupply;
	private Dimensions dimensions1;
	
	public Case(String model, String manfuacturer, String powerSupply, Dimensions dimensions1) {
		this.model = model;
		this.manfuacturer = manfuacturer;
		this.powerSupply = powerSupply;
		this.dimensions1 = dimensions1;
	}
	
	public void pressPowerButton() {
		System.out.println("Power button pressed");
	}
	
	public String getModel() {
		return model;
	}
	public String getManfuacturer() {
		return manfuacturer;
	}
	public String getPowerSupply() {
		return powerSupply;
	}
	public Dimensions getDimensions1() {
		return dimensions1;
	}

	
	
}
