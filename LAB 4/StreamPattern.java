//import java.util.*;
public class StreamPattern {
    public static void main(String[] args) {
       // Scanner sc= new Scanner(System.in);
        String str="Stream";
        for(int i=0; i<=str.length();i++){
            for(int j=0;j<i;j++){
                System.out.print(str.charAt(j));
            }
            System.out.println("");
        }
    }
}
