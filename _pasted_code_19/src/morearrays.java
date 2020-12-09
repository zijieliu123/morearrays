
public class morearrays {

		
	public void avg(int[] arr) {
		double sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
	}
	
	public void negpos(int[] arr, String[] ar) {
		
		for (int i = 0; i < arr.length; i++) {
			if (i > 0) {
				ar[i].equals("pos");
				}
			else {
				ar[i].equals("neg");
			}
		}
		
}
		
	
	
	public void twoarrays(int[] arr1, int[] arr2) {
		
		for (int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; i++) {
				
				arr1[1] = arr2[0];
				
			}
			
			
		}
		
		
	}
	
	public void containornot(String[] arr) {
		
		for (int i = 0; i < arr.length; i++) {
			if (arr[i].equals("c")) {
				System.out.println("found");
			}
			else {
				System.out.println("not found");
			}
		}
		
		
	}
	
	public void location(String[] arr, String keyword) {
		
		for (int i = 0; i < arr.length; i++) {
			
			if (arr[i].equals(keyword)) {
				System.out.println(i);
				
			}
		}
		
	}
	
	

	public void duplicates(int[] arr1, int[] arr2) {
		
		for (int i = 0; i < arr1.length; i++) {
			
			for (int j = 0; j < arr2.length; j++) {
				
				if (arr2[j] == arr1[i]) {
					System.out.println(arr2[j]);
				}	
			}
		}
		
	}	
		
	
	
	
	
	
	
}


