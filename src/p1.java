
public class p1 {

	public static void main(String[] args) {

		int sum = 0;

		for(int i = 0; i < 1000; i++)
		{ 
			if(i % 3 == 0 || i % 5 == 0) //checks to see if it is divisible by 3
				
				{
				sum += i;
				}
		}		
		
			System.out.println("All Natural Numbers Below 1000: " + sum);
	}
}



