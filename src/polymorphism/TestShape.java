package polymorphism;

public class TestShape {

	public static void main(String[] args) {
		
		Shape shape = new Shape();
		int squareSize = shape.areaOfLand(15, 17, 18, 20);
        System.out.println(squareSize);
        int pentagonSize = shape.areaOfLand(15, 17, 18, 20, 25);
        System.out.println(pentagonSize);
        
        Shape superShape = new SuperShape();
		int superpentagonSize = superShape.areaOfLand(15, 17, 18, 20, 25);
        System.out.println(superpentagonSize);
	}

}
