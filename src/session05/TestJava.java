package session05;

public class TestJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TV tv1 = new TV();
		tv1.turnOn();
		tv1.setChannel(30);
		tv1.setVolume(3);
		
		System.out.println("tv1 channel is " + tv1.channel + " volume " + tv1.volumeLevel);
	}

}
