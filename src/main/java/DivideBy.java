public class DivideBy {

    public static boolean isLeapYear(int year) {
        // Her var det en lang if, men kortet kraftig ned pga refactoring.
        return (year % 4 == 0 && year % 100 > 0 || year % 400 == 0);
    }

}
