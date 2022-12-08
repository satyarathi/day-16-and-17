package algorithmProgramm;

public class Bubblesort {
public static void main(String[] args) {
	String[] arr ={"Anil","Disuza","Fido","Eminem","Hrk","Karun","India"};

	String temp;

	for (int i = 0; i < arr.length - 1; i++) {
        for (int j = 0; j < arr.length - i - 1; j++) {
            if (arr[j].compareTo(arr[j + 1])>0) {
              
                temp = arr[j];
                arr[j] = arr[j + 1];
                arr[j + 1] = temp;
               
            }
        }
	}

for (int i = 0; i < arr.length; i++) {
	
	System.out.print(arr[i]+" ");
}
}
}
