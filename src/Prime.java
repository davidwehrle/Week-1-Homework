
public class Prime {

	public static void main(String[] args) {
		
		int [] primeNumbers = {1, 2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97};
		
		int missing = 0;
		int primeValue = 0;
		for(int i = 0; i<=5; i++){
			if(i != primeNumbers[i]){
				primeValue = primeNumbers[i];
				missing = ++i;
			}
		}
		
		System.out.println(missing);
	}

}
