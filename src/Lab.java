import java.util.Scanner;

public class Lab {
    private static Scanner scanner = new Scanner(System.in);
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
                System.out.println("7");
                break;
            case "8":
                System.out.println("8");
                break;
            case "9":
                System.out.println("9");
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

    }
}
