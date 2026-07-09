import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your score: ");
        int score = input.nextInt();

        if (score >= 90) {
            System.out.println("Excellent");
        } else if (score >= 75) {
            System.out.println("Very Good");
        } else if (score >= 60) {
            System.out.println("Good");
        } else if (score >= 40) {
            System.out.println("Average");
        } else {
            System.out.println("Needs Improvement");
        }

        input.close();
    }
}
