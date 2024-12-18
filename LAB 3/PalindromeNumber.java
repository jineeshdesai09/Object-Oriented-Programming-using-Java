/**
 * The PalindromeNumber class checks if a given number is a palindrome or not.
 */
import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        int n,temp=0,sum=0,rem=0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number ");
        n=sc.nextInt();
        temp=n;
        while (n!=0) {
            rem=n%10;
            sum=sum*10+rem;
            n=n/10;
        }
        if (sum==temp) {
            System.out.println("Number is palindrome");
        }
        else{
            System.out.println("Number is not palindrome");
        }
    }
}
