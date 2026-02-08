// a) Create a class called EvenOddNumber
public class EvenOddNumber {

    // b) Method to check whether a number is even or odd
    // c) Returns a boolean value: true if even, false if odd
    public boolean findEvenOrOdd(int i) {

        // if the remainder when divided by 2 is 0, it’s even
        if (i % 2 == 0) {
            return true;   // even
        } else {
            return false;  // odd
        }
    }
}
