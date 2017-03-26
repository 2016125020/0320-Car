package Car;

public class CarTest {
	public static void main(String[] args){
		Car car1 = new Car();
		MtCar car2 = new MtCar();
		
		car1.accel(1);
		car2.accel(1);
		car2.shiftGear(0.5);
		
		System.out.printf("car1 speed is %f\n",car1.getSpeed());
		System.out.printf("car2 speed is %f\n",car2.getSpeed());
		
		car1.brake(0.5);
		car2.brake(0.5);
		
		System.out.print("After brake...\n");
		
		System.out.printf("car1 speed is %f\n",car1.getSpeed());
		System.out.printf("car2 speed is %f\n",car2.getSpeed());
	}
}
