

public class pattern10 {
    public static void main(String[] args) {
        // First half
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Second half
        for (int i = 1; i < 5; i++) {
            for (int j = 1; j <= 5 - i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
