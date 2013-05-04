import logic.*;


public class Start {

	/**
	 * @param args
	 */
	public static void main(String[] args) 
	{
		
		System.out.println("Welcome to your video game database");
		System.out.println("Please make your selection:");
		System.out.println("For new game entry press 1, to exit press 2.");
		
		Loop l = new Loop();
		l.looping();
		
	}

}
