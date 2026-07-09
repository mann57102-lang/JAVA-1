class Main {
    public static void main(String[] args) {

        boolean hasTicket = true;
        boolean hasID = false;

        if (hasTicket) {
            if (hasID) {
                System.out.println("You can enter the event.");
            } else {
                System.out.println("Please show your ID card.");
            }
        } else {
            System.out.println("You need to buy a ticket first.");
        }
    }
}
