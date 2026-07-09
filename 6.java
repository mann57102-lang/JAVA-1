import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your marks: ");
        int marks = input.nextInt();

        if (marks >= 40) {
            System.out.println("Congratulations! You passed.");
        } else {
            System.out.println("You need to work harder. Better luck next time!");
        }

        input.close();
    }
}
