public class PatternPrint04 {
    public static void main(String[] args) {

        int rows = 5;
        int i = 0;

        // First pattern (square)
        while (i < rows) {
            int j = 0;
            while (j < rows) {
                System.out.print("*");
                j++;
            }
            System.out.println();
            i++;
        }

        System.out.println();

        // Second pattern (right-aligned triangle)
        for (i = 1; i <= rows; i++) {

            for (int s = 1; s <= rows - i; s++) {
                System.out.print(" ");
            }

            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
