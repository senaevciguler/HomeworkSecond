//write a java program to count the number of even integers in a given array of integers

public class EvenIntegers{

	public static void main (String[] args) {
		
		int [] arr = {8 , 10 , 7 , 5};

		int count = 0;
		for( int num:arr) {
			if (num % 2 == 0) {
				System.out.println(num);
				count = count + 1;
			}
			
		}
			
			System.out.println("count is: " + count);
			
	}

}
