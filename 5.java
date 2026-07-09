import java.util.Scanner;

class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = input.nextLine();
        System.out.println("Name: " + name);

        System.out.print("Enter your age: ");
        int age = input.nextInt();
        System.out.println("Age: " + age);

        System.out.print("Enter your height (in cm): ");
        double height = input.nextDouble();
        System.out.println("Height: " + height + " cm");

        input.close();
    }
}
