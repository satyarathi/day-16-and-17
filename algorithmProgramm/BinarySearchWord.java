package algorithmProgramm;

public class BinarySearchWord {
	public static int search(String[] arr, String key) {
	int start= 0;
	int end= arr.length-1;
	int mid;
	while (start <= end) {
		
		mid = start+( end-start) / 2;
		int a = (key).compareTo(arr[mid]);
		if (a == 0) 
			return mid;
		
		if (a > 0)
			start = mid + 1;
		
		else 
			end = mid - 1;
		
	}
	return -1;
	}

	public static void main(String[] args) {
		
		String[] arr = {"Anil","Coorg","Dane","Eminem","Hrithik","Jagga","Loren"};
		String key = "Eminem";
		int result = search(arr, key);
		
		if (result == -1)
			System.out.println("Element not found");
		else
			System.out.println(key+" found at "+result+"rd index");
	}
}



