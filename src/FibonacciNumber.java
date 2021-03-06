import java.util.Scanner;

public class FibonacciNumber
{
    //	Print the sequence 1 1 2 3 5 8 13 21 (Fibonacci number)
    public static void main(String[] args)
    {
// Set it to the number of elements you want in the Fibonacci Series
        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter any number to find fibonacci series");
        int maxNumber = scanner.nextInt();
        int previousNumber = 0;
        int nextNumber = 1;
    // It will print fibonacci series
        System.out.print("Fibonacci Series of "+maxNumber+" numbers:");

        for (int i = 1; i <= maxNumber; ++i)
        {
            System.out.print(previousNumber+" ");
            // On each iteration, we are assigning second number
            int sum = previousNumber + nextNumber;
            previousNumber = nextNumber;
            nextNumber = sum;
        }
    }
}
