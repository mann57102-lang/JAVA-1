import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter how many numbers you want to check: ");
        int testCases = input.nextInt();

        for (int i = 1; i <= testCases; i++) {

            System.out.print("Enter value " + i + ": ");
            int number = input.nextInt();

            boolean isPrime = true;

            if (number <= 1) {
                isPrime = false;
            } else {

                for (int j = 2; j <= number / 2; j++) {
                    if (number % j == 0) {
                        isPrime = false;
                        break;
                    }
                }

            }

            if (isPrime) {
                System.out.println(number + " is a Prime Number");
            } else {
                System.out.println(number + " is Not a Prime Number");
            }
        }

        input.close();
    }
}
