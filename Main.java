public class Main {

    public static void main(String[] args) {
        System.out.printf("%-15s %-15s %-5s %-15s %-15s", "Feet", "Meters", "|", "Meters", "Feet");
        System.out.println("\n-----------------------------------------------------------------");
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%-15s %-15s %-5s %-15s %-15s %n", i, footToMeter(i), "|", (i + 3) * 5, meterToFoot((i + 3) * 5));
        }
        
        return;
    }
    //Converts from feet to meters
    public static double footToMeter(double foot) {
        return 0.305 * foot;
    }

    //converts from meters to feet
    public static double meterToFoot(double meter) {
        return 3.279 * meter;
    }
}