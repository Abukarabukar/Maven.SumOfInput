import java.util.Scanner;

public class LoopTimingTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of times to execute the loop: ");
        int loopCount = scanner.nextInt();
        scanner.close();

        int totalCount = 0;

        for (int j = 0; j < loopCount; j++) {
            int count = 0;

            // Loop 1
            for (int i = 1; i <= 100; i++) {
                // do something
                count++;
            }

            System.out.println("Iteration " + (j + 1) + ": The sum of n = " + count);
            totalCount += count;
        }

        System.out.println("Total sum of n = " + totalCount);
    }
}