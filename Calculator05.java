class Calculator {

    public int add(int a, int b) {
        return a + b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int square(int a) {
        return a * a;
    }
}

public class Calculator05 {
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        // 1. Calculate (3 * 4 + 5 * 7)^2
        int part1 = cal.multiply(3, 4);
        int part2 = cal.multiply(5, 7);
        int sum1 = cal.add(part1, part2);
        int result1 = cal.square(sum1);

        System.out.println("Result of (3*4 + 5*7)^2: " + result1);

        // 2. Calculate (4 + 7)^2 + (8 + 3)^2
        int sum2 = cal.add(4, 7);
        int sum3 = cal.add(8, 3);
        int square2 = cal.square(sum2);
        int square3 = cal.square(sum3);
        int result2 = cal.add(square2, square3);

        System.out.println("Result of (4 + 7)^2 + (8 + 3)^2: " + result2);
    }
}
