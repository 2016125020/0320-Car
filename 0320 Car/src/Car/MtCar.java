package Car;

public class MtCar extends Car {
	private double rpm;
	private double gearRatio;
	
	public void recalculate(){ //set speed
		speed = rpm * gearRatio;
	}
		
	@Override
	public double getSpeed(){
		return rpm*gearRatio; //return speed
	}

	@Override
	public void accel(double a){
		rpm = a*2;
		recalculate(); //rpm�� ���������Ƿ� speed �缳��
	}
	
	public void shiftGear(double g){
		gearRatio = g * 100.0;
		recalculate();
	}
}
