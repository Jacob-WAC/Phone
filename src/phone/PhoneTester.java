package phone;

public class PhoneTester {
	public static void main(String[] args) {
		
	
Galaxy s20 = new Galaxy("S20",100,"Verizon","ring Ring RING!!!!");
IPhone iphoneX = new IPhone("X",60,"AT&T","YOUR PHONE IS RINGING");


s20.displayInfo();
System.out.println(s20.ring());
System.out.println(s20.unlock());
iphoneX.displayInfo();
System.out.println(iphoneX.ring());
System.out.println(iphoneX.unlock());


	}

}
