package eg1;

public class first_value_and_last_value {

	public static void main(String[] args) {
		int[] arr = {101,22,344,699};
		isFirstAndLastValue(arr);

	}
	
	
	public static void isFirstAndLastValue(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int n = arr[i];
			int last_Digit = 0;
			last_Digit = n%10;
			while(!(n > 0 && n <= 9)) {
				n=n/10;
			}
			if(n==last_Digit) {
				System.out.println(arr[i]);
			}
		}
	}

}
