package phone;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
    @Override
    public String ring() {
        return this.getRingTone();
    }
    @Override
    public String unlock() {
    	return ("Unlocking via laser eye recognition");
    }
    @Override
    public void displayInfo() {
    String info = String.format("Iphone %s from %s",this.getVersionNumber(), this.getCarrier());
    	System.out.println(info);
    }
}

