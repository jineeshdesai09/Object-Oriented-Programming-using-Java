import java.util.*;
public class PalindromeString {
    public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String :");
		String str=sc.next();
 		String rev="";
		for(int i=0; i<str.length(); i++){
			rev = str.charAt(i) + rev;
		}
		if(str.equalsIgnoreCase(rev)){
			System.out.println("Given Word is palindrome");
		}
		else{
			System.out.println("Given Word is not palindrome");
		}
	}
}