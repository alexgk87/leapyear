import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner userInput = new Scanner(System.in);

        System.out.println("Year input: ");
        int year = userInput.nextInt();

        if (DivideBy.isLeapYear(year)) {
            System.out.println(year + " is a leap year!");
        }
        else {
            System.out.println(year + " is NOT a leap year!");
        }
    }
}
