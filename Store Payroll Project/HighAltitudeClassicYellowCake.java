package prob1;

public class HighAltitudeClassicYellowCake extends ClassicYellowCake {

	public HighAltitudeClassicYellowCake(String cakeMix) {
		super(cakeMix);
	}
	
	@Override 
	public String getCakeMix() {
		return (super.getCakeMix() + " 2 tbs flours");
	}
	
	@Override
	public String bake() {
		return "Bake at 375 degrees F 30 minutes";
	}
	
}
