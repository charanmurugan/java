public class LogicalOperators {
    public static void main(String[] args) {
        int age = 1270;
        boolean voting_registered = false;
        if (age >= 18 && voting_registered) {
            System.out.println("You can vote");
        } else if (age >= 18) {
            System.out.println("You can vote , register soon");
        } else {
            System.out.print("You are not eligible");
        }
    }
}
