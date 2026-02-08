// d) Another class with main method
public class Demo {
    public static void main(String[] args) {

        // create an object of EvenOddNumber class
        EvenOddNumber check = new EvenOddNumber();

        // e) Call the findEvenOrOdd() method and display results
        int[] numbers = {10, 23, 56, 77, 90};

        for (int num : numbers) {
            if (check.findEvenOrOdd(num)) {
                System.out.println(num + " is an Even number");
            } else {
                System.out.println(num + " is an Odd number");
            }
        }
    }
}
