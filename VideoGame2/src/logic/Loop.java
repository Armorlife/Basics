package logic;
import java.util.ArrayList;
import java.util.Scanner;

public class Loop 
{	
	ArrayList<Data> data = new ArrayList<Data>();
	ArrayList<Number> number = new ArrayList<Number>();
	String title;
	String selection;
	float price;
	
	
	public void looping()
	{
		Scanner k = new Scanner(System.in);
		
		selection = k.next();
		
		System.out.print("Please enter the title of the game: ");
		Data d = new Data(title);
		d.setTitle(k.next());
		
		data.add(new Data(d.getTitle()));
		
		System.out.print("Please enter the cost of the game: ");
		Number n = new Number(price);
		n.setPrice(k.nextFloat());
		
		number.add(new Number(n.getPrice()));
		
		System.out.println("The game you added is: " + d.getTitle());
		System.out.println("The cost of the game was: " + n.getPrice());
		
	}
}
