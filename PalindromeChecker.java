
import java.util.Scanner;


public class PalindromeChecker {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        String rev = sb.reverse().toString();
        if(str.equalsIgnoreCase(rev)){
            System.out.println("palindrome");
        }
        else{
            System.out.println("not palindrome");
        }
        sc.close();
    }
}
