package algorithmProgramm;

public class InsertionSort {
	public static void main(String[] args) {
		String[] arr ={"A","D","F","E","H","K","I"};


		String temp;
		int j = 0;

		for (int i = 1; i < arr.length; i++) {
			temp = arr[i];
			j = i - 1;
			while (j >= 0 && arr[j].compareTo(temp) > 0) {
				arr[j + 1] = arr[j];
				j = j - 1;
			}
			arr[j + 1] = temp;
		}
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
}


