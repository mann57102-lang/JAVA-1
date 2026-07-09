import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Enter a number from 1 to 5
        System.out.print("Enter your choice (1-5): ");
        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Apple");
                break;

            case 2:
                System.out.println("Banana");
                break;

            case 3:
                System.out.println("Orange");
                break;

            case 4:
                System.out.println("Mango");
                break;

            case 5:
                System.out.println("Grapes");
                break;

            default:
                System.out.println("Invalid choice! Please enter a number from 1 to 5.");
        }

        input.close();
    }
}
