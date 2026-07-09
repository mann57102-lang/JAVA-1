import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a positive number: ");
        int number = input.nextInt();

        System.out.print("Prime Factors: ");

        int factor = 2;

        while (factor <= number) {

            if (number % factor == 0) {
                System.out.print(factor + " ");
                number = number / factor;
            } else {
                factor++;
            }

        }

        input.close();
    }
}
