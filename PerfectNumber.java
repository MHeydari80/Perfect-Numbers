package perfectnumber;

import java.util.Scanner;

public class PerfectNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer :\t");

        int value = input.nextInt();
        int sum = 0;

        if (value <= 0) {

            System.out.printf("[%d] is a perfect number!", value);

        } else {
            for (int i = value; --i > 0;) {

                if (value % i == 0) {

                    sum += i;

                }

            }

            if (sum == value) {

                System.out.printf("[%d] is a perfect number!", value);

            } else {

                System.out.printf("[%d] is not a perfect number!", value);

            }
        }

        System.out.println("\n");
    }

}
