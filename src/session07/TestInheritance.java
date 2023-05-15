package session07;

// we will create two class the first is Bicycle Class and MountainBike Class
// 

// Bicycle will have two attribute gear and speed
// Bicycle will have three methods apply brake, speedUp and toString()
class Bicycle{
//	Attribute
	public int gear;
	public int speed;
	
//	Constructor with Two Attribute
	public Bicycle(int gear,int speed){
		this.gear = gear;
		this.speed = speed;
	}
	
	public void applyBrake(int decrement) {
		speed -= decrement;
	}
	
	public void speedUp(int increment) {
		speed += increment;
	}
	
	public String toString() {
		return ("No of gears are " + gear + "\n" + "speed of bicycle is " + speed);
	}
}

// Mountain Bike will have three attribute gear, speed and seatHeight
// Mountain bike have two methods toString and SetHeight
class MountainBike extends Bicycle {
	public int seatHeight;
	
	
	public MountainBike(int gear, int speed, int seatHeight) {
		super(gear, speed);
		this.seatHeight = seatHeight;
		// TODO Auto-generated constructor stub
	}
	
	public void setHeight(int newValue) {
		seatHeight = newValue;
	}
	
	@Override
	public String toString() {
		return (super.toString() + "\nseat height is " + seatHeight);
	}
	
}

public class TestInheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MountainBike mb = new MountainBike(2, 60, 25);
		System.out.println(mb.toString());
		mb.speedUp(1);
		System.out.println("After SpeedUp = " + mb.toString());
		mb.applyBrake(1);

	}

}
