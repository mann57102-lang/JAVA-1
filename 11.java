import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the last number: ");
        int limit = input.nextInt();

        int total = 0;

        for (int count = 1; count <= limit; count++) {
            total = total + count;
        }

        System.out.println("The total sum from 1 to " + limit + " is " + total);

        input.close();
    }
}
