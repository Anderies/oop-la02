package session05;

public class TV {
	int channel = 1;
	int volumeLevel = 1;
	boolean on = false;
	
//	First Constructor
	public TV() {
		
	}
//	Method 1 : For turn on the tv
	public void turnOn() {
		on = true;
	}
	
//	Method 2 : For turn off the tv
	public void turnOff() {
		on = false;
	}
	
//	Method 3: for setting tv channel
	public void setChannel(int newChannel) {
		if(on && newChannel >=1 && newChannel <= 120) {
			channel = newChannel;
		}
	}
	
//	Method 4: for setting tv volume
	public void setVolume(int newVolumeLevel) {
		if(on && newVolumeLevel >=1 && newVolumeLevel <=7) {
			volumeLevel = newVolumeLevel;
		}
	}
	
//	Method 5 : for increment 1 the channel
	public void channelUp() {
		if(on && channel > 1)
			channel++;
	}
	
//	Method 6 : for decrement 1 the channel
	public void channelDown() {
		if(on && channel > 1)
			channel--;
	}
	
//	Method 7 : for increment the volume by 1
	public void volumeUp() {
		if(on && volumeLevel < 7) {
			volumeLevel++;
		}
	}
	
//	Method 8 : for decrement the volume by 1
	public void volumeDown() {
		if(on && volumeLevel > 1) {
			volumeLevel--;
		}
	}
	
	
}
