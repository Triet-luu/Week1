import java.util.Scanner;

public class Lab {
    private static Scanner scanner = new Scanner(System.in);
    private static double CONVERSION = 1.609;
    public static void main(String[] args) {
        System.out.print("Choose an option (1-9): ");
        String receiver = scanner.next();
        switch (receiver) {
            case "1":
                Exercise1();
                break;
            case "2":
                Exercise2();
                break;
            case "3":
                Exercise3();
                break;
            case "4":
                Exercise4();
                break;
            case "5":
                Exercise5();
                break;
            case "6":
                Exercise6();
                break;
            case "7":
                Exercise7();
                break;
            case "8":
                Exercise8();
                break;
            case "9":
                Exercise9();
                break;
            default:
                System.out.println("Program exits.");
                break;
        }
    }

    private static void Exercise1() {
        System.out.println("    J      A      V     V      A");
        System.out.println("    J     A A      V   V      A A");
        System.out.println("J   J    AAAAA      V V      AAAAA");
        System.out.println(" J J    A     A      V      A     A");
    }

    private static void Exercise2() {
        System.out.print("Input a Celsius value: ");
        double Celsius = scanner.nextDouble();

        double Fahrenheit = (9.0/5) * Celsius + 32;

        System.out.println("Fahrenheit value is: " + Fahrenheit);
    }

    private static void Exercise3() {
        int number;
        do {
            System.out.print("Input a value: ");
            number = scanner.nextInt();
        } while (number < 0);

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }

        System.out.println("The sum of all digits in integer is: " + sum);
    }

    private static void Exercise4() {
        System.out.print("Input first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Input second integer: ");
        int num2 = scanner.nextInt();
        System.out.print("Input third integer: ");
        int num3 = scanner.nextInt();

        int temp = 0;
        if (num1 > num2 && num1 > num3) {
            if (num2 > num3) {
                temp = num3;
                num3 = num1;
                num1 = temp;
            } else {
                temp = num3;
                num3 = num1;
                num1 = num2;
                num2 = temp;
            }
        }

        if (num2 > num1 && num2 > num3) {
            if (num1 > num3) {
                temp = num3;
                num3 = num2;
                num2 = num1;
                num1 = temp;
            } else {
                temp = num3;
                num3 = num2;
                num2 = temp;
            }
        }

        if (num3 > num1 && num3 > num2) {
            if (num1 > num2) {
                temp = num2;
                num2 = num1;
                num1 = temp;
            }
        }

        System.out.println("\n" + "Ascending order:" + "\n" + num1 + "\n" + num2 + "\n" + num3);
    }

    private static void Exercise5() {
        System.out.print("Input an integer: ");
        int number = scanner.nextInt();

        if (number % 5 == 0 && number % 6 == 0) {
            System.out.println(number + " is divisible by both 5 and 6");
        } else if (number % 5 == 0 || number % 6 == 0) {
            System.out.println(number + " is divisible by 5 or 6, but not both");
        } else {
            System.out.println(number + " is not divisible by either 5 or 6");
        }
    }

    private static void Exercise6() {
        System.out.print("Input circle 1 values: ");
        double cir1_x_cor = scanner.nextDouble();
        double cir1_y_cor = scanner.nextDouble();
        double rad1 = scanner.nextDouble();
        System.out.print("Input circle 2 values: ");
        double cir2_x_cor = scanner.nextDouble();
        double cir2_y_cor = scanner.nextDouble();
        double rad2 = scanner.nextDouble();

        System.out.println("Enter circle1's center x-, y-coordinates, and radius: " + cir1_x_cor + "\t" + cir1_y_cor + "\t" + rad1 + "\n" +
                "Enter circle2's center x-, y-coordinates, and radius: " + cir2_x_cor + "\t" + cir2_y_cor + "\t" + rad2);

        double distance = Math.sqrt((cir2_x_cor - cir1_x_cor)*(cir2_x_cor - cir1_x_cor) +
                (cir2_y_cor - cir1_y_cor)*(cir2_y_cor - cir1_y_cor)) ;

        if (distance <= Math.abs(rad1 - rad2)) {
            System.out.println("Circle 2 is inside circle 1");
        } else if (distance <= rad1 + rad2)
            System.out.println("Circle 2 overlaps circle 1");
    }

    private static void Exercise7() {
        System.out.println("Miles\tKilometers\t|\tKilometers\tMiles");
        for (int miles = 1; miles < 11; miles++) {
            System.out.printf("%2d\t\t%5.2f\t\t|\t\t%d\t\t%.2f%n",
                    miles, miles * CONVERSION, 20 + (miles - 1) * 5, (20 + (miles - 1) * 5) / CONVERSION);
        }
    }

    private static void Exercise8() {
        int count = 0;
        for (int num = 100; num <= 200; num++) {
            if (num % 5 == 0 || num % 6 == 0) {
                System.out.print(num + "\t");
                count++;
                while (count == 10) {
                    System.out.print("\n");
                    count = 0;
                }
            }
        }
    }

    private static void Exercise9() {
        int number;
        int digital;
        do {
            System.out.print("Enter the number of lines: ");
            number = scanner.nextInt();
        } while (number < 0);

        for (int row = 1; row <= number; row++) {

            for (int col = 1; col <= number - row; col++) {
                System.out.print(" \t");
            }

            // Input numbers to the rows and columns created in descending order
            for (digital = row; (digital - 1) >= 0; digital--) {
                System.out.print(digital + "\t");
            }

            // Input numbers to the rows and columns created in ascending order
            for (int n = (digital + 1); ((n != row)) && (n >= 1); n++ ) {
                System.out.print((n + 1) + "\t");
            }
            System.out.println();
        }

    }
}

