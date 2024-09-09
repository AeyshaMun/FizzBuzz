/**
 * Solve the FizzBuzz challenge.
 */
class FizzBuzz {

    public static void main(String[] args) {
        //i = 1
        int i = 1;

        //for i in range(1, 100):
        //for loop format: (start; loop condition; step/operation)
        //for (int i = 1; i < 100; i++) {

        //while i < 100:
        while (i < 100) {

            i = getFizzBuzz(i);
        }
    }

    private static int getFizzBuzz(int i) {
        // Find out which numbers divide i.
        //divisibleBy3 = i % 3 == 0
        //divisibleBy5 = i % 5 == 0
        boolean divisibleBy3 = i % 3 == 0;
        boolean divisibleBy5 = i % 5 == 0;

        // Print our appropriate result.
        //if divisibleBy3 is True and divisibleBy5 is True:
        if (divisibleBy3 && divisibleBy5) {
            //print("Fizz Buzz")
            System.out.println("Fizz Buzz");
        //elif divisibleBy5 is True:
        } else if (divisibleBy3) {
            //print("Fizz")
            System.out.println("Fizz");
        //elif divisibleBy5 is True:
        } else if (divisibleBy5) {
            //print("Buzz")
            System.out.println("Buzz");
        //else:
        } else {
            //print(i)
            System.out.println(i);

        }

        //i += 1
        i++;
        return i;
    }
}
