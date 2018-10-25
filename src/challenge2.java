
public class challenge2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//challenge 2
		int [] array1 = {1,3,2,4,6,7,5,8,10};
		int sum = 0; 	
		for(int i=0; i< array1.length; i++) {
			sum = sum + array1[i];
		}
		int missing = 55 - sum;
		System.out.print("The missing number is " + missing);
	}

}
