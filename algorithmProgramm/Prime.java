package algorithmProgramm;

public class Prime {
	public static void prime() {
		boolean b;
		for (int j = 2; j <= 1000; j++) {
			b = true;
			for (int i = 2; i < j / 2; i++) {
				if (j % i == 0) {
					b = false;
					break;
				}
			}
			if (b) 
				System.out.print(j + " ");
		}
	}
		public static void main(String[] args) {
			System.out.println("prime between 0 to 1000");
			prime();
	}
}
