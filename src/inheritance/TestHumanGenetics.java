package inheritance;

public class TestHumanGenetics {

	public static void main(String[] args) {
		GrandMother gm = new GrandMother();
		gm.chief();
		
		Mother mother = new Mother();
		mother.blackHair();
		mother.chief();
		
		GrandDaughter gd = new GrandDaughter();
		gd.hobby();
		gd.chief();
		gd.blackHair();

	}

}
