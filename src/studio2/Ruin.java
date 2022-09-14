package studio2;

import java.util.Scanner;

public class Ruin 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub

		Scanner in = new Scanner(System.in);
		System.out.println("What is the start amount");
		double startAmount = in.nextDouble();

		System.out.println("What is the chance of winning?");
		double winChance = in.nextDouble();

		System.out.println("What is your win limit?");
		double winLimit = in.nextDouble();
		
		System.out.println("How many days to simulate?");
		int totalSimulations = in.nextInt();

		
			int games = 0;
			double x = Math.random();
			boolean y = (x < winChance);
			
		for(int completedSims = 0; completedSims<=totalSimulations; completedSims++)
		{
				
			while (0 < startAmount && startAmount < winLimit) 
			{
				if (x < winChance) 
				{
	
					startAmount++;
					games++;
					
				} 
				else 
				{
					startAmount--;
					games++;
				}
				
				
			}
			
			if (startAmount==winLimit)
			{
				System.out.println("You win");
			}
			
			else
			{System.out.println("You lose");
			}
			System.out.println(completedSims);
		}
		
		
	}

}
