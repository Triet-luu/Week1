import java.util.Scanner;

public class Wk1 {
    static Scanner input = new  Scanner(System.in);
    public static void main(String[] args) {
        int number;
        do {
            System.out.print("Enter the number of lines: ");
            number = input.nextInt();
        } while (number < 0);

        for (int row = 1; row <= number; row++) {
            for (int col = 1; col <= number - row; col++){
                System.out.print(col);
            }

            for (int)
        }
    }
}
