package main;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CalculatePrimeNumbers 
{

	public static void main(String[] args) 
	{
	    char choice = 'Y';
		int userInput = 0;
		
		
		while(choice =='Y')
		{
			@SuppressWarnings("resource")
			Scanner input = new Scanner(System.in);
			System.out.print("****** Welcome to the Sieve of Erastosthenes ******");
		    System.out.println();
		    System.out.print("************** Enter a Number to Play *************");
		    System.out.println();
			
			try 
			{
				userInput = Integer.parseInt(input.nextLine());
				System.out.print("These are the prime numbers less than '" + userInput +"'");
				List<Integer> calculatePrimes = calculatePrimes(userInput);
				System.out.println();
	        
				for (Integer integer : calculatePrimes) 
				{
		            System.out.println(integer);
		        }
		        
				if (calculatePrimes.size()<1)
				{
					System.out.println("There are no prime numbers less than " 
							+ userInput);
				}
				
			}
			catch (java.lang.NullPointerException nullE)
			{
				System.out.println("You must Enter an Integer");
			}
			catch (java.lang.NumberFormatException formatE)
			{
				System.out.println("You must Enter an Integer");
			}
			finally 
			{
			System.out.println("Would you like to try again? (Y/N)");
			choice = Character.toUpperCase(input.next().charAt(0));
			if(choice !='Y'&& choice !='N')
		    {
				System.out.println("Please choose 'Y' or 'N' ");
		    }
			
			}
		}

	}
	
	public static List<Integer> calculatePrimes(int n) 
	{
        
		// isPrime false by default
		boolean[] isPrime = new boolean[n + 1]; 
        List<Integer> primes = new ArrayList<Integer>();
        
        for (int i = 2; i < n; i++) 
        {
            isPrime[i] = true;
        }
        
        for (int i = 2; i < n; i++) 
        {
            if (isPrime[i]) 
            {
                primes.add(i);
                
                // identifies non-prime numbers
                for (int j = i; j * i <= n; j++) 
                {
                    isPrime[i * j] = false;
                }
            }

        }

        return primes;
    }


}
