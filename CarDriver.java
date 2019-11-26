public class CarDriver 
{
	private static final int capacityOfTank = 421;
	private static final int speedLimit = 55;
	private static boolean speeding;
	private static boolean gasLeft;
	
	public static void main ( String[]args )
	{
		int gasInTank = (int)(Math.random()*421);
		int speed = (int)(Math.random()*71);
		
		if( gasInTank == 0 )
		{
			gasLeft = false;
			gasInTank+=500;
		}
		else if ( gasInTank <= 150 )
		{
			System.out.println("There is low fuel in tank: " + gasInTank);
		}
		else
		{
			gasLeft = true;
			System.out.println("The amount of gas remaining is high: " + gasInTank);
		}
		if (speed > speedLimit)
		{
			speeding = true;
			System.out.print("Speed was " + speed );
			System.out.println("You will be caught by a cop");
		}
		else
		{
			System.out.print("Speed was " + speed );
			speeding = false;
		}
	}

}

class Person extends CarDriver
{
	
}
