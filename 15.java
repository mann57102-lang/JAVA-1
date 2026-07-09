import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter starting number: ");
        int start = input.nextInt();

        System.out.print("Enter ending number: ");
        int end = input.nextInt();

        System.out.println("Prime Numbers:");

        for (int number = start; number <= end; number++) {

            boolean prime = true;

            if (number < 2) {
                prime = false;
            } else {

                for (int i = 2; i <= number / 2; i++) {
                    if (number % i == 0) {
                        prime = false;
                        break;
                    }
                }

            }

            if (prime) {
                System.out.println(number);
            }
        }

        input.close();
    }
}
