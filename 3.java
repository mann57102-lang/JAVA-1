class Main {
    public static void main(String[] args) {

        int x = 15;
        int y = 8;

        System.out.println("======= Java Operators Demo =======");

        // Unary Operators
        System.out.println("Post Increment : " + (x++));
        System.out.println("Pre Increment  : " + (++y));

        // Binary Operators
        System.out.println("\nBinary Operators");
        System.out.println("5 + 10 = " + (5 + 10));
        System.out.println("20 - 7 = " + (20 - 7));
        System.out.println("6 * 4 = " + (6 * 4));
        System.out.println("18 / 3 = " + (18 / 3));

        int result = ++x * y++;
        System.out.println("Expression Result: " + result);

        System.out.println("Current value of x: " + x);
        System.out.println("Current value of y: " + y);

        // Ternary Operator
        System.out.println("\nTernary Operator");
        int greater = (x > y) ? x : y;

        System.out.println("Greater Number: " + greater);
    }
}
