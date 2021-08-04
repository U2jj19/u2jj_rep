package eg1;

import java.util.Arrays;

public class remove_all_duplicates {
	
	public static void main(String[] args) {
		
		int[] arr1 = {3, 1, 2, 3, 4, 5, 1, 6, 2, 2};
		remove_duplicates_value(arr1);
	}
	
	public static void remove_duplicates_value(int[] arr1) {
		
		int[] arr2 = new int[arr1.length];
		int j = 0;
		Arrays.sort(arr1);
		for (int i = 0; i < arr1.length-1; i++) {
			if(arr1[i] != arr1[i+1]) {
				arr2[j++] = arr1[i];
			}
		}
		arr2[j++] = arr1[arr1.length-1];
		
		for (int i = 0; i < j; i++) {
			System.out.print(arr2[i]+ " ");
		}
		
	}

}
