package Car;

public class Car {
	protected double speed;
	
	public double getSpeed(){
		return speed;
	}
	
	public void accel(double a){ 
		speed =  a + 100;
	}
	
	public void brake(double a){
		speed = speed - speed * a;
	}
}
