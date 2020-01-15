//Write a java program to find the minimum value of an array

public class MinimumValue {

	public static void main (String[] args) {
	
	int [] arr = {4, 2, 6, 5, 1};
	
	int min = arr[0];
	for(int i =1; i < arr.length; i++) {
			if(min > arr[i]){
				min = arr[i];
			}
			
	}
	    System.out.println(min);
	}

}
