import java.util.Scanner;

public class LoopTimingExample {
    public static void main(String[] args) {

        int userInput = 0;
        String operator;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please put number now: ");

        int loopCount = scanner.nextInt();

        int sum = 0;
        for (int i = 1; i <= loopCount; i++){
            sum = sum + i;
        }


        System.out.println("The sum of number " +loopCount +" is " +sum + " \n Now you are smarter than Carl Friedrich ^_^");

    }
}


