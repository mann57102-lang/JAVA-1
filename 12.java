import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int value;
        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        char option;

        do {

            System.out.print("Enter a value: ");
            value = input.nextInt();

            if (value > highest) {
                highest = value;
            }

            if (value < lowest) {
                lowest = value;
            }

            System.out.print("Do you want to enter another value? (y/n): ");
            option = input.next().charAt(0);

        } while (option == 'y' || option == 'Y');

        System.out.println("\nHighest Value: " + highest);
        System.out.println("Lowest Value: " + lowest);

        input.close();
    }
}
