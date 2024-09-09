public class Reduce {
    public static void main(String[] args) {
        int step = 0;
        int n = 100;

        while (n > 0) {
            if (n % 2 == 0) {
                n = n / 2;
                step++;
            }
            else {
                n = n - 1;
                step++;
            }
        }

        System.out.println("It takes " + step + " steps to get to 0.");
    }
}
