package OOAD_GearDesign;

class Gear{

	private int chainring, cog;
	private double rim, tire;

	Gear(int chainring, int cog, double rim, double tire){
		this.chainring = chainring;
		this.cog = cog;
		this.rim = rim;
		this.tire = tire;
	}

	public double getGearRatio(){
		return chainring/cog;
	}

	public double getGearInches(){
		return getGearRatio() * (rim + (tire*2));
	}

}

public class GearStructure {
	public static void main(String[] args) {
		Gear gear = new Gear(52, 11, 26, 1.5);
		System.out.println(gear.getGearRatio());
		System.out.println(gear.getGearInches());
	}
}