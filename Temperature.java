import java.util.Scanner;

class TempConverter {

    public double converter(double temp, String unit) {
        if (unit.equalsIgnoreCase("C")) {
            return (temp * 9 / 5) + 32;
        } else if (unit.equalsIgnoreCase("F")) {
            return (temp - 32) * (5 / 9);
        } else {
            return -1;
        }
    }
}

public class Temperature {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the unit to convert from (C/F): ");
        String unit = sc.nextLine();
        System.out.print("Enter the temperature value: ");
        double temperature = sc.nextDouble();
        TempConverter tc = new TempConverter();
        double result = tc.converter(temperature, unit);
        if (result == -1) {
            System.out.println("Enter the valid Units");
        } else {
            System.out.println("The temperature of " + temperature + " " + unit + " is " + result + " in other unit");
        }
        sc.close();
    }
}
