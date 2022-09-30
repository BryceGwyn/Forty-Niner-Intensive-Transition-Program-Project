import java.util.Scanner;

public class Project1 
{

	public static void main(String[] args) 
	{
		Scanner inp = new Scanner(System.in);
		System.out.println("Please enter your Package Number: ");
		int packageNumber = inp.nextInt ();
		System.out.println("Please enter # of hours used: ");
		int hours = inp.nextInt ();
		int extraHours;
		double extraCost;
		double totalCost;
		
		
		if (packageNumber == 1)
		{
			if (hours > 10)
			{
				extraHours = hours - 10;
				extraCost = extraHours * 2.0;
				totalCost = 9.95 + extraCost;	
			}
			else
			{
				totalCost = 9.95;
			}
			System.out.println("Summary:\n   Package#: " + packageNumber + "\n   Number of hours used: " + hours + "\n   Total Charges: $" + totalCost);
		}
		else if (packageNumber == 2)
		{
			if (hours > 20)
			{
				extraHours = hours - 20;
				extraCost = extraHours * 1.0;
				totalCost = 13.95 + extraCost;				
			}
			else
			{
				totalCost = 13.95;
			}
			System.out.println("Summary:\n   Package#: " + packageNumber + "\n   Number of hours used: " + hours + "\n   Total Charges: $" + totalCost);

		}
		else if (packageNumber == 3)
		{
			totalCost = 19.95;
			System.out.println("Summary:\n   Package#: " + packageNumber + "\n   Number of hours used: " + hours + "\n   Total Charges: $" + totalCost);
				
		}
		

	} //end main ()

}// end class
