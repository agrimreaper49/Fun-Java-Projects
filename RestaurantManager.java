package newProject;

public class RestaurantManager {
	
	
	public static void main (String[] args)
	{
		System.out.println("Restaurant manager initalized");
		Subway gainesville = new Subway( 50 , "whole wheat", "sprite" );
		Subway haymarket = new Subway (75 , "italian", "coke" );
		gainesville.trainEmployees();
		((Subway)gainesville).getTypeOfBread();
//		System.out.println("chicken = " + gainesville.getChickenQuantity());
//		System.out.println("bread at haymarket is " + haymarket.getTypeOfBread());
//		Meal Classic = new Meal ( "Buffalo Chicken", "Whole Wheat" , "Diet Coke");
//		
//		Person Agrim = new Person (253467892, "whole wheat" , 
//				"Oven Roasted chicken", "553-23-776");
		
	}
	
	
}

class Restaurant extends RestaurantManager
{
	private double [] prices = { 15.0, 16.0, 14.0, 13.0, 2.0 };
	private int numTables;
	private String[] mealNames = { "footlong" , "3 inch sub ", 
			"6 inch sub" , "sandwich" , "sliders" };
	
	
	public Restaurant(double [] prices, int numTables, String[] mealNames )
	{
		System.out.println("Initialized");
		this.prices =  prices;
		this.numTables = numTables;
		this.mealNames = mealNames;
	}
	
	public double getPrice (  int index )
	{
		return prices[index];
	}
	public void trainEmployees()	{
	// run employees training methods
	System.out.println("employees are now trained");
	
	}
}

class Subway extends Restaurant 
{
	
	private double chickenQuantity;
	private String typeOfBread;
	private String Soda;
	
	public Subway ( double chickenQuantity, String typeOfBread, String Soda )
	{
		super ( new double [] {10 ,10 ,10 ,10 ,10, 10}, 4, 
				new String[] {"footlong 1", "footlong 2", "footlong 3", "footlong 4", "footlong 5"});
		System.out.println("Subway Intitalized");
		this.chickenQuantity = chickenQuantity;
		this.typeOfBread = typeOfBread;
		this.Soda = Soda;
		
	}
	
	public String getTypeOfBread() 
	{
		return typeOfBread;
	}

	public double getChickenQuantity()
	{
		return chickenQuantity;
	}
	public String getSoda()
	{
		return Soda;
	}
	public void trainEmployees()
	{
		//special subway training method
		System.out.println("subway employee are now trained");
		
	}
	
}

class Meal extends Subway {
	
	private String typeOfChicken;
	private String typeOfBread;
	private String typeOfSoda;
	
	
	public Meal( String typeOfChicken, String typeOfBread, String typeOfSoda) {
		
		super ( 50.0 , "italian herbs and cheese", "fanta");
		this.typeOfChicken = typeOfChicken;
		this.typeOfBread = typeOfBread;
		this.typeOfSoda = typeOfSoda;
		
	}
	
	public String getTypeOfChicken()
	{
		return typeOfChicken;
	}
	public String getTypeOfBread()
	{
		return typeOfBread;
	}
	public String getTypeOfSoda()
	{
		return typeOfSoda;
	}
}

class Person extends Meal {
	
	private int creditCardNumber;
	private String name;
	private String mealName;
	private String socialSecurityNumber;
	
	Person (  int creditCardNumber , String name , String mealName, String socialSecurityNumber )
	{
		super ( "buffalo chicken" , "italian herbs and cheese", "fanta");
		this.creditCardNumber = creditCardNumber;
		this.name = name;
		this.mealName = mealName;
		this.socialSecurityNumber = socialSecurityNumber;
		
	}
	public int getCreditCardNumber()
	{
		return creditCardNumber;
	}
	public String getName()
	{
		return name;
	}
	public String getMealName()
	{
		return mealName;
	}
	public String getSocialSecurityNumber() 
	{
		return socialSecurityNumber;
	}
	
	
}

