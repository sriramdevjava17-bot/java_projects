import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter desired password length: ");
            int length = sc.nextInt();

            System.out.print("Include lowercase? (Y/N): ");
            boolean includeLower = sc.next().equalsIgnoreCase("Y");

            System.out.print("Include uppercase? (Y/N): ");
            boolean includeUpper = sc.next().equalsIgnoreCase("Y");

            System.out.print("Include numbers? (Y/N): ");
            boolean includeNumber = sc.next().equalsIgnoreCase("Y");

            System.out.print("Include special characters? (Y/N): ");
            boolean includeSpecial = sc.next().equalsIgnoreCase("Y");

            String lower = "abcdefghijklmnopqrstuvwxyz";
            String upper = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
            String numbers = "0123456789";
            String special = "!@#$%^&*()_+-={}[]:;<>,.?/";

            String charSet = "";

            if (includeLower) charSet += lower;
            if (includeUpper) charSet += upper;
            if (includeNumber) charSet += numbers;
            if (includeSpecial) charSet += special;

            if (charSet.isEmpty()) {
                System.out.println("You must select at least one character type!");
                return;
            }

            StringBuilder password = new StringBuilder();
            Random random = new Random();

            for (int i = 0; i < length; i++) {
                int index = random.nextInt(charSet.length());
                password.append(charSet.charAt(index));
            }

            System.out.println("Generated Password: " + password);
        }
    }
}
