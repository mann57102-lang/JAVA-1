class Main {
    public static void main(String[] args) {

        int x = 24;
        int y = 6;

        int addition = x + y;
        int subtraction = x - y;
        int multiplication = x * y;
        int division = x / y;
        int remainder = x % y;

        String heading = "======= Calculator Results =======";

        System.out.println(heading);

        System.out.println("First Number : " + x);
        System.out.println("Second Number: " + y);

        System.out.println("\n--- Method 1 ---");
        System.out.println("Addition = " + addition);
        System.out.println("Subtraction = " + subtraction);
        System.out.println("Multiplication = " + multiplication);
        System.out.println("Division = " + division);
        System.out.println("Remainder = " + remainder);

        System.out.println("\n--- Method 2 ---");
        System.out.println("Addition = " + (x + y));
        System.out.println("Subtraction = " + (x - y));
        System.out.println("Multiplication = " + (x * y));
        System.out.println("Division = " + (x / y));
        System.out.println("Remainder = " + (x % y));

        System.out.println("\nSummary:");
        System.out.println(
            "Add: " + addition +
            " | Sub: " + subtraction +
            " | Mul: " + multiplication +
            " | Div: " + division
        );
    }
}
