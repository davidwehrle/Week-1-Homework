
public class p2 {

	public static void main(String[] args) {
	
		int a = 1;
		int b = 1;
		int c = 0;
		double sum = 0;
		while(c<4000000)
		{
			c=a+b;
			if((c%2)==0)
				sum+=c;
			
			a=b;
			b=c;
		}
		
		System.out.println(sum);
	}

}
