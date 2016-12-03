package abstraction;

public abstract class Cars implements Wagon {
	
    public void woodenWheels(){
    	System.out.println("wagon has wooden wheels");
    }
	
	public void horses(){
		System.out.println("wagon has horses");
	}
	
	public abstract void fourRims();
	
	public abstract void fourTires();
	
	
	
}
