package week1.day1;

public class Mobile{
	String mobileModel="Redmi Note 4";
	int mobileWeight=100;
	double mobileCost=15000;
	boolean fullCharge= true;
	public void makeCall() {
		System.out.println("Call Connected");
	}
	public void sendMsg() {
		System.out.println("Message Received");
		
	}
	public static void main(String[] args) {
		Mobile mob=new Mobile();
		
		mob.makeCall();
		mob.sendMsg();
		System.out.println(mob.mobileModel);
		System.out.println(mob.mobileWeight);
		System.out.println(mob.mobileCost);
		System.out.println(mob.fullCharge);
	}
}