public class Sorting{
	
	public static void main(String[] args) {
		int[] test = {8,3,7,8,7,1,0};
		int[] fixed = selectionSort(test);
		int[] fixed1 = insertionSort(test);
		int[] fixed2 = bubbleSort(test);
		
		if (isSorted(fixed)) {
			System.out.println("Selection");
			print(fixed);
		}
		if (isSorted(fixed1)) {
			System.out.println("Insertion");
			print(fixed1);
		}
		// if (isSorted(fixed2)) {
		// 	System.out.println("Bubble");
		// 	print(fixed2);
		// }

	}

	public static int[] selectionSort(int[] test){
		for (int i=0, k = test.length-1; i<test.length; i++, k--) {
			for (int j=0; j<test.length; j++) {
				if (test[j] < test[i]) {
					int first = test[i];
					test[i] = test[j];
					test[j] = first;
				}
			}
			int second = test[i];
			test[i] = test[k];
			test[k] = second;
			print(test);


		}
		return test;
	}

	public static int[] insertionSort(int[] test){
		for (int i=0; i<test.length-1 ; i++) {
			if (test[i] > test[i+1]) {
				int first = test[i];
				test[i] = test[i+1];
				test[i+1] = first;
				
			}
			print(test);
		}
		return test;


	}

	public static int[] bubbleSort(int[] test){
		for (int i=0; i<test.length-1 ; i++) {
			if (test[i] > test[i+1]) {
				int first = test[i];
				test[i] = test[i+1];
				test[i+1] = first;
				print(test);
			}

		}
		return test;

	}


	public static void print(int[] test){
		for (int i=0; i<test.length; i++) {
			System.out.print(test[i] + " ");
		}
		System.out.println();
	}

	public static boolean isSorted(int[] test){
		for (int i=1; i<test.length; i++) {
			if (test[i] < test[i-1]) {
				return false;
			}
		}
		return true;

	}
}