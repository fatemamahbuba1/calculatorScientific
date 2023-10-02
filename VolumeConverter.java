import java.util.Scanner;

public class VolumeConverter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Volume Converter");
        int choice;

        do {
            System.out.println("Available Options:");
            System.out.println("1. Milliliters to Cubic Centimeters");
            System.out.println("2. Cubic Centimeters to Milliliters");
            System.out.println("3. Liters to Cubic Meters");
            System.out.println("4. Cubic Meters to Liters");
            System.out.println("5. Teaspoons to Milliliters");
            System.out.println("6. Tablespoons to Milliliters");
            System.out.println("7. Fluid Ounces to Milliliters");
            System.out.println("8. Cups to Milliliters");
            System.out.println("9. Pints to Liters");
            System.out.println("10. Quarts to Liters");
            System.out.println("11. Gallons to Liters");
            System.out.println("12. Cubic Inches to Cubic Centimeters");
            System.out.println("13. Cubic Feet to Cubic Meters");
            System.out.println("14. Quit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    // Milliliters to Cubic Centimeters
                    System.out.print("Enter volume in milliliters: ");
                    double millilitersToCm3 = scanner.nextDouble();
                    double cubicCentimeters = millilitersToCubicCentimeters(millilitersToCm3);
                    System.out.println(millilitersToCm3 + " milliliters is equal to " + cubicCentimeters + " cubic centimeters");
                    break;
                case 2:
                    // Cubic Centimeters to Milliliters
                    System.out.print("Enter volume in cubic centimeters: ");
                    double cm3ToMilliliters = scanner.nextDouble();
                    double milliliters = cubicCentimetersToMilliliters(cm3ToMilliliters);
                    System.out.println(cm3ToMilliliters + " cubic centimeters is equal to " + milliliters + " milliliters");
                    break;
                case 3:
                    // Liters to Cubic Meters
                    System.out.print("Enter volume in liters: ");
                    double litersToCubicMeters = scanner.nextDouble();
                    double cubicMeters = litersToCubicMeters(litersToCubicMeters);
                    System.out.println(litersToCubicMeters + " liters is equal to " + cubicMeters + " cubic meters");
                    break;
                case 4:
                    // Cubic Meters to Liters
                    System.out.print("Enter volume in cubic meters: ");
                    double cubicMetersToLiters = scanner.nextDouble();
                    double liters = cubicMetersToLiters(cubicMetersToLiters);
                    System.out.println(cubicMetersToLiters + " cubic meters is equal to " + liters + " liters");
                    break;
                case 5:
                    // Teaspoons to Milliliters
                    System.out.print("Enter volume in teaspoons: ");
                    double teaspoonsToMilliliters = scanner.nextDouble();
                    double millilitersFromTeaspoons = teaspoonsToMilliliters(teaspoonsToMilliliters);
                    System.out.println(teaspoonsToMilliliters + " teaspoons is equal to " + millilitersFromTeaspoons + " milliliters");
                    break;
                case 6:
                    // Tablespoons to Milliliters
                    System.out.print("Enter volume in tablespoons: ");
                    double tablespoonsToMilliliters = scanner.nextDouble();
                    double millilitersFromTablespoons = tablespoonsToMilliliters(tablespoonsToMilliliters);
                    System.out.println(tablespoonsToMilliliters + " tablespoons is equal to " + millilitersFromTablespoons + " milliliters");
                    break;
                case 7:
                    // Fluid Ounces to Milliliters
                    System.out.print("Enter volume in fluid ounces: ");
                    double fluidOuncesToMilliliters = scanner.nextDouble();
                    double millilitersFromFluidOunces = fluidOuncesToMilliliters(fluidOuncesToMilliliters);
                    System.out.println(fluidOuncesToMilliliters + " fluid ounces is equal to " + millilitersFromFluidOunces + " milliliters");
                    break;
                case 8:
                    // Cups to Milliliters
                    System.out.print("Enter volume in cups: ");
                    double cupsToMilliliters = scanner.nextDouble();
                    double millilitersFromCups = cupsToMilliliters(cupsToMilliliters);
                    System.out.println(cupsToMilliliters + " cups is equal to " + millilitersFromCups + " milliliters");
                    break;
                case 9:
                    // Pints to Liters
                    System.out.print("Enter volume in pints: ");
                    double pintsToLiters = scanner.nextDouble();
                    double litersFromPints = pintsToLiters(pintsToLiters);
                    System.out.println(pintsToLiters + " pints is equal to " + litersFromPints + " liters");
                    break;
                case 10:
                    // Quarts to Liters
                    System.out.print("Enter volume in quarts: ");
                    double quartsToLiters = scanner.nextDouble();
                    double litersFromQuarts = quartsToLiters(quartsToLiters);
                    System.out.println(quartsToLiters + " quarts is equal to " + litersFromQuarts + " liters");
                    break;
                case 11:
                    // Gallons to Liters
                    System.out.print("Enter volume in gallons: ");
                    double gallonsToLiters = scanner.nextDouble();
                    double litersFromGallons = gallonsToLiters(gallonsToLiters);
                    System.out.println(gallonsToLiters + " gallons is equal to " + litersFromGallons + " liters");
                    break;
                case 12:
                    // Cubic Inches to Cubic Centimeters
                    System.out.print("Enter volume in cubic inches: ");
                    double cubicInchesToCm3 = scanner.nextDouble();
                    double cubicCentimetersFromCubicInches = cubicInchesToCubicCentimeters(cubicInchesToCm3);
                    System.out.println(cubicInchesToCm3 + " cubic inches is equal to " + cubicCentimetersFromCubicInches + " cubic centimeters");
                    break;
                case 13:
                    // Cubic Feet to Cubic Meters
                    System.out.print("Enter volume in cubic feet: ");
                    double cubicFeetToCubicMeters = scanner.nextDouble();
                    double cubicMetersFromCubicFeet = cubicFeetToCubicMeters(cubicFeetToCubicMeters);
                    System.out.println(cubicFeetToCubicMeters + " cubic feet is equal to " + cubicMetersFromCubicFeet + " cubic meters");
                    break;
                case 14:
                    System.out.println("Exiting program. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }

        } while (choice != 14);

        scanner.close();
    }

    public static double millilitersToCubicCentimeters(double milliliters) {
        return milliliters;
    }

    public static double cubicCentimetersToMilliliters(double cubicCentimeters) {
        return cubicCentimeters;
    }

    public static double litersToCubicMeters(double liters) {
        return liters * Math.pow(10, -3);
    }

    public static double cubicMetersToLiters(double cubicMeters) {
        return cubicMeters * Math.pow(10, 3);
    }

    public static double teaspoonsToMilliliters(double teaspoons) {
        return teaspoons * 4.92892;
    }

    public static double tablespoonsToMilliliters(double tablespoons) {
        return tablespoons * 14.7868;
    }

    public static double fluidOuncesToMilliliters(double fluidOunces) {
        return fluidOunces * 28.4131;
    }

    public static double cupsToMilliliters(double cups) {
        return cups * 236.588;
    }

    public static double pintsToLiters(double pints) {
        return pints * 0.568261;
    }

    public static double quartsToLiters(double quarts) {
        return quarts * 1.13652;
    }

    public static double gallonsToLiters(double gallons) {
        return gallons * 4.54609;
    }

    public static double cubicInchesToCubicCentimeters(double cubicInches) {
        return cubicInches * 16.3871;
    }

    public static double cubicFeetToCubicMeters(double cubicFeet) {
        return cubicFeet * 0.0283168;
    }
}
