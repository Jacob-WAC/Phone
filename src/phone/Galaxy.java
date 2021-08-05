package phone;

public class Galaxy extends Phone implements Ringable {
    public Galaxy(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
    	return this.getRingTone();
    }
    @Override
    public String unlock() {
        return ("Unlocking via finger print");
    }
    @Override
    public void displayInfo() {
    	String info = String.format("Galaxy %s from %s",this.getVersionNumber(), this.getCarrier());
    	System.out.println(info);     
    }
}

