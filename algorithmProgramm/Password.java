package algorithmProgramm;
import java .util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Password {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter password");
		String password = sc.next();
		String regex = "^[A-Za-z@#*]+[0-9]$";
		
		Pattern p = Pattern.compile(regex);
		Matcher match = p.matcher(password);
		
		if (match.matches()) {
			System.out.println("password is correct");
		}else {
			System.out.println("Invalid password");
		}
	}

}
