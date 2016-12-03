package abstraction;

public class TestMyRides {

	public static void main(String[] args) {
	
		Wagon wagon = new Motercycle();
		wagon.woodenWheels();
		wagon.horses();
		
		Cars cars = new Motercycle();
		cars.fourRims();
		cars.fourTires();
		
		Motercycle motercycle = new Motercycle();
		motercycle.twoRims();
		motercycle.twoTires();
	}

}
