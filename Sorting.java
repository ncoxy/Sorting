public class Sorting{
	
	public static void main(String[] args) {
		int[] test = {3,1,6,7,1,2};
		int[] test1 = {3,1,6,7,1,2};
		int[] test2 = {3,1,6,7,1,2};
		int[] fixed = selectionSort(test);
		int[] fixed1 = insertionSort(test1);
		int[] fixed2 = bubbleSort(test2);
		
		if (isSorted(fixed)) {
			System.out.println("Selection");
			print(fixed);
		}
		if (isSorted(fixed1)) {
			System.out.println("Insertion");
			print(fixed1);
		}
		if (isSorted(fixed2)) {
			System.out.println("Bubble");
			print(fixed2);
		}

	}

	public static int[] selectionSort(int[] test){
		int placeHolder = 0;
		for (int i=0; i<test.length; i++) {
			int min = test[i];
			for (int k=i; k<test.length; k++) {
				if (test[k] < min) {
					min = test[k];
					placeHolder = k;
				}
			}
			int temp = test[placeHolder];
			test[placeHolder] = test[i];
			test[i] = temp;
			
			
		}
		return test;
	}

	public static int[] insertionSort(int[] test1){
		int min = 0;
		for (int i=1; i<test1.length; i++) {
			min = i;
			for (int x=1-1; x>=0; x--) {
				if (test1[i] < test1[x]) {
					int holder = test1[x];
					test1[x] = test1[i];
					test1[i] = holder;
				}
				i--;
			}
			i = min;
		}
		return test1;


	}

	public static int[] bubbleSort(int[] test2){
		for (int i=0; i<test2.length-1; i++) {
			for (int x=0; x<test2.length-1; x++) {
				if (test2[x] > test2[x+1]) {
					int temp = test2[x+1];
					test2[x+1] = test2[x];
					test2[x] = temp;
				}
			}
		}
		return test2;
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